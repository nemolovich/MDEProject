package fr.nantes.univ.alma.mvc.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.nantes.univ.alma.mvc.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_VERSION", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?xml version='", "' encoding='", "' ?>'", "'<UIApplication>'", "'</UIApplication>'", "'<models>'", "'<model ref='", "' />'", "'</models>'", "'<pages>'", "'<page ref='", "'</pages>'", "'<view id='", "' >'", "'</view>'", "'<description>'", "'</description>'", "'<actions>'", "'</actions>'", "'<model id='", "'</model>'", "'<properties>'", "'</properties>'", "'<ownedElements>'", "'</ownedElements>'", "'<action name='", "'</action>'", "'<nextPage ref='", "'<modelProperty name='"
    };
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_VERSION=6;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g"; }


     
     	private LanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePackage"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:60:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:61:1: ( rulePackage EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:62:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage61);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:69:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:73:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:74:1: ( ( rule__Package__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:74:1: ( ( rule__Package__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:75:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:76:1: ( rule__Package__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:76:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage94);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleXMLDeclaration"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:88:1: entryRuleXMLDeclaration : ruleXMLDeclaration EOF ;
    public final void entryRuleXMLDeclaration() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:89:1: ( ruleXMLDeclaration EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:90:1: ruleXMLDeclaration EOF
            {
             before(grammarAccess.getXMLDeclarationRule()); 
            pushFollow(FOLLOW_ruleXMLDeclaration_in_entryRuleXMLDeclaration121);
            ruleXMLDeclaration();

            state._fsp--;

             after(grammarAccess.getXMLDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLDeclaration128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXMLDeclaration"


    // $ANTLR start "ruleXMLDeclaration"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:97:1: ruleXMLDeclaration : ( ( rule__XMLDeclaration__Group__0 ) ) ;
    public final void ruleXMLDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:101:2: ( ( ( rule__XMLDeclaration__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:102:1: ( ( rule__XMLDeclaration__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:102:1: ( ( rule__XMLDeclaration__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:103:1: ( rule__XMLDeclaration__Group__0 )
            {
             before(grammarAccess.getXMLDeclarationAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:104:1: ( rule__XMLDeclaration__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:104:2: rule__XMLDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__0_in_ruleXMLDeclaration154);
            rule__XMLDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXMLDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXMLDeclaration"


    // $ANTLR start "entryRuleUIApplication"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:116:1: entryRuleUIApplication : ruleUIApplication EOF ;
    public final void entryRuleUIApplication() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:117:1: ( ruleUIApplication EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:118:1: ruleUIApplication EOF
            {
             before(grammarAccess.getUIApplicationRule()); 
            pushFollow(FOLLOW_ruleUIApplication_in_entryRuleUIApplication181);
            ruleUIApplication();

            state._fsp--;

             after(grammarAccess.getUIApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIApplication188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUIApplication"


    // $ANTLR start "ruleUIApplication"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:125:1: ruleUIApplication : ( ( rule__UIApplication__Group__0 ) ) ;
    public final void ruleUIApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:129:2: ( ( ( rule__UIApplication__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:130:1: ( ( rule__UIApplication__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:130:1: ( ( rule__UIApplication__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:131:1: ( rule__UIApplication__Group__0 )
            {
             before(grammarAccess.getUIApplicationAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:132:1: ( rule__UIApplication__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:132:2: rule__UIApplication__Group__0
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__0_in_ruleUIApplication214);
            rule__UIApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIApplication"


    // $ANTLR start "entryRuleView"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:144:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:145:1: ( ruleView EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:146:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView241);
            ruleView();

            state._fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:153:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:157:2: ( ( ( rule__View__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:158:1: ( ( rule__View__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:158:1: ( ( rule__View__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:159:1: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:160:1: ( rule__View__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:160:2: rule__View__Group__0
            {
            pushFollow(FOLLOW_rule__View__Group__0_in_ruleView274);
            rule__View__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleModel"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:172:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:173:1: ( ruleModel EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:174:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel301);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:181:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:185:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:186:1: ( ( rule__Model__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:186:1: ( ( rule__Model__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:187:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:188:1: ( rule__Model__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:188:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel334);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAction"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:200:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:201:1: ( ruleAction EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:202:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction361);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:209:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:213:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:214:1: ( ( rule__Action__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:214:1: ( ( rule__Action__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:215:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:216:1: ( rule__Action__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:216:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction394);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleModelProperty"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:228:1: entryRuleModelProperty : ruleModelProperty EOF ;
    public final void entryRuleModelProperty() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:229:1: ( ruleModelProperty EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:230:1: ruleModelProperty EOF
            {
             before(grammarAccess.getModelPropertyRule()); 
            pushFollow(FOLLOW_ruleModelProperty_in_entryRuleModelProperty421);
            ruleModelProperty();

            state._fsp--;

             after(grammarAccess.getModelPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelProperty428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:237:1: ruleModelProperty : ( ( rule__ModelProperty__Group__0 ) ) ;
    public final void ruleModelProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:241:2: ( ( ( rule__ModelProperty__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:242:1: ( ( rule__ModelProperty__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:242:1: ( ( rule__ModelProperty__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:243:1: ( rule__ModelProperty__Group__0 )
            {
             before(grammarAccess.getModelPropertyAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:244:1: ( rule__ModelProperty__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:244:2: rule__ModelProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__0_in_ruleModelProperty454);
            rule__ModelProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelProperty"


    // $ANTLR start "entryRuleEString"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:257:1: ( ruleEString EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString481);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:270:1: ( ( rule__EString__Alternatives ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:272:1: ( rule__EString__Alternatives )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString514);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Package__Alternatives_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:284:1: rule__Package__Alternatives_1 : ( ( ( rule__Package__ViewsAssignment_1_0 ) ) | ( ( rule__Package__ModelsAssignment_1_1 ) ) | ( ( rule__Package__ActionsAssignment_1_2 ) ) | ( ( rule__Package__PropertiesAssignment_1_3 ) ) );
    public final void rule__Package__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:288:1: ( ( ( rule__Package__ViewsAssignment_1_0 ) ) | ( ( rule__Package__ModelsAssignment_1_1 ) ) | ( ( rule__Package__ActionsAssignment_1_2 ) ) | ( ( rule__Package__PropertiesAssignment_1_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 40:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:289:1: ( ( rule__Package__ViewsAssignment_1_0 ) )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:289:1: ( ( rule__Package__ViewsAssignment_1_0 ) )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:290:1: ( rule__Package__ViewsAssignment_1_0 )
                    {
                     before(grammarAccess.getPackageAccess().getViewsAssignment_1_0()); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:291:1: ( rule__Package__ViewsAssignment_1_0 )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:291:2: rule__Package__ViewsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Package__ViewsAssignment_1_0_in_rule__Package__Alternatives_1550);
                    rule__Package__ViewsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getViewsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:295:6: ( ( rule__Package__ModelsAssignment_1_1 ) )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:295:6: ( ( rule__Package__ModelsAssignment_1_1 ) )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:296:1: ( rule__Package__ModelsAssignment_1_1 )
                    {
                     before(grammarAccess.getPackageAccess().getModelsAssignment_1_1()); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:297:1: ( rule__Package__ModelsAssignment_1_1 )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:297:2: rule__Package__ModelsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Package__ModelsAssignment_1_1_in_rule__Package__Alternatives_1568);
                    rule__Package__ModelsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getModelsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:301:6: ( ( rule__Package__ActionsAssignment_1_2 ) )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:301:6: ( ( rule__Package__ActionsAssignment_1_2 ) )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:302:1: ( rule__Package__ActionsAssignment_1_2 )
                    {
                     before(grammarAccess.getPackageAccess().getActionsAssignment_1_2()); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:303:1: ( rule__Package__ActionsAssignment_1_2 )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:303:2: rule__Package__ActionsAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__Package__ActionsAssignment_1_2_in_rule__Package__Alternatives_1586);
                    rule__Package__ActionsAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getActionsAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:307:6: ( ( rule__Package__PropertiesAssignment_1_3 ) )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:307:6: ( ( rule__Package__PropertiesAssignment_1_3 ) )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:308:1: ( rule__Package__PropertiesAssignment_1_3 )
                    {
                     before(grammarAccess.getPackageAccess().getPropertiesAssignment_1_3()); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:309:1: ( rule__Package__PropertiesAssignment_1_3 )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:309:2: rule__Package__PropertiesAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__Package__PropertiesAssignment_1_3_in_rule__Package__Alternatives_1604);
                    rule__Package__PropertiesAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getPropertiesAssignment_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Alternatives_1"


    // $ANTLR start "rule__EString__Alternatives"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:318:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:322:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:323:1: ( RULE_STRING )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:323:1: ( RULE_STRING )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:324:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives637); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:329:6: ( RULE_ID )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:329:6: ( RULE_ID )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:330:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives654); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:342:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:346:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:347:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0684);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0687);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:354:1: rule__Package__Group__0__Impl : ( ruleXMLDeclaration ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:358:1: ( ( ruleXMLDeclaration ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:359:1: ( ruleXMLDeclaration )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:359:1: ( ruleXMLDeclaration )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:360:1: ruleXMLDeclaration
            {
             before(grammarAccess.getPackageAccess().getXMLDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleXMLDeclaration_in_rule__Package__Group__0__Impl714);
            ruleXMLDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getXMLDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:371:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:375:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:376:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1743);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1746);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:383:1: rule__Package__Group__1__Impl : ( ( rule__Package__Alternatives_1 )* ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:387:1: ( ( ( rule__Package__Alternatives_1 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:388:1: ( ( rule__Package__Alternatives_1 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:388:1: ( ( rule__Package__Alternatives_1 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:389:1: ( rule__Package__Alternatives_1 )*
            {
             before(grammarAccess.getPackageAccess().getAlternatives_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:390:1: ( rule__Package__Alternatives_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24||LA3_0==31||LA3_0==37||LA3_0==40) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:390:2: rule__Package__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Package__Alternatives_1_in_rule__Package__Group__1__Impl773);
            	    rule__Package__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:400:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:404:1: ( rule__Package__Group__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:405:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2804);
            rule__Package__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:411:1: rule__Package__Group__2__Impl : ( ( rule__Package__MainAppAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:415:1: ( ( ( rule__Package__MainAppAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:416:1: ( ( rule__Package__MainAppAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:416:1: ( ( rule__Package__MainAppAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:417:1: ( rule__Package__MainAppAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getMainAppAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:418:1: ( rule__Package__MainAppAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:418:2: rule__Package__MainAppAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__MainAppAssignment_2_in_rule__Package__Group__2__Impl831);
            rule__Package__MainAppAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getMainAppAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__XMLDeclaration__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:434:1: rule__XMLDeclaration__Group__0 : rule__XMLDeclaration__Group__0__Impl rule__XMLDeclaration__Group__1 ;
    public final void rule__XMLDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:438:1: ( rule__XMLDeclaration__Group__0__Impl rule__XMLDeclaration__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:439:2: rule__XMLDeclaration__Group__0__Impl rule__XMLDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__0__Impl_in_rule__XMLDeclaration__Group__0867);
            rule__XMLDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XMLDeclaration__Group__1_in_rule__XMLDeclaration__Group__0870);
            rule__XMLDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__0"


    // $ANTLR start "rule__XMLDeclaration__Group__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:446:1: rule__XMLDeclaration__Group__0__Impl : ( '<?xml version=' ) ;
    public final void rule__XMLDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:450:1: ( ( '<?xml version=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:451:1: ( '<?xml version=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:451:1: ( '<?xml version=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:452:1: '<?xml version='
            {
             before(grammarAccess.getXMLDeclarationAccess().getXmlVersionKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__XMLDeclaration__Group__0__Impl898); 
             after(grammarAccess.getXMLDeclarationAccess().getXmlVersionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__0__Impl"


    // $ANTLR start "rule__XMLDeclaration__Group__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:465:1: rule__XMLDeclaration__Group__1 : rule__XMLDeclaration__Group__1__Impl rule__XMLDeclaration__Group__2 ;
    public final void rule__XMLDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:469:1: ( rule__XMLDeclaration__Group__1__Impl rule__XMLDeclaration__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:470:2: rule__XMLDeclaration__Group__1__Impl rule__XMLDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__1__Impl_in_rule__XMLDeclaration__Group__1929);
            rule__XMLDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XMLDeclaration__Group__2_in_rule__XMLDeclaration__Group__1932);
            rule__XMLDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__1"


    // $ANTLR start "rule__XMLDeclaration__Group__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:477:1: rule__XMLDeclaration__Group__1__Impl : ( RULE_VERSION ) ;
    public final void rule__XMLDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:481:1: ( ( RULE_VERSION ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:482:1: ( RULE_VERSION )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:482:1: ( RULE_VERSION )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:483:1: RULE_VERSION
            {
             before(grammarAccess.getXMLDeclarationAccess().getVERSIONTerminalRuleCall_1()); 
            match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_rule__XMLDeclaration__Group__1__Impl959); 
             after(grammarAccess.getXMLDeclarationAccess().getVERSIONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__1__Impl"


    // $ANTLR start "rule__XMLDeclaration__Group__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:494:1: rule__XMLDeclaration__Group__2 : rule__XMLDeclaration__Group__2__Impl rule__XMLDeclaration__Group__3 ;
    public final void rule__XMLDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:498:1: ( rule__XMLDeclaration__Group__2__Impl rule__XMLDeclaration__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:499:2: rule__XMLDeclaration__Group__2__Impl rule__XMLDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__2__Impl_in_rule__XMLDeclaration__Group__2988);
            rule__XMLDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XMLDeclaration__Group__3_in_rule__XMLDeclaration__Group__2991);
            rule__XMLDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__2"


    // $ANTLR start "rule__XMLDeclaration__Group__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:506:1: rule__XMLDeclaration__Group__2__Impl : ( ' encoding=' ) ;
    public final void rule__XMLDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:510:1: ( ( ' encoding=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:511:1: ( ' encoding=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:511:1: ( ' encoding=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:512:1: ' encoding='
            {
             before(grammarAccess.getXMLDeclarationAccess().getEncodingKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__XMLDeclaration__Group__2__Impl1019); 
             after(grammarAccess.getXMLDeclarationAccess().getEncodingKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__2__Impl"


    // $ANTLR start "rule__XMLDeclaration__Group__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:525:1: rule__XMLDeclaration__Group__3 : rule__XMLDeclaration__Group__3__Impl rule__XMLDeclaration__Group__4 ;
    public final void rule__XMLDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:529:1: ( rule__XMLDeclaration__Group__3__Impl rule__XMLDeclaration__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:530:2: rule__XMLDeclaration__Group__3__Impl rule__XMLDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__3__Impl_in_rule__XMLDeclaration__Group__31050);
            rule__XMLDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XMLDeclaration__Group__4_in_rule__XMLDeclaration__Group__31053);
            rule__XMLDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__3"


    // $ANTLR start "rule__XMLDeclaration__Group__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:537:1: rule__XMLDeclaration__Group__3__Impl : ( ruleEString ) ;
    public final void rule__XMLDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:541:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:542:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:542:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:543:1: ruleEString
            {
             before(grammarAccess.getXMLDeclarationAccess().getEStringParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleEString_in_rule__XMLDeclaration__Group__3__Impl1080);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXMLDeclarationAccess().getEStringParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__3__Impl"


    // $ANTLR start "rule__XMLDeclaration__Group__4"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:554:1: rule__XMLDeclaration__Group__4 : rule__XMLDeclaration__Group__4__Impl ;
    public final void rule__XMLDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:558:1: ( rule__XMLDeclaration__Group__4__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:559:2: rule__XMLDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__4__Impl_in_rule__XMLDeclaration__Group__41109);
            rule__XMLDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__4"


    // $ANTLR start "rule__XMLDeclaration__Group__4__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:565:1: rule__XMLDeclaration__Group__4__Impl : ( ' ?>' ) ;
    public final void rule__XMLDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:569:1: ( ( ' ?>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:570:1: ( ' ?>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:570:1: ( ' ?>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:571:1: ' ?>'
            {
             before(grammarAccess.getXMLDeclarationAccess().getSpaceQuestionMarkGreaterThanSignKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__XMLDeclaration__Group__4__Impl1137); 
             after(grammarAccess.getXMLDeclarationAccess().getSpaceQuestionMarkGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDeclaration__Group__4__Impl"


    // $ANTLR start "rule__UIApplication__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:594:1: rule__UIApplication__Group__0 : rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1 ;
    public final void rule__UIApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:598:1: ( rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:599:2: rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__0__Impl_in_rule__UIApplication__Group__01178);
            rule__UIApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group__1_in_rule__UIApplication__Group__01181);
            rule__UIApplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__0"


    // $ANTLR start "rule__UIApplication__Group__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:606:1: rule__UIApplication__Group__0__Impl : ( () ) ;
    public final void rule__UIApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:610:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:611:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:611:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:612:1: ()
            {
             before(grammarAccess.getUIApplicationAccess().getUIApplicationAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:613:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:615:1: 
            {
            }

             after(grammarAccess.getUIApplicationAccess().getUIApplicationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__0__Impl"


    // $ANTLR start "rule__UIApplication__Group__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:625:1: rule__UIApplication__Group__1 : rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2 ;
    public final void rule__UIApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:629:1: ( rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:630:2: rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__1__Impl_in_rule__UIApplication__Group__11239);
            rule__UIApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group__2_in_rule__UIApplication__Group__11242);
            rule__UIApplication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__1"


    // $ANTLR start "rule__UIApplication__Group__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:637:1: rule__UIApplication__Group__1__Impl : ( '<UIApplication>' ) ;
    public final void rule__UIApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:641:1: ( ( '<UIApplication>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:642:1: ( '<UIApplication>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:642:1: ( '<UIApplication>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:643:1: '<UIApplication>'
            {
             before(grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__UIApplication__Group__1__Impl1270); 
             after(grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__1__Impl"


    // $ANTLR start "rule__UIApplication__Group__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:656:1: rule__UIApplication__Group__2 : rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3 ;
    public final void rule__UIApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:660:1: ( rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:661:2: rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__2__Impl_in_rule__UIApplication__Group__21301);
            rule__UIApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group__3_in_rule__UIApplication__Group__21304);
            rule__UIApplication__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__2"


    // $ANTLR start "rule__UIApplication__Group__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:668:1: rule__UIApplication__Group__2__Impl : ( ( rule__UIApplication__Group_2__0 )? ) ;
    public final void rule__UIApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:672:1: ( ( ( rule__UIApplication__Group_2__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:673:1: ( ( rule__UIApplication__Group_2__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:673:1: ( ( rule__UIApplication__Group_2__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:674:1: ( rule__UIApplication__Group_2__0 )?
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:675:1: ( rule__UIApplication__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:675:2: rule__UIApplication__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UIApplication__Group_2__0_in_rule__UIApplication__Group__2__Impl1331);
                    rule__UIApplication__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIApplicationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__2__Impl"


    // $ANTLR start "rule__UIApplication__Group__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:685:1: rule__UIApplication__Group__3 : rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4 ;
    public final void rule__UIApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:689:1: ( rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:690:2: rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__3__Impl_in_rule__UIApplication__Group__31362);
            rule__UIApplication__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group__4_in_rule__UIApplication__Group__31365);
            rule__UIApplication__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__3"


    // $ANTLR start "rule__UIApplication__Group__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:697:1: rule__UIApplication__Group__3__Impl : ( ( rule__UIApplication__Group_3__0 )? ) ;
    public final void rule__UIApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:701:1: ( ( ( rule__UIApplication__Group_3__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:702:1: ( ( rule__UIApplication__Group_3__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:702:1: ( ( rule__UIApplication__Group_3__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:703:1: ( rule__UIApplication__Group_3__0 )?
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_3()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:704:1: ( rule__UIApplication__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:704:2: rule__UIApplication__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__UIApplication__Group_3__0_in_rule__UIApplication__Group__3__Impl1392);
                    rule__UIApplication__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIApplicationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__3__Impl"


    // $ANTLR start "rule__UIApplication__Group__4"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:714:1: rule__UIApplication__Group__4 : rule__UIApplication__Group__4__Impl ;
    public final void rule__UIApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:718:1: ( rule__UIApplication__Group__4__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:719:2: rule__UIApplication__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__4__Impl_in_rule__UIApplication__Group__41423);
            rule__UIApplication__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__4"


    // $ANTLR start "rule__UIApplication__Group__4__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:725:1: rule__UIApplication__Group__4__Impl : ( '</UIApplication>' ) ;
    public final void rule__UIApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:729:1: ( ( '</UIApplication>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:730:1: ( '</UIApplication>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:730:1: ( '</UIApplication>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:731:1: '</UIApplication>'
            {
             before(grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__UIApplication__Group__4__Impl1451); 
             after(grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__4__Impl"


    // $ANTLR start "rule__UIApplication__Group_2__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:754:1: rule__UIApplication__Group_2__0 : rule__UIApplication__Group_2__0__Impl rule__UIApplication__Group_2__1 ;
    public final void rule__UIApplication__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:758:1: ( rule__UIApplication__Group_2__0__Impl rule__UIApplication__Group_2__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:759:2: rule__UIApplication__Group_2__0__Impl rule__UIApplication__Group_2__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__0__Impl_in_rule__UIApplication__Group_2__01492);
            rule__UIApplication__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__1_in_rule__UIApplication__Group_2__01495);
            rule__UIApplication__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__0"


    // $ANTLR start "rule__UIApplication__Group_2__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:766:1: rule__UIApplication__Group_2__0__Impl : ( '<models>' ) ;
    public final void rule__UIApplication__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:770:1: ( ( '<models>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:771:1: ( '<models>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:771:1: ( '<models>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:772:1: '<models>'
            {
             before(grammarAccess.getUIApplicationAccess().getModelsKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__UIApplication__Group_2__0__Impl1523); 
             after(grammarAccess.getUIApplicationAccess().getModelsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__0__Impl"


    // $ANTLR start "rule__UIApplication__Group_2__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:785:1: rule__UIApplication__Group_2__1 : rule__UIApplication__Group_2__1__Impl rule__UIApplication__Group_2__2 ;
    public final void rule__UIApplication__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:789:1: ( rule__UIApplication__Group_2__1__Impl rule__UIApplication__Group_2__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:790:2: rule__UIApplication__Group_2__1__Impl rule__UIApplication__Group_2__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__1__Impl_in_rule__UIApplication__Group_2__11554);
            rule__UIApplication__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__2_in_rule__UIApplication__Group_2__11557);
            rule__UIApplication__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__1"


    // $ANTLR start "rule__UIApplication__Group_2__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:797:1: rule__UIApplication__Group_2__1__Impl : ( '<model ref=' ) ;
    public final void rule__UIApplication__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:801:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:802:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:802:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:803:1: '<model ref='
            {
             before(grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__UIApplication__Group_2__1__Impl1585); 
             after(grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__1__Impl"


    // $ANTLR start "rule__UIApplication__Group_2__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:816:1: rule__UIApplication__Group_2__2 : rule__UIApplication__Group_2__2__Impl rule__UIApplication__Group_2__3 ;
    public final void rule__UIApplication__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:820:1: ( rule__UIApplication__Group_2__2__Impl rule__UIApplication__Group_2__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:821:2: rule__UIApplication__Group_2__2__Impl rule__UIApplication__Group_2__3
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__2__Impl_in_rule__UIApplication__Group_2__21616);
            rule__UIApplication__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__3_in_rule__UIApplication__Group_2__21619);
            rule__UIApplication__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__2"


    // $ANTLR start "rule__UIApplication__Group_2__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:828:1: rule__UIApplication__Group_2__2__Impl : ( ( rule__UIApplication__ModelsAssignment_2_2 ) ) ;
    public final void rule__UIApplication__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:832:1: ( ( ( rule__UIApplication__ModelsAssignment_2_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:833:1: ( ( rule__UIApplication__ModelsAssignment_2_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:833:1: ( ( rule__UIApplication__ModelsAssignment_2_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:834:1: ( rule__UIApplication__ModelsAssignment_2_2 )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsAssignment_2_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:835:1: ( rule__UIApplication__ModelsAssignment_2_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:835:2: rule__UIApplication__ModelsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__UIApplication__ModelsAssignment_2_2_in_rule__UIApplication__Group_2__2__Impl1646);
            rule__UIApplication__ModelsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getModelsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__2__Impl"


    // $ANTLR start "rule__UIApplication__Group_2__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:845:1: rule__UIApplication__Group_2__3 : rule__UIApplication__Group_2__3__Impl rule__UIApplication__Group_2__4 ;
    public final void rule__UIApplication__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:849:1: ( rule__UIApplication__Group_2__3__Impl rule__UIApplication__Group_2__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:850:2: rule__UIApplication__Group_2__3__Impl rule__UIApplication__Group_2__4
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__3__Impl_in_rule__UIApplication__Group_2__31676);
            rule__UIApplication__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__4_in_rule__UIApplication__Group_2__31679);
            rule__UIApplication__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__3"


    // $ANTLR start "rule__UIApplication__Group_2__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:857:1: rule__UIApplication__Group_2__3__Impl : ( ' />' ) ;
    public final void rule__UIApplication__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:861:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:862:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:862:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:863:1: ' />'
            {
             before(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_3()); 
            match(input,19,FOLLOW_19_in_rule__UIApplication__Group_2__3__Impl1707); 
             after(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__3__Impl"


    // $ANTLR start "rule__UIApplication__Group_2__4"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:876:1: rule__UIApplication__Group_2__4 : rule__UIApplication__Group_2__4__Impl rule__UIApplication__Group_2__5 ;
    public final void rule__UIApplication__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:880:1: ( rule__UIApplication__Group_2__4__Impl rule__UIApplication__Group_2__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:881:2: rule__UIApplication__Group_2__4__Impl rule__UIApplication__Group_2__5
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__4__Impl_in_rule__UIApplication__Group_2__41738);
            rule__UIApplication__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__5_in_rule__UIApplication__Group_2__41741);
            rule__UIApplication__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__4"


    // $ANTLR start "rule__UIApplication__Group_2__4__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:888:1: rule__UIApplication__Group_2__4__Impl : ( ( rule__UIApplication__Group_2_4__0 )* ) ;
    public final void rule__UIApplication__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:892:1: ( ( ( rule__UIApplication__Group_2_4__0 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:893:1: ( ( rule__UIApplication__Group_2_4__0 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:893:1: ( ( rule__UIApplication__Group_2_4__0 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:894:1: ( rule__UIApplication__Group_2_4__0 )*
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_2_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:895:1: ( rule__UIApplication__Group_2_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:895:2: rule__UIApplication__Group_2_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UIApplication__Group_2_4__0_in_rule__UIApplication__Group_2__4__Impl1768);
            	    rule__UIApplication__Group_2_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUIApplicationAccess().getGroup_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__4__Impl"


    // $ANTLR start "rule__UIApplication__Group_2__5"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:905:1: rule__UIApplication__Group_2__5 : rule__UIApplication__Group_2__5__Impl ;
    public final void rule__UIApplication__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:909:1: ( rule__UIApplication__Group_2__5__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:910:2: rule__UIApplication__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__5__Impl_in_rule__UIApplication__Group_2__51799);
            rule__UIApplication__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__5"


    // $ANTLR start "rule__UIApplication__Group_2__5__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:916:1: rule__UIApplication__Group_2__5__Impl : ( '</models>' ) ;
    public final void rule__UIApplication__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:920:1: ( ( '</models>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:921:1: ( '</models>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:921:1: ( '</models>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:922:1: '</models>'
            {
             before(grammarAccess.getUIApplicationAccess().getModelsKeyword_2_5()); 
            match(input,20,FOLLOW_20_in_rule__UIApplication__Group_2__5__Impl1827); 
             after(grammarAccess.getUIApplicationAccess().getModelsKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2__5__Impl"


    // $ANTLR start "rule__UIApplication__Group_2_4__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:947:1: rule__UIApplication__Group_2_4__0 : rule__UIApplication__Group_2_4__0__Impl rule__UIApplication__Group_2_4__1 ;
    public final void rule__UIApplication__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:951:1: ( rule__UIApplication__Group_2_4__0__Impl rule__UIApplication__Group_2_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:952:2: rule__UIApplication__Group_2_4__0__Impl rule__UIApplication__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__0__Impl_in_rule__UIApplication__Group_2_4__01870);
            rule__UIApplication__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__1_in_rule__UIApplication__Group_2_4__01873);
            rule__UIApplication__Group_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2_4__0"


    // $ANTLR start "rule__UIApplication__Group_2_4__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:959:1: rule__UIApplication__Group_2_4__0__Impl : ( '<model ref=' ) ;
    public final void rule__UIApplication__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:963:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:964:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:964:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:965:1: '<model ref='
            {
             before(grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_4_0()); 
            match(input,18,FOLLOW_18_in_rule__UIApplication__Group_2_4__0__Impl1901); 
             after(grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2_4__0__Impl"


    // $ANTLR start "rule__UIApplication__Group_2_4__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:978:1: rule__UIApplication__Group_2_4__1 : rule__UIApplication__Group_2_4__1__Impl rule__UIApplication__Group_2_4__2 ;
    public final void rule__UIApplication__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:982:1: ( rule__UIApplication__Group_2_4__1__Impl rule__UIApplication__Group_2_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:983:2: rule__UIApplication__Group_2_4__1__Impl rule__UIApplication__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__1__Impl_in_rule__UIApplication__Group_2_4__11932);
            rule__UIApplication__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__2_in_rule__UIApplication__Group_2_4__11935);
            rule__UIApplication__Group_2_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2_4__1"


    // $ANTLR start "rule__UIApplication__Group_2_4__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:990:1: rule__UIApplication__Group_2_4__1__Impl : ( ( rule__UIApplication__ModelsAssignment_2_4_1 ) ) ;
    public final void rule__UIApplication__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:994:1: ( ( ( rule__UIApplication__ModelsAssignment_2_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:995:1: ( ( rule__UIApplication__ModelsAssignment_2_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:995:1: ( ( rule__UIApplication__ModelsAssignment_2_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:996:1: ( rule__UIApplication__ModelsAssignment_2_4_1 )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsAssignment_2_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:997:1: ( rule__UIApplication__ModelsAssignment_2_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:997:2: rule__UIApplication__ModelsAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__UIApplication__ModelsAssignment_2_4_1_in_rule__UIApplication__Group_2_4__1__Impl1962);
            rule__UIApplication__ModelsAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getModelsAssignment_2_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2_4__1__Impl"


    // $ANTLR start "rule__UIApplication__Group_2_4__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1007:1: rule__UIApplication__Group_2_4__2 : rule__UIApplication__Group_2_4__2__Impl ;
    public final void rule__UIApplication__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1011:1: ( rule__UIApplication__Group_2_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1012:2: rule__UIApplication__Group_2_4__2__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__2__Impl_in_rule__UIApplication__Group_2_4__21992);
            rule__UIApplication__Group_2_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2_4__2"


    // $ANTLR start "rule__UIApplication__Group_2_4__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1018:1: rule__UIApplication__Group_2_4__2__Impl : ( ' />' ) ;
    public final void rule__UIApplication__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1022:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1023:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1023:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1024:1: ' />'
            {
             before(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_4_2()); 
            match(input,19,FOLLOW_19_in_rule__UIApplication__Group_2_4__2__Impl2020); 
             after(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_2_4__2__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1043:1: rule__UIApplication__Group_3__0 : rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1 ;
    public final void rule__UIApplication__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1047:1: ( rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1048:2: rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__0__Impl_in_rule__UIApplication__Group_3__02057);
            rule__UIApplication__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__1_in_rule__UIApplication__Group_3__02060);
            rule__UIApplication__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__0"


    // $ANTLR start "rule__UIApplication__Group_3__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1055:1: rule__UIApplication__Group_3__0__Impl : ( '<pages>' ) ;
    public final void rule__UIApplication__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1059:1: ( ( '<pages>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1060:1: ( '<pages>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1060:1: ( '<pages>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1061:1: '<pages>'
            {
             before(grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__UIApplication__Group_3__0__Impl2088); 
             after(grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__0__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1074:1: rule__UIApplication__Group_3__1 : rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2 ;
    public final void rule__UIApplication__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1078:1: ( rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1079:2: rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__1__Impl_in_rule__UIApplication__Group_3__12119);
            rule__UIApplication__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__2_in_rule__UIApplication__Group_3__12122);
            rule__UIApplication__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__1"


    // $ANTLR start "rule__UIApplication__Group_3__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1086:1: rule__UIApplication__Group_3__1__Impl : ( '<page ref=' ) ;
    public final void rule__UIApplication__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1090:1: ( ( '<page ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1091:1: ( '<page ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1091:1: ( '<page ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1092:1: '<page ref='
            {
             before(grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_1()); 
            match(input,22,FOLLOW_22_in_rule__UIApplication__Group_3__1__Impl2150); 
             after(grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__1__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1105:1: rule__UIApplication__Group_3__2 : rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3 ;
    public final void rule__UIApplication__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1109:1: ( rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1110:2: rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__2__Impl_in_rule__UIApplication__Group_3__22181);
            rule__UIApplication__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__3_in_rule__UIApplication__Group_3__22184);
            rule__UIApplication__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__2"


    // $ANTLR start "rule__UIApplication__Group_3__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1117:1: rule__UIApplication__Group_3__2__Impl : ( ( rule__UIApplication__PagesAssignment_3_2 ) ) ;
    public final void rule__UIApplication__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1121:1: ( ( ( rule__UIApplication__PagesAssignment_3_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1122:1: ( ( rule__UIApplication__PagesAssignment_3_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1122:1: ( ( rule__UIApplication__PagesAssignment_3_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1123:1: ( rule__UIApplication__PagesAssignment_3_2 )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1124:1: ( rule__UIApplication__PagesAssignment_3_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1124:2: rule__UIApplication__PagesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__UIApplication__PagesAssignment_3_2_in_rule__UIApplication__Group_3__2__Impl2211);
            rule__UIApplication__PagesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__2__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1134:1: rule__UIApplication__Group_3__3 : rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4 ;
    public final void rule__UIApplication__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1138:1: ( rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1139:2: rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__3__Impl_in_rule__UIApplication__Group_3__32241);
            rule__UIApplication__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__4_in_rule__UIApplication__Group_3__32244);
            rule__UIApplication__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__3"


    // $ANTLR start "rule__UIApplication__Group_3__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1146:1: rule__UIApplication__Group_3__3__Impl : ( ' />' ) ;
    public final void rule__UIApplication__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1150:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1151:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1151:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1152:1: ' />'
            {
             before(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_3()); 
            match(input,19,FOLLOW_19_in_rule__UIApplication__Group_3__3__Impl2272); 
             after(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__3__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__4"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1165:1: rule__UIApplication__Group_3__4 : rule__UIApplication__Group_3__4__Impl rule__UIApplication__Group_3__5 ;
    public final void rule__UIApplication__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1169:1: ( rule__UIApplication__Group_3__4__Impl rule__UIApplication__Group_3__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1170:2: rule__UIApplication__Group_3__4__Impl rule__UIApplication__Group_3__5
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__4__Impl_in_rule__UIApplication__Group_3__42303);
            rule__UIApplication__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__5_in_rule__UIApplication__Group_3__42306);
            rule__UIApplication__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__4"


    // $ANTLR start "rule__UIApplication__Group_3__4__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1177:1: rule__UIApplication__Group_3__4__Impl : ( ( rule__UIApplication__Group_3_4__0 )* ) ;
    public final void rule__UIApplication__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1181:1: ( ( ( rule__UIApplication__Group_3_4__0 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1182:1: ( ( rule__UIApplication__Group_3_4__0 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1182:1: ( ( rule__UIApplication__Group_3_4__0 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1183:1: ( rule__UIApplication__Group_3_4__0 )*
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_3_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1184:1: ( rule__UIApplication__Group_3_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1184:2: rule__UIApplication__Group_3_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UIApplication__Group_3_4__0_in_rule__UIApplication__Group_3__4__Impl2333);
            	    rule__UIApplication__Group_3_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUIApplicationAccess().getGroup_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__4__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__5"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1194:1: rule__UIApplication__Group_3__5 : rule__UIApplication__Group_3__5__Impl ;
    public final void rule__UIApplication__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1198:1: ( rule__UIApplication__Group_3__5__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1199:2: rule__UIApplication__Group_3__5__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__5__Impl_in_rule__UIApplication__Group_3__52364);
            rule__UIApplication__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__5"


    // $ANTLR start "rule__UIApplication__Group_3__5__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1205:1: rule__UIApplication__Group_3__5__Impl : ( '</pages>' ) ;
    public final void rule__UIApplication__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1209:1: ( ( '</pages>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1210:1: ( '</pages>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1210:1: ( '</pages>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1211:1: '</pages>'
            {
             before(grammarAccess.getUIApplicationAccess().getPagesKeyword_3_5()); 
            match(input,23,FOLLOW_23_in_rule__UIApplication__Group_3__5__Impl2392); 
             after(grammarAccess.getUIApplicationAccess().getPagesKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__5__Impl"


    // $ANTLR start "rule__UIApplication__Group_3_4__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1236:1: rule__UIApplication__Group_3_4__0 : rule__UIApplication__Group_3_4__0__Impl rule__UIApplication__Group_3_4__1 ;
    public final void rule__UIApplication__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1240:1: ( rule__UIApplication__Group_3_4__0__Impl rule__UIApplication__Group_3_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1241:2: rule__UIApplication__Group_3_4__0__Impl rule__UIApplication__Group_3_4__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__0__Impl_in_rule__UIApplication__Group_3_4__02435);
            rule__UIApplication__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__1_in_rule__UIApplication__Group_3_4__02438);
            rule__UIApplication__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_4__0"


    // $ANTLR start "rule__UIApplication__Group_3_4__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1248:1: rule__UIApplication__Group_3_4__0__Impl : ( '<page ref=' ) ;
    public final void rule__UIApplication__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1252:1: ( ( '<page ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1253:1: ( '<page ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1253:1: ( '<page ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1254:1: '<page ref='
            {
             before(grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_4_0()); 
            match(input,22,FOLLOW_22_in_rule__UIApplication__Group_3_4__0__Impl2466); 
             after(grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_4__0__Impl"


    // $ANTLR start "rule__UIApplication__Group_3_4__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1267:1: rule__UIApplication__Group_3_4__1 : rule__UIApplication__Group_3_4__1__Impl rule__UIApplication__Group_3_4__2 ;
    public final void rule__UIApplication__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1271:1: ( rule__UIApplication__Group_3_4__1__Impl rule__UIApplication__Group_3_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1272:2: rule__UIApplication__Group_3_4__1__Impl rule__UIApplication__Group_3_4__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__1__Impl_in_rule__UIApplication__Group_3_4__12497);
            rule__UIApplication__Group_3_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__2_in_rule__UIApplication__Group_3_4__12500);
            rule__UIApplication__Group_3_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_4__1"


    // $ANTLR start "rule__UIApplication__Group_3_4__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1279:1: rule__UIApplication__Group_3_4__1__Impl : ( ( rule__UIApplication__PagesAssignment_3_4_1 ) ) ;
    public final void rule__UIApplication__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1283:1: ( ( ( rule__UIApplication__PagesAssignment_3_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1284:1: ( ( rule__UIApplication__PagesAssignment_3_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1284:1: ( ( rule__UIApplication__PagesAssignment_3_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1285:1: ( rule__UIApplication__PagesAssignment_3_4_1 )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1286:1: ( rule__UIApplication__PagesAssignment_3_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1286:2: rule__UIApplication__PagesAssignment_3_4_1
            {
            pushFollow(FOLLOW_rule__UIApplication__PagesAssignment_3_4_1_in_rule__UIApplication__Group_3_4__1__Impl2527);
            rule__UIApplication__PagesAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_4__1__Impl"


    // $ANTLR start "rule__UIApplication__Group_3_4__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1296:1: rule__UIApplication__Group_3_4__2 : rule__UIApplication__Group_3_4__2__Impl ;
    public final void rule__UIApplication__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1300:1: ( rule__UIApplication__Group_3_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1301:2: rule__UIApplication__Group_3_4__2__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__2__Impl_in_rule__UIApplication__Group_3_4__22557);
            rule__UIApplication__Group_3_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_4__2"


    // $ANTLR start "rule__UIApplication__Group_3_4__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1307:1: rule__UIApplication__Group_3_4__2__Impl : ( ' />' ) ;
    public final void rule__UIApplication__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1311:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1312:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1312:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1313:1: ' />'
            {
             before(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_4_2()); 
            match(input,19,FOLLOW_19_in_rule__UIApplication__Group_3_4__2__Impl2585); 
             after(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_4__2__Impl"


    // $ANTLR start "rule__View__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1332:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1336:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1337:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__02622);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__02625);
            rule__View__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0"


    // $ANTLR start "rule__View__Group__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1344:1: rule__View__Group__0__Impl : ( () ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1348:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1349:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1349:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1350:1: ()
            {
             before(grammarAccess.getViewAccess().getViewAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1351:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1353:1: 
            {
            }

             after(grammarAccess.getViewAccess().getViewAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0__Impl"


    // $ANTLR start "rule__View__Group__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1363:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1367:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1368:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__12683);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__12686);
            rule__View__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1"


    // $ANTLR start "rule__View__Group__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1375:1: rule__View__Group__1__Impl : ( '<view id=' ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1379:1: ( ( '<view id=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1380:1: ( '<view id=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1380:1: ( '<view id=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1381:1: '<view id='
            {
             before(grammarAccess.getViewAccess().getViewIdKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__View__Group__1__Impl2714); 
             after(grammarAccess.getViewAccess().getViewIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1__Impl"


    // $ANTLR start "rule__View__Group__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1394:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1398:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1399:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__22745);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__22748);
            rule__View__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2"


    // $ANTLR start "rule__View__Group__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1406:1: rule__View__Group__2__Impl : ( ( rule__View__NameAssignment_2 ) ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1410:1: ( ( ( rule__View__NameAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1411:1: ( ( rule__View__NameAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1411:1: ( ( rule__View__NameAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1412:1: ( rule__View__NameAssignment_2 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1413:1: ( rule__View__NameAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1413:2: rule__View__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__2__Impl2775);
            rule__View__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2__Impl"


    // $ANTLR start "rule__View__Group__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1423:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1427:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1428:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__32805);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__4_in_rule__View__Group__32808);
            rule__View__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3"


    // $ANTLR start "rule__View__Group__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1435:1: rule__View__Group__3__Impl : ( ' >' ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1439:1: ( ( ' >' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1440:1: ( ' >' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1440:1: ( ' >' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1441:1: ' >'
            {
             before(grammarAccess.getViewAccess().getSpaceGreaterThanSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__View__Group__3__Impl2836); 
             after(grammarAccess.getViewAccess().getSpaceGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3__Impl"


    // $ANTLR start "rule__View__Group__4"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1454:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1458:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1459:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__42867);
            rule__View__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__5_in_rule__View__Group__42870);
            rule__View__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4"


    // $ANTLR start "rule__View__Group__4__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1466:1: rule__View__Group__4__Impl : ( ( rule__View__Group_4__0 )? ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1470:1: ( ( ( rule__View__Group_4__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1471:1: ( ( rule__View__Group_4__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1471:1: ( ( rule__View__Group_4__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1472:1: ( rule__View__Group_4__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1473:1: ( rule__View__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1473:2: rule__View__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_4__0_in_rule__View__Group__4__Impl2897);
                    rule__View__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4__Impl"


    // $ANTLR start "rule__View__Group__5"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1483:1: rule__View__Group__5 : rule__View__Group__5__Impl rule__View__Group__6 ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1487:1: ( rule__View__Group__5__Impl rule__View__Group__6 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1488:2: rule__View__Group__5__Impl rule__View__Group__6
            {
            pushFollow(FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__52928);
            rule__View__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__6_in_rule__View__Group__52931);
            rule__View__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5"


    // $ANTLR start "rule__View__Group__5__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1495:1: rule__View__Group__5__Impl : ( '<model ref=' ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1499:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1500:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1500:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1501:1: '<model ref='
            {
             before(grammarAccess.getViewAccess().getModelRefKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__View__Group__5__Impl2959); 
             after(grammarAccess.getViewAccess().getModelRefKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5__Impl"


    // $ANTLR start "rule__View__Group__6"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1514:1: rule__View__Group__6 : rule__View__Group__6__Impl rule__View__Group__7 ;
    public final void rule__View__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1518:1: ( rule__View__Group__6__Impl rule__View__Group__7 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1519:2: rule__View__Group__6__Impl rule__View__Group__7
            {
            pushFollow(FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__62990);
            rule__View__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__7_in_rule__View__Group__62993);
            rule__View__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__6"


    // $ANTLR start "rule__View__Group__6__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1526:1: rule__View__Group__6__Impl : ( ( rule__View__ModelAssignment_6 ) ) ;
    public final void rule__View__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1530:1: ( ( ( rule__View__ModelAssignment_6 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1531:1: ( ( rule__View__ModelAssignment_6 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1531:1: ( ( rule__View__ModelAssignment_6 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1532:1: ( rule__View__ModelAssignment_6 )
            {
             before(grammarAccess.getViewAccess().getModelAssignment_6()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1533:1: ( rule__View__ModelAssignment_6 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1533:2: rule__View__ModelAssignment_6
            {
            pushFollow(FOLLOW_rule__View__ModelAssignment_6_in_rule__View__Group__6__Impl3020);
            rule__View__ModelAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getModelAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__6__Impl"


    // $ANTLR start "rule__View__Group__7"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1543:1: rule__View__Group__7 : rule__View__Group__7__Impl rule__View__Group__8 ;
    public final void rule__View__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1547:1: ( rule__View__Group__7__Impl rule__View__Group__8 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1548:2: rule__View__Group__7__Impl rule__View__Group__8
            {
            pushFollow(FOLLOW_rule__View__Group__7__Impl_in_rule__View__Group__73050);
            rule__View__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__8_in_rule__View__Group__73053);
            rule__View__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__7"


    // $ANTLR start "rule__View__Group__7__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1555:1: rule__View__Group__7__Impl : ( ' />' ) ;
    public final void rule__View__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1559:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1560:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1560:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1561:1: ' />'
            {
             before(grammarAccess.getViewAccess().getSpaceSolidusGreaterThanSignKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__View__Group__7__Impl3081); 
             after(grammarAccess.getViewAccess().getSpaceSolidusGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__7__Impl"


    // $ANTLR start "rule__View__Group__8"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1574:1: rule__View__Group__8 : rule__View__Group__8__Impl rule__View__Group__9 ;
    public final void rule__View__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1578:1: ( rule__View__Group__8__Impl rule__View__Group__9 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1579:2: rule__View__Group__8__Impl rule__View__Group__9
            {
            pushFollow(FOLLOW_rule__View__Group__8__Impl_in_rule__View__Group__83112);
            rule__View__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__9_in_rule__View__Group__83115);
            rule__View__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__8"


    // $ANTLR start "rule__View__Group__8__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1586:1: rule__View__Group__8__Impl : ( ( rule__View__Group_8__0 )? ) ;
    public final void rule__View__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1590:1: ( ( ( rule__View__Group_8__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1591:1: ( ( rule__View__Group_8__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1591:1: ( ( rule__View__Group_8__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1592:1: ( rule__View__Group_8__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_8()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1593:1: ( rule__View__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1593:2: rule__View__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_8__0_in_rule__View__Group__8__Impl3142);
                    rule__View__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__8__Impl"


    // $ANTLR start "rule__View__Group__9"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1603:1: rule__View__Group__9 : rule__View__Group__9__Impl ;
    public final void rule__View__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1607:1: ( rule__View__Group__9__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1608:2: rule__View__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__View__Group__9__Impl_in_rule__View__Group__93173);
            rule__View__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__9"


    // $ANTLR start "rule__View__Group__9__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1614:1: rule__View__Group__9__Impl : ( '</view>' ) ;
    public final void rule__View__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1618:1: ( ( '</view>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1619:1: ( '</view>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1619:1: ( '</view>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1620:1: '</view>'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_9()); 
            match(input,26,FOLLOW_26_in_rule__View__Group__9__Impl3201); 
             after(grammarAccess.getViewAccess().getViewKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__9__Impl"


    // $ANTLR start "rule__View__Group_4__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1653:1: rule__View__Group_4__0 : rule__View__Group_4__0__Impl rule__View__Group_4__1 ;
    public final void rule__View__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1657:1: ( rule__View__Group_4__0__Impl rule__View__Group_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1658:2: rule__View__Group_4__0__Impl rule__View__Group_4__1
            {
            pushFollow(FOLLOW_rule__View__Group_4__0__Impl_in_rule__View__Group_4__03252);
            rule__View__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_4__1_in_rule__View__Group_4__03255);
            rule__View__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__0"


    // $ANTLR start "rule__View__Group_4__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1665:1: rule__View__Group_4__0__Impl : ( '<description>' ) ;
    public final void rule__View__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1669:1: ( ( '<description>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1670:1: ( '<description>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1670:1: ( '<description>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1671:1: '<description>'
            {
             before(grammarAccess.getViewAccess().getDescriptionKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__View__Group_4__0__Impl3283); 
             after(grammarAccess.getViewAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__0__Impl"


    // $ANTLR start "rule__View__Group_4__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1684:1: rule__View__Group_4__1 : rule__View__Group_4__1__Impl rule__View__Group_4__2 ;
    public final void rule__View__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1688:1: ( rule__View__Group_4__1__Impl rule__View__Group_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1689:2: rule__View__Group_4__1__Impl rule__View__Group_4__2
            {
            pushFollow(FOLLOW_rule__View__Group_4__1__Impl_in_rule__View__Group_4__13314);
            rule__View__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_4__2_in_rule__View__Group_4__13317);
            rule__View__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__1"


    // $ANTLR start "rule__View__Group_4__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1696:1: rule__View__Group_4__1__Impl : ( ( rule__View__DescriptionAssignment_4_1 ) ) ;
    public final void rule__View__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1700:1: ( ( ( rule__View__DescriptionAssignment_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1701:1: ( ( rule__View__DescriptionAssignment_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1701:1: ( ( rule__View__DescriptionAssignment_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1702:1: ( rule__View__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getViewAccess().getDescriptionAssignment_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1703:1: ( rule__View__DescriptionAssignment_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1703:2: rule__View__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__View__DescriptionAssignment_4_1_in_rule__View__Group_4__1__Impl3344);
            rule__View__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__1__Impl"


    // $ANTLR start "rule__View__Group_4__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1713:1: rule__View__Group_4__2 : rule__View__Group_4__2__Impl ;
    public final void rule__View__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1717:1: ( rule__View__Group_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1718:2: rule__View__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_4__2__Impl_in_rule__View__Group_4__23374);
            rule__View__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__2"


    // $ANTLR start "rule__View__Group_4__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1724:1: rule__View__Group_4__2__Impl : ( '</description>' ) ;
    public final void rule__View__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1728:1: ( ( '</description>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1729:1: ( '</description>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1729:1: ( '</description>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1730:1: '</description>'
            {
             before(grammarAccess.getViewAccess().getDescriptionKeyword_4_2()); 
            match(input,28,FOLLOW_28_in_rule__View__Group_4__2__Impl3402); 
             after(grammarAccess.getViewAccess().getDescriptionKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__2__Impl"


    // $ANTLR start "rule__View__Group_8__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1749:1: rule__View__Group_8__0 : rule__View__Group_8__0__Impl rule__View__Group_8__1 ;
    public final void rule__View__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1753:1: ( rule__View__Group_8__0__Impl rule__View__Group_8__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1754:2: rule__View__Group_8__0__Impl rule__View__Group_8__1
            {
            pushFollow(FOLLOW_rule__View__Group_8__0__Impl_in_rule__View__Group_8__03439);
            rule__View__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_8__1_in_rule__View__Group_8__03442);
            rule__View__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_8__0"


    // $ANTLR start "rule__View__Group_8__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1761:1: rule__View__Group_8__0__Impl : ( '<actions>' ) ;
    public final void rule__View__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1765:1: ( ( '<actions>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1766:1: ( '<actions>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1766:1: ( '<actions>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1767:1: '<actions>'
            {
             before(grammarAccess.getViewAccess().getActionsKeyword_8_0()); 
            match(input,29,FOLLOW_29_in_rule__View__Group_8__0__Impl3470); 
             after(grammarAccess.getViewAccess().getActionsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_8__0__Impl"


    // $ANTLR start "rule__View__Group_8__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1780:1: rule__View__Group_8__1 : rule__View__Group_8__1__Impl rule__View__Group_8__2 ;
    public final void rule__View__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1784:1: ( rule__View__Group_8__1__Impl rule__View__Group_8__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1785:2: rule__View__Group_8__1__Impl rule__View__Group_8__2
            {
            pushFollow(FOLLOW_rule__View__Group_8__1__Impl_in_rule__View__Group_8__13501);
            rule__View__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_8__2_in_rule__View__Group_8__13504);
            rule__View__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_8__1"


    // $ANTLR start "rule__View__Group_8__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1792:1: rule__View__Group_8__1__Impl : ( ( rule__View__ActionsAssignment_8_1 ) ) ;
    public final void rule__View__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1796:1: ( ( ( rule__View__ActionsAssignment_8_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1797:1: ( ( rule__View__ActionsAssignment_8_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1797:1: ( ( rule__View__ActionsAssignment_8_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1798:1: ( rule__View__ActionsAssignment_8_1 )
            {
             before(grammarAccess.getViewAccess().getActionsAssignment_8_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1799:1: ( rule__View__ActionsAssignment_8_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1799:2: rule__View__ActionsAssignment_8_1
            {
            pushFollow(FOLLOW_rule__View__ActionsAssignment_8_1_in_rule__View__Group_8__1__Impl3531);
            rule__View__ActionsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getActionsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_8__1__Impl"


    // $ANTLR start "rule__View__Group_8__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1809:1: rule__View__Group_8__2 : rule__View__Group_8__2__Impl rule__View__Group_8__3 ;
    public final void rule__View__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1813:1: ( rule__View__Group_8__2__Impl rule__View__Group_8__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1814:2: rule__View__Group_8__2__Impl rule__View__Group_8__3
            {
            pushFollow(FOLLOW_rule__View__Group_8__2__Impl_in_rule__View__Group_8__23561);
            rule__View__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_8__3_in_rule__View__Group_8__23564);
            rule__View__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_8__2"


    // $ANTLR start "rule__View__Group_8__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1821:1: rule__View__Group_8__2__Impl : ( ( rule__View__ActionsAssignment_8_2 )* ) ;
    public final void rule__View__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1825:1: ( ( ( rule__View__ActionsAssignment_8_2 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1826:1: ( ( rule__View__ActionsAssignment_8_2 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1826:1: ( ( rule__View__ActionsAssignment_8_2 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1827:1: ( rule__View__ActionsAssignment_8_2 )*
            {
             before(grammarAccess.getViewAccess().getActionsAssignment_8_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1828:1: ( rule__View__ActionsAssignment_8_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1828:2: rule__View__ActionsAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__View__ActionsAssignment_8_2_in_rule__View__Group_8__2__Impl3591);
            	    rule__View__ActionsAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getActionsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_8__2__Impl"


    // $ANTLR start "rule__View__Group_8__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1838:1: rule__View__Group_8__3 : rule__View__Group_8__3__Impl ;
    public final void rule__View__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1842:1: ( rule__View__Group_8__3__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1843:2: rule__View__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_8__3__Impl_in_rule__View__Group_8__33622);
            rule__View__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_8__3"


    // $ANTLR start "rule__View__Group_8__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1849:1: rule__View__Group_8__3__Impl : ( '</actions>' ) ;
    public final void rule__View__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1853:1: ( ( '</actions>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1854:1: ( '</actions>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1854:1: ( '</actions>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1855:1: '</actions>'
            {
             before(grammarAccess.getViewAccess().getActionsKeyword_8_3()); 
            match(input,30,FOLLOW_30_in_rule__View__Group_8__3__Impl3650); 
             after(grammarAccess.getViewAccess().getActionsKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_8__3__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1876:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1880:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1881:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03689);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03692);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1888:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1892:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1893:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1893:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1894:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1895:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1897:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1907:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1911:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1912:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13750);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13753);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1919:1: rule__Model__Group__1__Impl : ( '<model id=' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1923:1: ( ( '<model id=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1924:1: ( '<model id=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1924:1: ( '<model id=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1925:1: '<model id='
            {
             before(grammarAccess.getModelAccess().getModelIdKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Model__Group__1__Impl3781); 
             after(grammarAccess.getModelAccess().getModelIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1938:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1942:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1943:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23812);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23815);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1950:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1954:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1955:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1955:1: ( ( rule__Model__NameAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1956:1: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1957:1: ( rule__Model__NameAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1957:2: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl3842);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1967:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1971:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1972:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33872);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33875);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1979:1: rule__Model__Group__3__Impl : ( ' >' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1983:1: ( ( ' >' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1984:1: ( ' >' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1984:1: ( ' >' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1985:1: ' >'
            {
             before(grammarAccess.getModelAccess().getSpaceGreaterThanSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__3__Impl3903); 
             after(grammarAccess.getModelAccess().getSpaceGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1998:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2002:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2003:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43934);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43937);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2010:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2014:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2015:1: ( ( rule__Model__Group_4__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2015:1: ( ( rule__Model__Group_4__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2016:1: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2017:1: ( rule__Model__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2017:2: rule__Model__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl3964);
                    rule__Model__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2027:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2031:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2032:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53995);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__53998);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2039:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2043:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2044:1: ( ( rule__Model__Group_5__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2044:1: ( ( rule__Model__Group_5__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2045:1: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2046:1: ( rule__Model__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2046:2: rule__Model__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_5__0_in_rule__Model__Group__5__Impl4025);
                    rule__Model__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2056:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2060:1: ( rule__Model__Group__6__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2061:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__64056);
            rule__Model__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2067:1: rule__Model__Group__6__Impl : ( '</model>' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2071:1: ( ( '</model>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2072:1: ( '</model>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2072:1: ( '</model>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2073:1: '</model>'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__Model__Group__6__Impl4084); 
             after(grammarAccess.getModelAccess().getModelKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2100:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2104:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2105:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__04129);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__04132);
            rule__Model__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2112:1: rule__Model__Group_4__0__Impl : ( '<properties>' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2116:1: ( ( '<properties>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2117:1: ( '<properties>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2117:1: ( '<properties>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2118:1: '<properties>'
            {
             before(grammarAccess.getModelAccess().getPropertiesKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Model__Group_4__0__Impl4160); 
             after(grammarAccess.getModelAccess().getPropertiesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2131:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2135:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2136:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
            {
            pushFollow(FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__14191);
            rule__Model__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__2_in_rule__Model__Group_4__14194);
            rule__Model__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2143:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__PropertiesAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2147:1: ( ( ( rule__Model__PropertiesAssignment_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2148:1: ( ( rule__Model__PropertiesAssignment_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2148:1: ( ( rule__Model__PropertiesAssignment_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2149:1: ( rule__Model__PropertiesAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2150:1: ( rule__Model__PropertiesAssignment_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2150:2: rule__Model__PropertiesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Model__PropertiesAssignment_4_1_in_rule__Model__Group_4__1__Impl4221);
            rule__Model__PropertiesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPropertiesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Model__Group_4__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2160:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2164:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2165:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
            {
            pushFollow(FOLLOW_rule__Model__Group_4__2__Impl_in_rule__Model__Group_4__24251);
            rule__Model__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__3_in_rule__Model__Group_4__24254);
            rule__Model__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__2"


    // $ANTLR start "rule__Model__Group_4__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2172:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__PropertiesAssignment_4_2 )* ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2176:1: ( ( ( rule__Model__PropertiesAssignment_4_2 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2177:1: ( ( rule__Model__PropertiesAssignment_4_2 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2177:1: ( ( rule__Model__PropertiesAssignment_4_2 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2178:1: ( rule__Model__PropertiesAssignment_4_2 )*
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_4_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2179:1: ( rule__Model__PropertiesAssignment_4_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2179:2: rule__Model__PropertiesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PropertiesAssignment_4_2_in_rule__Model__Group_4__2__Impl4281);
            	    rule__Model__PropertiesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPropertiesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__2__Impl"


    // $ANTLR start "rule__Model__Group_4__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2189:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2193:1: ( rule__Model__Group_4__3__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2194:2: rule__Model__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_4__3__Impl_in_rule__Model__Group_4__34312);
            rule__Model__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__3"


    // $ANTLR start "rule__Model__Group_4__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2200:1: rule__Model__Group_4__3__Impl : ( '</properties>' ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2204:1: ( ( '</properties>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2205:1: ( '</properties>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2205:1: ( '</properties>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2206:1: '</properties>'
            {
             before(grammarAccess.getModelAccess().getPropertiesKeyword_4_3()); 
            match(input,34,FOLLOW_34_in_rule__Model__Group_4__3__Impl4340); 
             after(grammarAccess.getModelAccess().getPropertiesKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__3__Impl"


    // $ANTLR start "rule__Model__Group_5__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2227:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2231:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2232:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
            {
            pushFollow(FOLLOW_rule__Model__Group_5__0__Impl_in_rule__Model__Group_5__04379);
            rule__Model__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__1_in_rule__Model__Group_5__04382);
            rule__Model__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__0"


    // $ANTLR start "rule__Model__Group_5__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2239:1: rule__Model__Group_5__0__Impl : ( '<ownedElements>' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2243:1: ( ( '<ownedElements>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2244:1: ( '<ownedElements>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2244:1: ( '<ownedElements>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2245:1: '<ownedElements>'
            {
             before(grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0()); 
            match(input,35,FOLLOW_35_in_rule__Model__Group_5__0__Impl4410); 
             after(grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__0__Impl"


    // $ANTLR start "rule__Model__Group_5__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2258:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2262:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2263:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
            {
            pushFollow(FOLLOW_rule__Model__Group_5__1__Impl_in_rule__Model__Group_5__14441);
            rule__Model__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__2_in_rule__Model__Group_5__14444);
            rule__Model__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__1"


    // $ANTLR start "rule__Model__Group_5__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2270:1: rule__Model__Group_5__1__Impl : ( '<model ref=' ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2274:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2275:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2275:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2276:1: '<model ref='
            {
             before(grammarAccess.getModelAccess().getModelRefKeyword_5_1()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group_5__1__Impl4472); 
             after(grammarAccess.getModelAccess().getModelRefKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__1__Impl"


    // $ANTLR start "rule__Model__Group_5__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2289:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl rule__Model__Group_5__3 ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2293:1: ( rule__Model__Group_5__2__Impl rule__Model__Group_5__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2294:2: rule__Model__Group_5__2__Impl rule__Model__Group_5__3
            {
            pushFollow(FOLLOW_rule__Model__Group_5__2__Impl_in_rule__Model__Group_5__24503);
            rule__Model__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__3_in_rule__Model__Group_5__24506);
            rule__Model__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__2"


    // $ANTLR start "rule__Model__Group_5__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2301:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__OwnedElementsAssignment_5_2 ) ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2305:1: ( ( ( rule__Model__OwnedElementsAssignment_5_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2306:1: ( ( rule__Model__OwnedElementsAssignment_5_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2306:1: ( ( rule__Model__OwnedElementsAssignment_5_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2307:1: ( rule__Model__OwnedElementsAssignment_5_2 )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2308:1: ( rule__Model__OwnedElementsAssignment_5_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2308:2: rule__Model__OwnedElementsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Model__OwnedElementsAssignment_5_2_in_rule__Model__Group_5__2__Impl4533);
            rule__Model__OwnedElementsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__2__Impl"


    // $ANTLR start "rule__Model__Group_5__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2318:1: rule__Model__Group_5__3 : rule__Model__Group_5__3__Impl rule__Model__Group_5__4 ;
    public final void rule__Model__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2322:1: ( rule__Model__Group_5__3__Impl rule__Model__Group_5__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2323:2: rule__Model__Group_5__3__Impl rule__Model__Group_5__4
            {
            pushFollow(FOLLOW_rule__Model__Group_5__3__Impl_in_rule__Model__Group_5__34563);
            rule__Model__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__4_in_rule__Model__Group_5__34566);
            rule__Model__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__3"


    // $ANTLR start "rule__Model__Group_5__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2330:1: rule__Model__Group_5__3__Impl : ( ' />' ) ;
    public final void rule__Model__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2334:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2335:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2335:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2336:1: ' />'
            {
             before(grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_3()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group_5__3__Impl4594); 
             after(grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__3__Impl"


    // $ANTLR start "rule__Model__Group_5__4"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2349:1: rule__Model__Group_5__4 : rule__Model__Group_5__4__Impl rule__Model__Group_5__5 ;
    public final void rule__Model__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2353:1: ( rule__Model__Group_5__4__Impl rule__Model__Group_5__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2354:2: rule__Model__Group_5__4__Impl rule__Model__Group_5__5
            {
            pushFollow(FOLLOW_rule__Model__Group_5__4__Impl_in_rule__Model__Group_5__44625);
            rule__Model__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__5_in_rule__Model__Group_5__44628);
            rule__Model__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__4"


    // $ANTLR start "rule__Model__Group_5__4__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2361:1: rule__Model__Group_5__4__Impl : ( ( rule__Model__Group_5_4__0 )* ) ;
    public final void rule__Model__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2365:1: ( ( ( rule__Model__Group_5_4__0 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2366:1: ( ( rule__Model__Group_5_4__0 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2366:1: ( ( rule__Model__Group_5_4__0 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2367:1: ( rule__Model__Group_5_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_5_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2368:1: ( rule__Model__Group_5_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2368:2: rule__Model__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_5_4__0_in_rule__Model__Group_5__4__Impl4655);
            	    rule__Model__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__4__Impl"


    // $ANTLR start "rule__Model__Group_5__5"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2378:1: rule__Model__Group_5__5 : rule__Model__Group_5__5__Impl ;
    public final void rule__Model__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2382:1: ( rule__Model__Group_5__5__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2383:2: rule__Model__Group_5__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_5__5__Impl_in_rule__Model__Group_5__54686);
            rule__Model__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__5"


    // $ANTLR start "rule__Model__Group_5__5__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2389:1: rule__Model__Group_5__5__Impl : ( '</ownedElements>' ) ;
    public final void rule__Model__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2393:1: ( ( '</ownedElements>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2394:1: ( '</ownedElements>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2394:1: ( '</ownedElements>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2395:1: '</ownedElements>'
            {
             before(grammarAccess.getModelAccess().getOwnedElementsKeyword_5_5()); 
            match(input,36,FOLLOW_36_in_rule__Model__Group_5__5__Impl4714); 
             after(grammarAccess.getModelAccess().getOwnedElementsKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__5__Impl"


    // $ANTLR start "rule__Model__Group_5_4__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2420:1: rule__Model__Group_5_4__0 : rule__Model__Group_5_4__0__Impl rule__Model__Group_5_4__1 ;
    public final void rule__Model__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2424:1: ( rule__Model__Group_5_4__0__Impl rule__Model__Group_5_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2425:2: rule__Model__Group_5_4__0__Impl rule__Model__Group_5_4__1
            {
            pushFollow(FOLLOW_rule__Model__Group_5_4__0__Impl_in_rule__Model__Group_5_4__04757);
            rule__Model__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5_4__1_in_rule__Model__Group_5_4__04760);
            rule__Model__Group_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_4__0"


    // $ANTLR start "rule__Model__Group_5_4__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2432:1: rule__Model__Group_5_4__0__Impl : ( '<model ref=' ) ;
    public final void rule__Model__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2436:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2437:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2437:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2438:1: '<model ref='
            {
             before(grammarAccess.getModelAccess().getModelRefKeyword_5_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group_5_4__0__Impl4788); 
             after(grammarAccess.getModelAccess().getModelRefKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_4__0__Impl"


    // $ANTLR start "rule__Model__Group_5_4__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2451:1: rule__Model__Group_5_4__1 : rule__Model__Group_5_4__1__Impl rule__Model__Group_5_4__2 ;
    public final void rule__Model__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2455:1: ( rule__Model__Group_5_4__1__Impl rule__Model__Group_5_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2456:2: rule__Model__Group_5_4__1__Impl rule__Model__Group_5_4__2
            {
            pushFollow(FOLLOW_rule__Model__Group_5_4__1__Impl_in_rule__Model__Group_5_4__14819);
            rule__Model__Group_5_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5_4__2_in_rule__Model__Group_5_4__14822);
            rule__Model__Group_5_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_4__1"


    // $ANTLR start "rule__Model__Group_5_4__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2463:1: rule__Model__Group_5_4__1__Impl : ( ( rule__Model__OwnedElementsAssignment_5_4_1 ) ) ;
    public final void rule__Model__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2467:1: ( ( ( rule__Model__OwnedElementsAssignment_5_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2468:1: ( ( rule__Model__OwnedElementsAssignment_5_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2468:1: ( ( rule__Model__OwnedElementsAssignment_5_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2469:1: ( rule__Model__OwnedElementsAssignment_5_4_1 )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2470:1: ( rule__Model__OwnedElementsAssignment_5_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2470:2: rule__Model__OwnedElementsAssignment_5_4_1
            {
            pushFollow(FOLLOW_rule__Model__OwnedElementsAssignment_5_4_1_in_rule__Model__Group_5_4__1__Impl4849);
            rule__Model__OwnedElementsAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_4__1__Impl"


    // $ANTLR start "rule__Model__Group_5_4__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2480:1: rule__Model__Group_5_4__2 : rule__Model__Group_5_4__2__Impl ;
    public final void rule__Model__Group_5_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2484:1: ( rule__Model__Group_5_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2485:2: rule__Model__Group_5_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_5_4__2__Impl_in_rule__Model__Group_5_4__24879);
            rule__Model__Group_5_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_4__2"


    // $ANTLR start "rule__Model__Group_5_4__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2491:1: rule__Model__Group_5_4__2__Impl : ( ' />' ) ;
    public final void rule__Model__Group_5_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2495:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2496:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2496:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2497:1: ' />'
            {
             before(grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_4_2()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group_5_4__2__Impl4907); 
             after(grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_4__2__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2516:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2520:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2521:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04944);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04947);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2528:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2532:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2533:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2533:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2534:1: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2535:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2537:1: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2547:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2551:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2552:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__15005);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__15008);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2559:1: rule__Action__Group__1__Impl : ( '<action name=' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2563:1: ( ( '<action name=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2564:1: ( '<action name=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2564:1: ( '<action name=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2565:1: '<action name='
            {
             before(grammarAccess.getActionAccess().getActionNameKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Action__Group__1__Impl5036); 
             after(grammarAccess.getActionAccess().getActionNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2578:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2582:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2583:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__25067);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__25070);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2590:1: rule__Action__Group__2__Impl : ( ( rule__Action__NameAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2594:1: ( ( ( rule__Action__NameAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2595:1: ( ( rule__Action__NameAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2595:1: ( ( rule__Action__NameAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2596:1: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2597:1: ( rule__Action__NameAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2597:2: rule__Action__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__2__Impl5097);
            rule__Action__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2607:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2611:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2612:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__35127);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__35130);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2619:1: rule__Action__Group__3__Impl : ( ' >' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2623:1: ( ( ' >' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2624:1: ( ' >' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2624:1: ( ' >' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2625:1: ' >'
            {
             before(grammarAccess.getActionAccess().getSpaceGreaterThanSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Action__Group__3__Impl5158); 
             after(grammarAccess.getActionAccess().getSpaceGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2638:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2642:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2643:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__45189);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__45192);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2650:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2654:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2655:1: ( ( rule__Action__Group_4__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2655:1: ( ( rule__Action__Group_4__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2656:1: ( rule__Action__Group_4__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2657:1: ( rule__Action__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2657:2: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl5219);
                    rule__Action__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2667:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2671:1: ( rule__Action__Group__5__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2672:2: rule__Action__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__55250);
            rule__Action__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2678:1: rule__Action__Group__5__Impl : ( '</action>' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2682:1: ( ( '</action>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2683:1: ( '</action>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2683:1: ( '</action>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2684:1: '</action>'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_5()); 
            match(input,38,FOLLOW_38_in_rule__Action__Group__5__Impl5278); 
             after(grammarAccess.getActionAccess().getActionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2709:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2713:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2714:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__05321);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__05324);
            rule__Action__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2721:1: rule__Action__Group_4__0__Impl : ( '<nextPage ref=' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2725:1: ( ( '<nextPage ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2726:1: ( '<nextPage ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2726:1: ( '<nextPage ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2727:1: '<nextPage ref='
            {
             before(grammarAccess.getActionAccess().getNextPageRefKeyword_4_0()); 
            match(input,39,FOLLOW_39_in_rule__Action__Group_4__0__Impl5352); 
             after(grammarAccess.getActionAccess().getNextPageRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2740:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl rule__Action__Group_4__2 ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2744:1: ( rule__Action__Group_4__1__Impl rule__Action__Group_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2745:2: rule__Action__Group_4__1__Impl rule__Action__Group_4__2
            {
            pushFollow(FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__15383);
            rule__Action__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group_4__2_in_rule__Action__Group_4__15386);
            rule__Action__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2752:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__NextPageAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2756:1: ( ( ( rule__Action__NextPageAssignment_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2757:1: ( ( rule__Action__NextPageAssignment_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2757:1: ( ( rule__Action__NextPageAssignment_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2758:1: ( rule__Action__NextPageAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getNextPageAssignment_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2759:1: ( rule__Action__NextPageAssignment_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2759:2: rule__Action__NextPageAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Action__NextPageAssignment_4_1_in_rule__Action__Group_4__1__Impl5413);
            rule__Action__NextPageAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNextPageAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__Action__Group_4__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2769:1: rule__Action__Group_4__2 : rule__Action__Group_4__2__Impl ;
    public final void rule__Action__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2773:1: ( rule__Action__Group_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2774:2: rule__Action__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_4__2__Impl_in_rule__Action__Group_4__25443);
            rule__Action__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__2"


    // $ANTLR start "rule__Action__Group_4__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2780:1: rule__Action__Group_4__2__Impl : ( ' />' ) ;
    public final void rule__Action__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2784:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2785:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2785:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2786:1: ' />'
            {
             before(grammarAccess.getActionAccess().getSpaceSolidusGreaterThanSignKeyword_4_2()); 
            match(input,19,FOLLOW_19_in_rule__Action__Group_4__2__Impl5471); 
             after(grammarAccess.getActionAccess().getSpaceSolidusGreaterThanSignKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__2__Impl"


    // $ANTLR start "rule__ModelProperty__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2805:1: rule__ModelProperty__Group__0 : rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 ;
    public final void rule__ModelProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2809:1: ( rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2810:2: rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__0__Impl_in_rule__ModelProperty__Group__05508);
            rule__ModelProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelProperty__Group__1_in_rule__ModelProperty__Group__05511);
            rule__ModelProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__0"


    // $ANTLR start "rule__ModelProperty__Group__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2817:1: rule__ModelProperty__Group__0__Impl : ( () ) ;
    public final void rule__ModelProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2821:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2822:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2822:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2823:1: ()
            {
             before(grammarAccess.getModelPropertyAccess().getModelPropertyAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2824:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2826:1: 
            {
            }

             after(grammarAccess.getModelPropertyAccess().getModelPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__0__Impl"


    // $ANTLR start "rule__ModelProperty__Group__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2836:1: rule__ModelProperty__Group__1 : rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2 ;
    public final void rule__ModelProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2840:1: ( rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2841:2: rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__1__Impl_in_rule__ModelProperty__Group__15569);
            rule__ModelProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelProperty__Group__2_in_rule__ModelProperty__Group__15572);
            rule__ModelProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__1"


    // $ANTLR start "rule__ModelProperty__Group__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2848:1: rule__ModelProperty__Group__1__Impl : ( '<modelProperty name=' ) ;
    public final void rule__ModelProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2852:1: ( ( '<modelProperty name=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2853:1: ( '<modelProperty name=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2853:1: ( '<modelProperty name=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2854:1: '<modelProperty name='
            {
             before(grammarAccess.getModelPropertyAccess().getModelPropertyNameKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__ModelProperty__Group__1__Impl5600); 
             after(grammarAccess.getModelPropertyAccess().getModelPropertyNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__1__Impl"


    // $ANTLR start "rule__ModelProperty__Group__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2867:1: rule__ModelProperty__Group__2 : rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3 ;
    public final void rule__ModelProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2871:1: ( rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2872:2: rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__2__Impl_in_rule__ModelProperty__Group__25631);
            rule__ModelProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelProperty__Group__3_in_rule__ModelProperty__Group__25634);
            rule__ModelProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__2"


    // $ANTLR start "rule__ModelProperty__Group__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2879:1: rule__ModelProperty__Group__2__Impl : ( ( rule__ModelProperty__NameAssignment_2 ) ) ;
    public final void rule__ModelProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2883:1: ( ( ( rule__ModelProperty__NameAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2884:1: ( ( rule__ModelProperty__NameAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2884:1: ( ( rule__ModelProperty__NameAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2885:1: ( rule__ModelProperty__NameAssignment_2 )
            {
             before(grammarAccess.getModelPropertyAccess().getNameAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2886:1: ( rule__ModelProperty__NameAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2886:2: rule__ModelProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelProperty__NameAssignment_2_in_rule__ModelProperty__Group__2__Impl5661);
            rule__ModelProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__2__Impl"


    // $ANTLR start "rule__ModelProperty__Group__3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2896:1: rule__ModelProperty__Group__3 : rule__ModelProperty__Group__3__Impl ;
    public final void rule__ModelProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2900:1: ( rule__ModelProperty__Group__3__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2901:2: rule__ModelProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__3__Impl_in_rule__ModelProperty__Group__35691);
            rule__ModelProperty__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__3"


    // $ANTLR start "rule__ModelProperty__Group__3__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2907:1: rule__ModelProperty__Group__3__Impl : ( ' />' ) ;
    public final void rule__ModelProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2911:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2912:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2912:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2913:1: ' />'
            {
             before(grammarAccess.getModelPropertyAccess().getSpaceSolidusGreaterThanSignKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__ModelProperty__Group__3__Impl5719); 
             after(grammarAccess.getModelPropertyAccess().getSpaceSolidusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__3__Impl"


    // $ANTLR start "rule__Package__ViewsAssignment_1_0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2935:1: rule__Package__ViewsAssignment_1_0 : ( ruleView ) ;
    public final void rule__Package__ViewsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2939:1: ( ( ruleView ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2940:1: ( ruleView )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2940:1: ( ruleView )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2941:1: ruleView
            {
             before(grammarAccess.getPackageAccess().getViewsViewParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleView_in_rule__Package__ViewsAssignment_1_05763);
            ruleView();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getViewsViewParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ViewsAssignment_1_0"


    // $ANTLR start "rule__Package__ModelsAssignment_1_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2950:1: rule__Package__ModelsAssignment_1_1 : ( ruleModel ) ;
    public final void rule__Package__ModelsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2954:1: ( ( ruleModel ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2955:1: ( ruleModel )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2955:1: ( ruleModel )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2956:1: ruleModel
            {
             before(grammarAccess.getPackageAccess().getModelsModelParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__Package__ModelsAssignment_1_15794);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getModelsModelParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ModelsAssignment_1_1"


    // $ANTLR start "rule__Package__ActionsAssignment_1_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2965:1: rule__Package__ActionsAssignment_1_2 : ( ruleAction ) ;
    public final void rule__Package__ActionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2969:1: ( ( ruleAction ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2970:1: ( ruleAction )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2970:1: ( ruleAction )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2971:1: ruleAction
            {
             before(grammarAccess.getPackageAccess().getActionsActionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__Package__ActionsAssignment_1_25825);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getActionsActionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ActionsAssignment_1_2"


    // $ANTLR start "rule__Package__PropertiesAssignment_1_3"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2980:1: rule__Package__PropertiesAssignment_1_3 : ( ruleModelProperty ) ;
    public final void rule__Package__PropertiesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2984:1: ( ( ruleModelProperty ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2985:1: ( ruleModelProperty )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2985:1: ( ruleModelProperty )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2986:1: ruleModelProperty
            {
             before(grammarAccess.getPackageAccess().getPropertiesModelPropertyParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleModelProperty_in_rule__Package__PropertiesAssignment_1_35856);
            ruleModelProperty();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPropertiesModelPropertyParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PropertiesAssignment_1_3"


    // $ANTLR start "rule__Package__MainAppAssignment_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2995:1: rule__Package__MainAppAssignment_2 : ( ruleUIApplication ) ;
    public final void rule__Package__MainAppAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2999:1: ( ( ruleUIApplication ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3000:1: ( ruleUIApplication )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3000:1: ( ruleUIApplication )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3001:1: ruleUIApplication
            {
             before(grammarAccess.getPackageAccess().getMainAppUIApplicationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUIApplication_in_rule__Package__MainAppAssignment_25887);
            ruleUIApplication();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getMainAppUIApplicationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__MainAppAssignment_2"


    // $ANTLR start "rule__UIApplication__ModelsAssignment_2_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3010:1: rule__UIApplication__ModelsAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__UIApplication__ModelsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3014:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3015:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3015:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3016:1: ( ruleEString )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_2_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3017:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3018:1: ruleEString
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UIApplication__ModelsAssignment_2_25922);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUIApplicationAccess().getModelsModelEStringParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__ModelsAssignment_2_2"


    // $ANTLR start "rule__UIApplication__ModelsAssignment_2_4_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3029:1: rule__UIApplication__ModelsAssignment_2_4_1 : ( ( ruleEString ) ) ;
    public final void rule__UIApplication__ModelsAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3033:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3034:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3034:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3035:1: ( ruleEString )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_4_1_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3036:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3037:1: ruleEString
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelEStringParserRuleCall_2_4_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UIApplication__ModelsAssignment_2_4_15961);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUIApplicationAccess().getModelsModelEStringParserRuleCall_2_4_1_0_1()); 

            }

             after(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__ModelsAssignment_2_4_1"


    // $ANTLR start "rule__UIApplication__PagesAssignment_3_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3048:1: rule__UIApplication__PagesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__UIApplication__PagesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3052:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3053:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3053:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3054:1: ( ruleEString )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_2_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3055:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3056:1: ruleEString
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UIApplication__PagesAssignment_3_26000);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUIApplicationAccess().getPagesViewEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__PagesAssignment_3_2"


    // $ANTLR start "rule__UIApplication__PagesAssignment_3_4_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3067:1: rule__UIApplication__PagesAssignment_3_4_1 : ( ( ruleEString ) ) ;
    public final void rule__UIApplication__PagesAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3071:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3072:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3072:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3073:1: ( ruleEString )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_4_1_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3074:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3075:1: ruleEString
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewEStringParserRuleCall_3_4_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UIApplication__PagesAssignment_3_4_16039);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUIApplicationAccess().getPagesViewEStringParserRuleCall_3_4_1_0_1()); 

            }

             after(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__PagesAssignment_3_4_1"


    // $ANTLR start "rule__View__NameAssignment_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3086:1: rule__View__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__View__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3090:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3091:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3091:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3092:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__View__NameAssignment_26074);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__NameAssignment_2"


    // $ANTLR start "rule__View__DescriptionAssignment_4_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3101:1: rule__View__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__View__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3105:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3106:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3106:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3107:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__View__DescriptionAssignment_4_16105);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__DescriptionAssignment_4_1"


    // $ANTLR start "rule__View__ModelAssignment_6"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3116:1: rule__View__ModelAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__View__ModelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3120:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3121:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3121:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3122:1: ( ruleEString )
            {
             before(grammarAccess.getViewAccess().getModelModelCrossReference_6_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3123:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3124:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getModelModelEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__View__ModelAssignment_66140);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getModelModelEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getViewAccess().getModelModelCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ModelAssignment_6"


    // $ANTLR start "rule__View__ActionsAssignment_8_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3135:1: rule__View__ActionsAssignment_8_1 : ( ruleAction ) ;
    public final void rule__View__ActionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3139:1: ( ( ruleAction ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3140:1: ( ruleAction )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3140:1: ( ruleAction )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3141:1: ruleAction
            {
             before(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__View__ActionsAssignment_8_16175);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ActionsAssignment_8_1"


    // $ANTLR start "rule__View__ActionsAssignment_8_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3150:1: rule__View__ActionsAssignment_8_2 : ( ruleAction ) ;
    public final void rule__View__ActionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3154:1: ( ( ruleAction ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3155:1: ( ruleAction )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3155:1: ( ruleAction )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3156:1: ruleAction
            {
             before(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__View__ActionsAssignment_8_26206);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ActionsAssignment_8_2"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3165:1: rule__Model__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3169:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3170:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3170:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3171:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Model__NameAssignment_26237);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__PropertiesAssignment_4_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3180:1: rule__Model__PropertiesAssignment_4_1 : ( ruleModelProperty ) ;
    public final void rule__Model__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3184:1: ( ( ruleModelProperty ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3185:1: ( ruleModelProperty )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3185:1: ( ruleModelProperty )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3186:1: ruleModelProperty
            {
             before(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_16268);
            ruleModelProperty();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PropertiesAssignment_4_1"


    // $ANTLR start "rule__Model__PropertiesAssignment_4_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3195:1: rule__Model__PropertiesAssignment_4_2 : ( ruleModelProperty ) ;
    public final void rule__Model__PropertiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3199:1: ( ( ruleModelProperty ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3200:1: ( ruleModelProperty )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3200:1: ( ruleModelProperty )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3201:1: ruleModelProperty
            {
             before(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_26299);
            ruleModelProperty();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PropertiesAssignment_4_2"


    // $ANTLR start "rule__Model__OwnedElementsAssignment_5_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3210:1: rule__Model__OwnedElementsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Model__OwnedElementsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3214:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3215:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3215:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3216:1: ( ruleEString )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_2_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3217:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3218:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Model__OwnedElementsAssignment_5_26334);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getOwnedElementsModelEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__OwnedElementsAssignment_5_2"


    // $ANTLR start "rule__Model__OwnedElementsAssignment_5_4_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3229:1: rule__Model__OwnedElementsAssignment_5_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Model__OwnedElementsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3233:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3234:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3234:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3235:1: ( ruleEString )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_4_1_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3236:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3237:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelEStringParserRuleCall_5_4_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Model__OwnedElementsAssignment_5_4_16373);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getOwnedElementsModelEStringParserRuleCall_5_4_1_0_1()); 

            }

             after(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__OwnedElementsAssignment_5_4_1"


    // $ANTLR start "rule__Action__NameAssignment_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3248:1: rule__Action__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3252:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3253:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3253:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3254:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Action__NameAssignment_26408);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_2"


    // $ANTLR start "rule__Action__NextPageAssignment_4_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3263:1: rule__Action__NextPageAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Action__NextPageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3267:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3268:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3268:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3269:1: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3270:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3271:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNextPageViewEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Action__NextPageAssignment_4_16443);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNextPageViewEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NextPageAssignment_4_1"


    // $ANTLR start "rule__ModelProperty__NameAssignment_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3282:1: rule__ModelProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModelProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3286:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3287:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3287:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3288:1: ruleEString
            {
             before(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ModelProperty__NameAssignment_26478);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDeclaration_in_entryRuleXMLDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__0_in_ruleXMLDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIApplication_in_entryRuleUIApplication181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIApplication188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__0_in_ruleUIApplication214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0_in_ruleView274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProperty_in_entryRuleModelProperty421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelProperty428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__0_in_ruleModelProperty454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ViewsAssignment_1_0_in_rule__Package__Alternatives_1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ModelsAssignment_1_1_in_rule__Package__Alternatives_1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ActionsAssignment_1_2_in_rule__Package__Alternatives_1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PropertiesAssignment_1_3_in_rule__Package__Alternatives_1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0684 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDeclaration_in_rule__Package__Group__0__Impl714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1743 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Alternatives_1_in_rule__Package__Group__1__Impl773 = new BitSet(new long[]{0x0000012081000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__MainAppAssignment_2_in_rule__Package__Group__2__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__0__Impl_in_rule__XMLDeclaration__Group__0867 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__1_in_rule__XMLDeclaration__Group__0870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__XMLDeclaration__Group__0__Impl898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__1__Impl_in_rule__XMLDeclaration__Group__1929 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__2_in_rule__XMLDeclaration__Group__1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_in_rule__XMLDeclaration__Group__1__Impl959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__2__Impl_in_rule__XMLDeclaration__Group__2988 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__3_in_rule__XMLDeclaration__Group__2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__XMLDeclaration__Group__2__Impl1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__3__Impl_in_rule__XMLDeclaration__Group__31050 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__4_in_rule__XMLDeclaration__Group__31053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__XMLDeclaration__Group__3__Impl1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__4__Impl_in_rule__XMLDeclaration__Group__41109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__XMLDeclaration__Group__4__Impl1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__0__Impl_in_rule__UIApplication__Group__01178 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__1_in_rule__UIApplication__Group__01181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__1__Impl_in_rule__UIApplication__Group__11239 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__2_in_rule__UIApplication__Group__11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UIApplication__Group__1__Impl1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__2__Impl_in_rule__UIApplication__Group__21301 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__3_in_rule__UIApplication__Group__21304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__0_in_rule__UIApplication__Group__2__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__3__Impl_in_rule__UIApplication__Group__31362 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__4_in_rule__UIApplication__Group__31365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__0_in_rule__UIApplication__Group__3__Impl1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__4__Impl_in_rule__UIApplication__Group__41423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UIApplication__Group__4__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__0__Impl_in_rule__UIApplication__Group_2__01492 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__1_in_rule__UIApplication__Group_2__01495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UIApplication__Group_2__0__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__1__Impl_in_rule__UIApplication__Group_2__11554 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__2_in_rule__UIApplication__Group_2__11557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UIApplication__Group_2__1__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__2__Impl_in_rule__UIApplication__Group_2__21616 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__3_in_rule__UIApplication__Group_2__21619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__ModelsAssignment_2_2_in_rule__UIApplication__Group_2__2__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__3__Impl_in_rule__UIApplication__Group_2__31676 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__4_in_rule__UIApplication__Group_2__31679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UIApplication__Group_2__3__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__4__Impl_in_rule__UIApplication__Group_2__41738 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__5_in_rule__UIApplication__Group_2__41741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__0_in_rule__UIApplication__Group_2__4__Impl1768 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__5__Impl_in_rule__UIApplication__Group_2__51799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UIApplication__Group_2__5__Impl1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__0__Impl_in_rule__UIApplication__Group_2_4__01870 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__1_in_rule__UIApplication__Group_2_4__01873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UIApplication__Group_2_4__0__Impl1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__1__Impl_in_rule__UIApplication__Group_2_4__11932 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__2_in_rule__UIApplication__Group_2_4__11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__ModelsAssignment_2_4_1_in_rule__UIApplication__Group_2_4__1__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__2__Impl_in_rule__UIApplication__Group_2_4__21992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UIApplication__Group_2_4__2__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__0__Impl_in_rule__UIApplication__Group_3__02057 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__1_in_rule__UIApplication__Group_3__02060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UIApplication__Group_3__0__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__1__Impl_in_rule__UIApplication__Group_3__12119 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__2_in_rule__UIApplication__Group_3__12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UIApplication__Group_3__1__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__2__Impl_in_rule__UIApplication__Group_3__22181 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__3_in_rule__UIApplication__Group_3__22184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__PagesAssignment_3_2_in_rule__UIApplication__Group_3__2__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__3__Impl_in_rule__UIApplication__Group_3__32241 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__4_in_rule__UIApplication__Group_3__32244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UIApplication__Group_3__3__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__4__Impl_in_rule__UIApplication__Group_3__42303 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__5_in_rule__UIApplication__Group_3__42306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__0_in_rule__UIApplication__Group_3__4__Impl2333 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__5__Impl_in_rule__UIApplication__Group_3__52364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UIApplication__Group_3__5__Impl2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__0__Impl_in_rule__UIApplication__Group_3_4__02435 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__1_in_rule__UIApplication__Group_3_4__02438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UIApplication__Group_3_4__0__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__1__Impl_in_rule__UIApplication__Group_3_4__12497 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__2_in_rule__UIApplication__Group_3_4__12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__PagesAssignment_3_4_1_in_rule__UIApplication__Group_3_4__1__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__2__Impl_in_rule__UIApplication__Group_3_4__22557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UIApplication__Group_3_4__2__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__02622 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__02625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__12683 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__View__Group__1__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__22745 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__22748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__2__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__32805 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__32808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__View__Group__3__Impl2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__42867 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_rule__View__Group__5_in_rule__View__Group__42870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_4__0_in_rule__View__Group__4__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__52928 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__View__Group__6_in_rule__View__Group__52931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__View__Group__5__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__62990 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__View__Group__7_in_rule__View__Group__62993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ModelAssignment_6_in_rule__View__Group__6__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__7__Impl_in_rule__View__Group__73050 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__View__Group__8_in_rule__View__Group__73053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__View__Group__7__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__8__Impl_in_rule__View__Group__83112 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__View__Group__9_in_rule__View__Group__83115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__0_in_rule__View__Group__8__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__9__Impl_in_rule__View__Group__93173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__View__Group__9__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_4__0__Impl_in_rule__View__Group_4__03252 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__View__Group_4__1_in_rule__View__Group_4__03255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__View__Group_4__0__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_4__1__Impl_in_rule__View__Group_4__13314 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__View__Group_4__2_in_rule__View__Group_4__13317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__DescriptionAssignment_4_1_in_rule__View__Group_4__1__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_4__2__Impl_in_rule__View__Group_4__23374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__View__Group_4__2__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__0__Impl_in_rule__View__Group_8__03439 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__View__Group_8__1_in_rule__View__Group_8__03442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__View__Group_8__0__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__1__Impl_in_rule__View__Group_8__13501 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__View__Group_8__2_in_rule__View__Group_8__13504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ActionsAssignment_8_1_in_rule__View__Group_8__1__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__2__Impl_in_rule__View__Group_8__23561 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__View__Group_8__3_in_rule__View__Group_8__23564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ActionsAssignment_8_2_in_rule__View__Group_8__2__Impl3591 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__3__Impl_in_rule__View__Group_8__33622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__View__Group_8__3__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03689 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13750 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Model__Group__1__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23812 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33872 = new BitSet(new long[]{0x0000000B00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__3__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43934 = new BitSet(new long[]{0x0000000B00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53995 = new BitSet(new long[]{0x0000000B00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__53998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__0_in_rule__Model__Group__5__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__64056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__6__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__04129 = new BitSet(new long[]{0x0000012081000000L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__04132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Model__Group_4__0__Impl4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__14191 = new BitSet(new long[]{0x0000012481000000L});
    public static final BitSet FOLLOW_rule__Model__Group_4__2_in_rule__Model__Group_4__14194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PropertiesAssignment_4_1_in_rule__Model__Group_4__1__Impl4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__2__Impl_in_rule__Model__Group_4__24251 = new BitSet(new long[]{0x0000012481000000L});
    public static final BitSet FOLLOW_rule__Model__Group_4__3_in_rule__Model__Group_4__24254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PropertiesAssignment_4_2_in_rule__Model__Group_4__2__Impl4281 = new BitSet(new long[]{0x0000012081000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__3__Impl_in_rule__Model__Group_4__34312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Model__Group_4__3__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__0__Impl_in_rule__Model__Group_5__04379 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Model__Group_5__1_in_rule__Model__Group_5__04382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Model__Group_5__0__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__1__Impl_in_rule__Model__Group_5__14441 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Model__Group_5__2_in_rule__Model__Group_5__14444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group_5__1__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__2__Impl_in_rule__Model__Group_5__24503 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group_5__3_in_rule__Model__Group_5__24506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OwnedElementsAssignment_5_2_in_rule__Model__Group_5__2__Impl4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__3__Impl_in_rule__Model__Group_5__34563 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_rule__Model__Group_5__4_in_rule__Model__Group_5__34566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group_5__3__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__4__Impl_in_rule__Model__Group_5__44625 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_rule__Model__Group_5__5_in_rule__Model__Group_5__44628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__0_in_rule__Model__Group_5__4__Impl4655 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__5__Impl_in_rule__Model__Group_5__54686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Model__Group_5__5__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__0__Impl_in_rule__Model__Group_5_4__04757 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__1_in_rule__Model__Group_5_4__04760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group_5_4__0__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__1__Impl_in_rule__Model__Group_5_4__14819 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__2_in_rule__Model__Group_5_4__14822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OwnedElementsAssignment_5_4_1_in_rule__Model__Group_5_4__1__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__2__Impl_in_rule__Model__Group_5_4__24879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group_5_4__2__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04944 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__15005 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__15008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Action__Group__1__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__25067 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__25070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__2__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__35127 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__35130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Action__Group__3__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__45189 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__45192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__55250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Action__Group__5__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__05321 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__05324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Action__Group_4__0__Impl5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__15383 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Action__Group_4__2_in_rule__Action__Group_4__15386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NextPageAssignment_4_1_in_rule__Action__Group_4__1__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__2__Impl_in_rule__Action__Group_4__25443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Action__Group_4__2__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__0__Impl_in_rule__ModelProperty__Group__05508 = new BitSet(new long[]{0x0000012081000000L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__1_in_rule__ModelProperty__Group__05511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__1__Impl_in_rule__ModelProperty__Group__15569 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__2_in_rule__ModelProperty__Group__15572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ModelProperty__Group__1__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__2__Impl_in_rule__ModelProperty__Group__25631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__3_in_rule__ModelProperty__Group__25634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__NameAssignment_2_in_rule__ModelProperty__Group__2__Impl5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__3__Impl_in_rule__ModelProperty__Group__35691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ModelProperty__Group__3__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__Package__ViewsAssignment_1_05763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__Package__ModelsAssignment_1_15794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Package__ActionsAssignment_1_25825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProperty_in_rule__Package__PropertiesAssignment_1_35856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIApplication_in_rule__Package__MainAppAssignment_25887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIApplication__ModelsAssignment_2_25922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIApplication__ModelsAssignment_2_4_15961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIApplication__PagesAssignment_3_26000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIApplication__PagesAssignment_3_4_16039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__View__NameAssignment_26074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__View__DescriptionAssignment_4_16105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__View__ModelAssignment_66140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__View__ActionsAssignment_8_16175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__View__ActionsAssignment_8_26206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Model__NameAssignment_26237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_16268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_26299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Model__OwnedElementsAssignment_5_26334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Model__OwnedElementsAssignment_5_4_16373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Action__NameAssignment_26408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Action__NextPageAssignment_4_16443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ModelProperty__NameAssignment_26478 = new BitSet(new long[]{0x0000000000000002L});

}