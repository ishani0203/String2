package string2;

public class EndOther {
    /*
     * Given two strings, return true if either of the strings
     * appears at the very end of the other string,
     * ignoring upper/lower case differences (ie, computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     *
     * endOther("Hiabc", "abc") → true
     * endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     */

    public static void main(String[] args) {
        String a = "Hiabc", b = "ABC"; //return true
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(endOther(a,b));
    }
    public static boolean endOther(String a, String b) {

        //since not case-sensitive, convert both to same case type
        String A = a.toLowerCase();
        String B = b.toLowerCase();

        return(A.endsWith(B) || B.endsWith(A));
    }






}
