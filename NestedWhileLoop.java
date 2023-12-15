public class NestedWhileLoop {
    public static void main(String[] args) {
        int outer = 1;
        while (outer <= 3) {
            int inner = 1;
            while (inner <= 3) {
                System.out.println("Outer: " + outer + ", Inner: " + inner);
                inner++;
            }
            outer++;
        }
    }
}
