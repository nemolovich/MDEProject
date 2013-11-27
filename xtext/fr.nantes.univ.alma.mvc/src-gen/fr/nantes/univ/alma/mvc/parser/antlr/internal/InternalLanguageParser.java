package fr.nantes.univ.alma.mvc.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.nantes.univ.alma.mvc.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?xml version='", "' encoding='", "' ?>'", "'<UIApplication>'", "'<models>'", "'<model ref='", "' />'", "'</models>'", "'<pages>'", "'<page ref='", "'</pages>'", "'</UIApplication>'", "'<view id='", "' >'", "'<description>'", "'</description>'", "'<actions>'", "'</actions>'", "'</view>'", "'<model id='", "'<properties>'", "'</properties>'", "'<ownedElements>'", "'</ownedElements>'", "'</model>'", "'<action name='", "'<nextPage ref='", "'</action>'", "'<modelProperty name='"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_VERSION=4;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private LanguageGrammarAccess grammarAccess;
     	
        public InternalLanguageParser(TokenStream input, LanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Package";	
       	}
       	
       	@Override
       	protected LanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackage"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:73:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:74:2: (iv_rulePackage= rulePackage EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:75:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage81);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:82:1: rulePackage returns [EObject current=null] : ( ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        EObject lv_views_1_0 = null;

        EObject lv_models_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_mainApp_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:85:28: ( ( ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) ) ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:86:1: ( ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) ) )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:86:1: ( ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:87:2: ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackageAccess().getXMLDeclarationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMLDeclaration_in_rulePackage135);
            ruleXMLDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:97:1: ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )*
            loop1:
            do {
                int alt1=5;
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

                }

                switch (alt1) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:97:2: ( (lv_views_1_0= ruleView ) )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:97:2: ( (lv_views_1_0= ruleView ) )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:98:1: (lv_views_1_0= ruleView )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:98:1: (lv_views_1_0= ruleView )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:99:3: lv_views_1_0= ruleView
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getViewsViewParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleView_in_rulePackage156);
            	    lv_views_1_0=ruleView();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"views",
            	              		lv_views_1_0, 
            	              		"View");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:116:6: ( (lv_models_2_0= ruleModel ) )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:116:6: ( (lv_models_2_0= ruleModel ) )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:117:1: (lv_models_2_0= ruleModel )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:117:1: (lv_models_2_0= ruleModel )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:118:3: lv_models_2_0= ruleModel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getModelsModelParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModel_in_rulePackage183);
            	    lv_models_2_0=ruleModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"models",
            	              		lv_models_2_0, 
            	              		"Model");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:135:6: ( (lv_actions_3_0= ruleAction ) )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:135:6: ( (lv_actions_3_0= ruleAction ) )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:136:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:136:1: (lv_actions_3_0= ruleAction )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:137:3: lv_actions_3_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getActionsActionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_rulePackage210);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actions",
            	              		lv_actions_3_0, 
            	              		"Action");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:154:6: ( (lv_properties_4_0= ruleModelProperty ) )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:154:6: ( (lv_properties_4_0= ruleModelProperty ) )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:155:1: (lv_properties_4_0= ruleModelProperty )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:155:1: (lv_properties_4_0= ruleModelProperty )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:156:3: lv_properties_4_0= ruleModelProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getPropertiesModelPropertyParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModelProperty_in_rulePackage237);
            	    lv_properties_4_0=ruleModelProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_4_0, 
            	              		"ModelProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:172:4: ( (lv_mainApp_5_0= ruleUIApplication ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:173:1: (lv_mainApp_5_0= ruleUIApplication )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:173:1: (lv_mainApp_5_0= ruleUIApplication )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:174:3: lv_mainApp_5_0= ruleUIApplication
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageAccess().getMainAppUIApplicationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUIApplication_in_rulePackage260);
            lv_mainApp_5_0=ruleUIApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageRule());
              	        }
                     		add(
                     			current, 
                     			"mainApp",
                      		lv_mainApp_5_0, 
                      		"UIApplication");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleXMLDeclaration"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:198:1: entryRuleXMLDeclaration returns [String current=null] : iv_ruleXMLDeclaration= ruleXMLDeclaration EOF ;
    public final String entryRuleXMLDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXMLDeclaration = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:199:2: (iv_ruleXMLDeclaration= ruleXMLDeclaration EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:200:2: iv_ruleXMLDeclaration= ruleXMLDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMLDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXMLDeclaration_in_entryRuleXMLDeclaration297);
            iv_ruleXMLDeclaration=ruleXMLDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMLDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLDeclaration308); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMLDeclaration"


    // $ANTLR start "ruleXMLDeclaration"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:207:1: ruleXMLDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>' ) ;
    public final AntlrDatatypeRuleToken ruleXMLDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VERSION_1=null;
        AntlrDatatypeRuleToken this_EString_3 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:210:28: ( (kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:211:1: (kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:211:1: (kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:212:2: kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleXMLDeclaration346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getXmlVersionKeyword_0()); 
                  
            }
            this_VERSION_1=(Token)match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_ruleXMLDeclaration361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VERSION_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_VERSION_1, grammarAccess.getXMLDeclarationAccess().getVERSIONTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,13,FOLLOW_13_in_ruleXMLDeclaration379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getEncodingKeyword_2()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMLDeclarationAccess().getEStringParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleEString_in_ruleXMLDeclaration401);
            this_EString_3=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EString_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,14,FOLLOW_14_in_ruleXMLDeclaration419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getSpaceQuestionMarkGreaterThanSignKeyword_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMLDeclaration"


    // $ANTLR start "entryRuleUIApplication"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:255:1: entryRuleUIApplication returns [EObject current=null] : iv_ruleUIApplication= ruleUIApplication EOF ;
    public final EObject entryRuleUIApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIApplication = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:256:2: (iv_ruleUIApplication= ruleUIApplication EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:257:2: iv_ruleUIApplication= ruleUIApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUIApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleUIApplication_in_entryRuleUIApplication459);
            iv_ruleUIApplication=ruleUIApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUIApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIApplication469); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIApplication"


    // $ANTLR start "ruleUIApplication"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:264:1: ruleUIApplication returns [EObject current=null] : ( () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>' ) ;
    public final EObject ruleUIApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:267:28: ( ( () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:268:1: ( () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:268:1: ( () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:268:2: () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:268:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:269:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUIApplicationAccess().getUIApplicationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleUIApplication518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:281:1: (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:281:3: otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleUIApplication531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUIApplicationAccess().getModelsKeyword_2_0());
                          
                    }
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleUIApplication543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_1());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:289:1: ( ( ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:290:1: ( ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:290:1: ( ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:291:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUIApplicationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUIApplication570);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleUIApplication582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_3());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:311:1: (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:311:3: otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />'
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleUIApplication595); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_4_0());
                    	          
                    	    }
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:315:1: ( ( ruleEString ) )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:316:1: ( ruleEString )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:316:1: ( ruleEString )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:317:3: ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getUIApplicationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleUIApplication622);
                    	    ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleUIApplication634); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_4_2());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleUIApplication648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getUIApplicationAccess().getModelsKeyword_2_5());
                          
                    }

                    }
                    break;

            }

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:341:3: (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:341:5: otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleUIApplication663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0());
                          
                    }
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleUIApplication675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_1());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:349:1: ( ( ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:350:1: ( ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:350:1: ( ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:351:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUIApplicationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleUIApplication702);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleUIApplication714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_3());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:371:1: (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:371:3: otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />'
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleUIApplication727); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_4_0());
                    	          
                    	    }
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:375:1: ( ( ruleEString ) )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:376:1: ( ruleEString )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:376:1: ( ruleEString )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:377:3: ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getUIApplicationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleUIApplication754);
                    	    ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleUIApplication766); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_4_2());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleUIApplication780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getUIApplicationAccess().getPagesKeyword_3_5());
                          
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleUIApplication794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIApplication"


    // $ANTLR start "entryRuleView"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:413:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:414:2: (iv_ruleView= ruleView EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:415:2: iv_ruleView= ruleView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewRule()); 
            }
            pushFollow(FOLLOW_ruleView_in_entryRuleView830);
            iv_ruleView=ruleView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleView; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleView840); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:422:1: ruleView returns [EObject current=null] : ( () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_actions_11_0 = null;

        EObject lv_actions_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:425:28: ( ( () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:426:1: ( () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:426:1: ( () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:426:2: () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:426:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:427:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getViewAccess().getViewAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleView889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewAccess().getViewIdKeyword_1());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:439:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:440:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:440:1: (lv_name_2_0= ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:441:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleView910);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleView922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getSpaceGreaterThanSignKeyword_3());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:461:1: (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:461:3: otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleView935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getViewAccess().getDescriptionKeyword_4_0());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:465:1: ( (lv_description_5_0= ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:466:1: (lv_description_5_0= ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:466:1: (lv_description_5_0= ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:467:3: lv_description_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleView956);
                    lv_description_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_5_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleView968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getViewAccess().getDescriptionKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleView982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getViewAccess().getModelRefKeyword_5());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:491:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:492:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:492:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:493:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewAccess().getModelModelCrossReference_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleView1009);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleView1021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getViewAccess().getSpaceSolidusGreaterThanSignKeyword_7());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:513:1: (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:513:3: otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>'
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleView1034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getViewAccess().getActionsKeyword_8_0());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:517:1: ( (lv_actions_11_0= ruleAction ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:518:1: (lv_actions_11_0= ruleAction )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:518:1: (lv_actions_11_0= ruleAction )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:519:3: lv_actions_11_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAction_in_ruleView1055);
                    lv_actions_11_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewRule());
                      	        }
                             		add(
                             			current, 
                             			"actions",
                              		lv_actions_11_0, 
                              		"Action");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:535:2: ( (lv_actions_12_0= ruleAction ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==37) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:536:1: (lv_actions_12_0= ruleAction )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:536:1: (lv_actions_12_0= ruleAction )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:537:3: lv_actions_12_0= ruleAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleView1076);
                    	    lv_actions_12_0=ruleAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"actions",
                    	              		lv_actions_12_0, 
                    	              		"Action");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleView1089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getViewAccess().getActionsKeyword_8_3());
                          
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleView1103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getViewAccess().getViewKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleModel"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:569:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:570:2: (iv_ruleModel= ruleModel EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:571:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel1139);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel1149); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:578:1: ruleModel returns [EObject current=null] : ( () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_properties_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:581:28: ( ( () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:582:1: ( () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:582:1: ( () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:582:2: () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:582:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:583:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelAccess().getModelAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleModel1198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelIdKeyword_1());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:595:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:596:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:596:1: (lv_name_2_0= ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:597:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleModel1219);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleModel1231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getSpaceGreaterThanSignKeyword_3());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:617:1: (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:617:3: otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleModel1244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPropertiesKeyword_4_0());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:621:1: ( (lv_properties_5_0= ruleModelProperty ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:622:1: (lv_properties_5_0= ruleModelProperty )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:622:1: (lv_properties_5_0= ruleModelProperty )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:623:3: lv_properties_5_0= ruleModelProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModelProperty_in_ruleModel1265);
                    lv_properties_5_0=ruleModelProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		add(
                             			current, 
                             			"properties",
                              		lv_properties_5_0, 
                              		"ModelProperty");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:639:2: ( (lv_properties_6_0= ruleModelProperty ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==40) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:640:1: (lv_properties_6_0= ruleModelProperty )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:640:1: (lv_properties_6_0= ruleModelProperty )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:641:3: lv_properties_6_0= ruleModelProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleModelProperty_in_ruleModel1286);
                    	    lv_properties_6_0=ruleModelProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_6_0, 
                    	              		"ModelProperty");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleModel1299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getPropertiesKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:661:3: (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:661:5: otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>'
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleModel1314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0());
                          
                    }
                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleModel1326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getModelRefKeyword_5_1());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:669:1: ( ( ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:670:1: ( ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:670:1: ( ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:671:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getModelRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleModel1353);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleModel1365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_3());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:691:1: (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:691:3: otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />'
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleModel1378); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getModelAccess().getModelRefKeyword_5_4_0());
                    	          
                    	    }
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:695:1: ( ( ruleEString ) )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:696:1: ( ruleEString )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:696:1: ( ruleEString )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:697:3: ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getModelRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleModel1405);
                    	    ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleModel1417); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_4_2());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleModel1431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getModelAccess().getOwnedElementsKeyword_5_5());
                          
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,36,FOLLOW_36_in_ruleModel1445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getModelAccess().getModelKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAction"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:733:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:734:2: (iv_ruleAction= ruleAction EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:735:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1481);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1491); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:742:1: ruleAction returns [EObject current=null] : ( () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:745:28: ( ( () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:746:1: ( () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:746:1: ( () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:746:2: () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:746:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:747:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActionAccess().getActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAction1540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionNameKeyword_1());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:759:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:760:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:760:1: (lv_name_2_0= ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:761:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleAction1561);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAction1573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getSpaceGreaterThanSignKeyword_3());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:781:1: (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:781:3: otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleAction1586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getNextPageRefKeyword_4_0());
                          
                    }
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:785:1: ( ( ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:786:1: ( ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:786:1: ( ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:787:3: ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleAction1613);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleAction1625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getSpaceSolidusGreaterThanSignKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleAction1639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getActionAccess().getActionKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleModelProperty"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:819:1: entryRuleModelProperty returns [EObject current=null] : iv_ruleModelProperty= ruleModelProperty EOF ;
    public final EObject entryRuleModelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperty = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:820:2: (iv_ruleModelProperty= ruleModelProperty EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:821:2: iv_ruleModelProperty= ruleModelProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleModelProperty_in_entryRuleModelProperty1675);
            iv_ruleModelProperty=ruleModelProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelProperty1685); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:828:1: ruleModelProperty returns [EObject current=null] : ( () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />' ) ;
    public final EObject ruleModelProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:831:28: ( ( () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:832:1: ( () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:832:1: ( () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:832:2: () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:832:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:833:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelPropertyAccess().getModelPropertyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleModelProperty1734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getModelPropertyNameKeyword_1());
                  
            }
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:845:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:846:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:846:1: (lv_name_2_0= ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:3: lv_name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleModelProperty1755);
            lv_name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleModelProperty1767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModelPropertyAccess().getSpaceSolidusGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelProperty"


    // $ANTLR start "entryRuleEString"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:875:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:876:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:877:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1804);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1815); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:884:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:887:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:888:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:888:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:888:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:896:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDeclaration_in_rulePackage135 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleView_in_rulePackage156 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleModel_in_rulePackage183 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleAction_in_rulePackage210 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleModelProperty_in_rulePackage237 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleUIApplication_in_rulePackage260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDeclaration_in_entryRuleXMLDeclaration297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleXMLDeclaration346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_VERSION_in_ruleXMLDeclaration361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXMLDeclaration379 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleXMLDeclaration401 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXMLDeclaration419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIApplication_in_entryRuleUIApplication459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIApplication469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUIApplication518 = new BitSet(new long[]{0x0000000000910000L});
    public static final BitSet FOLLOW_16_in_ruleUIApplication531 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUIApplication543 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIApplication570 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUIApplication582 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleUIApplication595 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIApplication622 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUIApplication634 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_19_in_ruleUIApplication648 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleUIApplication663 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUIApplication675 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIApplication702 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUIApplication714 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleUIApplication727 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIApplication754 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUIApplication766 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleUIApplication780 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUIApplication794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleView889 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleView910 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleView922 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleView935 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleView956 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleView968 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleView982 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleView1009 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleView1021 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_28_in_ruleView1034 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleView1055 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleView1076 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_29_in_ruleView1089 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleView1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleModel1198 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModel1219 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModel1231 = new BitSet(new long[]{0x0000001500000000L});
    public static final BitSet FOLLOW_32_in_ruleModel1244 = new BitSet(new long[]{0x0000012081000000L});
    public static final BitSet FOLLOW_ruleModelProperty_in_ruleModel1265 = new BitSet(new long[]{0x0000012281000000L});
    public static final BitSet FOLLOW_ruleModelProperty_in_ruleModel1286 = new BitSet(new long[]{0x0000012281000000L});
    public static final BitSet FOLLOW_33_in_ruleModel1299 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_34_in_ruleModel1314 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModel1326 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModel1353 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModel1365 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_17_in_ruleModel1378 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModel1405 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModel1417 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_35_in_ruleModel1431 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleModel1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAction1540 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAction1561 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAction1573 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleAction1586 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAction1613 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAction1625 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAction1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProperty_in_entryRuleModelProperty1675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelProperty1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleModelProperty1734 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModelProperty1755 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModelProperty1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1881 = new BitSet(new long[]{0x0000000000000002L});

}