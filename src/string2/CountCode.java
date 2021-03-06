package string2;

public class CountCode {
    /*
     * Return the number of times that the string "code" appears
     * anywhere in the given string, except we'll accept any letter
     * for the 'd', so "cope" and "cooe" count.
     *
     * countCode("aaacodebbb") → 1
     * countCode("codexxcode") → 2
     * countCode("cozexxcope") → 2
     */

    public static void main(String[] args) {
        String str = "cobexcod excope"; //count = 2
        System.out.println(countCode(str));
    }

    public static int countCode(String str) {

        int count = 0;

        //length-3 to keep within boundary of "code"
        for(int i=0; i<str.length()-3; i++) {

            /*coding bat solution: checking occurrence of both char values
            if (str.substring(i, i+2).equals("hi"))
                count++;
            */

            //can also use if(str.substring(i, i+2).equals("co"))
            if (str.substring(i, i+2).equals("co"))
                if (str.charAt(i+2)!=' ' && str.charAt(i+3)=='e' )
                    count++;
        }
        //return  statement always outside of for-loop
        return count;
    }

}
