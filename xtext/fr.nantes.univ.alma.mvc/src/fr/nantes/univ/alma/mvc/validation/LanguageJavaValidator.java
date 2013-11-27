package fr.nantes.univ.alma.mvc.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import fr.nantes.univ.alma.mvc.mvc.Action;
import fr.nantes.univ.alma.mvc.mvc.Model;
import fr.nantes.univ.alma.mvc.mvc.ModelProperty;
import fr.nantes.univ.alma.mvc.mvc.MvcPackage;
import fr.nantes.univ.alma.mvc.mvc.UIApplication;
import fr.nantes.univ.alma.mvc.mvc.View;

public class LanguageJavaValidator extends AbstractLanguageJavaValidator {

	@Check
	public void checkObjectStartsWithCapital(EObject o) {
		String name = "";
		String className = null;
		EAttribute attr = null;
		if (o instanceof Model) {
			name = ((Model) o).getName();
			className = "Model";
			attr = MvcPackage.Literals.MODEL__NAME;
		} else if (o instanceof View) {
			name = ((View) o).getName();
			className = "View";
			attr = MvcPackage.Literals.VIEW__NAME;
		} else if (o instanceof ModelProperty) {
			name = ((ModelProperty) o).getName();
			className = "ModelProperty";
			attr = MvcPackage.Literals.MODEL_PROPERTY__NAME;
		}
		if (name.isEmpty()) {
			return;
		}
		if (!Character.isUpperCase(name.charAt(0))) {
			error("The " + className + " name must start with a capital", attr);
		}
	}

	@Check
	public void checkObjectStartsWithLower(EObject o) {
		String name = "";
		String className = null;
		EAttribute attr = null;
		if (o instanceof Action) {
			name = ((Action) o).getName();
			className = "Action";
			attr = MvcPackage.Literals.ACTION__NAME;
		}
		if (name.isEmpty()) {
			return;
		}
		if (!Character.isLowerCase(name.charAt(0))) {
			error("The " + className + " name can not start with a capital",
					attr);
		}
	}

	private boolean containsModel(Model parent, Model child) {
		if (parent == null || child == null) {
			return false;
		}
		if (parent.getOwnedElements().contains(child)) {
			return true;
		}
		for (Model m : parent.getOwnedElements()) {
			if (this.containsModel(m, child)) {
				return true;
			}
		}
		return false;
	}

	@Check(CheckType.FAST)
	public void checkAppAttrIsUnique(UIApplication app) {
		Model[] models = (Model[]) app.getModels().toArray();
		View[] pages = (View[]) app.getPages().toArray();
		if (models.length > 1) {
			for (int i = 0; i < models.length - 1; i++) {
				for (int j = i + 1; j < models.length; j++) {
					if (models[i].equals(models[j])) {
						error("The application already contains this model",
								app,
								MvcPackage.Literals.UI_APPLICATION__MODELS, j);
					}
				}
			}
		}
		if (pages.length > 1) {
			for (int i = 0; i < pages.length - 1; i++) {
				for (int j = i + 1; j < pages.length; j++) {
					if (pages[i].equals(pages[j])) {
						error("The application already contains this view",
								app, MvcPackage.Literals.UI_APPLICATION__PAGES,
								j);
					}
				}
			}
		}
	}

	@Check(CheckType.FAST)
	public void checkAppDoesNotContainsParentModel(UIApplication app) {
		Model[] models = (Model[]) app.getModels().toArray();
		if (models.length > 1) {
			for (int i = 0; i < models.length - 1; i++) {
				for (int j = i + 1; j < models.length; j++) {
					if (this.containsModel(models[i], models[j])) {
						error("This Model is present in the Model \""
								+ models[i].getName() + "\"", app,
								MvcPackage.Literals.UI_APPLICATION__MODELS, j);
					} else if (this.containsModel(models[j], models[i])) {
						error("This Model is present in the Model \""
								+ models[j].getName() + "\"", app,
								MvcPackage.Literals.UI_APPLICATION__MODELS, i);
					}
				}
			}
		}
	}

//	@Check(CheckType.FAST)
//	public void checkModelNameIsUnique(Package p) {
//		boolean multiple = true;
//		Model[] models = (Model[]) p.getModels().toArray();
//		if (models.length < 2) {
//			multiple = false;
//		}
//		if (multiple) {
//			for (int i = 0; i < models.length - 1; i++) {
//				for (int j = i + 1; j < models.length; j++) {
//					if (models[i].getName().equalsIgnoreCase(
//							models[j].getName())) {
//						error("The Model name must be unique", models[j],
//								MvcPackage.Literals.MODEL__NAME, -1);
//					}
//				}
//			}
//		}
//		multiple = true;
//		View[] pages = (View[]) p.getViews().toArray();
//		if (pages.length < 2) {
//			multiple = false;
//		}
//		if (multiple) {
//			for (int i = 0; i < pages.length - 1; i++) {
//				for (int j = i + 1; j < pages.length; j++) {
//					if (pages[i].getName().equalsIgnoreCase(pages[j].getName())) {
//						error("The Model name must be unique", pages[j],
//								MvcPackage.Literals.VIEW__NAME, -1);
//					}
//				}
//			}
//		}
//	}

}
