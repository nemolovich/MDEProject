/*
* generated by Xtext
*/
package fr.nantes.univ.alma.mvc.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import fr.nantes.univ.alma.mvc.services.LanguageGrammarAccess;

public class LanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private LanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected fr.nantes.univ.alma.mvc.ui.contentassist.antlr.internal.InternalLanguageParser createParser() {
		fr.nantes.univ.alma.mvc.ui.contentassist.antlr.internal.InternalLanguageParser result = new fr.nantes.univ.alma.mvc.ui.contentassist.antlr.internal.InternalLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMainPackageAccess().getAlternatives_1(), "rule__MainPackage__Alternatives_1");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getMainPackageAccess().getGroup(), "rule__MainPackage__Group__0");
					put(grammarAccess.getUIApplicationAccess().getGroup(), "rule__UIApplication__Group__0");
					put(grammarAccess.getUIApplicationAccess().getGroup_2(), "rule__UIApplication__Group_2__0");
					put(grammarAccess.getUIApplicationAccess().getGroup_2_4(), "rule__UIApplication__Group_2_4__0");
					put(grammarAccess.getUIApplicationAccess().getGroup_3(), "rule__UIApplication__Group_3__0");
					put(grammarAccess.getUIApplicationAccess().getGroup_3_4(), "rule__UIApplication__Group_3_4__0");
					put(grammarAccess.getXMLDeclarationAccess().getGroup(), "rule__XMLDeclaration__Group__0");
					put(grammarAccess.getViewAccess().getGroup(), "rule__View__Group__0");
					put(grammarAccess.getViewAccess().getGroup_4(), "rule__View__Group_4__0");
					put(grammarAccess.getViewAccess().getGroup_8(), "rule__View__Group_8__0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getModelAccess().getGroup_5(), "rule__Model__Group_5__0");
					put(grammarAccess.getModelAccess().getGroup_5_4(), "rule__Model__Group_5_4__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
					put(grammarAccess.getModelPropertyAccess().getGroup(), "rule__ModelProperty__Group__0");
					put(grammarAccess.getEStringAccess().getGroup_1(), "rule__EString__Group_1__0");
					put(grammarAccess.getEStringAccess().getGroup_1_1(), "rule__EString__Group_1_1__0");
					put(grammarAccess.getMainPackageAccess().getAllModelsAssignment_1_0(), "rule__MainPackage__AllModelsAssignment_1_0");
					put(grammarAccess.getMainPackageAccess().getAllViewsAssignment_1_1(), "rule__MainPackage__AllViewsAssignment_1_1");
					put(grammarAccess.getMainPackageAccess().getAppAssignment_2(), "rule__MainPackage__AppAssignment_2");
					put(grammarAccess.getUIApplicationAccess().getModelsAssignment_2_2(), "rule__UIApplication__ModelsAssignment_2_2");
					put(grammarAccess.getUIApplicationAccess().getModelsAssignment_2_4_1(), "rule__UIApplication__ModelsAssignment_2_4_1");
					put(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_2(), "rule__UIApplication__PagesAssignment_3_2");
					put(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_4_1(), "rule__UIApplication__PagesAssignment_3_4_1");
					put(grammarAccess.getViewAccess().getNameAssignment_2(), "rule__View__NameAssignment_2");
					put(grammarAccess.getViewAccess().getDescriptionAssignment_4_1(), "rule__View__DescriptionAssignment_4_1");
					put(grammarAccess.getViewAccess().getModelAssignment_6(), "rule__View__ModelAssignment_6");
					put(grammarAccess.getViewAccess().getActionsAssignment_8_1(), "rule__View__ActionsAssignment_8_1");
					put(grammarAccess.getViewAccess().getActionsAssignment_8_2(), "rule__View__ActionsAssignment_8_2");
					put(grammarAccess.getModelAccess().getNameAssignment_2(), "rule__Model__NameAssignment_2");
					put(grammarAccess.getModelAccess().getPropertiesAssignment_4_1(), "rule__Model__PropertiesAssignment_4_1");
					put(grammarAccess.getModelAccess().getPropertiesAssignment_4_2(), "rule__Model__PropertiesAssignment_4_2");
					put(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_2(), "rule__Model__OwnedElementsAssignment_5_2");
					put(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_4_1(), "rule__Model__OwnedElementsAssignment_5_4_1");
					put(grammarAccess.getActionAccess().getNameAssignment_2(), "rule__Action__NameAssignment_2");
					put(grammarAccess.getActionAccess().getNextPageAssignment_4_1(), "rule__Action__NextPageAssignment_4_1");
					put(grammarAccess.getModelPropertyAccess().getNameAssignment_2(), "rule__ModelProperty__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			fr.nantes.univ.alma.mvc.ui.contentassist.antlr.internal.InternalLanguageParser typedParser = (fr.nantes.univ.alma.mvc.ui.contentassist.antlr.internal.InternalLanguageParser) parser;
			typedParser.entryRuleMainPackage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
