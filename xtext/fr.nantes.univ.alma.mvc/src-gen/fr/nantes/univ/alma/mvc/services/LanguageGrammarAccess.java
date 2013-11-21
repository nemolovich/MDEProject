/*
* generated by Xtext
*/

package fr.nantes.univ.alma.mvc.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class LanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cXMLDeclarationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cViewsAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cViewsViewParserRuleCall_1_0_0 = (RuleCall)cViewsAssignment_1_0.eContents().get(0);
		private final Assignment cModelsAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cModelsModelParserRuleCall_1_1_0 = (RuleCall)cModelsAssignment_1_1.eContents().get(0);
		private final Assignment cActionsAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final RuleCall cActionsActionParserRuleCall_1_2_0 = (RuleCall)cActionsAssignment_1_2.eContents().get(0);
		private final Assignment cPropertiesAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final RuleCall cPropertiesModelPropertyParserRuleCall_1_3_0 = (RuleCall)cPropertiesAssignment_1_3.eContents().get(0);
		private final Assignment cMainAppAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMainAppUIApplicationParserRuleCall_2_0 = (RuleCall)cMainAppAssignment_2.eContents().get(0);
		
		//Package:
		//	XMLDeclaration (views+=View | models+=Model | actions+=Action | properties+=ModelProperty)* mainApp+=UIApplication;
		public ParserRule getRule() { return rule; }

		//XMLDeclaration (views+=View | models+=Model | actions+=Action | properties+=ModelProperty)* mainApp+=UIApplication
		public Group getGroup() { return cGroup; }

		//XMLDeclaration
		public RuleCall getXMLDeclarationParserRuleCall_0() { return cXMLDeclarationParserRuleCall_0; }

		//(views+=View | models+=Model | actions+=Action | properties+=ModelProperty)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//views+=View
		public Assignment getViewsAssignment_1_0() { return cViewsAssignment_1_0; }

		//View
		public RuleCall getViewsViewParserRuleCall_1_0_0() { return cViewsViewParserRuleCall_1_0_0; }

		//models+=Model
		public Assignment getModelsAssignment_1_1() { return cModelsAssignment_1_1; }

		//Model
		public RuleCall getModelsModelParserRuleCall_1_1_0() { return cModelsModelParserRuleCall_1_1_0; }

		//actions+=Action
		public Assignment getActionsAssignment_1_2() { return cActionsAssignment_1_2; }

		//Action
		public RuleCall getActionsActionParserRuleCall_1_2_0() { return cActionsActionParserRuleCall_1_2_0; }

		//properties+=ModelProperty
		public Assignment getPropertiesAssignment_1_3() { return cPropertiesAssignment_1_3; }

		//ModelProperty
		public RuleCall getPropertiesModelPropertyParserRuleCall_1_3_0() { return cPropertiesModelPropertyParserRuleCall_1_3_0; }

		//mainApp+=UIApplication
		public Assignment getMainAppAssignment_2() { return cMainAppAssignment_2; }

		//UIApplication
		public RuleCall getMainAppUIApplicationParserRuleCall_2_0() { return cMainAppUIApplicationParserRuleCall_2_0; }
	}

	public class XMLDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XMLDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cXmlVersionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cVERSIONTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cEncodingKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEStringParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cSpaceQuestionMarkGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//XMLDeclaration:
		//	"<?xml version=" VERSION " encoding=" EString " ?>";
		public ParserRule getRule() { return rule; }

		//"<?xml version=" VERSION " encoding=" EString " ?>"
		public Group getGroup() { return cGroup; }

		//"<?xml version="
		public Keyword getXmlVersionKeyword_0() { return cXmlVersionKeyword_0; }

		//VERSION
		public RuleCall getVERSIONTerminalRuleCall_1() { return cVERSIONTerminalRuleCall_1; }

		//" encoding="
		public Keyword getEncodingKeyword_2() { return cEncodingKeyword_2; }

		//EString
		public RuleCall getEStringParserRuleCall_3() { return cEStringParserRuleCall_3; }

		//" ?>"
		public Keyword getSpaceQuestionMarkGreaterThanSignKeyword_4() { return cSpaceQuestionMarkGreaterThanSignKeyword_4; }
	}

	public class UIApplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UIApplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUIApplicationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUIApplicationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cModelsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cModelRefKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cModelsAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cModelsModelCrossReference_2_2_0 = (CrossReference)cModelsAssignment_2_2.eContents().get(0);
		private final RuleCall cModelsModelEStringParserRuleCall_2_2_0_1 = (RuleCall)cModelsModelCrossReference_2_2_0.eContents().get(1);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Group cGroup_2_4 = (Group)cGroup_2.eContents().get(4);
		private final Keyword cModelRefKeyword_2_4_0 = (Keyword)cGroup_2_4.eContents().get(0);
		private final Assignment cModelsAssignment_2_4_1 = (Assignment)cGroup_2_4.eContents().get(1);
		private final CrossReference cModelsModelCrossReference_2_4_1_0 = (CrossReference)cModelsAssignment_2_4_1.eContents().get(0);
		private final RuleCall cModelsModelEStringParserRuleCall_2_4_1_0_1 = (RuleCall)cModelsModelCrossReference_2_4_1_0.eContents().get(1);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_2_4_2 = (Keyword)cGroup_2_4.eContents().get(2);
		private final Keyword cModelsKeyword_2_5 = (Keyword)cGroup_2.eContents().get(5);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cPagesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cPageRefKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cPagesAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cPagesViewCrossReference_3_2_0 = (CrossReference)cPagesAssignment_3_2.eContents().get(0);
		private final RuleCall cPagesViewEStringParserRuleCall_3_2_0_1 = (RuleCall)cPagesViewCrossReference_3_2_0.eContents().get(1);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_3_4 = (Group)cGroup_3.eContents().get(4);
		private final Keyword cPageRefKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Assignment cPagesAssignment_3_4_1 = (Assignment)cGroup_3_4.eContents().get(1);
		private final CrossReference cPagesViewCrossReference_3_4_1_0 = (CrossReference)cPagesAssignment_3_4_1.eContents().get(0);
		private final RuleCall cPagesViewEStringParserRuleCall_3_4_1_0_1 = (RuleCall)cPagesViewCrossReference_3_4_1_0.eContents().get(1);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_3_4_2 = (Keyword)cGroup_3_4.eContents().get(2);
		private final Keyword cPagesKeyword_3_5 = (Keyword)cGroup_3.eContents().get(5);
		private final Keyword cUIApplicationKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//UIApplication:
		//	{UIApplication} "<UIApplication>" ("<models>" "<model ref=" models+=[Model|EString] " />" ("<model ref="
		//	models+=[Model|EString] " />")* "</models>")? ("<pages>" "<page ref=" pages+=[View|EString] " />" ("<page ref="
		//	pages+=[View|EString] " />")* "</pages>")? "</UIApplication>";
		public ParserRule getRule() { return rule; }

		//{UIApplication} "<UIApplication>" ("<models>" "<model ref=" models+=[Model|EString] " />" ("<model ref="
		//models+=[Model|EString] " />")* "</models>")? ("<pages>" "<page ref=" pages+=[View|EString] " />" ("<page ref="
		//pages+=[View|EString] " />")* "</pages>")? "</UIApplication>"
		public Group getGroup() { return cGroup; }

		//{UIApplication}
		public Action getUIApplicationAction_0() { return cUIApplicationAction_0; }

		//"<UIApplication>"
		public Keyword getUIApplicationKeyword_1() { return cUIApplicationKeyword_1; }

		//("<models>" "<model ref=" models+=[Model|EString] " />" ("<model ref=" models+=[Model|EString] " />")* "</models>")?
		public Group getGroup_2() { return cGroup_2; }

		//"<models>"
		public Keyword getModelsKeyword_2_0() { return cModelsKeyword_2_0; }

		//"<model ref="
		public Keyword getModelRefKeyword_2_1() { return cModelRefKeyword_2_1; }

		//models+=[Model|EString]
		public Assignment getModelsAssignment_2_2() { return cModelsAssignment_2_2; }

		//[Model|EString]
		public CrossReference getModelsModelCrossReference_2_2_0() { return cModelsModelCrossReference_2_2_0; }

		//EString
		public RuleCall getModelsModelEStringParserRuleCall_2_2_0_1() { return cModelsModelEStringParserRuleCall_2_2_0_1; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_2_3() { return cSpaceSolidusGreaterThanSignKeyword_2_3; }

		//("<model ref=" models+=[Model|EString] " />")*
		public Group getGroup_2_4() { return cGroup_2_4; }

		//"<model ref="
		public Keyword getModelRefKeyword_2_4_0() { return cModelRefKeyword_2_4_0; }

		//models+=[Model|EString]
		public Assignment getModelsAssignment_2_4_1() { return cModelsAssignment_2_4_1; }

		//[Model|EString]
		public CrossReference getModelsModelCrossReference_2_4_1_0() { return cModelsModelCrossReference_2_4_1_0; }

		//EString
		public RuleCall getModelsModelEStringParserRuleCall_2_4_1_0_1() { return cModelsModelEStringParserRuleCall_2_4_1_0_1; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_2_4_2() { return cSpaceSolidusGreaterThanSignKeyword_2_4_2; }

		//"</models>"
		public Keyword getModelsKeyword_2_5() { return cModelsKeyword_2_5; }

		//("<pages>" "<page ref=" pages+=[View|EString] " />" ("<page ref=" pages+=[View|EString] " />")* "</pages>")?
		public Group getGroup_3() { return cGroup_3; }

		//"<pages>"
		public Keyword getPagesKeyword_3_0() { return cPagesKeyword_3_0; }

		//"<page ref="
		public Keyword getPageRefKeyword_3_1() { return cPageRefKeyword_3_1; }

		//pages+=[View|EString]
		public Assignment getPagesAssignment_3_2() { return cPagesAssignment_3_2; }

		//[View|EString]
		public CrossReference getPagesViewCrossReference_3_2_0() { return cPagesViewCrossReference_3_2_0; }

		//EString
		public RuleCall getPagesViewEStringParserRuleCall_3_2_0_1() { return cPagesViewEStringParserRuleCall_3_2_0_1; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_3_3() { return cSpaceSolidusGreaterThanSignKeyword_3_3; }

		//("<page ref=" pages+=[View|EString] " />")*
		public Group getGroup_3_4() { return cGroup_3_4; }

		//"<page ref="
		public Keyword getPageRefKeyword_3_4_0() { return cPageRefKeyword_3_4_0; }

		//pages+=[View|EString]
		public Assignment getPagesAssignment_3_4_1() { return cPagesAssignment_3_4_1; }

		//[View|EString]
		public CrossReference getPagesViewCrossReference_3_4_1_0() { return cPagesViewCrossReference_3_4_1_0; }

		//EString
		public RuleCall getPagesViewEStringParserRuleCall_3_4_1_0_1() { return cPagesViewEStringParserRuleCall_3_4_1_0_1; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_3_4_2() { return cSpaceSolidusGreaterThanSignKeyword_3_4_2; }

		//"</pages>"
		public Keyword getPagesKeyword_3_5() { return cPagesKeyword_3_5; }

		//"</UIApplication>"
		public Keyword getUIApplicationKeyword_4() { return cUIApplicationKeyword_4; }
	}

	public class ViewElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "View");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cViewAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cViewIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSpaceGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Keyword cDescriptionKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Keyword cModelRefKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cModelAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cModelModelCrossReference_6_0 = (CrossReference)cModelAssignment_6.eContents().get(0);
		private final RuleCall cModelModelEStringParserRuleCall_6_0_1 = (RuleCall)cModelModelCrossReference_6_0.eContents().get(1);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cActionsKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cActionsAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cActionsActionParserRuleCall_8_1_0 = (RuleCall)cActionsAssignment_8_1.eContents().get(0);
		private final Assignment cActionsAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cActionsActionParserRuleCall_8_2_0 = (RuleCall)cActionsAssignment_8_2.eContents().get(0);
		private final Keyword cActionsKeyword_8_3 = (Keyword)cGroup_8.eContents().get(3);
		private final Keyword cViewKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//View:
		//	{View} "<view id=" name=EString " >" ("<description>" description=EString "</description>")? "<model ref="
		//	model=[Model|EString] " />" ("<actions>" actions+=Action actions+=Action* "</actions>")? "</view>";
		public ParserRule getRule() { return rule; }

		//{View} "<view id=" name=EString " >" ("<description>" description=EString "</description>")? "<model ref="
		//model=[Model|EString] " />" ("<actions>" actions+=Action actions+=Action* "</actions>")? "</view>"
		public Group getGroup() { return cGroup; }

		//{View}
		public Action getViewAction_0() { return cViewAction_0; }

		//"<view id="
		public Keyword getViewIdKeyword_1() { return cViewIdKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//" >"
		public Keyword getSpaceGreaterThanSignKeyword_3() { return cSpaceGreaterThanSignKeyword_3; }

		//("<description>" description=EString "</description>")?
		public Group getGroup_4() { return cGroup_4; }

		//"<description>"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=EString
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_4_1_0() { return cDescriptionEStringParserRuleCall_4_1_0; }

		//"</description>"
		public Keyword getDescriptionKeyword_4_2() { return cDescriptionKeyword_4_2; }

		//"<model ref="
		public Keyword getModelRefKeyword_5() { return cModelRefKeyword_5; }

		//model=[Model|EString]
		public Assignment getModelAssignment_6() { return cModelAssignment_6; }

		//[Model|EString]
		public CrossReference getModelModelCrossReference_6_0() { return cModelModelCrossReference_6_0; }

		//EString
		public RuleCall getModelModelEStringParserRuleCall_6_0_1() { return cModelModelEStringParserRuleCall_6_0_1; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_7() { return cSpaceSolidusGreaterThanSignKeyword_7; }

		//("<actions>" actions+=Action actions+=Action* "</actions>")?
		public Group getGroup_8() { return cGroup_8; }

		//"<actions>"
		public Keyword getActionsKeyword_8_0() { return cActionsKeyword_8_0; }

		//actions+=Action
		public Assignment getActionsAssignment_8_1() { return cActionsAssignment_8_1; }

		//Action
		public RuleCall getActionsActionParserRuleCall_8_1_0() { return cActionsActionParserRuleCall_8_1_0; }

		//actions+=Action*
		public Assignment getActionsAssignment_8_2() { return cActionsAssignment_8_2; }

		//Action
		public RuleCall getActionsActionParserRuleCall_8_2_0() { return cActionsActionParserRuleCall_8_2_0; }

		//"</actions>"
		public Keyword getActionsKeyword_8_3() { return cActionsKeyword_8_3; }

		//"</view>"
		public Keyword getViewKeyword_9() { return cViewKeyword_9; }
	}

	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cModelIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSpaceGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPropertiesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPropertiesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPropertiesModelPropertyParserRuleCall_4_1_0 = (RuleCall)cPropertiesAssignment_4_1.eContents().get(0);
		private final Assignment cPropertiesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cPropertiesModelPropertyParserRuleCall_4_2_0 = (RuleCall)cPropertiesAssignment_4_2.eContents().get(0);
		private final Keyword cPropertiesKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cOwnedElementsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cModelRefKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cOwnedElementsAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final CrossReference cOwnedElementsModelCrossReference_5_2_0 = (CrossReference)cOwnedElementsAssignment_5_2.eContents().get(0);
		private final RuleCall cOwnedElementsModelEStringParserRuleCall_5_2_0_1 = (RuleCall)cOwnedElementsModelCrossReference_5_2_0.eContents().get(1);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Group cGroup_5_4 = (Group)cGroup_5.eContents().get(4);
		private final Keyword cModelRefKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Assignment cOwnedElementsAssignment_5_4_1 = (Assignment)cGroup_5_4.eContents().get(1);
		private final CrossReference cOwnedElementsModelCrossReference_5_4_1_0 = (CrossReference)cOwnedElementsAssignment_5_4_1.eContents().get(0);
		private final RuleCall cOwnedElementsModelEStringParserRuleCall_5_4_1_0_1 = (RuleCall)cOwnedElementsModelCrossReference_5_4_1_0.eContents().get(1);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_5_4_2 = (Keyword)cGroup_5_4.eContents().get(2);
		private final Keyword cOwnedElementsKeyword_5_5 = (Keyword)cGroup_5.eContents().get(5);
		private final Keyword cModelKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Model:
		//	{Model} "<model id=" name=EString " >" ("<properties>" properties+=ModelProperty properties+=ModelProperty*
		//	"</properties>")? ("<ownedElements>" "<model ref=" ownedElements+=[Model|EString] " />" ("<model ref="
		//	ownedElements+=[Model|EString] " />")* "</ownedElements>")? "</model>";
		public ParserRule getRule() { return rule; }

		//{Model} "<model id=" name=EString " >" ("<properties>" properties+=ModelProperty properties+=ModelProperty*
		//"</properties>")? ("<ownedElements>" "<model ref=" ownedElements+=[Model|EString] " />" ("<model ref="
		//ownedElements+=[Model|EString] " />")* "</ownedElements>")? "</model>"
		public Group getGroup() { return cGroup; }

		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }

		//"<model id="
		public Keyword getModelIdKeyword_1() { return cModelIdKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//" >"
		public Keyword getSpaceGreaterThanSignKeyword_3() { return cSpaceGreaterThanSignKeyword_3; }

		//("<properties>" properties+=ModelProperty properties+=ModelProperty* "</properties>")?
		public Group getGroup_4() { return cGroup_4; }

		//"<properties>"
		public Keyword getPropertiesKeyword_4_0() { return cPropertiesKeyword_4_0; }

		//properties+=ModelProperty
		public Assignment getPropertiesAssignment_4_1() { return cPropertiesAssignment_4_1; }

		//ModelProperty
		public RuleCall getPropertiesModelPropertyParserRuleCall_4_1_0() { return cPropertiesModelPropertyParserRuleCall_4_1_0; }

		//properties+=ModelProperty*
		public Assignment getPropertiesAssignment_4_2() { return cPropertiesAssignment_4_2; }

		//ModelProperty
		public RuleCall getPropertiesModelPropertyParserRuleCall_4_2_0() { return cPropertiesModelPropertyParserRuleCall_4_2_0; }

		//"</properties>"
		public Keyword getPropertiesKeyword_4_3() { return cPropertiesKeyword_4_3; }

		//("<ownedElements>" "<model ref=" ownedElements+=[Model|EString] " />" ("<model ref=" ownedElements+=[Model|EString]
		//" />")* "</ownedElements>")?
		public Group getGroup_5() { return cGroup_5; }

		//"<ownedElements>"
		public Keyword getOwnedElementsKeyword_5_0() { return cOwnedElementsKeyword_5_0; }

		//"<model ref="
		public Keyword getModelRefKeyword_5_1() { return cModelRefKeyword_5_1; }

		//ownedElements+=[Model|EString]
		public Assignment getOwnedElementsAssignment_5_2() { return cOwnedElementsAssignment_5_2; }

		//[Model|EString]
		public CrossReference getOwnedElementsModelCrossReference_5_2_0() { return cOwnedElementsModelCrossReference_5_2_0; }

		//EString
		public RuleCall getOwnedElementsModelEStringParserRuleCall_5_2_0_1() { return cOwnedElementsModelEStringParserRuleCall_5_2_0_1; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_5_3() { return cSpaceSolidusGreaterThanSignKeyword_5_3; }

		//("<model ref=" ownedElements+=[Model|EString] " />")*
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"<model ref="
		public Keyword getModelRefKeyword_5_4_0() { return cModelRefKeyword_5_4_0; }

		//ownedElements+=[Model|EString]
		public Assignment getOwnedElementsAssignment_5_4_1() { return cOwnedElementsAssignment_5_4_1; }

		//[Model|EString]
		public CrossReference getOwnedElementsModelCrossReference_5_4_1_0() { return cOwnedElementsModelCrossReference_5_4_1_0; }

		//EString
		public RuleCall getOwnedElementsModelEStringParserRuleCall_5_4_1_0_1() { return cOwnedElementsModelEStringParserRuleCall_5_4_1_0_1; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_5_4_2() { return cSpaceSolidusGreaterThanSignKeyword_5_4_2; }

		//"</ownedElements>"
		public Keyword getOwnedElementsKeyword_5_5() { return cOwnedElementsKeyword_5_5; }

		//"</model>"
		public Keyword getModelKeyword_6() { return cModelKeyword_6; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActionNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSpaceGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cNextPageRefKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cNextPageAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cNextPageViewCrossReference_4_1_0 = (CrossReference)cNextPageAssignment_4_1.eContents().get(0);
		private final RuleCall cNextPageViewEStringParserRuleCall_4_1_0_1 = (RuleCall)cNextPageViewCrossReference_4_1_0.eContents().get(1);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Keyword cActionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Action:
		//	{Action} "<action name=" name=EString " >" ("<nextPage ref=" nextPage=[View|EString] " />")? "</action>";
		public ParserRule getRule() { return rule; }

		//{Action} "<action name=" name=EString " >" ("<nextPage ref=" nextPage=[View|EString] " />")? "</action>"
		public Group getGroup() { return cGroup; }

		//{Action}
		public Action getActionAction_0() { return cActionAction_0; }

		//"<action name="
		public Keyword getActionNameKeyword_1() { return cActionNameKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//" >"
		public Keyword getSpaceGreaterThanSignKeyword_3() { return cSpaceGreaterThanSignKeyword_3; }

		//("<nextPage ref=" nextPage=[View|EString] " />")?
		public Group getGroup_4() { return cGroup_4; }

		//"<nextPage ref="
		public Keyword getNextPageRefKeyword_4_0() { return cNextPageRefKeyword_4_0; }

		//nextPage=[View|EString]
		public Assignment getNextPageAssignment_4_1() { return cNextPageAssignment_4_1; }

		//[View|EString]
		public CrossReference getNextPageViewCrossReference_4_1_0() { return cNextPageViewCrossReference_4_1_0; }

		//EString
		public RuleCall getNextPageViewEStringParserRuleCall_4_1_0_1() { return cNextPageViewEStringParserRuleCall_4_1_0_1; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_4_2() { return cSpaceSolidusGreaterThanSignKeyword_4_2; }

		//"</action>"
		public Keyword getActionKeyword_5() { return cActionKeyword_5; }
	}

	public class ModelPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModelProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelPropertyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cModelPropertyNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSpaceSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ModelProperty:
		//	{ModelProperty} "<modelProperty name=" name=EString " />";
		public ParserRule getRule() { return rule; }

		//{ModelProperty} "<modelProperty name=" name=EString " />"
		public Group getGroup() { return cGroup; }

		//{ModelProperty}
		public Action getModelPropertyAction_0() { return cModelPropertyAction_0; }

		//"<modelProperty name="
		public Keyword getModelPropertyNameKeyword_1() { return cModelPropertyNameKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//" />"
		public Keyword getSpaceSolidusGreaterThanSignKeyword_3() { return cSpaceSolidusGreaterThanSignKeyword_3; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private PackageElements pPackage;
	private XMLDeclarationElements pXMLDeclaration;
	private UIApplicationElements pUIApplication;
	private ViewElements pView;
	private ModelElements pModel;
	private ActionElements pAction;
	private ModelPropertyElements pModelProperty;
	private TerminalRule tVERSION;
	private EStringElements pEString;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public LanguageGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.nantes.univ.alma.mvc.Language".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Package:
	//	XMLDeclaration (views+=View | models+=Model | actions+=Action | properties+=ModelProperty)* mainApp+=UIApplication;
	public PackageElements getPackageAccess() {
		return (pPackage != null) ? pPackage : (pPackage = new PackageElements());
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}

	//XMLDeclaration:
	//	"<?xml version=" VERSION " encoding=" EString " ?>";
	public XMLDeclarationElements getXMLDeclarationAccess() {
		return (pXMLDeclaration != null) ? pXMLDeclaration : (pXMLDeclaration = new XMLDeclarationElements());
	}
	
	public ParserRule getXMLDeclarationRule() {
		return getXMLDeclarationAccess().getRule();
	}

	//UIApplication:
	//	{UIApplication} "<UIApplication>" ("<models>" "<model ref=" models+=[Model|EString] " />" ("<model ref="
	//	models+=[Model|EString] " />")* "</models>")? ("<pages>" "<page ref=" pages+=[View|EString] " />" ("<page ref="
	//	pages+=[View|EString] " />")* "</pages>")? "</UIApplication>";
	public UIApplicationElements getUIApplicationAccess() {
		return (pUIApplication != null) ? pUIApplication : (pUIApplication = new UIApplicationElements());
	}
	
	public ParserRule getUIApplicationRule() {
		return getUIApplicationAccess().getRule();
	}

	//View:
	//	{View} "<view id=" name=EString " >" ("<description>" description=EString "</description>")? "<model ref="
	//	model=[Model|EString] " />" ("<actions>" actions+=Action actions+=Action* "</actions>")? "</view>";
	public ViewElements getViewAccess() {
		return (pView != null) ? pView : (pView = new ViewElements());
	}
	
	public ParserRule getViewRule() {
		return getViewAccess().getRule();
	}

	//Model:
	//	{Model} "<model id=" name=EString " >" ("<properties>" properties+=ModelProperty properties+=ModelProperty*
	//	"</properties>")? ("<ownedElements>" "<model ref=" ownedElements+=[Model|EString] " />" ("<model ref="
	//	ownedElements+=[Model|EString] " />")* "</ownedElements>")? "</model>";
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Action:
	//	{Action} "<action name=" name=EString " >" ("<nextPage ref=" nextPage=[View|EString] " />")? "</action>";
	public ActionElements getActionAccess() {
		return (pAction != null) ? pAction : (pAction = new ActionElements());
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	//ModelProperty:
	//	{ModelProperty} "<modelProperty name=" name=EString " />";
	public ModelPropertyElements getModelPropertyAccess() {
		return (pModelProperty != null) ? pModelProperty : (pModelProperty = new ModelPropertyElements());
	}
	
	public ParserRule getModelPropertyRule() {
		return getModelPropertyAccess().getRule();
	}

	//terminal VERSION:
	//	"\"" "0".."9"+ "." "0".."9"+ "\"";
	public TerminalRule getVERSIONRule() {
		return (tVERSION != null) ? tVERSION : (tVERSION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "VERSION"));
	} 

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}