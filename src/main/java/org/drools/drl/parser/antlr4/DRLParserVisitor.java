// Generated from DRLParser.g4 by ANTLR 4.10.1
package org.drools.drl.parser.antlr4;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DRLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DRLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DRLParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(DRLParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlStatementdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlStatementdef(DRLParser.DrlStatementdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#packagedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagedef(DRLParser.PackagedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#unitdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitdef(DRLParser.UnitdefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importStandardDef}
	 * labeled alternative in {@link DRLParser#importdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStandardDef(DRLParser.ImportStandardDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importAccumulateDef}
	 * labeled alternative in {@link DRLParser#importdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAccumulateDef(DRLParser.ImportAccumulateDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#globaldef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobaldef(DRLParser.GlobaldefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#declaredef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredef(DRLParser.DeclaredefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(DRLParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#entryPointDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryPointDeclaration(DRLParser.EntryPointDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#windowDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDeclaration(DRLParser.WindowDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(DRLParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#enumeratives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratives(DRLParser.EnumerativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#enumerative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerative(DRLParser.EnumerativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(DRLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#ruledef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuledef(DRLParser.RuledefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#querydef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerydef(DRLParser.QuerydefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DRLParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DRLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(DRLParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#queryLhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryLhs(DRLParser.QueryLhsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lhsExpressionEnclosed}
	 * labeled alternative in {@link DRLParser#lhsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsExpressionEnclosed(DRLParser.LhsExpressionEnclosedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lhsOr}
	 * labeled alternative in {@link DRLParser#lhsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsOr(DRLParser.LhsOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lhsAnd}
	 * labeled alternative in {@link DRLParser#lhsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsAnd(DRLParser.LhsAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lhsUnarySingle}
	 * labeled alternative in {@link DRLParser#lhsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsUnarySingle(DRLParser.LhsUnarySingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsAndDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsAndDef(DRLParser.LhsAndDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsUnary(DRLParser.LhsUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsPatternBind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsPatternBind(DRLParser.LhsPatternBindContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsPattern(DRLParser.LhsPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#positionalConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalConstraints(DRLParser.PositionalConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints(DRLParser.ConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(DRLParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#nestedConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstraint(DRLParser.NestedConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#consequenceInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsequenceInvocation(DRLParser.ConsequenceInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#conditionalBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalBranch(DRLParser.ConditionalBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#namedConsequenceInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedConsequenceInvocation(DRLParser.NamedConsequenceInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#breakingNamedConsequenceInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakingNamedConsequenceInvocation(DRLParser.BreakingNamedConsequenceInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(DRLParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlRelationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlRelationalOperator(DRLParser.DrlRelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(DRLParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlQualifiedName(DRLParser.DrlQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlExpression(DRLParser.DrlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#backReferenceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackReferenceExpression(DRLParser.BackReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlMethodCall(DRLParser.DrlMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#temporalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalOperator(DRLParser.TemporalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#timeAmount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeAmount(DRLParser.TimeAmountContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlPrimary(DRLParser.DrlPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#inlineCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineCast(DRLParser.InlineCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlLiteral(DRLParser.DrlLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#inlineListExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineListExpression(DRLParser.InlineListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#inlineMapExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineMapExpression(DRLParser.InlineMapExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#mapExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpressionList(DRLParser.MapExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#mapEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntry(DRLParser.MapEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#patternFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternFilter(DRLParser.PatternFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#patternSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternSource(DRLParser.PatternSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#fromExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromExpression(DRLParser.FromExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#fromAccumulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromAccumulate(DRLParser.FromAccumulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(DRLParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#accumulateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccumulateFunction(DRLParser.AccumulateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#conditionalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressions(DRLParser.ConditionalExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#fromCollect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromCollect(DRLParser.FromCollectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#fromEntryPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromEntryPoint(DRLParser.FromEntryPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#fromWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromWindow(DRLParser.FromWindowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsExists(DRLParser.LhsExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsNot(DRLParser.LhsNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsEval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsEval(DRLParser.LhsEvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsForall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsForall(DRLParser.LhsForallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsAccumulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsAccumulate(DRLParser.LhsAccumulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lhsGroupBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsGroupBy(DRLParser.LhsGroupByContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#groupByKeyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByKeyBinding(DRLParser.GroupByKeyBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(DRLParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#consequenceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsequenceBody(DRLParser.ConsequenceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#namedConsequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedConsequence(DRLParser.NamedConsequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#stringId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringId(DRLParser.StringIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlArguments(DRLParser.DrlArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlArgument(DRLParser.DrlArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlAnnotation(DRLParser.DrlAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(DRLParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAttribute}
	 * labeled alternative in {@link DRLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAttribute(DRLParser.ExpressionAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAttribute}
	 * labeled alternative in {@link DRLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAttribute(DRLParser.BooleanAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAttribute}
	 * labeled alternative in {@link DRLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAttribute(DRLParser.StringAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringListAttribute}
	 * labeled alternative in {@link DRLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringListAttribute(DRLParser.StringListAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intOrChunkAttribute}
	 * labeled alternative in {@link DRLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntOrChunkAttribute(DRLParser.IntOrChunkAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#conditionalAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAttributeValue(DRLParser.ConditionalAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(DRLParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(DRLParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(DRLParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#unif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnif(DRLParser.UnifContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlVariableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlVariableInitializer(DRLParser.DrlVariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlCreator(DRLParser.DrlCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlArrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlArrayCreatorRest(DRLParser.DrlArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlArrayInitializer(DRLParser.DrlArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlBlock(DRLParser.DrlBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlBlockStatement(DRLParser.DrlBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlStatement(DRLParser.DrlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlLocalVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlLocalVariableDeclaration(DRLParser.DrlLocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlVariableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlVariableDeclarators(DRLParser.DrlVariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlVariableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlVariableDeclarator(DRLParser.DrlVariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlVariableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlVariableDeclaratorId(DRLParser.DrlVariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DRLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(DRLParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(DRLParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#complexOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexOp(DRLParser.ComplexOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(DRLParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DRLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMatch(DRLParser.TypeMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(DRLParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(DRLParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlIdentifier(DRLParser.DrlIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#drlKeywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrlKeywords(DRLParser.DrlKeywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#builtInOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInOperator(DRLParser.BuiltInOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#dummy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummy(DRLParser.DummyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#dummy2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummy2(DRLParser.Dummy2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DRLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DRLParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(DRLParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#fullAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullAnnotation(DRLParser.FullAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgs(DRLParser.AnnotationArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationElementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElementValuePairs(DRLParser.AnnotationElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationElementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElementValuePair(DRLParser.AnnotationElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationValue(DRLParser.AnnotationValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArray(DRLParser.AnnotationArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(DRLParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(DRLParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(DRLParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(DRLParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(DRLParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(DRLParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(DRLParser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#inExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(DRLParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(DRLParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#orRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrRestriction(DRLParser.OrRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#andRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndRestriction(DRLParser.AndRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#singleRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleRestriction(DRLParser.SingleRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(DRLParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#shiftOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(DRLParser.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(DRLParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(DRLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DRLParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(DRLParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(DRLParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(DRLParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#xpathSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpathSeparator(DRLParser.XpathSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#xpathPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpathPrimary(DRLParser.XpathPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#xpathChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpathChunk(DRLParser.XpathChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#xpathExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpathExpressionList(DRLParser.XpathExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DRLParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(DRLParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#identifierSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSuffix(DRLParser.IdentifierSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(DRLParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(DRLParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(DRLParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(DRLParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(DRLParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(DRLParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#classCreatorRestExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRestExpr(DRLParser.ClassCreatorRestExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(DRLParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(DRLParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(DRLParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(DRLParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(DRLParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#squareArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareArguments(DRLParser.SquareArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(DRLParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DRLParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#extends_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_key(DRLParser.Extends_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#super_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_key(DRLParser.Super_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#instanceof_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceof_key(DRLParser.Instanceof_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#boolean_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_key(DRLParser.Boolean_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#char_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_key(DRLParser.Char_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#byte_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByte_key(DRLParser.Byte_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#short_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort_key(DRLParser.Short_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#int_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_key(DRLParser.Int_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#float_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_key(DRLParser.Float_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#long_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong_key(DRLParser.Long_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#double_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_key(DRLParser.Double_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#void_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_key(DRLParser.Void_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#this_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_key(DRLParser.This_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#class_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_key(DRLParser.Class_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#new_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_key(DRLParser.New_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#not_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_key(DRLParser.Not_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#in_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_key(DRLParser.In_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#operator_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_key(DRLParser.Operator_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#neg_operator_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_operator_key(DRLParser.Neg_operator_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(DRLParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(DRLParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(DRLParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(DRLParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(DRLParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DRLParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(DRLParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(DRLParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(DRLParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(DRLParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(DRLParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(DRLParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(DRLParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DRLParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(DRLParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(DRLParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(DRLParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(DRLParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(DRLParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(DRLParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(DRLParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(DRLParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(DRLParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(DRLParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(DRLParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(DRLParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(DRLParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(DRLParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(DRLParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(DRLParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(DRLParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCommonBodyDeclaration(DRLParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(DRLParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(DRLParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(DRLParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(DRLParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(DRLParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(DRLParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(DRLParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(DRLParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(DRLParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(DRLParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIList(DRLParser.LambdaLVTIListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIParameter(DRLParser.LambdaLVTIParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DRLParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(DRLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(DRLParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(DRLParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(DRLParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(DRLParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(DRLParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(DRLParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(DRLParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(DRLParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(DRLParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(DRLParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(DRLParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(DRLParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(DRLParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(DRLParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(DRLParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(DRLParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(DRLParser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(DRLParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(DRLParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(DRLParser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#recordHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordHeader(DRLParser.RecordHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#recordComponentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponentList(DRLParser.RecordComponentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#recordComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponent(DRLParser.RecordComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#recordBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordBody(DRLParser.RecordBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DRLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(DRLParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(DRLParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DRLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(DRLParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DRLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(DRLParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(DRLParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(DRLParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(DRLParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(DRLParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(DRLParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(DRLParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(DRLParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(DRLParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(DRLParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(DRLParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(DRLParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(DRLParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(DRLParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(DRLParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(DRLParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(DRLParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabeledRule(DRLParser.SwitchLabeledRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#guardedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedPattern(DRLParser.GuardedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchRuleOutcome(DRLParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(DRLParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(DRLParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(DRLParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(DRLParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link DRLParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(DRLParser.TypeTypeContext ctx);
}