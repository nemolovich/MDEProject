
package fr.nantes.univ.alma.mvc;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LanguageStandaloneSetup extends LanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new LanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
