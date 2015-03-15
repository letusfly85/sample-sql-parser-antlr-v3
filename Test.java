import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Test {
		public static void main(String[] args) throws Exception {
				ANTLRInputStream input = new ANTLRInputStream(System.in);

				MyLexerLexer lexer = new MyLexerLexer(input);

				CommonTokenStream tokens = new CommonTokenStream(lexer);

				MySelect parser = new MySelect(tokens);

				CommonTree tree = (CommonTree)parser.select_clause().getTree();
				System.out.println(tree.getText());
				System.out.println(tree.getChildCount());
				System.out.println(tree.toStringTree());

				System.out.println("###################");

				CommonTree cTree = (CommonTree)tree.getChild(0);
				System.out.println(cTree.getText());
				System.out.println(cTree.toStringTree());
				System.out.println(cTree.getChildCount());

				for (int i=0; i < cTree.getChildCount(); i++) {
					CommonTree nTree = (CommonTree)cTree.getChild(i);
					System.out.println(nTree.getText());
				}
		}
}
