package string2;

public class CatDog {
    /*
     * Return true if the string "cat" and "dog"
     * appear the same number of times in the given string.
     *
     * catDog("catdog") → true (1,1)
     * catDog("catcat") → false (2,0)
     * catDog("1cat1cadodog") → true (1,1)
     */

    public static void main(String[] args) {
        String str = "catcat";

        System.out.println(catDog(str));

    }
    /*public static int cat(String str) {
        int countCat = 0;
        for(int i=0; i<str.length()-2; i++) {

            if (str.startsWith("cat", i))
                    countCat++;
        }
        return countCat;
    }

    public static int dog(String str) {
        int countDog = 0;
        for(int i=0; i<str.length()-2; i++) {

            if (str.startsWith("dog", i))
                countDog++;
        }
        return countDog;
    }*/

    public static boolean catDog(String str) {

        System.out.println("Your string: "+ str);

        //count cat-occurrence first
        int countCat = 0;
        for(int i=0; i<str.length()-2; i++) {

            if (str.startsWith("cat", i))
                countCat++;
        }
        System.out.println("\"cat\" appears " + countCat + " time(s).");

        //then count dog-occurrence
        int countDog = 0;
        for(int i=0; i<str.length()-2; i++) {

            if (str.startsWith("dog", i))
                countDog++;
        }
        System.out.println("\"dog\" appears " + countDog + " time(s).");

        //compare both results
        return (countCat==countDog);
    }
}
