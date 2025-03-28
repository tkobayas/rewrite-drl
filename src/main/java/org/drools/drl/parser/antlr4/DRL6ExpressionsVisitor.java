// Generated from DRL6Expressions.g4 by ANTLR 4.10.1
package org.drools.drl.parser.antlr4;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DRL6Expressions}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DRL6ExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DRL6Expressions.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(DRL6Expressions.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(DRL6Expressions.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#complexOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexOp(DRL6Expressions.ComplexOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(DRL6Expressions.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DRL6Expressions.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#typeMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMatch(DRL6Expressions.TypeMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(DRL6Expressions.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(DRL6Expressions.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#drlIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlIdentifier(DRL6Expressions.DrlIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#drlKeywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlKeywords(DRL6Expressions.DrlKeywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#builtInOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInOperator(DRL6Expressions.BuiltInOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#dummy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummy(DRL6Expressions.DummyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#dummy2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummy2(DRL6Expressions.Dummy2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DRL6Expressions.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DRL6Expressions.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(DRL6Expressions.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#fullAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullAnnotation(DRL6Expressions.FullAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#annotationArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgs(DRL6Expressions.AnnotationArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#annotationElementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElementValuePairs(DRL6Expressions.AnnotationElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#annotationElementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElementValuePair(DRL6Expressions.AnnotationElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#annotationValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationValue(DRL6Expressions.AnnotationValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#annotationArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArray(DRL6Expressions.AnnotationArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(DRL6Expressions.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(DRL6Expressions.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(DRL6Expressions.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(DRL6Expressions.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(DRL6Expressions.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(DRL6Expressions.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#instanceOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(DRL6Expressions.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#inExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(DRL6Expressions.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(DRL6Expressions.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#orRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrRestriction(DRL6Expressions.OrRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#andRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndRestriction(DRL6Expressions.AndRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#singleRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleRestriction(DRL6Expressions.SingleRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(DRL6Expressions.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#shiftOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(DRL6Expressions.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(DRL6Expressions.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(DRL6Expressions.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DRL6Expressions.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(DRL6Expressions.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(DRL6Expressions.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#backReferenceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackReferenceExpression(DRL6Expressions.BackReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(DRL6Expressions.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#xpathSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpathSeparator(DRL6Expressions.XpathSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#xpathPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpathPrimary(DRL6Expressions.XpathPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#xpathChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpathChunk(DRL6Expressions.XpathChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#xpathExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpathExpressionList(DRL6Expressions.XpathExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DRL6Expressions.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#inlineListExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineListExpression(DRL6Expressions.InlineListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#inlineMapExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineMapExpression(DRL6Expressions.InlineMapExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#mapExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpressionList(DRL6Expressions.MapExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#mapEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntry(DRL6Expressions.MapEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(DRL6Expressions.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#identifierSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSuffix(DRL6Expressions.IdentifierSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(DRL6Expressions.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(DRL6Expressions.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(DRL6Expressions.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(DRL6Expressions.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(DRL6Expressions.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(DRL6Expressions.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#classCreatorRestExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRestExpr(DRL6Expressions.ClassCreatorRestExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(DRL6Expressions.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(DRL6Expressions.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(DRL6Expressions.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(DRL6Expressions.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(DRL6Expressions.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#squareArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareArguments(DRL6Expressions.SquareArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(DRL6Expressions.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DRL6Expressions.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(DRL6Expressions.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#extends_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_key(DRL6Expressions.Extends_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#super_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_key(DRL6Expressions.Super_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#instanceof_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceof_key(DRL6Expressions.Instanceof_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#boolean_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_key(DRL6Expressions.Boolean_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#char_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_key(DRL6Expressions.Char_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#byte_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByte_key(DRL6Expressions.Byte_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#short_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort_key(DRL6Expressions.Short_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#int_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_key(DRL6Expressions.Int_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#float_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_key(DRL6Expressions.Float_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#long_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong_key(DRL6Expressions.Long_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#double_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_key(DRL6Expressions.Double_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#void_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_key(DRL6Expressions.Void_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#this_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_key(DRL6Expressions.This_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#class_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_key(DRL6Expressions.Class_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#new_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_key(DRL6Expressions.New_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#not_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_key(DRL6Expressions.Not_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#in_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_key(DRL6Expressions.In_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#operator_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_key(DRL6Expressions.Operator_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRL6Expressions#neg_operator_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_operator_key(DRL6Expressions.Neg_operator_keyContext ctx);
}