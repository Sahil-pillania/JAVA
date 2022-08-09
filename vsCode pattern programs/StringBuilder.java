//import java.util.*;

public class StringBuilder {

    public StringBuilder(String string) {
    }

    public static void main(String args[]) {

        StringBuilder stb = new StringBuilder("Sahil");
        System.out.println(stb);

        // index 0
        System.out.println(stb.charAt(0));

        // set char at 0 index
        stb.insert(0, 'M');
        System.out.println(stb);

    }

}
