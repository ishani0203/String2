package string2;

public class XyBalance {
    /**
     * We'll say that a String is xy-balanced if:
     * for all the 'x' chars in the string, there exists a 'y' char
     * somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
     * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
     *
     * xyBalance("aaxbby") → true      * xyBalance("aaxbb") → false     * xyBalance("yaaxbb") → false
     */

    public static void main(String[] args) {
        String str = "xxxxxyx";
        System.out.println("String = " + str);
        System.out.println("Balance check: " + xyBalance(str));
    }

    public static boolean xyBalance(String str) {
        boolean check;
        //index of last 'y' in the string
        int iOfY = 0;

        if (str.contains("y")) {
            iOfY = str.lastIndexOf("y");
        }

        //the only relevant part of string begins with last 'y'
        String newStr = str.substring(iOfY);
        System.out.println("new relevant String = " + newStr);

        //true, only if remaining string DOES NOT contain 'x'
        check = !newStr.contains("x");
        return check;
    }
}
