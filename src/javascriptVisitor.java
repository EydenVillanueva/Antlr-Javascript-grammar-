// Generated from C:\Users\Eyden Villanueva\Documents\GitHub\Antlr-Javascript-grammar-\src\javascript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link javascriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface javascriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link javascriptParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(@NotNull javascriptParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opera}
	 * labeled alternative in {@link javascriptParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpera(@NotNull javascriptParser.OperaContext ctx);
	/**
	 * Visit a parse tree produced by {@link javascriptParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(@NotNull javascriptParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigna}
	 * labeled alternative in {@link javascriptParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigna(@NotNull javascriptParser.AsignaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declara}
	 * labeled alternative in {@link javascriptParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclara(@NotNull javascriptParser.DeclaraContext ctx);
	/**
	 * Visit a parse tree produced by {@link javascriptParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(@NotNull javascriptParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javascriptParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull javascriptParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link javascriptParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(@NotNull javascriptParser.ArgumentoContext ctx);
}