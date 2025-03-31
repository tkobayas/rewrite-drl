// Generated from DRL6Expressions.g4 by ANTLR 4.10.1
package org.drools.drl.parser.antlr4.drl6.gen;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DRL6Expressions}.
 */
public interface DRL6ExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DRL6Expressions.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DRL6Expressions.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DRL6Expressions.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DRL6Expressions.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(DRL6Expressions.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(DRL6Expressions.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#complexOp}.
	 * @param ctx the parse tree
	 */
	void enterComplexOp(DRL6Expressions.ComplexOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#complexOp}.
	 * @param ctx the parse tree
	 */
	void exitComplexOp(DRL6Expressions.ComplexOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(DRL6Expressions.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(DRL6Expressions.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DRL6Expressions.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DRL6Expressions.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#typeMatch}.
	 * @param ctx the parse tree
	 */
	void enterTypeMatch(DRL6Expressions.TypeMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#typeMatch}.
	 * @param ctx the parse tree
	 */
	void exitTypeMatch(DRL6Expressions.TypeMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(DRL6Expressions.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(DRL6Expressions.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(DRL6Expressions.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(DRL6Expressions.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#drlIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDrlIdentifier(DRL6Expressions.DrlIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#drlIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDrlIdentifier(DRL6Expressions.DrlIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#drlKeywords}.
	 * @param ctx the parse tree
	 */
	void enterDrlKeywords(DRL6Expressions.DrlKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#drlKeywords}.
	 * @param ctx the parse tree
	 */
	void exitDrlKeywords(DRL6Expressions.DrlKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#builtInOperator}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInOperator(DRL6Expressions.BuiltInOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#builtInOperator}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInOperator(DRL6Expressions.BuiltInOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#dummy}.
	 * @param ctx the parse tree
	 */
	void enterDummy(DRL6Expressions.DummyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#dummy}.
	 * @param ctx the parse tree
	 */
	void exitDummy(DRL6Expressions.DummyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#dummy2}.
	 * @param ctx the parse tree
	 */
	void enterDummy2(DRL6Expressions.Dummy2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#dummy2}.
	 * @param ctx the parse tree
	 */
	void exitDummy2(DRL6Expressions.Dummy2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DRL6Expressions.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DRL6Expressions.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(DRL6Expressions.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(DRL6Expressions.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(DRL6Expressions.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(DRL6Expressions.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#fullAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterFullAnnotation(DRL6Expressions.FullAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#fullAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitFullAnnotation(DRL6Expressions.FullAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#annotationArgs}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgs(DRL6Expressions.AnnotationArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#annotationArgs}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgs(DRL6Expressions.AnnotationArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#annotationElementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationElementValuePairs(DRL6Expressions.AnnotationElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#annotationElementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationElementValuePairs(DRL6Expressions.AnnotationElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#annotationElementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationElementValuePair(DRL6Expressions.AnnotationElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#annotationElementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationElementValuePair(DRL6Expressions.AnnotationElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#annotationValue}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationValue(DRL6Expressions.AnnotationValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#annotationValue}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationValue(DRL6Expressions.AnnotationValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#annotationArray}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArray(DRL6Expressions.AnnotationArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#annotationArray}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArray(DRL6Expressions.AnnotationArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(DRL6Expressions.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(DRL6Expressions.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(DRL6Expressions.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(DRL6Expressions.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(DRL6Expressions.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(DRL6Expressions.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(DRL6Expressions.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(DRL6Expressions.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(DRL6Expressions.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(DRL6Expressions.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(DRL6Expressions.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(DRL6Expressions.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(DRL6Expressions.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(DRL6Expressions.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#inExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(DRL6Expressions.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#inExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(DRL6Expressions.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(DRL6Expressions.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(DRL6Expressions.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#orRestriction}.
	 * @param ctx the parse tree
	 */
	void enterOrRestriction(DRL6Expressions.OrRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#orRestriction}.
	 * @param ctx the parse tree
	 */
	void exitOrRestriction(DRL6Expressions.OrRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#andRestriction}.
	 * @param ctx the parse tree
	 */
	void enterAndRestriction(DRL6Expressions.AndRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#andRestriction}.
	 * @param ctx the parse tree
	 */
	void exitAndRestriction(DRL6Expressions.AndRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#singleRestriction}.
	 * @param ctx the parse tree
	 */
	void enterSingleRestriction(DRL6Expressions.SingleRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#singleRestriction}.
	 * @param ctx the parse tree
	 */
	void exitSingleRestriction(DRL6Expressions.SingleRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(DRL6Expressions.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(DRL6Expressions.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(DRL6Expressions.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(DRL6Expressions.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(DRL6Expressions.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(DRL6Expressions.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(DRL6Expressions.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(DRL6Expressions.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(DRL6Expressions.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(DRL6Expressions.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(DRL6Expressions.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(DRL6Expressions.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(DRL6Expressions.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(DRL6Expressions.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#backReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void enterBackReferenceExpression(DRL6Expressions.BackReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#backReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void exitBackReferenceExpression(DRL6Expressions.BackReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(DRL6Expressions.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(DRL6Expressions.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#xpathSeparator}.
	 * @param ctx the parse tree
	 */
	void enterXpathSeparator(DRL6Expressions.XpathSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#xpathSeparator}.
	 * @param ctx the parse tree
	 */
	void exitXpathSeparator(DRL6Expressions.XpathSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#xpathPrimary}.
	 * @param ctx the parse tree
	 */
	void enterXpathPrimary(DRL6Expressions.XpathPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#xpathPrimary}.
	 * @param ctx the parse tree
	 */
	void exitXpathPrimary(DRL6Expressions.XpathPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#xpathChunk}.
	 * @param ctx the parse tree
	 */
	void enterXpathChunk(DRL6Expressions.XpathChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#xpathChunk}.
	 * @param ctx the parse tree
	 */
	void exitXpathChunk(DRL6Expressions.XpathChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#xpathExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterXpathExpressionList(DRL6Expressions.XpathExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#xpathExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitXpathExpressionList(DRL6Expressions.XpathExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DRL6Expressions.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DRL6Expressions.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#inlineListExpression}.
	 * @param ctx the parse tree
	 */
	void enterInlineListExpression(DRL6Expressions.InlineListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#inlineListExpression}.
	 * @param ctx the parse tree
	 */
	void exitInlineListExpression(DRL6Expressions.InlineListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#inlineMapExpression}.
	 * @param ctx the parse tree
	 */
	void enterInlineMapExpression(DRL6Expressions.InlineMapExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#inlineMapExpression}.
	 * @param ctx the parse tree
	 */
	void exitInlineMapExpression(DRL6Expressions.InlineMapExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#mapExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterMapExpressionList(DRL6Expressions.MapExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#mapExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitMapExpressionList(DRL6Expressions.MapExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#mapEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapEntry(DRL6Expressions.MapEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#mapEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapEntry(DRL6Expressions.MapEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(DRL6Expressions.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(DRL6Expressions.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSuffix(DRL6Expressions.IdentifierSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSuffix(DRL6Expressions.IdentifierSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(DRL6Expressions.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(DRL6Expressions.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(DRL6Expressions.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(DRL6Expressions.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(DRL6Expressions.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(DRL6Expressions.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(DRL6Expressions.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(DRL6Expressions.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(DRL6Expressions.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(DRL6Expressions.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(DRL6Expressions.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(DRL6Expressions.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#classCreatorRestExpr}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRestExpr(DRL6Expressions.ClassCreatorRestExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#classCreatorRestExpr}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRestExpr(DRL6Expressions.ClassCreatorRestExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(DRL6Expressions.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(DRL6Expressions.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(DRL6Expressions.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(DRL6Expressions.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(DRL6Expressions.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(DRL6Expressions.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(DRL6Expressions.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(DRL6Expressions.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(DRL6Expressions.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(DRL6Expressions.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#squareArguments}.
	 * @param ctx the parse tree
	 */
	void enterSquareArguments(DRL6Expressions.SquareArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#squareArguments}.
	 * @param ctx the parse tree
	 */
	void exitSquareArguments(DRL6Expressions.SquareArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(DRL6Expressions.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(DRL6Expressions.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DRL6Expressions.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DRL6Expressions.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(DRL6Expressions.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(DRL6Expressions.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#extends_key}.
	 * @param ctx the parse tree
	 */
	void enterExtends_key(DRL6Expressions.Extends_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#extends_key}.
	 * @param ctx the parse tree
	 */
	void exitExtends_key(DRL6Expressions.Extends_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#super_key}.
	 * @param ctx the parse tree
	 */
	void enterSuper_key(DRL6Expressions.Super_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#super_key}.
	 * @param ctx the parse tree
	 */
	void exitSuper_key(DRL6Expressions.Super_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#instanceof_key}.
	 * @param ctx the parse tree
	 */
	void enterInstanceof_key(DRL6Expressions.Instanceof_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#instanceof_key}.
	 * @param ctx the parse tree
	 */
	void exitInstanceof_key(DRL6Expressions.Instanceof_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#boolean_key}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_key(DRL6Expressions.Boolean_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#boolean_key}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_key(DRL6Expressions.Boolean_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#char_key}.
	 * @param ctx the parse tree
	 */
	void enterChar_key(DRL6Expressions.Char_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#char_key}.
	 * @param ctx the parse tree
	 */
	void exitChar_key(DRL6Expressions.Char_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#byte_key}.
	 * @param ctx the parse tree
	 */
	void enterByte_key(DRL6Expressions.Byte_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#byte_key}.
	 * @param ctx the parse tree
	 */
	void exitByte_key(DRL6Expressions.Byte_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#short_key}.
	 * @param ctx the parse tree
	 */
	void enterShort_key(DRL6Expressions.Short_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#short_key}.
	 * @param ctx the parse tree
	 */
	void exitShort_key(DRL6Expressions.Short_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#int_key}.
	 * @param ctx the parse tree
	 */
	void enterInt_key(DRL6Expressions.Int_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#int_key}.
	 * @param ctx the parse tree
	 */
	void exitInt_key(DRL6Expressions.Int_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#float_key}.
	 * @param ctx the parse tree
	 */
	void enterFloat_key(DRL6Expressions.Float_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#float_key}.
	 * @param ctx the parse tree
	 */
	void exitFloat_key(DRL6Expressions.Float_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#long_key}.
	 * @param ctx the parse tree
	 */
	void enterLong_key(DRL6Expressions.Long_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#long_key}.
	 * @param ctx the parse tree
	 */
	void exitLong_key(DRL6Expressions.Long_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#double_key}.
	 * @param ctx the parse tree
	 */
	void enterDouble_key(DRL6Expressions.Double_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#double_key}.
	 * @param ctx the parse tree
	 */
	void exitDouble_key(DRL6Expressions.Double_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#void_key}.
	 * @param ctx the parse tree
	 */
	void enterVoid_key(DRL6Expressions.Void_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#void_key}.
	 * @param ctx the parse tree
	 */
	void exitVoid_key(DRL6Expressions.Void_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#this_key}.
	 * @param ctx the parse tree
	 */
	void enterThis_key(DRL6Expressions.This_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#this_key}.
	 * @param ctx the parse tree
	 */
	void exitThis_key(DRL6Expressions.This_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#class_key}.
	 * @param ctx the parse tree
	 */
	void enterClass_key(DRL6Expressions.Class_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#class_key}.
	 * @param ctx the parse tree
	 */
	void exitClass_key(DRL6Expressions.Class_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#new_key}.
	 * @param ctx the parse tree
	 */
	void enterNew_key(DRL6Expressions.New_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#new_key}.
	 * @param ctx the parse tree
	 */
	void exitNew_key(DRL6Expressions.New_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#not_key}.
	 * @param ctx the parse tree
	 */
	void enterNot_key(DRL6Expressions.Not_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#not_key}.
	 * @param ctx the parse tree
	 */
	void exitNot_key(DRL6Expressions.Not_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#in_key}.
	 * @param ctx the parse tree
	 */
	void enterIn_key(DRL6Expressions.In_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#in_key}.
	 * @param ctx the parse tree
	 */
	void exitIn_key(DRL6Expressions.In_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#operator_key}.
	 * @param ctx the parse tree
	 */
	void enterOperator_key(DRL6Expressions.Operator_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#operator_key}.
	 * @param ctx the parse tree
	 */
	void exitOperator_key(DRL6Expressions.Operator_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DRL6Expressions#neg_operator_key}.
	 * @param ctx the parse tree
	 */
	void enterNeg_operator_key(DRL6Expressions.Neg_operator_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DRL6Expressions#neg_operator_key}.
	 * @param ctx the parse tree
	 */
	void exitNeg_operator_key(DRL6Expressions.Neg_operator_keyContext ctx);
}