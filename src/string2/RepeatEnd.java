package string2;

public class RepeatEnd {
    /*
     * Given a string and an int n, return a string
     * made of n repetitions of the last n characters of the string.
     * You may assume that n is between 0 and the length of the string, inclusive.
     *
     * repeatEnd("Hello", 3) → "llollollo"
     * repeatEnd("Hello", 2) → "lolo"
     * repeatEnd("Hello", 1) → "o"
     */
    public static void main(String[] args) {

        String str = "Hello"; //op: (llo)(llo)(llo)
        int n = 3;
        System.out.println("string: " + str + "    n: "+ n);
        System.out.println("The new string is: " + repeatEnd(str,n));
    }

    public static String repeatEnd(String str, int n) {
        //relevant string: the last n chars
        String newStr = str.substring((str.length()-n),str.length());
        String repEnd = "";

        //repeat substring n times
        for(int i=0;i<n;i++){
            repEnd += newStr;
        }
        return repEnd;
    }
}
