public class NestedDoWhileLoop {
    public static void main(String[] args) {
        int outer = 1;
        do {
            int inner = 1;
            do {
                System.out.println("Outer: " + outer + ", Inner: " + inner);
                inner++;
            } while (inner <= 3);
            outer++;
        } while (outer <= 3);
    }
}
