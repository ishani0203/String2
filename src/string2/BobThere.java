package string2;

public class BobThere {
    /*Return true if the given string contains a "bob" string,
     * but where the middle 'o' char can be any char.
     *
     * bobThere("abcbob") → true
     * bobThere("b9b") → true
     * bobThere("bac") → false
     */

    public static void main(String[] args) {
        String str = "bobbob";
        System.out.println(str);
        System.out.println(bobThere(str));
    }

    public static boolean bobThere(String str) {

        boolean check = false;

        //length-2 to keep within boundary of "bob"
        for(int i=0; i<str.length()-2; i++) {

            /*check if 'b' exists in string.
            then, also check for another 'b', only 2 indexes after*/
            if ((str.charAt(i)=='b') && (str.charAt(i+2)=='b'))
                    check = true;
        }
        //return  statement always outside of for-loop
        return check;

    }

}
