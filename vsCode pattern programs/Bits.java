public class Bits {
    public static void main(String args[]) {
        // Get
        int n = 5; // 0101
        int position = 3;
        int bitMask = 1 << position;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}
