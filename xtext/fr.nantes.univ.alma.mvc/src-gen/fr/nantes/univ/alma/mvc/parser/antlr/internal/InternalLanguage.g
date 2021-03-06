/*
* generated by Xtext
*/
grammar InternalLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package fr.nantes.univ.alma.mvc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

 	private LanguageGrammarAccess grammarAccess;
 	
    public InternalLanguageParser(TokenStream input, LanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MainPackage";	
   	}
   	
   	@Override
   	protected LanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMainPackage
entryRuleMainPackage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMainPackageRule()); }
	 iv_ruleMainPackage=ruleMainPackage 
	 { $current=$iv_ruleMainPackage.current; } 
	 EOF 
;

// Rule MainPackage
ruleMainPackage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMainPackageAccess().getXMLDeclarationParserRuleCall_0()); 
    }
ruleXMLDeclaration
    { 
        afterParserOrEnumRuleCall();
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getMainPackageAccess().getAllModelsModelParserRuleCall_1_0_0()); 
	    }
		lv_allModels_1_0=ruleModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMainPackageRule());
	        }
       		add(
       			$current, 
       			"allModels",
        		lv_allModels_1_0, 
        		"Model");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getMainPackageAccess().getAllViewsViewParserRuleCall_1_1_0()); 
	    }
		lv_allViews_2_0=ruleView		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMainPackageRule());
	        }
       		add(
       			$current, 
       			"allViews",
        		lv_allViews_2_0, 
        		"View");
	        afterParserOrEnumRuleCall();
	    }

)
))*(
(
		{ 
	        newCompositeNode(grammarAccess.getMainPackageAccess().getAppUIApplicationParserRuleCall_2_0()); 
	    }
		lv_app_3_0=ruleUIApplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMainPackageRule());
	        }
       		set(
       			$current, 
       			"app",
        		lv_app_3_0, 
        		"UIApplication");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleUIApplication
entryRuleUIApplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUIApplicationRule()); }
	 iv_ruleUIApplication=ruleUIApplication 
	 { $current=$iv_ruleUIApplication.current; } 
	 EOF 
;

// Rule UIApplication
ruleUIApplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getUIApplicationAccess().getUIApplicationAction_0(),
            $current);
    }
)	otherlv_1='<UIApplication>' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1());
    }
(	otherlv_2='<models>' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getUIApplicationAccess().getModelsKeyword_2_0());
    }
	otherlv_3='<model ref=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUIApplicationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=' />' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_3());
    }
(	otherlv_6='<model ref=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getUIApplicationAccess().getModelRefKeyword_2_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUIApplicationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelCrossReference_2_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=' />' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_2_4_2());
    }
)*	otherlv_9='</models>' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getUIApplicationAccess().getModelsKeyword_2_5());
    }
)?(	otherlv_10='<pages>' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0());
    }
	otherlv_11='<page ref=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUIApplicationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=' />' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_3());
    }
(	otherlv_14='<page ref=' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getUIApplicationAccess().getPageRefKeyword_3_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUIApplicationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewCrossReference_3_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_16=' />' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getUIApplicationAccess().getSpaceSolidusGreaterThanSignKeyword_3_4_2());
    }
)*	otherlv_17='</pages>' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getUIApplicationAccess().getPagesKeyword_3_5());
    }
)?	otherlv_18='</UIApplication>' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_4());
    }
)
;





// Entry rule entryRuleXMLDeclaration
entryRuleXMLDeclaration returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getXMLDeclarationRule()); } 
	 iv_ruleXMLDeclaration=ruleXMLDeclaration 
	 { $current=$iv_ruleXMLDeclaration.current.getText(); }  
	 EOF 
;

// Rule XMLDeclaration
ruleXMLDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='<?xml version=' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getXmlVersionKeyword_0()); 
    }
    this_VERSION_1=RULE_VERSION    {
		$current.merge(this_VERSION_1);
    }

    { 
    newLeafNode(this_VERSION_1, grammarAccess.getXMLDeclarationAccess().getVERSIONTerminalRuleCall_1()); 
    }

	kw=' encoding=' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getEncodingKeyword_2()); 
    }

    { 
        newCompositeNode(grammarAccess.getXMLDeclarationAccess().getEStringParserRuleCall_3()); 
    }
    this_EString_3=ruleEString    {
		$current.merge(this_EString_3);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw=' ?>' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getXMLDeclarationAccess().getSpaceQuestionMarkGreaterThanSignKeyword_4()); 
    }
)
    ;





