// Generated from C:\Users\Eyden Villanueva\Documents\GitHub\Antlr-Javascript-grammar-\src\javascript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javascriptParser}.
 */
public interface javascriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javascriptParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull javascriptParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javascriptParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull javascriptParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javascriptParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(@NotNull javascriptParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javascriptParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(@NotNull javascriptParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigna}
	 * labeled alternative in {@link javascriptParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterAsigna(@NotNull javascriptParser.AsignaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigna}
	 * labeled alternative in {@link javascriptParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitAsigna(@NotNull javascriptParser.AsignaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declara}
	 * labeled alternative in {@link javascriptParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(@NotNull javascriptParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declara}
	 * labeled alternative in {@link javascriptParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(@NotNull javascriptParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link javascriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull javascriptParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link javascriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull javascriptParser.ProgContext ctx);
}