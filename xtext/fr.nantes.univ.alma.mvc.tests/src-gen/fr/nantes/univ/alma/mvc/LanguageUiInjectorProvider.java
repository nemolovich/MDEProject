/*
* generated by Xtext
*/
package fr.nantes.univ.alma.mvc;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return fr.nantes.univ.alma.mvc.ui.internal.LanguageActivator.getInstance().getInjector("fr.nantes.univ.alma.mvc.Language");
	}
	
}