import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Test {
		public static void main(String[] args) throws Exception {
				ANTLRInputStream input = new ANTLRInputStream(System.in);

				MyLexer lexer = new MyLexer(input);

				CommonTokenStream tokens = new CommonTokenStream(lexer);

				MySelectParser parser = new MySelectParser(tokens);

				CommonTree tree = (CommonTree)parser.select_clause().getTree();

				walkTree(tree);
		}

		public static void walkTree(CommonTree tree) throws Exception {
				System.out.printf("# %s\n", tree.getText());

				for (int i=0; i < tree.getChildCount(); i++) {
					CommonTree cTree = (CommonTree)tree.getChild(i);
					//System.out.printf("#\t# %s\n", cTree.getText());
					System.out.printf("---\t %s\n", cTree.toStringTree());

					if (cTree.getChildCount() > 0) {
							walkTree(cTree);
					}
				}
		}
}
