// Generated from C:/Users/Admin/IdeaProjects/JFK\Qbson.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QbsonParser}.
 */
public interface QbsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QbsonParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(QbsonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QbsonParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(QbsonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QbsonParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(QbsonParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QbsonParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(QbsonParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 */
	void enterAssign(QbsonParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 */
	void exitAssign(QbsonParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QbsonParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QbsonParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 */
	void enterIf(QbsonParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 */
	void exitIf(QbsonParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(QbsonParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link QbsonParser#line}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(QbsonParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scanReal}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterScanReal(QbsonParser.ScanRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scanReal}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitScanReal(QbsonParser.ScanRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDivision(QbsonParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDivision(QbsonParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scanInt}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterScanInt(QbsonParser.ScanIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scanInt}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitScanInt(QbsonParser.ScanIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(QbsonParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(QbsonParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterReal(QbsonParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitReal(QbsonParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterId(QbsonParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitId(QbsonParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(QbsonParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(QbsonParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterInt(QbsonParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitInt(QbsonParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAddition(QbsonParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link QbsonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAddition(QbsonParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QbsonParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(QbsonParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QbsonParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(QbsonParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fParam}
	 * labeled alternative in {@link QbsonParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFParam(QbsonParser.FParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fParam}
	 * labeled alternative in {@link QbsonParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFParam(QbsonParser.FParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fBlock}
	 * labeled alternative in {@link QbsonParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFBlock(QbsonParser.FBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fBlock}
	 * labeled alternative in {@link QbsonParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFBlock(QbsonParser.FBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition}
	 * labeled alternative in {@link QbsonParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondition(QbsonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link QbsonParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondition(QbsonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockIf}
	 * labeled alternative in {@link QbsonParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockIf(QbsonParser.BlockIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockIf}
	 * labeled alternative in {@link QbsonParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockIf(QbsonParser.BlockIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockRepeat}
	 * labeled alternative in {@link QbsonParser#blockrepeat}.
	 * @param ctx the parse tree
	 */
	void enterBlockRepeat(QbsonParser.BlockRepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockRepeat}
	 * labeled alternative in {@link QbsonParser#blockrepeat}.
	 * @param ctx the parse tree
	 */
	void exitBlockRepeat(QbsonParser.BlockRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QbsonParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void enterRepetitions(QbsonParser.RepetitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QbsonParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void exitRepetitions(QbsonParser.RepetitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QbsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QbsonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QbsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QbsonParser.ValueContext ctx);
}