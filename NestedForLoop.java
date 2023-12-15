public class NestedForLoop {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 3; outer++) {
            for (int inner = 1; inner <= 3; inner++) {
                System.out.println("Outer: " + outer + ", Inner: " + inner);
            }
        }
    }
}
