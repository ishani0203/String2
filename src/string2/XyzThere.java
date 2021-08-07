package string2;

public class XyzThere {
    /*
     * Return true if the given string contains an appearance of "xyz"
     * where the xyz is not directly preceded by a period (.).
     * So "xxyz" counts but "x.xyz" does not.
     *
     * xyzThere("abcxyz") → true
     * xyzThere("abc.xyz") → false
     * xyzThere("xyz.abc") → true
     */

    public static void main(String[] args) {
        String str = "xyz.abc"; //xyz.abc returns true
        System.out.println(xyzThere(str));
    }

    public static boolean xyzThere(String str){

        boolean check = false;

        //length-2 to keep within boundary of "xyz"
        for(int i=0; i<str.length()-2; i++) {

            //first check if "xyz" exists in entire string
            if (str.substring(i, i+3).equals("xyz"))

                /*to check if '.' appears before "xyz",
                make sure 'x' is not at first index*/
                if (str.indexOf('x') > 0 && str.charAt(i-1)!='.')
                    check = true;

                /*if 'x' is at first index,
                don't need to check for '.' */
                else if (str.indexOf('x')==0)
                    check = true;
        }
        //return  statement always outside of for-loop
        return check;

    }
}
