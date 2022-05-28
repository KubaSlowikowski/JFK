// Generated from C:/Users/Admin/IdeaProjects/JFK\Qbson.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QbsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QbsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QbsonParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(QbsonParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(QbsonParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QbsonParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(QbsonParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scanReal}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanReal(QbsonParser.ScanRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(QbsonParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scanInt}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanInt(QbsonParser.ScanIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(QbsonParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(QbsonParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QbsonParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(QbsonParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(QbsonParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(QbsonParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link QbsonParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(QbsonParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockIf}
	 * labeled alternative in {@link QbsonParser#blockif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIf(QbsonParser.BlockIfContext ctx);
}