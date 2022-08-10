public class Bits {
    public static void main(String args[])
    // {
    // // Get
    // int n = 5; // 0101
    // int position = 3;
    // int bitMask = 1 << position;

    // if ((bitMask & n) == 0) {
    // System.out.println("Bit was zero");
    // } else {
    // System.out.println("Bit was one");
    // }
    // // Output:
    // // Bit was zero
    // }

    // ------------------------------
    // {
    // // set
    // int n = 5; // 0101
    // int pos = 1;
    // int bitMask = 1 << pos;

    // int newNum = bitMask | n;
    // System.out.println(newNum);

    // // output:
    // // 7
    // }
    // --------------------------------

    {
        int n = 5;
        int position = 2;
        int bitMask = 1 << position;
        int notBitMask = ~(bitMask);

        int newNum = notBitMask & n;
        System.out.println(newNum);

        // output:
        // 1
    }
}
