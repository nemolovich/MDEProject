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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_VERSION", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<UIApplication>'", "'</UIApplication>'", "'<models>'", "'<model ref='", "' />'", "'</models>'", "'<pages>'", "'<page ref='", "'</pages>'", "'<?xml version='", "' encoding='", "' ?>'", "'<view name='", "' >'", "'</view>'", "'<description>'", "'</description>'", "'<actions>'", "'</actions>'", "'<model name='", "'</model>'", "'<properties>'", "'</properties>'", "'<ownedElements>'", "'</ownedElements>'", "'<action name='", "'</action>'", "'<nextPage ref='", "'<modelProperty name='", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int RULE_VERSION=5;
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




    // $ANTLR start "entryRuleMainPackage"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:60:1: entryRuleMainPackage : ruleMainPackage EOF ;
    public final void entryRuleMainPackage() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:61:1: ( ruleMainPackage EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:62:1: ruleMainPackage EOF
            {
             before(grammarAccess.getMainPackageRule()); 
            pushFollow(FOLLOW_ruleMainPackage_in_entryRuleMainPackage61);
            ruleMainPackage();

            state._fsp--;

             after(grammarAccess.getMainPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainPackage68); 

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
    // $ANTLR end "entryRuleMainPackage"


    // $ANTLR start "ruleMainPackage"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:69:1: ruleMainPackage : ( ( rule__MainPackage__Group__0 ) ) ;
    public final void ruleMainPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:73:2: ( ( ( rule__MainPackage__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:74:1: ( ( rule__MainPackage__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:74:1: ( ( rule__MainPackage__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:75:1: ( rule__MainPackage__Group__0 )
            {
             before(grammarAccess.getMainPackageAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:76:1: ( rule__MainPackage__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:76:2: rule__MainPackage__Group__0
            {
            pushFollow(FOLLOW_rule__MainPackage__Group__0_in_ruleMainPackage94);
            rule__MainPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainPackageAccess().getGroup()); 

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
    // $ANTLR end "ruleMainPackage"


    // $ANTLR start "entryRuleUIApplication"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:88:1: entryRuleUIApplication : ruleUIApplication EOF ;
    public final void entryRuleUIApplication() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:89:1: ( ruleUIApplication EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:90:1: ruleUIApplication EOF
            {
             before(grammarAccess.getUIApplicationRule()); 
            pushFollow(FOLLOW_ruleUIApplication_in_entryRuleUIApplication121);
            ruleUIApplication();

            state._fsp--;

             after(grammarAccess.getUIApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIApplication128); 

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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:97:1: ruleUIApplication : ( ( rule__UIApplication__Group__0 ) ) ;
    public final void ruleUIApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:101:2: ( ( ( rule__UIApplication__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:102:1: ( ( rule__UIApplication__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:102:1: ( ( rule__UIApplication__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:103:1: ( rule__UIApplication__Group__0 )
            {
             before(grammarAccess.getUIApplicationAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:104:1: ( rule__UIApplication__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:104:2: rule__UIApplication__Group__0
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__0_in_ruleUIApplication154);
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


    // $ANTLR start "entryRuleXMLDeclaration"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:116:1: entryRuleXMLDeclaration : ruleXMLDeclaration EOF ;
    public final void entryRuleXMLDeclaration() throws RecognitionException {
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:117:1: ( ruleXMLDeclaration EOF )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:118:1: ruleXMLDeclaration EOF
            {
             before(grammarAccess.getXMLDeclarationRule()); 
            pushFollow(FOLLOW_ruleXMLDeclaration_in_entryRuleXMLDeclaration181);
            ruleXMLDeclaration();

            state._fsp--;

             after(grammarAccess.getXMLDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLDeclaration188); 

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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:125:1: ruleXMLDeclaration : ( ( rule__XMLDeclaration__Group__0 ) ) ;
    public final void ruleXMLDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:129:2: ( ( ( rule__XMLDeclaration__Group__0 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:130:1: ( ( rule__XMLDeclaration__Group__0 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:130:1: ( ( rule__XMLDeclaration__Group__0 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:131:1: ( rule__XMLDeclaration__Group__0 )
            {
             before(grammarAccess.getXMLDeclarationAccess().getGroup()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:132:1: ( rule__XMLDeclaration__Group__0 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:132:2: rule__XMLDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__0_in_ruleXMLDeclaration214);
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


    // $ANTLR start "rule__MainPackage__Alternatives_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:284:1: rule__MainPackage__Alternatives_1 : ( ( ( rule__MainPackage__AllModelsAssignment_1_0 ) ) | ( ( rule__MainPackage__AllViewsAssignment_1_1 ) ) );
    public final void rule__MainPackage__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:288:1: ( ( ( rule__MainPackage__AllModelsAssignment_1_0 ) ) | ( ( rule__MainPackage__AllViewsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:289:1: ( ( rule__MainPackage__AllModelsAssignment_1_0 ) )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:289:1: ( ( rule__MainPackage__AllModelsAssignment_1_0 ) )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:290:1: ( rule__MainPackage__AllModelsAssignment_1_0 )
                    {
                     before(grammarAccess.getMainPackageAccess().getAllModelsAssignment_1_0()); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:291:1: ( rule__MainPackage__AllModelsAssignment_1_0 )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:291:2: rule__MainPackage__AllModelsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MainPackage__AllModelsAssignment_1_0_in_rule__MainPackage__Alternatives_1550);
                    rule__MainPackage__AllModelsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainPackageAccess().getAllModelsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:295:6: ( ( rule__MainPackage__AllViewsAssignment_1_1 ) )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:295:6: ( ( rule__MainPackage__AllViewsAssignment_1_1 ) )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:296:1: ( rule__MainPackage__AllViewsAssignment_1_1 )
                    {
                     before(grammarAccess.getMainPackageAccess().getAllViewsAssignment_1_1()); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:297:1: ( rule__MainPackage__AllViewsAssignment_1_1 )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:297:2: rule__MainPackage__AllViewsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__MainPackage__AllViewsAssignment_1_1_in_rule__MainPackage__Alternatives_1568);
                    rule__MainPackage__AllViewsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainPackageAccess().getAllViewsAssignment_1_1()); 

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
    // $ANTLR end "rule__MainPackage__Alternatives_1"


    // $ANTLR start "rule__EString__Alternatives"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:306:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ( rule__EString__Group_1__0 ) ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:310:1: ( ( RULE_STRING ) | ( ( rule__EString__Group_1__0 ) ) )
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
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:311:1: ( RULE_STRING )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:311:1: ( RULE_STRING )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:312:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives601); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:317:6: ( ( rule__EString__Group_1__0 ) )
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:317:6: ( ( rule__EString__Group_1__0 ) )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:318:1: ( rule__EString__Group_1__0 )
                    {
                     before(grammarAccess.getEStringAccess().getGroup_1()); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:319:1: ( rule__EString__Group_1__0 )
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:319:2: rule__EString__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EString__Group_1__0_in_rule__EString__Alternatives618);
                    rule__EString__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEStringAccess().getGroup_1()); 

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


    // $ANTLR start "rule__MainPackage__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:330:1: rule__MainPackage__Group__0 : rule__MainPackage__Group__0__Impl rule__MainPackage__Group__1 ;
    public final void rule__MainPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:334:1: ( rule__MainPackage__Group__0__Impl rule__MainPackage__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:335:2: rule__MainPackage__Group__0__Impl rule__MainPackage__Group__1
            {
            pushFollow(FOLLOW_rule__MainPackage__Group__0__Impl_in_rule__MainPackage__Group__0649);
            rule__MainPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MainPackage__Group__1_in_rule__MainPackage__Group__0652);
            rule__MainPackage__Group__1();

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
    // $ANTLR end "rule__MainPackage__Group__0"


    // $ANTLR start "rule__MainPackage__Group__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:342:1: rule__MainPackage__Group__0__Impl : ( ruleXMLDeclaration ) ;
    public final void rule__MainPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:346:1: ( ( ruleXMLDeclaration ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:347:1: ( ruleXMLDeclaration )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:347:1: ( ruleXMLDeclaration )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:348:1: ruleXMLDeclaration
            {
             before(grammarAccess.getMainPackageAccess().getXMLDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleXMLDeclaration_in_rule__MainPackage__Group__0__Impl679);
            ruleXMLDeclaration();

            state._fsp--;

             after(grammarAccess.getMainPackageAccess().getXMLDeclarationParserRuleCall_0()); 

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
    // $ANTLR end "rule__MainPackage__Group__0__Impl"


    // $ANTLR start "rule__MainPackage__Group__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:359:1: rule__MainPackage__Group__1 : rule__MainPackage__Group__1__Impl rule__MainPackage__Group__2 ;
    public final void rule__MainPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:363:1: ( rule__MainPackage__Group__1__Impl rule__MainPackage__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:364:2: rule__MainPackage__Group__1__Impl rule__MainPackage__Group__2
            {
            pushFollow(FOLLOW_rule__MainPackage__Group__1__Impl_in_rule__MainPackage__Group__1708);
            rule__MainPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MainPackage__Group__2_in_rule__MainPackage__Group__1711);
            rule__MainPackage__Group__2();

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
    // $ANTLR end "rule__MainPackage__Group__1"


    // $ANTLR start "rule__MainPackage__Group__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:371:1: rule__MainPackage__Group__1__Impl : ( ( rule__MainPackage__Alternatives_1 )* ) ;
    public final void rule__MainPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:375:1: ( ( ( rule__MainPackage__Alternatives_1 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:376:1: ( ( rule__MainPackage__Alternatives_1 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:376:1: ( ( rule__MainPackage__Alternatives_1 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:377:1: ( rule__MainPackage__Alternatives_1 )*
            {
             before(grammarAccess.getMainPackageAccess().getAlternatives_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:378:1: ( rule__MainPackage__Alternatives_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:378:2: rule__MainPackage__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__MainPackage__Alternatives_1_in_rule__MainPackage__Group__1__Impl738);
            	    rule__MainPackage__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMainPackageAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__MainPackage__Group__1__Impl"


    // $ANTLR start "rule__MainPackage__Group__2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:388:1: rule__MainPackage__Group__2 : rule__MainPackage__Group__2__Impl ;
    public final void rule__MainPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:392:1: ( rule__MainPackage__Group__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:393:2: rule__MainPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MainPackage__Group__2__Impl_in_rule__MainPackage__Group__2769);
            rule__MainPackage__Group__2__Impl();

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
    // $ANTLR end "rule__MainPackage__Group__2"


    // $ANTLR start "rule__MainPackage__Group__2__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:399:1: rule__MainPackage__Group__2__Impl : ( ( rule__MainPackage__AppAssignment_2 ) ) ;
    public final void rule__MainPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:403:1: ( ( ( rule__MainPackage__AppAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:404:1: ( ( rule__MainPackage__AppAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:404:1: ( ( rule__MainPackage__AppAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:405:1: ( rule__MainPackage__AppAssignment_2 )
            {
             before(grammarAccess.getMainPackageAccess().getAppAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:406:1: ( rule__MainPackage__AppAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:406:2: rule__MainPackage__AppAssignment_2
            {
            pushFollow(FOLLOW_rule__MainPackage__AppAssignment_2_in_rule__MainPackage__Group__2__Impl796);
            rule__MainPackage__AppAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMainPackageAccess().getAppAssignment_2()); 

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
    // $ANTLR end "rule__MainPackage__Group__2__Impl"


    // $ANTLR start "rule__UIApplication__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:422:1: rule__UIApplication__Group__0 : rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1 ;
    public final void rule__UIApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:426:1: ( rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:427:2: rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__0__Impl_in_rule__UIApplication__Group__0832);
            rule__UIApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group__1_in_rule__UIApplication__Group__0835);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:434:1: rule__UIApplication__Group__0__Impl : ( () ) ;
    public final void rule__UIApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:438:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:439:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:439:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:440:1: ()
            {
             before(grammarAccess.getUIApplicationAccess().getUIApplicationAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:441:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:443:1: 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:453:1: rule__UIApplication__Group__1 : rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2 ;
    public final void rule__UIApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:457:1: ( rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:458:2: rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__1__Impl_in_rule__UIApplication__Group__1893);
            rule__UIApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group__2_in_rule__UIApplication__Group__1896);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:465:1: rule__UIApplication__Group__1__Impl : ( '<UIApplication>' ) ;
    public final void rule__UIApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:469:1: ( ( '<UIApplication>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:470:1: ( '<UIApplication>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:470:1: ( '<UIApplication>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:471:1: '<UIApplication>'
            {
             before(grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__UIApplication__Group__1__Impl924); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:484:1: rule__UIApplication__Group__2 : rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3 ;
    public final void rule__UIApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:488:1: ( rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:489:2: rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__2__Impl_in_rule__UIApplication__Group__2955);
            rule__UIApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group__3_in_rule__UIApplication__Group__2958);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:496:1: rule__UIApplication__Group__2__Impl : ( ( rule__UIApplication__Group_2__0 )? ) ;
    public final void rule__UIApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:500:1: ( ( ( rule__UIApplication__Group_2__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:501:1: ( ( rule__UIApplication__Group_2__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:501:1: ( ( rule__UIApplication__Group_2__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:502:1: ( rule__UIApplication__Group_2__0 )?
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:503:1: ( rule__UIApplication__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:503:2: rule__UIApplication__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UIApplication__Group_2__0_in_rule__UIApplication__Group__2__Impl985);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:513:1: rule__UIApplication__Group__3 : rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4 ;
    public final void rule__UIApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:517:1: ( rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:518:2: rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__3__Impl_in_rule__UIApplication__Group__31016);
            rule__UIApplication__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group__4_in_rule__UIApplication__Group__31019);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:525:1: rule__UIApplication__Group__3__Impl : ( ( rule__UIApplication__Group_3__0 )? ) ;
    public final void rule__UIApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:529:1: ( ( ( rule__UIApplication__Group_3__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:530:1: ( ( rule__UIApplication__Group_3__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:530:1: ( ( rule__UIApplication__Group_3__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:531:1: ( rule__UIApplication__Group_3__0 )?
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_3()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:532:1: ( rule__UIApplication__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:532:2: rule__UIApplication__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__UIApplication__Group_3__0_in_rule__UIApplication__Group__3__Impl1046);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:542:1: rule__UIApplication__Group__4 : rule__UIApplication__Group__4__Impl ;
    public final void rule__UIApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:546:1: ( rule__UIApplication__Group__4__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:547:2: rule__UIApplication__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group__4__Impl_in_rule__UIApplication__Group__41077);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:553:1: rule__UIApplication__Group__4__Impl : ( '</UIApplication>' ) ;
    public final void rule__UIApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:557:1: ( ( '</UIApplication>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:558:1: ( '</UIApplication>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:558:1: ( '</UIApplication>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:559:1: '</UIApplication>'
            {
             before(grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__UIApplication__Group__4__Impl1105); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:582:1: rule__UIApplication__Group_2__0 : rule__UIApplication__Group_2__0__Impl rule__UIApplication__Group_2__1 ;
    public final void rule__UIApplication__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:586:1: ( rule__UIApplication__Group_2__0__Impl rule__UIApplication__Group_2__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:587:2: rule__UIApplication__Group_2__0__Impl rule__UIApplication__Group_2__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__0__Impl_in_rule__UIApplication__Group_2__01146);
            rule__UIApplication__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__1_in_rule__UIApplication__Group_2__01149);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:594:1: rule__UIApplication__Group_2__0__Impl : ( '<models>' ) ;
    public final void rule__UIApplication__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:598:1: ( ( '<models>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:599:1: ( '<models>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:599:1: ( '<models>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:600:1: '<models>'
            {
             before(grammarAccess.getUIApplicationAccess().getModelsKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__UIApplication__Group_2__0__Impl1177); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:613:1: rule__UIApplication__Group_2__1 : rule__UIApplication__Group_2__1__Impl rule__UIApplication__Group_2__2 ;
    public final void rule__UIApplication__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:617:1: ( rule__UIApplication__Group_2__1__Impl rule__UIApplication__Group_2__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:618:2: rule__UIApplication__Group_2__1__Impl rule__UIApplication__Group_2__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__1__Impl_in_rule__UIApplication__Group_2__11208);
            rule__UIApplication__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__2_in_rule__UIApplication__Group_2__11211);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:625:1: rule__UIApplication__Group_2__1__Impl : ( '<model ref=' ) ;
    public final void rule__UIApplication__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:629:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:630:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:630:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:631:1: '<model ref='
            {
             before(grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_1()); 
            match(input,15,FOLLOW_15_in_rule__UIApplication__Group_2__1__Impl1239); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:644:1: rule__UIApplication__Group_2__2 : rule__UIApplication__Group_2__2__Impl rule__UIApplication__Group_2__3 ;
    public final void rule__UIApplication__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:648:1: ( rule__UIApplication__Group_2__2__Impl rule__UIApplication__Group_2__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:649:2: rule__UIApplication__Group_2__2__Impl rule__UIApplication__Group_2__3
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__2__Impl_in_rule__UIApplication__Group_2__21270);
            rule__UIApplication__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__3_in_rule__UIApplication__Group_2__21273);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:656:1: rule__UIApplication__Group_2__2__Impl : ( ( rule__UIApplication__ModelsAssignment_2_2 ) ) ;
    public final void rule__UIApplication__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:660:1: ( ( ( rule__UIApplication__ModelsAssignment_2_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:661:1: ( ( rule__UIApplication__ModelsAssignment_2_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:661:1: ( ( rule__UIApplication__ModelsAssignment_2_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:662:1: ( rule__UIApplication__ModelsAssignment_2_2 )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsAssignment_2_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:663:1: ( rule__UIApplication__ModelsAssignment_2_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:663:2: rule__UIApplication__ModelsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__UIApplication__ModelsAssignment_2_2_in_rule__UIApplication__Group_2__2__Impl1300);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:673:1: rule__UIApplication__Group_2__3 : rule__UIApplication__Group_2__3__Impl rule__UIApplication__Group_2__4 ;
    public final void rule__UIApplication__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:677:1: ( rule__UIApplication__Group_2__3__Impl rule__UIApplication__Group_2__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:678:2: rule__UIApplication__Group_2__3__Impl rule__UIApplication__Group_2__4
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__3__Impl_in_rule__UIApplication__Group_2__31330);
            rule__UIApplication__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__4_in_rule__UIApplication__Group_2__31333);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:685:1: rule__UIApplication__Group_2__3__Impl : ( ' />' ) ;
    public final void rule__UIApplication__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:689:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:690:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:690:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:691:1: ' />'
            {
             before(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_3()); 
            match(input,16,FOLLOW_16_in_rule__UIApplication__Group_2__3__Impl1361); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:704:1: rule__UIApplication__Group_2__4 : rule__UIApplication__Group_2__4__Impl rule__UIApplication__Group_2__5 ;
    public final void rule__UIApplication__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:708:1: ( rule__UIApplication__Group_2__4__Impl rule__UIApplication__Group_2__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:709:2: rule__UIApplication__Group_2__4__Impl rule__UIApplication__Group_2__5
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__4__Impl_in_rule__UIApplication__Group_2__41392);
            rule__UIApplication__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2__5_in_rule__UIApplication__Group_2__41395);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:716:1: rule__UIApplication__Group_2__4__Impl : ( ( rule__UIApplication__Group_2_4__0 )* ) ;
    public final void rule__UIApplication__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:720:1: ( ( ( rule__UIApplication__Group_2_4__0 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:721:1: ( ( rule__UIApplication__Group_2_4__0 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:721:1: ( ( rule__UIApplication__Group_2_4__0 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:722:1: ( rule__UIApplication__Group_2_4__0 )*
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_2_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:723:1: ( rule__UIApplication__Group_2_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:723:2: rule__UIApplication__Group_2_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UIApplication__Group_2_4__0_in_rule__UIApplication__Group_2__4__Impl1422);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:733:1: rule__UIApplication__Group_2__5 : rule__UIApplication__Group_2__5__Impl ;
    public final void rule__UIApplication__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:737:1: ( rule__UIApplication__Group_2__5__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:738:2: rule__UIApplication__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2__5__Impl_in_rule__UIApplication__Group_2__51453);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:744:1: rule__UIApplication__Group_2__5__Impl : ( '</models>' ) ;
    public final void rule__UIApplication__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:748:1: ( ( '</models>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:749:1: ( '</models>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:749:1: ( '</models>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:750:1: '</models>'
            {
             before(grammarAccess.getUIApplicationAccess().getModelsKeyword_2_5()); 
            match(input,17,FOLLOW_17_in_rule__UIApplication__Group_2__5__Impl1481); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:775:1: rule__UIApplication__Group_2_4__0 : rule__UIApplication__Group_2_4__0__Impl rule__UIApplication__Group_2_4__1 ;
    public final void rule__UIApplication__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:779:1: ( rule__UIApplication__Group_2_4__0__Impl rule__UIApplication__Group_2_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:780:2: rule__UIApplication__Group_2_4__0__Impl rule__UIApplication__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__0__Impl_in_rule__UIApplication__Group_2_4__01524);
            rule__UIApplication__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__1_in_rule__UIApplication__Group_2_4__01527);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:787:1: rule__UIApplication__Group_2_4__0__Impl : ( '<model ref=' ) ;
    public final void rule__UIApplication__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:791:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:792:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:792:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:793:1: '<model ref='
            {
             before(grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_4_0()); 
            match(input,15,FOLLOW_15_in_rule__UIApplication__Group_2_4__0__Impl1555); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:806:1: rule__UIApplication__Group_2_4__1 : rule__UIApplication__Group_2_4__1__Impl rule__UIApplication__Group_2_4__2 ;
    public final void rule__UIApplication__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:810:1: ( rule__UIApplication__Group_2_4__1__Impl rule__UIApplication__Group_2_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:811:2: rule__UIApplication__Group_2_4__1__Impl rule__UIApplication__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__1__Impl_in_rule__UIApplication__Group_2_4__11586);
            rule__UIApplication__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__2_in_rule__UIApplication__Group_2_4__11589);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:818:1: rule__UIApplication__Group_2_4__1__Impl : ( ( rule__UIApplication__ModelsAssignment_2_4_1 ) ) ;
    public final void rule__UIApplication__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:822:1: ( ( ( rule__UIApplication__ModelsAssignment_2_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:823:1: ( ( rule__UIApplication__ModelsAssignment_2_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:823:1: ( ( rule__UIApplication__ModelsAssignment_2_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:824:1: ( rule__UIApplication__ModelsAssignment_2_4_1 )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsAssignment_2_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:825:1: ( rule__UIApplication__ModelsAssignment_2_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:825:2: rule__UIApplication__ModelsAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__UIApplication__ModelsAssignment_2_4_1_in_rule__UIApplication__Group_2_4__1__Impl1616);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:835:1: rule__UIApplication__Group_2_4__2 : rule__UIApplication__Group_2_4__2__Impl ;
    public final void rule__UIApplication__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:839:1: ( rule__UIApplication__Group_2_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:840:2: rule__UIApplication__Group_2_4__2__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_2_4__2__Impl_in_rule__UIApplication__Group_2_4__21646);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:846:1: rule__UIApplication__Group_2_4__2__Impl : ( ' />' ) ;
    public final void rule__UIApplication__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:850:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:851:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:851:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:852:1: ' />'
            {
             before(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_4_2()); 
            match(input,16,FOLLOW_16_in_rule__UIApplication__Group_2_4__2__Impl1674); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:871:1: rule__UIApplication__Group_3__0 : rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1 ;
    public final void rule__UIApplication__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:875:1: ( rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:876:2: rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__0__Impl_in_rule__UIApplication__Group_3__01711);
            rule__UIApplication__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__1_in_rule__UIApplication__Group_3__01714);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:883:1: rule__UIApplication__Group_3__0__Impl : ( '<pages>' ) ;
    public final void rule__UIApplication__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:887:1: ( ( '<pages>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:888:1: ( '<pages>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:888:1: ( '<pages>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:889:1: '<pages>'
            {
             before(grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__UIApplication__Group_3__0__Impl1742); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:902:1: rule__UIApplication__Group_3__1 : rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2 ;
    public final void rule__UIApplication__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:906:1: ( rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:907:2: rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__1__Impl_in_rule__UIApplication__Group_3__11773);
            rule__UIApplication__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__2_in_rule__UIApplication__Group_3__11776);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:914:1: rule__UIApplication__Group_3__1__Impl : ( '<page ref=' ) ;
    public final void rule__UIApplication__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:918:1: ( ( '<page ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:919:1: ( '<page ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:919:1: ( '<page ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:920:1: '<page ref='
            {
             before(grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_1()); 
            match(input,19,FOLLOW_19_in_rule__UIApplication__Group_3__1__Impl1804); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:933:1: rule__UIApplication__Group_3__2 : rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3 ;
    public final void rule__UIApplication__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:937:1: ( rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:938:2: rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__2__Impl_in_rule__UIApplication__Group_3__21835);
            rule__UIApplication__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__3_in_rule__UIApplication__Group_3__21838);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:945:1: rule__UIApplication__Group_3__2__Impl : ( ( rule__UIApplication__PagesAssignment_3_2 ) ) ;
    public final void rule__UIApplication__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:949:1: ( ( ( rule__UIApplication__PagesAssignment_3_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:950:1: ( ( rule__UIApplication__PagesAssignment_3_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:950:1: ( ( rule__UIApplication__PagesAssignment_3_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:951:1: ( rule__UIApplication__PagesAssignment_3_2 )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:952:1: ( rule__UIApplication__PagesAssignment_3_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:952:2: rule__UIApplication__PagesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__UIApplication__PagesAssignment_3_2_in_rule__UIApplication__Group_3__2__Impl1865);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:962:1: rule__UIApplication__Group_3__3 : rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4 ;
    public final void rule__UIApplication__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:966:1: ( rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:967:2: rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__3__Impl_in_rule__UIApplication__Group_3__31895);
            rule__UIApplication__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__4_in_rule__UIApplication__Group_3__31898);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:974:1: rule__UIApplication__Group_3__3__Impl : ( ' />' ) ;
    public final void rule__UIApplication__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:978:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:979:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:979:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:980:1: ' />'
            {
             before(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_3()); 
            match(input,16,FOLLOW_16_in_rule__UIApplication__Group_3__3__Impl1926); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:993:1: rule__UIApplication__Group_3__4 : rule__UIApplication__Group_3__4__Impl rule__UIApplication__Group_3__5 ;
    public final void rule__UIApplication__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:997:1: ( rule__UIApplication__Group_3__4__Impl rule__UIApplication__Group_3__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:998:2: rule__UIApplication__Group_3__4__Impl rule__UIApplication__Group_3__5
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__4__Impl_in_rule__UIApplication__Group_3__41957);
            rule__UIApplication__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3__5_in_rule__UIApplication__Group_3__41960);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1005:1: rule__UIApplication__Group_3__4__Impl : ( ( rule__UIApplication__Group_3_4__0 )* ) ;
    public final void rule__UIApplication__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1009:1: ( ( ( rule__UIApplication__Group_3_4__0 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1010:1: ( ( rule__UIApplication__Group_3_4__0 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1010:1: ( ( rule__UIApplication__Group_3_4__0 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1011:1: ( rule__UIApplication__Group_3_4__0 )*
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_3_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1012:1: ( rule__UIApplication__Group_3_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1012:2: rule__UIApplication__Group_3_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UIApplication__Group_3_4__0_in_rule__UIApplication__Group_3__4__Impl1987);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1022:1: rule__UIApplication__Group_3__5 : rule__UIApplication__Group_3__5__Impl ;
    public final void rule__UIApplication__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1026:1: ( rule__UIApplication__Group_3__5__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1027:2: rule__UIApplication__Group_3__5__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3__5__Impl_in_rule__UIApplication__Group_3__52018);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1033:1: rule__UIApplication__Group_3__5__Impl : ( '</pages>' ) ;
    public final void rule__UIApplication__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1037:1: ( ( '</pages>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1038:1: ( '</pages>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1038:1: ( '</pages>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1039:1: '</pages>'
            {
             before(grammarAccess.getUIApplicationAccess().getPagesKeyword_3_5()); 
            match(input,20,FOLLOW_20_in_rule__UIApplication__Group_3__5__Impl2046); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1064:1: rule__UIApplication__Group_3_4__0 : rule__UIApplication__Group_3_4__0__Impl rule__UIApplication__Group_3_4__1 ;
    public final void rule__UIApplication__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1068:1: ( rule__UIApplication__Group_3_4__0__Impl rule__UIApplication__Group_3_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1069:2: rule__UIApplication__Group_3_4__0__Impl rule__UIApplication__Group_3_4__1
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__0__Impl_in_rule__UIApplication__Group_3_4__02089);
            rule__UIApplication__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__1_in_rule__UIApplication__Group_3_4__02092);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1076:1: rule__UIApplication__Group_3_4__0__Impl : ( '<page ref=' ) ;
    public final void rule__UIApplication__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1080:1: ( ( '<page ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1081:1: ( '<page ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1081:1: ( '<page ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1082:1: '<page ref='
            {
             before(grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_4_0()); 
            match(input,19,FOLLOW_19_in_rule__UIApplication__Group_3_4__0__Impl2120); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1095:1: rule__UIApplication__Group_3_4__1 : rule__UIApplication__Group_3_4__1__Impl rule__UIApplication__Group_3_4__2 ;
    public final void rule__UIApplication__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1099:1: ( rule__UIApplication__Group_3_4__1__Impl rule__UIApplication__Group_3_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1100:2: rule__UIApplication__Group_3_4__1__Impl rule__UIApplication__Group_3_4__2
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__1__Impl_in_rule__UIApplication__Group_3_4__12151);
            rule__UIApplication__Group_3_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__2_in_rule__UIApplication__Group_3_4__12154);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1107:1: rule__UIApplication__Group_3_4__1__Impl : ( ( rule__UIApplication__PagesAssignment_3_4_1 ) ) ;
    public final void rule__UIApplication__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1111:1: ( ( ( rule__UIApplication__PagesAssignment_3_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1112:1: ( ( rule__UIApplication__PagesAssignment_3_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1112:1: ( ( rule__UIApplication__PagesAssignment_3_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1113:1: ( rule__UIApplication__PagesAssignment_3_4_1 )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1114:1: ( rule__UIApplication__PagesAssignment_3_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1114:2: rule__UIApplication__PagesAssignment_3_4_1
            {
            pushFollow(FOLLOW_rule__UIApplication__PagesAssignment_3_4_1_in_rule__UIApplication__Group_3_4__1__Impl2181);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1124:1: rule__UIApplication__Group_3_4__2 : rule__UIApplication__Group_3_4__2__Impl ;
    public final void rule__UIApplication__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1128:1: ( rule__UIApplication__Group_3_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1129:2: rule__UIApplication__Group_3_4__2__Impl
            {
            pushFollow(FOLLOW_rule__UIApplication__Group_3_4__2__Impl_in_rule__UIApplication__Group_3_4__22211);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1135:1: rule__UIApplication__Group_3_4__2__Impl : ( ' />' ) ;
    public final void rule__UIApplication__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1139:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1140:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1140:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1141:1: ' />'
            {
             before(grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_4_2()); 
            match(input,16,FOLLOW_16_in_rule__UIApplication__Group_3_4__2__Impl2239); 
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


    // $ANTLR start "rule__XMLDeclaration__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1160:1: rule__XMLDeclaration__Group__0 : rule__XMLDeclaration__Group__0__Impl rule__XMLDeclaration__Group__1 ;
    public final void rule__XMLDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1164:1: ( rule__XMLDeclaration__Group__0__Impl rule__XMLDeclaration__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1165:2: rule__XMLDeclaration__Group__0__Impl rule__XMLDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__0__Impl_in_rule__XMLDeclaration__Group__02276);
            rule__XMLDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XMLDeclaration__Group__1_in_rule__XMLDeclaration__Group__02279);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1172:1: rule__XMLDeclaration__Group__0__Impl : ( '<?xml version=' ) ;
    public final void rule__XMLDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1176:1: ( ( '<?xml version=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1177:1: ( '<?xml version=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1177:1: ( '<?xml version=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1178:1: '<?xml version='
            {
             before(grammarAccess.getXMLDeclarationAccess().getXmlVersionKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__XMLDeclaration__Group__0__Impl2307); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1191:1: rule__XMLDeclaration__Group__1 : rule__XMLDeclaration__Group__1__Impl rule__XMLDeclaration__Group__2 ;
    public final void rule__XMLDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1195:1: ( rule__XMLDeclaration__Group__1__Impl rule__XMLDeclaration__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1196:2: rule__XMLDeclaration__Group__1__Impl rule__XMLDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__1__Impl_in_rule__XMLDeclaration__Group__12338);
            rule__XMLDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XMLDeclaration__Group__2_in_rule__XMLDeclaration__Group__12341);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1203:1: rule__XMLDeclaration__Group__1__Impl : ( RULE_VERSION ) ;
    public final void rule__XMLDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1207:1: ( ( RULE_VERSION ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1208:1: ( RULE_VERSION )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1208:1: ( RULE_VERSION )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1209:1: RULE_VERSION
            {
             before(grammarAccess.getXMLDeclarationAccess().getVERSIONTerminalRuleCall_1()); 
            match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_rule__XMLDeclaration__Group__1__Impl2368); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1220:1: rule__XMLDeclaration__Group__2 : rule__XMLDeclaration__Group__2__Impl rule__XMLDeclaration__Group__3 ;
    public final void rule__XMLDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1224:1: ( rule__XMLDeclaration__Group__2__Impl rule__XMLDeclaration__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1225:2: rule__XMLDeclaration__Group__2__Impl rule__XMLDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__2__Impl_in_rule__XMLDeclaration__Group__22397);
            rule__XMLDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XMLDeclaration__Group__3_in_rule__XMLDeclaration__Group__22400);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1232:1: rule__XMLDeclaration__Group__2__Impl : ( ' encoding=' ) ;
    public final void rule__XMLDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1236:1: ( ( ' encoding=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1237:1: ( ' encoding=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1237:1: ( ' encoding=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1238:1: ' encoding='
            {
             before(grammarAccess.getXMLDeclarationAccess().getEncodingKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__XMLDeclaration__Group__2__Impl2428); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1251:1: rule__XMLDeclaration__Group__3 : rule__XMLDeclaration__Group__3__Impl rule__XMLDeclaration__Group__4 ;
    public final void rule__XMLDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1255:1: ( rule__XMLDeclaration__Group__3__Impl rule__XMLDeclaration__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1256:2: rule__XMLDeclaration__Group__3__Impl rule__XMLDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__3__Impl_in_rule__XMLDeclaration__Group__32459);
            rule__XMLDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XMLDeclaration__Group__4_in_rule__XMLDeclaration__Group__32462);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1263:1: rule__XMLDeclaration__Group__3__Impl : ( ruleEString ) ;
    public final void rule__XMLDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1267:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1268:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1268:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1269:1: ruleEString
            {
             before(grammarAccess.getXMLDeclarationAccess().getEStringParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleEString_in_rule__XMLDeclaration__Group__3__Impl2489);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1280:1: rule__XMLDeclaration__Group__4 : rule__XMLDeclaration__Group__4__Impl ;
    public final void rule__XMLDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1284:1: ( rule__XMLDeclaration__Group__4__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1285:2: rule__XMLDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__XMLDeclaration__Group__4__Impl_in_rule__XMLDeclaration__Group__42518);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1291:1: rule__XMLDeclaration__Group__4__Impl : ( ' ?>' ) ;
    public final void rule__XMLDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1295:1: ( ( ' ?>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1296:1: ( ' ?>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1296:1: ( ' ?>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1297:1: ' ?>'
            {
             before(grammarAccess.getXMLDeclarationAccess().getSpaceQuestionMarkGreaterThanSignKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__XMLDeclaration__Group__4__Impl2546); 
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


    // $ANTLR start "rule__View__Group__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1320:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1324:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1325:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__02587);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__02590);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1332:1: rule__View__Group__0__Impl : ( () ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1336:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1337:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1337:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1338:1: ()
            {
             before(grammarAccess.getViewAccess().getViewAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1339:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1341:1: 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1351:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1355:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1356:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__12648);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__12651);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1363:1: rule__View__Group__1__Impl : ( '<view name=' ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1367:1: ( ( '<view name=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1368:1: ( '<view name=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1368:1: ( '<view name=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1369:1: '<view name='
            {
             before(grammarAccess.getViewAccess().getViewNameKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__View__Group__1__Impl2679); 
             after(grammarAccess.getViewAccess().getViewNameKeyword_1()); 

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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1382:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1386:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1387:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__22710);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__22713);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1394:1: rule__View__Group__2__Impl : ( ( rule__View__NameAssignment_2 ) ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1398:1: ( ( ( rule__View__NameAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1399:1: ( ( rule__View__NameAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1399:1: ( ( rule__View__NameAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1400:1: ( rule__View__NameAssignment_2 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1401:1: ( rule__View__NameAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1401:2: rule__View__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__2__Impl2740);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1411:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1415:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1416:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__32770);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__4_in_rule__View__Group__32773);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1423:1: rule__View__Group__3__Impl : ( ' >' ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1427:1: ( ( ' >' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1428:1: ( ' >' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1428:1: ( ' >' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1429:1: ' >'
            {
             before(grammarAccess.getViewAccess().getSpaceGreaterThanSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__View__Group__3__Impl2801); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1442:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1446:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1447:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__42832);
            rule__View__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__5_in_rule__View__Group__42835);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1454:1: rule__View__Group__4__Impl : ( ( rule__View__Group_4__0 )? ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1458:1: ( ( ( rule__View__Group_4__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1459:1: ( ( rule__View__Group_4__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1459:1: ( ( rule__View__Group_4__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1460:1: ( rule__View__Group_4__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1461:1: ( rule__View__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1461:2: rule__View__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_4__0_in_rule__View__Group__4__Impl2862);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1471:1: rule__View__Group__5 : rule__View__Group__5__Impl rule__View__Group__6 ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1475:1: ( rule__View__Group__5__Impl rule__View__Group__6 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1476:2: rule__View__Group__5__Impl rule__View__Group__6
            {
            pushFollow(FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__52893);
            rule__View__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__6_in_rule__View__Group__52896);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1483:1: rule__View__Group__5__Impl : ( '<model ref=' ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1487:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1488:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1488:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1489:1: '<model ref='
            {
             before(grammarAccess.getViewAccess().getModelRefKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__View__Group__5__Impl2924); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1502:1: rule__View__Group__6 : rule__View__Group__6__Impl rule__View__Group__7 ;
    public final void rule__View__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1506:1: ( rule__View__Group__6__Impl rule__View__Group__7 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1507:2: rule__View__Group__6__Impl rule__View__Group__7
            {
            pushFollow(FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__62955);
            rule__View__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__7_in_rule__View__Group__62958);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1514:1: rule__View__Group__6__Impl : ( ( rule__View__ModelAssignment_6 ) ) ;
    public final void rule__View__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1518:1: ( ( ( rule__View__ModelAssignment_6 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1519:1: ( ( rule__View__ModelAssignment_6 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1519:1: ( ( rule__View__ModelAssignment_6 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1520:1: ( rule__View__ModelAssignment_6 )
            {
             before(grammarAccess.getViewAccess().getModelAssignment_6()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1521:1: ( rule__View__ModelAssignment_6 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1521:2: rule__View__ModelAssignment_6
            {
            pushFollow(FOLLOW_rule__View__ModelAssignment_6_in_rule__View__Group__6__Impl2985);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1531:1: rule__View__Group__7 : rule__View__Group__7__Impl rule__View__Group__8 ;
    public final void rule__View__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1535:1: ( rule__View__Group__7__Impl rule__View__Group__8 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1536:2: rule__View__Group__7__Impl rule__View__Group__8
            {
            pushFollow(FOLLOW_rule__View__Group__7__Impl_in_rule__View__Group__73015);
            rule__View__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__8_in_rule__View__Group__73018);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1543:1: rule__View__Group__7__Impl : ( ' />' ) ;
    public final void rule__View__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1547:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1548:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1548:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1549:1: ' />'
            {
             before(grammarAccess.getViewAccess().getSpaceSolidusGreaterThanSignKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__View__Group__7__Impl3046); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1562:1: rule__View__Group__8 : rule__View__Group__8__Impl rule__View__Group__9 ;
    public final void rule__View__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1566:1: ( rule__View__Group__8__Impl rule__View__Group__9 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1567:2: rule__View__Group__8__Impl rule__View__Group__9
            {
            pushFollow(FOLLOW_rule__View__Group__8__Impl_in_rule__View__Group__83077);
            rule__View__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__9_in_rule__View__Group__83080);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1574:1: rule__View__Group__8__Impl : ( ( rule__View__Group_8__0 )? ) ;
    public final void rule__View__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1578:1: ( ( ( rule__View__Group_8__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1579:1: ( ( rule__View__Group_8__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1579:1: ( ( rule__View__Group_8__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1580:1: ( rule__View__Group_8__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_8()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1581:1: ( rule__View__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1581:2: rule__View__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_8__0_in_rule__View__Group__8__Impl3107);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1591:1: rule__View__Group__9 : rule__View__Group__9__Impl ;
    public final void rule__View__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1595:1: ( rule__View__Group__9__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1596:2: rule__View__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__View__Group__9__Impl_in_rule__View__Group__93138);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1602:1: rule__View__Group__9__Impl : ( '</view>' ) ;
    public final void rule__View__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1606:1: ( ( '</view>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1607:1: ( '</view>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1607:1: ( '</view>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1608:1: '</view>'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_9()); 
            match(input,26,FOLLOW_26_in_rule__View__Group__9__Impl3166); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1641:1: rule__View__Group_4__0 : rule__View__Group_4__0__Impl rule__View__Group_4__1 ;
    public final void rule__View__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1645:1: ( rule__View__Group_4__0__Impl rule__View__Group_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1646:2: rule__View__Group_4__0__Impl rule__View__Group_4__1
            {
            pushFollow(FOLLOW_rule__View__Group_4__0__Impl_in_rule__View__Group_4__03217);
            rule__View__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_4__1_in_rule__View__Group_4__03220);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1653:1: rule__View__Group_4__0__Impl : ( '<description>' ) ;
    public final void rule__View__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1657:1: ( ( '<description>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1658:1: ( '<description>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1658:1: ( '<description>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1659:1: '<description>'
            {
             before(grammarAccess.getViewAccess().getDescriptionKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__View__Group_4__0__Impl3248); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1672:1: rule__View__Group_4__1 : rule__View__Group_4__1__Impl rule__View__Group_4__2 ;
    public final void rule__View__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1676:1: ( rule__View__Group_4__1__Impl rule__View__Group_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1677:2: rule__View__Group_4__1__Impl rule__View__Group_4__2
            {
            pushFollow(FOLLOW_rule__View__Group_4__1__Impl_in_rule__View__Group_4__13279);
            rule__View__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_4__2_in_rule__View__Group_4__13282);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1684:1: rule__View__Group_4__1__Impl : ( ( rule__View__DescriptionAssignment_4_1 ) ) ;
    public final void rule__View__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1688:1: ( ( ( rule__View__DescriptionAssignment_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1689:1: ( ( rule__View__DescriptionAssignment_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1689:1: ( ( rule__View__DescriptionAssignment_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1690:1: ( rule__View__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getViewAccess().getDescriptionAssignment_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1691:1: ( rule__View__DescriptionAssignment_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1691:2: rule__View__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__View__DescriptionAssignment_4_1_in_rule__View__Group_4__1__Impl3309);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1701:1: rule__View__Group_4__2 : rule__View__Group_4__2__Impl ;
    public final void rule__View__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1705:1: ( rule__View__Group_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1706:2: rule__View__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_4__2__Impl_in_rule__View__Group_4__23339);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1712:1: rule__View__Group_4__2__Impl : ( '</description>' ) ;
    public final void rule__View__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1716:1: ( ( '</description>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1717:1: ( '</description>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1717:1: ( '</description>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1718:1: '</description>'
            {
             before(grammarAccess.getViewAccess().getDescriptionKeyword_4_2()); 
            match(input,28,FOLLOW_28_in_rule__View__Group_4__2__Impl3367); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1737:1: rule__View__Group_8__0 : rule__View__Group_8__0__Impl rule__View__Group_8__1 ;
    public final void rule__View__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1741:1: ( rule__View__Group_8__0__Impl rule__View__Group_8__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1742:2: rule__View__Group_8__0__Impl rule__View__Group_8__1
            {
            pushFollow(FOLLOW_rule__View__Group_8__0__Impl_in_rule__View__Group_8__03404);
            rule__View__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_8__1_in_rule__View__Group_8__03407);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1749:1: rule__View__Group_8__0__Impl : ( '<actions>' ) ;
    public final void rule__View__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1753:1: ( ( '<actions>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1754:1: ( '<actions>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1754:1: ( '<actions>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1755:1: '<actions>'
            {
             before(grammarAccess.getViewAccess().getActionsKeyword_8_0()); 
            match(input,29,FOLLOW_29_in_rule__View__Group_8__0__Impl3435); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1768:1: rule__View__Group_8__1 : rule__View__Group_8__1__Impl rule__View__Group_8__2 ;
    public final void rule__View__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1772:1: ( rule__View__Group_8__1__Impl rule__View__Group_8__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1773:2: rule__View__Group_8__1__Impl rule__View__Group_8__2
            {
            pushFollow(FOLLOW_rule__View__Group_8__1__Impl_in_rule__View__Group_8__13466);
            rule__View__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_8__2_in_rule__View__Group_8__13469);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1780:1: rule__View__Group_8__1__Impl : ( ( rule__View__ActionsAssignment_8_1 ) ) ;
    public final void rule__View__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1784:1: ( ( ( rule__View__ActionsAssignment_8_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1785:1: ( ( rule__View__ActionsAssignment_8_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1785:1: ( ( rule__View__ActionsAssignment_8_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1786:1: ( rule__View__ActionsAssignment_8_1 )
            {
             before(grammarAccess.getViewAccess().getActionsAssignment_8_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1787:1: ( rule__View__ActionsAssignment_8_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1787:2: rule__View__ActionsAssignment_8_1
            {
            pushFollow(FOLLOW_rule__View__ActionsAssignment_8_1_in_rule__View__Group_8__1__Impl3496);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1797:1: rule__View__Group_8__2 : rule__View__Group_8__2__Impl rule__View__Group_8__3 ;
    public final void rule__View__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1801:1: ( rule__View__Group_8__2__Impl rule__View__Group_8__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1802:2: rule__View__Group_8__2__Impl rule__View__Group_8__3
            {
            pushFollow(FOLLOW_rule__View__Group_8__2__Impl_in_rule__View__Group_8__23526);
            rule__View__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_8__3_in_rule__View__Group_8__23529);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1809:1: rule__View__Group_8__2__Impl : ( ( rule__View__ActionsAssignment_8_2 )* ) ;
    public final void rule__View__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1813:1: ( ( ( rule__View__ActionsAssignment_8_2 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1814:1: ( ( rule__View__ActionsAssignment_8_2 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1814:1: ( ( rule__View__ActionsAssignment_8_2 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1815:1: ( rule__View__ActionsAssignment_8_2 )*
            {
             before(grammarAccess.getViewAccess().getActionsAssignment_8_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1816:1: ( rule__View__ActionsAssignment_8_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1816:2: rule__View__ActionsAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__View__ActionsAssignment_8_2_in_rule__View__Group_8__2__Impl3556);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1826:1: rule__View__Group_8__3 : rule__View__Group_8__3__Impl ;
    public final void rule__View__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1830:1: ( rule__View__Group_8__3__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1831:2: rule__View__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_8__3__Impl_in_rule__View__Group_8__33587);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1837:1: rule__View__Group_8__3__Impl : ( '</actions>' ) ;
    public final void rule__View__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1841:1: ( ( '</actions>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1842:1: ( '</actions>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1842:1: ( '</actions>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1843:1: '</actions>'
            {
             before(grammarAccess.getViewAccess().getActionsKeyword_8_3()); 
            match(input,30,FOLLOW_30_in_rule__View__Group_8__3__Impl3615); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1864:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1868:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1869:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03654);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03657);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1876:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1880:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1881:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1881:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1882:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1883:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1885:1: 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1895:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1899:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1900:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13715);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13718);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1907:1: rule__Model__Group__1__Impl : ( '<model name=' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1911:1: ( ( '<model name=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1912:1: ( '<model name=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1912:1: ( '<model name=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1913:1: '<model name='
            {
             before(grammarAccess.getModelAccess().getModelNameKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Model__Group__1__Impl3746); 
             after(grammarAccess.getModelAccess().getModelNameKeyword_1()); 

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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1926:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1930:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1931:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23777);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23780);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1938:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1942:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1943:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1943:1: ( ( rule__Model__NameAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1944:1: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1945:1: ( rule__Model__NameAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1945:2: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl3807);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1955:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1959:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1960:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33837);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33840);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1967:1: rule__Model__Group__3__Impl : ( ' >' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1971:1: ( ( ' >' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1972:1: ( ' >' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1972:1: ( ' >' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1973:1: ' >'
            {
             before(grammarAccess.getModelAccess().getSpaceGreaterThanSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__3__Impl3868); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1986:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1990:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1991:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43899);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43902);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1998:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2002:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2003:1: ( ( rule__Model__Group_4__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2003:1: ( ( rule__Model__Group_4__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2004:1: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2005:1: ( rule__Model__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2005:2: rule__Model__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl3929);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2015:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2019:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2020:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53960);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__53963);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2027:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2031:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2032:1: ( ( rule__Model__Group_5__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2032:1: ( ( rule__Model__Group_5__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2033:1: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2034:1: ( rule__Model__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2034:2: rule__Model__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_5__0_in_rule__Model__Group__5__Impl3990);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2044:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2048:1: ( rule__Model__Group__6__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2049:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__64021);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2055:1: rule__Model__Group__6__Impl : ( '</model>' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2059:1: ( ( '</model>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2060:1: ( '</model>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2060:1: ( '</model>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2061:1: '</model>'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__Model__Group__6__Impl4049); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2088:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2092:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2093:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__04094);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__04097);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2100:1: rule__Model__Group_4__0__Impl : ( '<properties>' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2104:1: ( ( '<properties>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2105:1: ( '<properties>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2105:1: ( '<properties>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2106:1: '<properties>'
            {
             before(grammarAccess.getModelAccess().getPropertiesKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Model__Group_4__0__Impl4125); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2119:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2123:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2124:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
            {
            pushFollow(FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__14156);
            rule__Model__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__2_in_rule__Model__Group_4__14159);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2131:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__PropertiesAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2135:1: ( ( ( rule__Model__PropertiesAssignment_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2136:1: ( ( rule__Model__PropertiesAssignment_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2136:1: ( ( rule__Model__PropertiesAssignment_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2137:1: ( rule__Model__PropertiesAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2138:1: ( rule__Model__PropertiesAssignment_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2138:2: rule__Model__PropertiesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Model__PropertiesAssignment_4_1_in_rule__Model__Group_4__1__Impl4186);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2148:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2152:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2153:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
            {
            pushFollow(FOLLOW_rule__Model__Group_4__2__Impl_in_rule__Model__Group_4__24216);
            rule__Model__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_4__3_in_rule__Model__Group_4__24219);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2160:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__PropertiesAssignment_4_2 )* ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2164:1: ( ( ( rule__Model__PropertiesAssignment_4_2 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2165:1: ( ( rule__Model__PropertiesAssignment_4_2 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2165:1: ( ( rule__Model__PropertiesAssignment_4_2 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2166:1: ( rule__Model__PropertiesAssignment_4_2 )*
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_4_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2167:1: ( rule__Model__PropertiesAssignment_4_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2167:2: rule__Model__PropertiesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PropertiesAssignment_4_2_in_rule__Model__Group_4__2__Impl4246);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2177:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2181:1: ( rule__Model__Group_4__3__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2182:2: rule__Model__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_4__3__Impl_in_rule__Model__Group_4__34277);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2188:1: rule__Model__Group_4__3__Impl : ( '</properties>' ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2192:1: ( ( '</properties>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2193:1: ( '</properties>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2193:1: ( '</properties>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2194:1: '</properties>'
            {
             before(grammarAccess.getModelAccess().getPropertiesKeyword_4_3()); 
            match(input,34,FOLLOW_34_in_rule__Model__Group_4__3__Impl4305); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2215:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2219:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2220:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
            {
            pushFollow(FOLLOW_rule__Model__Group_5__0__Impl_in_rule__Model__Group_5__04344);
            rule__Model__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__1_in_rule__Model__Group_5__04347);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2227:1: rule__Model__Group_5__0__Impl : ( '<ownedElements>' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2231:1: ( ( '<ownedElements>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2232:1: ( '<ownedElements>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2232:1: ( '<ownedElements>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2233:1: '<ownedElements>'
            {
             before(grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0()); 
            match(input,35,FOLLOW_35_in_rule__Model__Group_5__0__Impl4375); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2246:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2250:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2251:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
            {
            pushFollow(FOLLOW_rule__Model__Group_5__1__Impl_in_rule__Model__Group_5__14406);
            rule__Model__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__2_in_rule__Model__Group_5__14409);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2258:1: rule__Model__Group_5__1__Impl : ( '<model ref=' ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2262:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2263:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2263:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2264:1: '<model ref='
            {
             before(grammarAccess.getModelAccess().getModelRefKeyword_5_1()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group_5__1__Impl4437); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2277:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl rule__Model__Group_5__3 ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2281:1: ( rule__Model__Group_5__2__Impl rule__Model__Group_5__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2282:2: rule__Model__Group_5__2__Impl rule__Model__Group_5__3
            {
            pushFollow(FOLLOW_rule__Model__Group_5__2__Impl_in_rule__Model__Group_5__24468);
            rule__Model__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__3_in_rule__Model__Group_5__24471);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2289:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__OwnedElementsAssignment_5_2 ) ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2293:1: ( ( ( rule__Model__OwnedElementsAssignment_5_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2294:1: ( ( rule__Model__OwnedElementsAssignment_5_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2294:1: ( ( rule__Model__OwnedElementsAssignment_5_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2295:1: ( rule__Model__OwnedElementsAssignment_5_2 )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2296:1: ( rule__Model__OwnedElementsAssignment_5_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2296:2: rule__Model__OwnedElementsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Model__OwnedElementsAssignment_5_2_in_rule__Model__Group_5__2__Impl4498);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2306:1: rule__Model__Group_5__3 : rule__Model__Group_5__3__Impl rule__Model__Group_5__4 ;
    public final void rule__Model__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2310:1: ( rule__Model__Group_5__3__Impl rule__Model__Group_5__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2311:2: rule__Model__Group_5__3__Impl rule__Model__Group_5__4
            {
            pushFollow(FOLLOW_rule__Model__Group_5__3__Impl_in_rule__Model__Group_5__34528);
            rule__Model__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__4_in_rule__Model__Group_5__34531);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2318:1: rule__Model__Group_5__3__Impl : ( ' />' ) ;
    public final void rule__Model__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2322:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2323:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2323:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2324:1: ' />'
            {
             before(grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_3()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group_5__3__Impl4559); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2337:1: rule__Model__Group_5__4 : rule__Model__Group_5__4__Impl rule__Model__Group_5__5 ;
    public final void rule__Model__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2341:1: ( rule__Model__Group_5__4__Impl rule__Model__Group_5__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2342:2: rule__Model__Group_5__4__Impl rule__Model__Group_5__5
            {
            pushFollow(FOLLOW_rule__Model__Group_5__4__Impl_in_rule__Model__Group_5__44590);
            rule__Model__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5__5_in_rule__Model__Group_5__44593);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2349:1: rule__Model__Group_5__4__Impl : ( ( rule__Model__Group_5_4__0 )* ) ;
    public final void rule__Model__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2353:1: ( ( ( rule__Model__Group_5_4__0 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2354:1: ( ( rule__Model__Group_5_4__0 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2354:1: ( ( rule__Model__Group_5_4__0 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2355:1: ( rule__Model__Group_5_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_5_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2356:1: ( rule__Model__Group_5_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2356:2: rule__Model__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_5_4__0_in_rule__Model__Group_5__4__Impl4620);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2366:1: rule__Model__Group_5__5 : rule__Model__Group_5__5__Impl ;
    public final void rule__Model__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2370:1: ( rule__Model__Group_5__5__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2371:2: rule__Model__Group_5__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_5__5__Impl_in_rule__Model__Group_5__54651);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2377:1: rule__Model__Group_5__5__Impl : ( '</ownedElements>' ) ;
    public final void rule__Model__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2381:1: ( ( '</ownedElements>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2382:1: ( '</ownedElements>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2382:1: ( '</ownedElements>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2383:1: '</ownedElements>'
            {
             before(grammarAccess.getModelAccess().getOwnedElementsKeyword_5_5()); 
            match(input,36,FOLLOW_36_in_rule__Model__Group_5__5__Impl4679); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2408:1: rule__Model__Group_5_4__0 : rule__Model__Group_5_4__0__Impl rule__Model__Group_5_4__1 ;
    public final void rule__Model__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2412:1: ( rule__Model__Group_5_4__0__Impl rule__Model__Group_5_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2413:2: rule__Model__Group_5_4__0__Impl rule__Model__Group_5_4__1
            {
            pushFollow(FOLLOW_rule__Model__Group_5_4__0__Impl_in_rule__Model__Group_5_4__04722);
            rule__Model__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5_4__1_in_rule__Model__Group_5_4__04725);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2420:1: rule__Model__Group_5_4__0__Impl : ( '<model ref=' ) ;
    public final void rule__Model__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2424:1: ( ( '<model ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2425:1: ( '<model ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2425:1: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2426:1: '<model ref='
            {
             before(grammarAccess.getModelAccess().getModelRefKeyword_5_4_0()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group_5_4__0__Impl4753); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2439:1: rule__Model__Group_5_4__1 : rule__Model__Group_5_4__1__Impl rule__Model__Group_5_4__2 ;
    public final void rule__Model__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2443:1: ( rule__Model__Group_5_4__1__Impl rule__Model__Group_5_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2444:2: rule__Model__Group_5_4__1__Impl rule__Model__Group_5_4__2
            {
            pushFollow(FOLLOW_rule__Model__Group_5_4__1__Impl_in_rule__Model__Group_5_4__14784);
            rule__Model__Group_5_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_5_4__2_in_rule__Model__Group_5_4__14787);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2451:1: rule__Model__Group_5_4__1__Impl : ( ( rule__Model__OwnedElementsAssignment_5_4_1 ) ) ;
    public final void rule__Model__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2455:1: ( ( ( rule__Model__OwnedElementsAssignment_5_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2456:1: ( ( rule__Model__OwnedElementsAssignment_5_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2456:1: ( ( rule__Model__OwnedElementsAssignment_5_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2457:1: ( rule__Model__OwnedElementsAssignment_5_4_1 )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2458:1: ( rule__Model__OwnedElementsAssignment_5_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2458:2: rule__Model__OwnedElementsAssignment_5_4_1
            {
            pushFollow(FOLLOW_rule__Model__OwnedElementsAssignment_5_4_1_in_rule__Model__Group_5_4__1__Impl4814);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2468:1: rule__Model__Group_5_4__2 : rule__Model__Group_5_4__2__Impl ;
    public final void rule__Model__Group_5_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2472:1: ( rule__Model__Group_5_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2473:2: rule__Model__Group_5_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_5_4__2__Impl_in_rule__Model__Group_5_4__24844);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2479:1: rule__Model__Group_5_4__2__Impl : ( ' />' ) ;
    public final void rule__Model__Group_5_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2483:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2484:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2484:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2485:1: ' />'
            {
             before(grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_4_2()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group_5_4__2__Impl4872); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2504:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2508:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2509:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04909);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04912);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2516:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2520:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2521:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2521:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2522:1: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2523:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2525:1: 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2535:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2539:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2540:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14970);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14973);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2547:1: rule__Action__Group__1__Impl : ( '<action name=' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2551:1: ( ( '<action name=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2552:1: ( '<action name=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2552:1: ( '<action name=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2553:1: '<action name='
            {
             before(grammarAccess.getActionAccess().getActionNameKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Action__Group__1__Impl5001); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2566:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2570:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2571:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__25032);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__25035);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2578:1: rule__Action__Group__2__Impl : ( ( rule__Action__NameAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2582:1: ( ( ( rule__Action__NameAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2583:1: ( ( rule__Action__NameAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2583:1: ( ( rule__Action__NameAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2584:1: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2585:1: ( rule__Action__NameAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2585:2: rule__Action__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__2__Impl5062);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2595:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2599:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2600:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__35092);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__35095);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2607:1: rule__Action__Group__3__Impl : ( ' >' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2611:1: ( ( ' >' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2612:1: ( ' >' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2612:1: ( ' >' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2613:1: ' >'
            {
             before(grammarAccess.getActionAccess().getSpaceGreaterThanSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Action__Group__3__Impl5123); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2626:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2630:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2631:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__45154);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__45157);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2638:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2642:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2643:1: ( ( rule__Action__Group_4__0 )? )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2643:1: ( ( rule__Action__Group_4__0 )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2644:1: ( rule__Action__Group_4__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2645:1: ( rule__Action__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2645:2: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl5184);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2655:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2659:1: ( rule__Action__Group__5__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2660:2: rule__Action__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__55215);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2666:1: rule__Action__Group__5__Impl : ( '</action>' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2670:1: ( ( '</action>' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2671:1: ( '</action>' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2671:1: ( '</action>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2672:1: '</action>'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_5()); 
            match(input,38,FOLLOW_38_in_rule__Action__Group__5__Impl5243); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2697:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2701:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2702:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__05286);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__05289);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2709:1: rule__Action__Group_4__0__Impl : ( '<nextPage ref=' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2713:1: ( ( '<nextPage ref=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2714:1: ( '<nextPage ref=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2714:1: ( '<nextPage ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2715:1: '<nextPage ref='
            {
             before(grammarAccess.getActionAccess().getNextPageRefKeyword_4_0()); 
            match(input,39,FOLLOW_39_in_rule__Action__Group_4__0__Impl5317); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2728:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl rule__Action__Group_4__2 ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2732:1: ( rule__Action__Group_4__1__Impl rule__Action__Group_4__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2733:2: rule__Action__Group_4__1__Impl rule__Action__Group_4__2
            {
            pushFollow(FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__15348);
            rule__Action__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Action__Group_4__2_in_rule__Action__Group_4__15351);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2740:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__NextPageAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2744:1: ( ( ( rule__Action__NextPageAssignment_4_1 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2745:1: ( ( rule__Action__NextPageAssignment_4_1 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2745:1: ( ( rule__Action__NextPageAssignment_4_1 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2746:1: ( rule__Action__NextPageAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getNextPageAssignment_4_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2747:1: ( rule__Action__NextPageAssignment_4_1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2747:2: rule__Action__NextPageAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Action__NextPageAssignment_4_1_in_rule__Action__Group_4__1__Impl5378);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2757:1: rule__Action__Group_4__2 : rule__Action__Group_4__2__Impl ;
    public final void rule__Action__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2761:1: ( rule__Action__Group_4__2__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2762:2: rule__Action__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_4__2__Impl_in_rule__Action__Group_4__25408);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2768:1: rule__Action__Group_4__2__Impl : ( ' />' ) ;
    public final void rule__Action__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2772:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2773:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2773:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2774:1: ' />'
            {
             before(grammarAccess.getActionAccess().getSpaceSolidusGreaterThanSignKeyword_4_2()); 
            match(input,16,FOLLOW_16_in_rule__Action__Group_4__2__Impl5436); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2793:1: rule__ModelProperty__Group__0 : rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 ;
    public final void rule__ModelProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2797:1: ( rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2798:2: rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__0__Impl_in_rule__ModelProperty__Group__05473);
            rule__ModelProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelProperty__Group__1_in_rule__ModelProperty__Group__05476);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2805:1: rule__ModelProperty__Group__0__Impl : ( () ) ;
    public final void rule__ModelProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2809:1: ( ( () ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2810:1: ( () )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2810:1: ( () )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2811:1: ()
            {
             before(grammarAccess.getModelPropertyAccess().getModelPropertyAction_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2812:1: ()
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2814:1: 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2824:1: rule__ModelProperty__Group__1 : rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2 ;
    public final void rule__ModelProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2828:1: ( rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2829:2: rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__1__Impl_in_rule__ModelProperty__Group__15534);
            rule__ModelProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelProperty__Group__2_in_rule__ModelProperty__Group__15537);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2836:1: rule__ModelProperty__Group__1__Impl : ( '<modelProperty name=' ) ;
    public final void rule__ModelProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2840:1: ( ( '<modelProperty name=' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2841:1: ( '<modelProperty name=' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2841:1: ( '<modelProperty name=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2842:1: '<modelProperty name='
            {
             before(grammarAccess.getModelPropertyAccess().getModelPropertyNameKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__ModelProperty__Group__1__Impl5565); 
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2855:1: rule__ModelProperty__Group__2 : rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3 ;
    public final void rule__ModelProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2859:1: ( rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2860:2: rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__2__Impl_in_rule__ModelProperty__Group__25596);
            rule__ModelProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelProperty__Group__3_in_rule__ModelProperty__Group__25599);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2867:1: rule__ModelProperty__Group__2__Impl : ( ( rule__ModelProperty__NameAssignment_2 ) ) ;
    public final void rule__ModelProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2871:1: ( ( ( rule__ModelProperty__NameAssignment_2 ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2872:1: ( ( rule__ModelProperty__NameAssignment_2 ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2872:1: ( ( rule__ModelProperty__NameAssignment_2 ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2873:1: ( rule__ModelProperty__NameAssignment_2 )
            {
             before(grammarAccess.getModelPropertyAccess().getNameAssignment_2()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2874:1: ( rule__ModelProperty__NameAssignment_2 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2874:2: rule__ModelProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelProperty__NameAssignment_2_in_rule__ModelProperty__Group__2__Impl5626);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2884:1: rule__ModelProperty__Group__3 : rule__ModelProperty__Group__3__Impl ;
    public final void rule__ModelProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2888:1: ( rule__ModelProperty__Group__3__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2889:2: rule__ModelProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelProperty__Group__3__Impl_in_rule__ModelProperty__Group__35656);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2895:1: rule__ModelProperty__Group__3__Impl : ( ' />' ) ;
    public final void rule__ModelProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2899:1: ( ( ' />' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2900:1: ( ' />' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2900:1: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2901:1: ' />'
            {
             before(grammarAccess.getModelPropertyAccess().getSpaceSolidusGreaterThanSignKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__ModelProperty__Group__3__Impl5684); 
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


    // $ANTLR start "rule__EString__Group_1__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2922:1: rule__EString__Group_1__0 : rule__EString__Group_1__0__Impl rule__EString__Group_1__1 ;
    public final void rule__EString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2926:1: ( rule__EString__Group_1__0__Impl rule__EString__Group_1__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2927:2: rule__EString__Group_1__0__Impl rule__EString__Group_1__1
            {
            pushFollow(FOLLOW_rule__EString__Group_1__0__Impl_in_rule__EString__Group_1__05723);
            rule__EString__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EString__Group_1__1_in_rule__EString__Group_1__05726);
            rule__EString__Group_1__1();

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
    // $ANTLR end "rule__EString__Group_1__0"


    // $ANTLR start "rule__EString__Group_1__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2934:1: rule__EString__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__EString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2938:1: ( ( RULE_ID ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2939:1: ( RULE_ID )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2939:1: ( RULE_ID )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2940:1: RULE_ID
            {
             before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Group_1__0__Impl5753); 
             after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EString__Group_1__0__Impl"


    // $ANTLR start "rule__EString__Group_1__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2951:1: rule__EString__Group_1__1 : rule__EString__Group_1__1__Impl ;
    public final void rule__EString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2955:1: ( rule__EString__Group_1__1__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2956:2: rule__EString__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EString__Group_1__1__Impl_in_rule__EString__Group_1__15782);
            rule__EString__Group_1__1__Impl();

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
    // $ANTLR end "rule__EString__Group_1__1"


    // $ANTLR start "rule__EString__Group_1__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2962:1: rule__EString__Group_1__1__Impl : ( ( rule__EString__Group_1_1__0 )* ) ;
    public final void rule__EString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2966:1: ( ( ( rule__EString__Group_1_1__0 )* ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2967:1: ( ( rule__EString__Group_1_1__0 )* )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2967:1: ( ( rule__EString__Group_1_1__0 )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2968:1: ( rule__EString__Group_1_1__0 )*
            {
             before(grammarAccess.getEStringAccess().getGroup_1_1()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2969:1: ( rule__EString__Group_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2969:2: rule__EString__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EString__Group_1_1__0_in_rule__EString__Group_1__1__Impl5809);
            	    rule__EString__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEStringAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__EString__Group_1__1__Impl"


    // $ANTLR start "rule__EString__Group_1_1__0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2983:1: rule__EString__Group_1_1__0 : rule__EString__Group_1_1__0__Impl rule__EString__Group_1_1__1 ;
    public final void rule__EString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2987:1: ( rule__EString__Group_1_1__0__Impl rule__EString__Group_1_1__1 )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2988:2: rule__EString__Group_1_1__0__Impl rule__EString__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__EString__Group_1_1__0__Impl_in_rule__EString__Group_1_1__05844);
            rule__EString__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EString__Group_1_1__1_in_rule__EString__Group_1_1__05847);
            rule__EString__Group_1_1__1();

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
    // $ANTLR end "rule__EString__Group_1_1__0"


    // $ANTLR start "rule__EString__Group_1_1__0__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2995:1: rule__EString__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__EString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:2999:1: ( ( '.' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3000:1: ( '.' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3000:1: ( '.' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3001:1: '.'
            {
             before(grammarAccess.getEStringAccess().getFullStopKeyword_1_1_0()); 
            match(input,41,FOLLOW_41_in_rule__EString__Group_1_1__0__Impl5875); 
             after(grammarAccess.getEStringAccess().getFullStopKeyword_1_1_0()); 

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
    // $ANTLR end "rule__EString__Group_1_1__0__Impl"


    // $ANTLR start "rule__EString__Group_1_1__1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3014:1: rule__EString__Group_1_1__1 : rule__EString__Group_1_1__1__Impl ;
    public final void rule__EString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3018:1: ( rule__EString__Group_1_1__1__Impl )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3019:2: rule__EString__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EString__Group_1_1__1__Impl_in_rule__EString__Group_1_1__15906);
            rule__EString__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__EString__Group_1_1__1"


    // $ANTLR start "rule__EString__Group_1_1__1__Impl"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3025:1: rule__EString__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__EString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3029:1: ( ( RULE_ID ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3030:1: ( RULE_ID )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3030:1: ( RULE_ID )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3031:1: RULE_ID
            {
             before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Group_1_1__1__Impl5933); 
             after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__EString__Group_1_1__1__Impl"


    // $ANTLR start "rule__MainPackage__AllModelsAssignment_1_0"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3047:1: rule__MainPackage__AllModelsAssignment_1_0 : ( ruleModel ) ;
    public final void rule__MainPackage__AllModelsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3051:1: ( ( ruleModel ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3052:1: ( ruleModel )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3052:1: ( ruleModel )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3053:1: ruleModel
            {
             before(grammarAccess.getMainPackageAccess().getAllModelsModelParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__MainPackage__AllModelsAssignment_1_05971);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getMainPackageAccess().getAllModelsModelParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__MainPackage__AllModelsAssignment_1_0"


    // $ANTLR start "rule__MainPackage__AllViewsAssignment_1_1"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3062:1: rule__MainPackage__AllViewsAssignment_1_1 : ( ruleView ) ;
    public final void rule__MainPackage__AllViewsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3066:1: ( ( ruleView ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3067:1: ( ruleView )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3067:1: ( ruleView )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3068:1: ruleView
            {
             before(grammarAccess.getMainPackageAccess().getAllViewsViewParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleView_in_rule__MainPackage__AllViewsAssignment_1_16002);
            ruleView();

            state._fsp--;

             after(grammarAccess.getMainPackageAccess().getAllViewsViewParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MainPackage__AllViewsAssignment_1_1"


    // $ANTLR start "rule__MainPackage__AppAssignment_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3077:1: rule__MainPackage__AppAssignment_2 : ( ruleUIApplication ) ;
    public final void rule__MainPackage__AppAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3081:1: ( ( ruleUIApplication ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3082:1: ( ruleUIApplication )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3082:1: ( ruleUIApplication )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3083:1: ruleUIApplication
            {
             before(grammarAccess.getMainPackageAccess().getAppUIApplicationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUIApplication_in_rule__MainPackage__AppAssignment_26033);
            ruleUIApplication();

            state._fsp--;

             after(grammarAccess.getMainPackageAccess().getAppUIApplicationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MainPackage__AppAssignment_2"


    // $ANTLR start "rule__UIApplication__ModelsAssignment_2_2"
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3092:1: rule__UIApplication__ModelsAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__UIApplication__ModelsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3096:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3097:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3097:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3098:1: ( ruleEString )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_2_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3099:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3100:1: ruleEString
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UIApplication__ModelsAssignment_2_26068);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3111:1: rule__UIApplication__ModelsAssignment_2_4_1 : ( ( ruleEString ) ) ;
    public final void rule__UIApplication__ModelsAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3115:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3116:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3116:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3117:1: ( ruleEString )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_4_1_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3118:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3119:1: ruleEString
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelEStringParserRuleCall_2_4_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UIApplication__ModelsAssignment_2_4_16107);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3130:1: rule__UIApplication__PagesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__UIApplication__PagesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3134:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3135:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3135:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3136:1: ( ruleEString )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_2_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3137:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3138:1: ruleEString
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UIApplication__PagesAssignment_3_26146);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3149:1: rule__UIApplication__PagesAssignment_3_4_1 : ( ( ruleEString ) ) ;
    public final void rule__UIApplication__PagesAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3153:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3154:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3154:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3155:1: ( ruleEString )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_4_1_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3156:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3157:1: ruleEString
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewEStringParserRuleCall_3_4_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UIApplication__PagesAssignment_3_4_16185);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3168:1: rule__View__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__View__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3172:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3173:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3173:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3174:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__View__NameAssignment_26220);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3183:1: rule__View__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__View__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3187:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3188:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3188:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3189:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__View__DescriptionAssignment_4_16251);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3198:1: rule__View__ModelAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__View__ModelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3202:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3203:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3203:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3204:1: ( ruleEString )
            {
             before(grammarAccess.getViewAccess().getModelModelCrossReference_6_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3205:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3206:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getModelModelEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__View__ModelAssignment_66286);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3217:1: rule__View__ActionsAssignment_8_1 : ( ruleAction ) ;
    public final void rule__View__ActionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3221:1: ( ( ruleAction ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3222:1: ( ruleAction )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3222:1: ( ruleAction )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3223:1: ruleAction
            {
             before(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__View__ActionsAssignment_8_16321);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3232:1: rule__View__ActionsAssignment_8_2 : ( ruleAction ) ;
    public final void rule__View__ActionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3236:1: ( ( ruleAction ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3237:1: ( ruleAction )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3237:1: ( ruleAction )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3238:1: ruleAction
            {
             before(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__View__ActionsAssignment_8_26352);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3247:1: rule__Model__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3251:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3252:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3252:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3253:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Model__NameAssignment_26383);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3262:1: rule__Model__PropertiesAssignment_4_1 : ( ruleModelProperty ) ;
    public final void rule__Model__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3266:1: ( ( ruleModelProperty ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3267:1: ( ruleModelProperty )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3267:1: ( ruleModelProperty )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3268:1: ruleModelProperty
            {
             before(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_16414);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3277:1: rule__Model__PropertiesAssignment_4_2 : ( ruleModelProperty ) ;
    public final void rule__Model__PropertiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3281:1: ( ( ruleModelProperty ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3282:1: ( ruleModelProperty )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3282:1: ( ruleModelProperty )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3283:1: ruleModelProperty
            {
             before(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_26445);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3292:1: rule__Model__OwnedElementsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Model__OwnedElementsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3296:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3297:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3297:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3298:1: ( ruleEString )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_2_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3299:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3300:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Model__OwnedElementsAssignment_5_26480);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3311:1: rule__Model__OwnedElementsAssignment_5_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Model__OwnedElementsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3315:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3316:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3316:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3317:1: ( ruleEString )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_4_1_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3318:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3319:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelEStringParserRuleCall_5_4_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Model__OwnedElementsAssignment_5_4_16519);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3330:1: rule__Action__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3334:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3335:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3335:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3336:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Action__NameAssignment_26554);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3345:1: rule__Action__NextPageAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Action__NextPageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3349:1: ( ( ( ruleEString ) ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3350:1: ( ( ruleEString ) )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3350:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3351:1: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3352:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3353:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNextPageViewEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Action__NextPageAssignment_4_16589);
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
    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3364:1: rule__ModelProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModelProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3368:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3369:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3369:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3370:1: ruleEString
            {
             before(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ModelProperty__NameAssignment_26624);
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


 

    public static final BitSet FOLLOW_ruleMainPackage_in_entryRuleMainPackage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainPackage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainPackage__Group__0_in_ruleMainPackage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIApplication_in_entryRuleUIApplication121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIApplication128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__0_in_ruleUIApplication154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDeclaration_in_entryRuleXMLDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__0_in_ruleXMLDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__MainPackage__AllModelsAssignment_1_0_in_rule__MainPackage__Alternatives_1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainPackage__AllViewsAssignment_1_1_in_rule__MainPackage__Alternatives_1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Group_1__0_in_rule__EString__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainPackage__Group__0__Impl_in_rule__MainPackage__Group__0649 = new BitSet(new long[]{0x0000000081001000L});
    public static final BitSet FOLLOW_rule__MainPackage__Group__1_in_rule__MainPackage__Group__0652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDeclaration_in_rule__MainPackage__Group__0__Impl679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainPackage__Group__1__Impl_in_rule__MainPackage__Group__1708 = new BitSet(new long[]{0x0000000081001000L});
    public static final BitSet FOLLOW_rule__MainPackage__Group__2_in_rule__MainPackage__Group__1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainPackage__Alternatives_1_in_rule__MainPackage__Group__1__Impl738 = new BitSet(new long[]{0x0000000081000002L});
    public static final BitSet FOLLOW_rule__MainPackage__Group__2__Impl_in_rule__MainPackage__Group__2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainPackage__AppAssignment_2_in_rule__MainPackage__Group__2__Impl796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__0__Impl_in_rule__UIApplication__Group__0832 = new BitSet(new long[]{0x0000000081001000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__1_in_rule__UIApplication__Group__0835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__1__Impl_in_rule__UIApplication__Group__1893 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__2_in_rule__UIApplication__Group__1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UIApplication__Group__1__Impl924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__2__Impl_in_rule__UIApplication__Group__2955 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__3_in_rule__UIApplication__Group__2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__0_in_rule__UIApplication__Group__2__Impl985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__3__Impl_in_rule__UIApplication__Group__31016 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__4_in_rule__UIApplication__Group__31019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__0_in_rule__UIApplication__Group__3__Impl1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group__4__Impl_in_rule__UIApplication__Group__41077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UIApplication__Group__4__Impl1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__0__Impl_in_rule__UIApplication__Group_2__01146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__1_in_rule__UIApplication__Group_2__01149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UIApplication__Group_2__0__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__1__Impl_in_rule__UIApplication__Group_2__11208 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__2_in_rule__UIApplication__Group_2__11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UIApplication__Group_2__1__Impl1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__2__Impl_in_rule__UIApplication__Group_2__21270 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__3_in_rule__UIApplication__Group_2__21273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__ModelsAssignment_2_2_in_rule__UIApplication__Group_2__2__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__3__Impl_in_rule__UIApplication__Group_2__31330 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__4_in_rule__UIApplication__Group_2__31333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UIApplication__Group_2__3__Impl1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__4__Impl_in_rule__UIApplication__Group_2__41392 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__5_in_rule__UIApplication__Group_2__41395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__0_in_rule__UIApplication__Group_2__4__Impl1422 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2__5__Impl_in_rule__UIApplication__Group_2__51453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UIApplication__Group_2__5__Impl1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__0__Impl_in_rule__UIApplication__Group_2_4__01524 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__1_in_rule__UIApplication__Group_2_4__01527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UIApplication__Group_2_4__0__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__1__Impl_in_rule__UIApplication__Group_2_4__11586 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__2_in_rule__UIApplication__Group_2_4__11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__ModelsAssignment_2_4_1_in_rule__UIApplication__Group_2_4__1__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_2_4__2__Impl_in_rule__UIApplication__Group_2_4__21646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UIApplication__Group_2_4__2__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__0__Impl_in_rule__UIApplication__Group_3__01711 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__1_in_rule__UIApplication__Group_3__01714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UIApplication__Group_3__0__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__1__Impl_in_rule__UIApplication__Group_3__11773 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__2_in_rule__UIApplication__Group_3__11776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UIApplication__Group_3__1__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__2__Impl_in_rule__UIApplication__Group_3__21835 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__3_in_rule__UIApplication__Group_3__21838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__PagesAssignment_3_2_in_rule__UIApplication__Group_3__2__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__3__Impl_in_rule__UIApplication__Group_3__31895 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__4_in_rule__UIApplication__Group_3__31898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UIApplication__Group_3__3__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__4__Impl_in_rule__UIApplication__Group_3__41957 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__5_in_rule__UIApplication__Group_3__41960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__0_in_rule__UIApplication__Group_3__4__Impl1987 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3__5__Impl_in_rule__UIApplication__Group_3__52018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UIApplication__Group_3__5__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__0__Impl_in_rule__UIApplication__Group_3_4__02089 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__1_in_rule__UIApplication__Group_3_4__02092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UIApplication__Group_3_4__0__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__1__Impl_in_rule__UIApplication__Group_3_4__12151 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__2_in_rule__UIApplication__Group_3_4__12154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__PagesAssignment_3_4_1_in_rule__UIApplication__Group_3_4__1__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIApplication__Group_3_4__2__Impl_in_rule__UIApplication__Group_3_4__22211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UIApplication__Group_3_4__2__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__0__Impl_in_rule__XMLDeclaration__Group__02276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__1_in_rule__XMLDeclaration__Group__02279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__XMLDeclaration__Group__0__Impl2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__1__Impl_in_rule__XMLDeclaration__Group__12338 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__2_in_rule__XMLDeclaration__Group__12341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_in_rule__XMLDeclaration__Group__1__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__2__Impl_in_rule__XMLDeclaration__Group__22397 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__3_in_rule__XMLDeclaration__Group__22400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__XMLDeclaration__Group__2__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__3__Impl_in_rule__XMLDeclaration__Group__32459 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__4_in_rule__XMLDeclaration__Group__32462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__XMLDeclaration__Group__3__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDeclaration__Group__4__Impl_in_rule__XMLDeclaration__Group__42518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__XMLDeclaration__Group__4__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__02587 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__02590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__12648 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__12651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__View__Group__1__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__22710 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__22713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__2__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__32770 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__32773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__View__Group__3__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__42832 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_rule__View__Group__5_in_rule__View__Group__42835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_4__0_in_rule__View__Group__4__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__52893 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__View__Group__6_in_rule__View__Group__52896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__View__Group__5__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__62955 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__View__Group__7_in_rule__View__Group__62958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ModelAssignment_6_in_rule__View__Group__6__Impl2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__7__Impl_in_rule__View__Group__73015 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__View__Group__8_in_rule__View__Group__73018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__View__Group__7__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__8__Impl_in_rule__View__Group__83077 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__View__Group__9_in_rule__View__Group__83080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__0_in_rule__View__Group__8__Impl3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__9__Impl_in_rule__View__Group__93138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__View__Group__9__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_4__0__Impl_in_rule__View__Group_4__03217 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__View__Group_4__1_in_rule__View__Group_4__03220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__View__Group_4__0__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_4__1__Impl_in_rule__View__Group_4__13279 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__View__Group_4__2_in_rule__View__Group_4__13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__DescriptionAssignment_4_1_in_rule__View__Group_4__1__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_4__2__Impl_in_rule__View__Group_4__23339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__View__Group_4__2__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__0__Impl_in_rule__View__Group_8__03404 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__View__Group_8__1_in_rule__View__Group_8__03407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__View__Group_8__0__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__1__Impl_in_rule__View__Group_8__13466 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__View__Group_8__2_in_rule__View__Group_8__13469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ActionsAssignment_8_1_in_rule__View__Group_8__1__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__2__Impl_in_rule__View__Group_8__23526 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__View__Group_8__3_in_rule__View__Group_8__23529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ActionsAssignment_8_2_in_rule__View__Group_8__2__Impl3556 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__View__Group_8__3__Impl_in_rule__View__Group_8__33587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__View__Group_8__3__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03654 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13715 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Model__Group__1__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23777 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33837 = new BitSet(new long[]{0x0000000B00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__3__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43899 = new BitSet(new long[]{0x0000000B00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53960 = new BitSet(new long[]{0x0000000B00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__53963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__0_in_rule__Model__Group__5__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__64021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__6__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__04094 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__04097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Model__Group_4__0__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__14156 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_rule__Model__Group_4__2_in_rule__Model__Group_4__14159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PropertiesAssignment_4_1_in_rule__Model__Group_4__1__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__2__Impl_in_rule__Model__Group_4__24216 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_rule__Model__Group_4__3_in_rule__Model__Group_4__24219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PropertiesAssignment_4_2_in_rule__Model__Group_4__2__Impl4246 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_4__3__Impl_in_rule__Model__Group_4__34277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Model__Group_4__3__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__0__Impl_in_rule__Model__Group_5__04344 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group_5__1_in_rule__Model__Group_5__04347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Model__Group_5__0__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__1__Impl_in_rule__Model__Group_5__14406 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Model__Group_5__2_in_rule__Model__Group_5__14409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_5__1__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__2__Impl_in_rule__Model__Group_5__24468 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Model__Group_5__3_in_rule__Model__Group_5__24471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OwnedElementsAssignment_5_2_in_rule__Model__Group_5__2__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__3__Impl_in_rule__Model__Group_5__34528 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_rule__Model__Group_5__4_in_rule__Model__Group_5__34531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group_5__3__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__4__Impl_in_rule__Model__Group_5__44590 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_rule__Model__Group_5__5_in_rule__Model__Group_5__44593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__0_in_rule__Model__Group_5__4__Impl4620 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group_5__5__Impl_in_rule__Model__Group_5__54651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Model__Group_5__5__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__0__Impl_in_rule__Model__Group_5_4__04722 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__1_in_rule__Model__Group_5_4__04725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_5_4__0__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__1__Impl_in_rule__Model__Group_5_4__14784 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__2_in_rule__Model__Group_5_4__14787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OwnedElementsAssignment_5_4_1_in_rule__Model__Group_5_4__1__Impl4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_5_4__2__Impl_in_rule__Model__Group_5_4__24844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group_5_4__2__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04909 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14970 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Action__Group__1__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__25032 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__25035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__2__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__35092 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__35095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Action__Group__3__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__45154 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__45157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__55215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Action__Group__5__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__05286 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__05289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Action__Group_4__0__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__15348 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Action__Group_4__2_in_rule__Action__Group_4__15351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NextPageAssignment_4_1_in_rule__Action__Group_4__1__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__2__Impl_in_rule__Action__Group_4__25408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Action__Group_4__2__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__0__Impl_in_rule__ModelProperty__Group__05473 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__1_in_rule__ModelProperty__Group__05476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__1__Impl_in_rule__ModelProperty__Group__15534 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__2_in_rule__ModelProperty__Group__15537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ModelProperty__Group__1__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__2__Impl_in_rule__ModelProperty__Group__25596 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__3_in_rule__ModelProperty__Group__25599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__NameAssignment_2_in_rule__ModelProperty__Group__2__Impl5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProperty__Group__3__Impl_in_rule__ModelProperty__Group__35656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModelProperty__Group__3__Impl5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Group_1__0__Impl_in_rule__EString__Group_1__05723 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EString__Group_1__1_in_rule__EString__Group_1__05726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Group_1__0__Impl5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Group_1__1__Impl_in_rule__EString__Group_1__15782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Group_1_1__0_in_rule__EString__Group_1__1__Impl5809 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__EString__Group_1_1__0__Impl_in_rule__EString__Group_1_1__05844 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EString__Group_1_1__1_in_rule__EString__Group_1_1__05847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EString__Group_1_1__0__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Group_1_1__1__Impl_in_rule__EString__Group_1_1__15906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Group_1_1__1__Impl5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__MainPackage__AllModelsAssignment_1_05971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__MainPackage__AllViewsAssignment_1_16002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIApplication_in_rule__MainPackage__AppAssignment_26033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIApplication__ModelsAssignment_2_26068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIApplication__ModelsAssignment_2_4_16107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIApplication__PagesAssignment_3_26146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UIApplication__PagesAssignment_3_4_16185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__View__NameAssignment_26220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__View__DescriptionAssignment_4_16251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__View__ModelAssignment_66286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__View__ActionsAssignment_8_16321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__View__ActionsAssignment_8_26352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Model__NameAssignment_26383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_16414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_26445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Model__OwnedElementsAssignment_5_26480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Model__OwnedElementsAssignment_5_4_16519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Action__NameAssignment_26554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Action__NextPageAssignment_4_16589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ModelProperty__NameAssignment_26624 = new BitSet(new long[]{0x0000000000000002L});

}