// Entry rule entryRuleView
entryRuleView returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getViewRule()); }
	 iv_ruleView=ruleView 
	 { $current=$iv_ruleView.current; } 
	 EOF 
;

// Rule View
ruleView returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getViewAccess().getViewAction_0(),
            $current);
    }
)	otherlv_1='<view name=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getViewAccess().getViewNameKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=' >' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getSpaceGreaterThanSignKeyword_3());
    }
(	otherlv_4='<description>' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getViewAccess().getDescriptionKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
	    }
		lv_description_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='</description>' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getViewAccess().getDescriptionKeyword_4_2());
    }
)?	otherlv_7='<model ref=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getViewAccess().getModelRefKeyword_5());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getModelModelCrossReference_6_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9=' />' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getViewAccess().getSpaceSolidusGreaterThanSignKeyword_7());
    }
(	otherlv_10='<actions>' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getViewAccess().getActionsKeyword_8_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_1_0()); 
	    }
		lv_actions_11_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_11_0, 
        		"Action");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_8_2_0()); 
	    }
		lv_actions_12_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_12_0, 
        		"Action");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_13='</actions>' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getViewAccess().getActionsKeyword_8_3());
    }
)?	otherlv_14='</view>' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getViewAccess().getViewKeyword_9());
    }
)
;





// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)	otherlv_1='<model name=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelNameKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=' >' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getSpaceGreaterThanSignKeyword_3());
    }
(	otherlv_4='<properties>' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPropertiesKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0()); 
	    }
		lv_properties_5_0=ruleModelProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_5_0, 
        		"ModelProperty");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 
	    }
		lv_properties_6_0=ruleModelProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_6_0, 
        		"ModelProperty");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='</properties>' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getPropertiesKeyword_4_3());
    }
)?(	otherlv_8='<ownedElements>' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0());
    }
	otherlv_9='<model ref=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getModelRefKeyword_5_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=' />' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_3());
    }
(	otherlv_12='<model ref=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getModelAccess().getModelRefKeyword_5_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelCrossReference_5_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_14=' />' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getModelAccess().getSpaceSolidusGreaterThanSignKeyword_5_4_2());
    }
)*	otherlv_15='</ownedElements>' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getModelAccess().getOwnedElementsKeyword_5_5());
    }
)?	otherlv_16='</model>' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getModelAccess().getModelKeyword_6());
    }
)
;





// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	 iv_ruleAction=ruleAction 
	 { $current=$iv_ruleAction.current; } 
	 EOF 
;

// Rule Action
ruleAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getActionAccess().getActionAction_0(),
            $current);
    }
)	otherlv_1='<action name=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionNameKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=' >' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getSpaceGreaterThanSignKeyword_3());
    }
(	otherlv_4='<nextPage ref=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getNextPageRefKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=' />' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getSpaceSolidusGreaterThanSignKeyword_4_2());
    }
)?	otherlv_7='</action>' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getActionAccess().getActionKeyword_5());
    }
)
;





// Entry rule entryRuleModelProperty
entryRuleModelProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelPropertyRule()); }
	 iv_ruleModelProperty=ruleModelProperty 
	 { $current=$iv_ruleModelProperty.current; } 
	 EOF 
;

// Rule ModelProperty
ruleModelProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelPropertyAccess().getModelPropertyAction_0(),
            $current);
    }
)	otherlv_1='<modelProperty name=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getModelPropertyNameKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelPropertyRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=' />' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelPropertyAccess().getSpaceSolidusGreaterThanSignKeyword_3());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |(    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEStringAccess().getFullStopKeyword_1_1_0()); 
    }
    this_ID_3=RULE_ID    {
		$current.merge(this_ID_3);
    }

    { 
    newLeafNode(this_ID_3, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1_1()); 
    }
)*))
    ;





RULE_VERSION : '"' ('0'..'9')+ '.' ('0'..'9')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


