package calc;

/**
 * Created by Администратор on 10.10.2015.
 */
abstract class MyOperation {
    public abstract int operation (int x, int y);

    }
class PlusOperation extends MyOperation {
    public static final String name = "+";

    public int operation(int x, int y) {
        return x + y;

    }

    class MinusOperation extends MyOperation {
        public static final String name = "-";

        public int operation(int x, int y) {
            return x - y;

        }

        public /*static*/ void main(String[] args) {
            // + -
            String expr = "100 + 200";
            String[] parse = expr.split(" ");
            int x = Integer.parseInt(parse[0]);
            int y = Integer.parseInt(parse[2]);
            String op = parse[1];
            switch (op) {
                case "+": {

                }
            }
        }
    }
}
