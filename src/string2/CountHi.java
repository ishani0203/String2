package string2;

public class CountHi {
    /*
     * Return the number of times that the string
     * "hi" appears anywhere in the given string.
     *
     * countHi("abc hi ho") → 1
     * countHi("ABChi hi") → 2
     * countHi("hihi") → 2
     */

    public static void main(String[] args) {
        String str = "hi hello lithium hiiih"; //count = 3
        System.out.println(hiCount(str));

        String cdefg = "cdefg";
        String d = cdefg.substring(1, 2);
        System.out.println("substring of cde starting at index 1 and ending at 2: "+ d);

    }

    public static int hiCount(String str) {

        int count = 0;

        for(int i=0; i<str.length()-1; i++) {

            /*coding bat solution: checking occurrence of both char values
            if (str.substring(i, i+2).equals("hi"))
                count++;
            */

            //increment count only if 'i' occurs after 'h'
            if (str.charAt(i)=='h')
                if (str.charAt(i+1)=='i')
                    count++;
        }
        //return  statement always outside of for-loop
        return count;
    }
}
