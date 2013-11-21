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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:67:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:68:2: (iv_rulePackage= rulePackage EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:69:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage75);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage85); 

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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:76:1: rulePackage returns [EObject current=null] : ( ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        EObject lv_views_1_0 = null;

        EObject lv_models_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_mainApp_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:79:28: ( ( ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) ) ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:80:1: ( ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) ) )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:80:1: ( ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:81:5: ruleXMLDeclaration ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )* ( (lv_mainApp_5_0= ruleUIApplication ) )
            {
             
                    newCompositeNode(grammarAccess.getPackageAccess().getXMLDeclarationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleXMLDeclaration_in_rulePackage126);
            ruleXMLDeclaration();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:88:1: ( ( (lv_views_1_0= ruleView ) ) | ( (lv_models_2_0= ruleModel ) ) | ( (lv_actions_3_0= ruleAction ) ) | ( (lv_properties_4_0= ruleModelProperty ) ) )*
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
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:88:2: ( (lv_views_1_0= ruleView ) )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:88:2: ( (lv_views_1_0= ruleView ) )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:89:1: (lv_views_1_0= ruleView )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:89:1: (lv_views_1_0= ruleView )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:90:3: lv_views_1_0= ruleView
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getViewsViewParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleView_in_rulePackage147);
            	    lv_views_1_0=ruleView();

            	    state._fsp--;


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
            	    break;
            	case 2 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:107:6: ( (lv_models_2_0= ruleModel ) )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:107:6: ( (lv_models_2_0= ruleModel ) )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:108:1: (lv_models_2_0= ruleModel )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:108:1: (lv_models_2_0= ruleModel )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:109:3: lv_models_2_0= ruleModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getModelsModelParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModel_in_rulePackage174);
            	    lv_models_2_0=ruleModel();

            	    state._fsp--;


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
            	    break;
            	case 3 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:126:6: ( (lv_actions_3_0= ruleAction ) )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:126:6: ( (lv_actions_3_0= ruleAction ) )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:127:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:127:1: (lv_actions_3_0= ruleAction )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:128:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getActionsActionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_rulePackage201);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


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
            	    break;
            	case 4 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:145:6: ( (lv_properties_4_0= ruleModelProperty ) )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:145:6: ( (lv_properties_4_0= ruleModelProperty ) )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:146:1: (lv_properties_4_0= ruleModelProperty )
            	    {
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:146:1: (lv_properties_4_0= ruleModelProperty )
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:147:3: lv_properties_4_0= ruleModelProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getPropertiesModelPropertyParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelProperty_in_rulePackage228);
            	    lv_properties_4_0=ruleModelProperty();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:163:4: ( (lv_mainApp_5_0= ruleUIApplication ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:164:1: (lv_mainApp_5_0= ruleUIApplication )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:164:1: (lv_mainApp_5_0= ruleUIApplication )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:165:3: lv_mainApp_5_0= ruleUIApplication
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getMainAppUIApplicationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUIApplication_in_rulePackage251);
            lv_mainApp_5_0=ruleUIApplication();

            state._fsp--;


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

             leaveRule(); 
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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:189:1: entryRuleXMLDeclaration returns [String current=null] : iv_ruleXMLDeclaration= ruleXMLDeclaration EOF ;
    public final String entryRuleXMLDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXMLDeclaration = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:190:2: (iv_ruleXMLDeclaration= ruleXMLDeclaration EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:191:2: iv_ruleXMLDeclaration= ruleXMLDeclaration EOF
            {
             newCompositeNode(grammarAccess.getXMLDeclarationRule()); 
            pushFollow(FOLLOW_ruleXMLDeclaration_in_entryRuleXMLDeclaration288);
            iv_ruleXMLDeclaration=ruleXMLDeclaration();

            state._fsp--;

             current =iv_ruleXMLDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLDeclaration299); 

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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:198:1: ruleXMLDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>' ) ;
    public final AntlrDatatypeRuleToken ruleXMLDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VERSION_1=null;
        AntlrDatatypeRuleToken this_EString_3 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:201:28: ( (kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:202:1: (kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:202:1: (kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:203:2: kw= '<?xml version=' this_VERSION_1= RULE_VERSION kw= ' encoding=' this_EString_3= ruleEString kw= ' ?>'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleXMLDeclaration337); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getXmlVersionKeyword_0()); 
                
            this_VERSION_1=(Token)match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_ruleXMLDeclaration352); 

            		current.merge(this_VERSION_1);
                
             
                newLeafNode(this_VERSION_1, grammarAccess.getXMLDeclarationAccess().getVERSIONTerminalRuleCall_1()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleXMLDeclaration370); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getEncodingKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getXMLDeclarationAccess().getEStringParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleEString_in_ruleXMLDeclaration392);
            this_EString_3=ruleEString();

            state._fsp--;


            		current.merge(this_EString_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleXMLDeclaration410); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getSpaceQuestionMarkGreaterThanSignKeyword_4()); 
                

            }


            }

             leaveRule(); 
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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:246:1: entryRuleUIApplication returns [EObject current=null] : iv_ruleUIApplication= ruleUIApplication EOF ;
    public final EObject entryRuleUIApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIApplication = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:247:2: (iv_ruleUIApplication= ruleUIApplication EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:248:2: iv_ruleUIApplication= ruleUIApplication EOF
            {
             newCompositeNode(grammarAccess.getUIApplicationRule()); 
            pushFollow(FOLLOW_ruleUIApplication_in_entryRuleUIApplication450);
            iv_ruleUIApplication=ruleUIApplication();

            state._fsp--;

             current =iv_ruleUIApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIApplication460); 

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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:255:1: ruleUIApplication returns [EObject current=null] : ( () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>' ) ;
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
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:258:28: ( ( () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:259:1: ( () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:259:1: ( () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:259:2: () otherlv_1= '<UIApplication>' (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )? (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )? otherlv_18= '</UIApplication>'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:259:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:260:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIApplicationAccess().getUIApplicationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleUIApplication506); 

                	newLeafNode(otherlv_1, grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:269:1: (otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:269:3: otherlv_2= '<models>' otherlv_3= '<model ref=' ( ( ruleEString ) ) otherlv_5= ' />' (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )* otherlv_9= '</models>'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleUIApplication519); 

                        	newLeafNode(otherlv_2, grammarAccess.getUIApplicationAccess().getModelsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleUIApplication531); 

                        	newLeafNode(otherlv_3, grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_1());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:277:1: ( ( ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:278:1: ( ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:278:1: ( ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:279:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIApplicationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleUIApplication554);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleUIApplication566); 

                        	newLeafNode(otherlv_5, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_3());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:296:1: (otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:296:3: otherlv_6= '<model ref=' ( ( ruleEString ) ) otherlv_8= ' />'
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleUIApplication579); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_4_0());
                    	        
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:300:1: ( ( ruleEString ) )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:301:1: ( ruleEString )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:301:1: ( ruleEString )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:302:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getUIApplicationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEString_in_ruleUIApplication602);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleUIApplication614); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_4_2());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleUIApplication628); 

                        	newLeafNode(otherlv_9, grammarAccess.getUIApplicationAccess().getModelsKeyword_2_5());
                        

                    }
                    break;

            }

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:323:3: (otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:323:5: otherlv_10= '<pages>' otherlv_11= '<page ref=' ( ( ruleEString ) ) otherlv_13= ' />' (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )* otherlv_17= '</pages>'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleUIApplication643); 

                        	newLeafNode(otherlv_10, grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0());
                        
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleUIApplication655); 

                        	newLeafNode(otherlv_11, grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_1());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:331:1: ( ( ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:332:1: ( ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:332:1: ( ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:333:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUIApplicationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleUIApplication678);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleUIApplication690); 

                        	newLeafNode(otherlv_13, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_3());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:350:1: (otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:350:3: otherlv_14= '<page ref=' ( ( ruleEString ) ) otherlv_16= ' />'
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleUIApplication703); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_4_0());
                    	        
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:354:1: ( ( ruleEString ) )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:355:1: ( ruleEString )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:355:1: ( ruleEString )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:356:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getUIApplicationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEString_in_ruleUIApplication726);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleUIApplication738); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_4_2());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleUIApplication752); 

                        	newLeafNode(otherlv_17, grammarAccess.getUIApplicationAccess().getPagesKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleUIApplication766); 

                	newLeafNode(otherlv_18, grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:389:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:390:2: (iv_ruleView= ruleView EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:391:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView802);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView812); 

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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:398:1: ruleView returns [EObject current=null] : ( () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>' ) ;
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
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:401:28: ( ( () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:402:1: ( () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:402:1: ( () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:402:2: () otherlv_1= '<view id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )? otherlv_7= '<model ref=' ( ( ruleEString ) ) otherlv_9= ' />' (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )? otherlv_14= '</view>'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:402:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:403:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getViewAccess().getViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleView858); 

                	newLeafNode(otherlv_1, grammarAccess.getViewAccess().getViewIdKeyword_1());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:412:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:413:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:413:1: (lv_name_2_0= ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:414:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getViewAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleView879);
            lv_name_2_0=ruleEString();

            state._fsp--;


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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleView891); 

                	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getSpaceGreaterThanSignKeyword_3());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:434:1: (otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:434:3: otherlv_4= '<description>' ( (lv_description_5_0= ruleEString ) ) otherlv_6= '</description>'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleView904); 

                        	newLeafNode(otherlv_4, grammarAccess.getViewAccess().getDescriptionKeyword_4_0());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:438:1: ( (lv_description_5_0= ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:439:1: (lv_description_5_0= ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:439:1: (lv_description_5_0= ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:440:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleView925);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


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

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleView937); 

                        	newLeafNode(otherlv_6, grammarAccess.getViewAccess().getDescriptionKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleView951); 

                	newLeafNode(otherlv_7, grammarAccess.getViewAccess().getModelRefKeyword_5());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:464:1: ( ( ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:465:1: ( ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:465:1: ( ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:466:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getViewAccess().getModelModelCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleView974);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleView986); 

                	newLeafNode(otherlv_9, grammarAccess.getViewAccess().getSpaceSolidusGreaterThanSignKeyword_7());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:483:1: (otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:483:3: otherlv_10= '<actions>' ( (lv_actions_11_0= ruleAction ) ) ( (lv_actions_12_0= ruleAction ) )* otherlv_13= '</actions>'
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleView999); 

                        	newLeafNode(otherlv_10, grammarAccess.getViewAccess().getActionsKeyword_8_0());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:487:1: ( (lv_actions_11_0= ruleAction ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:488:1: (lv_actions_11_0= ruleAction )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:488:1: (lv_actions_11_0= ruleAction )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:489:3: lv_actions_11_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleView1020);
                    lv_actions_11_0=ruleAction();

                    state._fsp--;


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

                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:505:2: ( (lv_actions_12_0= ruleAction ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==37) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:506:1: (lv_actions_12_0= ruleAction )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:506:1: (lv_actions_12_0= ruleAction )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:507:3: lv_actions_12_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleView1041);
                    	    lv_actions_12_0=ruleAction();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleView1054); 

                        	newLeafNode(otherlv_13, grammarAccess.getViewAccess().getActionsKeyword_8_3());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleView1068); 

                	newLeafNode(otherlv_14, grammarAccess.getViewAccess().getViewKeyword_9());
                

            }


            }

             leaveRule(); 
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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:539:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:540:2: (iv_ruleModel= ruleModel EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:541:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel1104);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel1114); 

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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:548:1: ruleModel returns [EObject current=null] : ( () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>' ) ;
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
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:551:28: ( ( () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:552:1: ( () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:552:1: ( () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:552:2: () otherlv_1= '<model id=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )? (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )? otherlv_16= '</model>'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:552:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:553:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleModel1160); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelIdKeyword_1());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:562:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:563:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:563:1: (lv_name_2_0= ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:564:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleModel1181);
            lv_name_2_0=ruleEString();

            state._fsp--;


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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleModel1193); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getSpaceGreaterThanSignKeyword_3());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:584:1: (otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:584:3: otherlv_4= '<properties>' ( (lv_properties_5_0= ruleModelProperty ) ) ( (lv_properties_6_0= ruleModelProperty ) )* otherlv_7= '</properties>'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleModel1206); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPropertiesKeyword_4_0());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:588:1: ( (lv_properties_5_0= ruleModelProperty ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:589:1: (lv_properties_5_0= ruleModelProperty )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:589:1: (lv_properties_5_0= ruleModelProperty )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:590:3: lv_properties_5_0= ruleModelProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModelProperty_in_ruleModel1227);
                    lv_properties_5_0=ruleModelProperty();

                    state._fsp--;


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

                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:606:2: ( (lv_properties_6_0= ruleModelProperty ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==40) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:607:1: (lv_properties_6_0= ruleModelProperty )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:607:1: (lv_properties_6_0= ruleModelProperty )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:608:3: lv_properties_6_0= ruleModelProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleModelProperty_in_ruleModel1248);
                    	    lv_properties_6_0=ruleModelProperty();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleModel1261); 

                        	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getPropertiesKeyword_4_3());
                        

                    }
                    break;

            }

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:628:3: (otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:628:5: otherlv_8= '<ownedElements>' otherlv_9= '<model ref=' ( ( ruleEString ) ) otherlv_11= ' />' (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )* otherlv_15= '</ownedElements>'
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleModel1276); 

                        	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleModel1288); 

                        	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getModelRefKeyword_5_1());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:636:1: ( ( ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:637:1: ( ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:637:1: ( ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:638:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleModel1311);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleModel1323); 

                        	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_3());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:655:1: (otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:655:3: otherlv_12= '<model ref=' ( ( ruleEString ) ) otherlv_14= ' />'
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleModel1336); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getModelAccess().getModelRefKeyword_5_4_0());
                    	        
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:659:1: ( ( ruleEString ) )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:660:1: ( ruleEString )
                    	    {
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:660:1: ( ruleEString )
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:661:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getModelRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEString_in_ruleModel1359);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleModel1371); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_4_2());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleModel1385); 

                        	newLeafNode(otherlv_15, grammarAccess.getModelAccess().getOwnedElementsKeyword_5_5());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,36,FOLLOW_36_in_ruleModel1399); 

                	newLeafNode(otherlv_16, grammarAccess.getModelAccess().getModelKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:694:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:695:2: (iv_ruleAction= ruleAction EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:696:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1435);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1445); 

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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:703:1: ruleAction returns [EObject current=null] : ( () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>' ) ;
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
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:706:28: ( ( () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:707:1: ( () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:707:1: ( () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:707:2: () otherlv_1= '<action name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' >' (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )? otherlv_7= '</action>'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:707:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:708:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionAccess().getActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAction1491); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionNameKeyword_1());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:717:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:718:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:718:1: (lv_name_2_0= ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:719:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAction1512);
            lv_name_2_0=ruleEString();

            state._fsp--;


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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAction1524); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getSpaceGreaterThanSignKeyword_3());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:739:1: (otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:739:3: otherlv_4= '<nextPage ref=' ( ( ruleEString ) ) otherlv_6= ' />'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleAction1537); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getNextPageRefKeyword_4_0());
                        
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:743:1: ( ( ruleEString ) )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:744:1: ( ruleEString )
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:744:1: ( ruleEString )
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:745:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleAction1560);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleAction1572); 

                        	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getSpaceSolidusGreaterThanSignKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleAction1586); 

                	newLeafNode(otherlv_7, grammarAccess.getActionAccess().getActionKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:774:1: entryRuleModelProperty returns [EObject current=null] : iv_ruleModelProperty= ruleModelProperty EOF ;
    public final EObject entryRuleModelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperty = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:775:2: (iv_ruleModelProperty= ruleModelProperty EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:776:2: iv_ruleModelProperty= ruleModelProperty EOF
            {
             newCompositeNode(grammarAccess.getModelPropertyRule()); 
            pushFollow(FOLLOW_ruleModelProperty_in_entryRuleModelProperty1622);
            iv_ruleModelProperty=ruleModelProperty();

            state._fsp--;

             current =iv_ruleModelProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelProperty1632); 

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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:783:1: ruleModelProperty returns [EObject current=null] : ( () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />' ) ;
    public final EObject ruleModelProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:786:28: ( ( () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:787:1: ( () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:787:1: ( () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:787:2: () otherlv_1= '<modelProperty name=' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ' />'
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:787:2: ()
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:788:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelPropertyAccess().getModelPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleModelProperty1678); 

                	newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getModelPropertyNameKeyword_1());
                
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:797:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:798:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:798:1: (lv_name_2_0= ruleEString )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:799:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleModelProperty1699);
            lv_name_2_0=ruleEString();

            state._fsp--;


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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleModelProperty1711); 

                	newLeafNode(otherlv_3, grammarAccess.getModelPropertyAccess().getSpaceSolidusGreaterThanSignKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:827:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:828:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:829:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1748);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1759); 

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
    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:836:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:839:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:840:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:840:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:840:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1799); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:848:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1825); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


 

    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDeclaration_in_rulePackage126 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleView_in_rulePackage147 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleModel_in_rulePackage174 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleAction_in_rulePackage201 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleModelProperty_in_rulePackage228 = new BitSet(new long[]{0x0000012081008000L});
    public static final BitSet FOLLOW_ruleUIApplication_in_rulePackage251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDeclaration_in_entryRuleXMLDeclaration288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLDeclaration299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleXMLDeclaration337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_VERSION_in_ruleXMLDeclaration352 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXMLDeclaration370 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleXMLDeclaration392 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXMLDeclaration410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIApplication_in_entryRuleUIApplication450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIApplication460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUIApplication506 = new BitSet(new long[]{0x0000000000910000L});
    public static final BitSet FOLLOW_16_in_ruleUIApplication519 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUIApplication531 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIApplication554 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUIApplication566 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleUIApplication579 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIApplication602 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUIApplication614 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_19_in_ruleUIApplication628 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleUIApplication643 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUIApplication655 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIApplication678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUIApplication690 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleUIApplication703 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUIApplication726 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUIApplication738 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleUIApplication752 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUIApplication766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleView858 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleView879 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleView891 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleView904 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleView925 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleView937 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleView951 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleView974 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleView986 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_28_in_ruleView999 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleView1020 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleView1041 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_29_in_ruleView1054 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleView1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleModel1160 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModel1181 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleModel1193 = new BitSet(new long[]{0x0000001500000000L});
    public static final BitSet FOLLOW_32_in_ruleModel1206 = new BitSet(new long[]{0x0000012081000000L});
    public static final BitSet FOLLOW_ruleModelProperty_in_ruleModel1227 = new BitSet(new long[]{0x0000012281000000L});
    public static final BitSet FOLLOW_ruleModelProperty_in_ruleModel1248 = new BitSet(new long[]{0x0000012281000000L});
    public static final BitSet FOLLOW_33_in_ruleModel1261 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_34_in_ruleModel1276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModel1288 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModel1311 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModel1323 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_17_in_ruleModel1336 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModel1359 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModel1371 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_35_in_ruleModel1385 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleModel1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAction1491 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAction1512 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAction1524 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleAction1537 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAction1560 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAction1572 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAction1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProperty_in_entryRuleModelProperty1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelProperty1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleModelProperty1678 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModelProperty1699 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModelProperty1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1825 = new BitSet(new long[]{0x0000000000000002L});

}