// Generated from YAPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YAPLParser}.
 */
public interface YAPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YAPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YAPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YAPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#define_class}.
	 * @param ctx the parse tree
	 */
	void enterDefine_class(YAPLParser.Define_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#define_class}.
	 * @param ctx the parse tree
	 */
	void exitDefine_class(YAPLParser.Define_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(YAPLParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(YAPLParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(YAPLParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(YAPLParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(YAPLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(YAPLParser.ExprContext ctx);
}