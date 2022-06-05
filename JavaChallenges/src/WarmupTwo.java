import java.util.Arrays;

public class WarmupTwo {

    // given string and int, return larger string that is 'n' copies of string
    public static String stringTimes(String str, int n) {
        // create new empty string
        String result = "";
        // for loop to do 'n' number of times
        for (int i = 0; i < n; i++) {
            // concatenating string to new string to repeat it
            result += str;
        }
        return result;
    }

    // given string and int, return larger string that is n copies of string
    // BUT it should only be the first 3 or fewer characters
    public static String frontTimes(String str, int n) {
        String result = "";
        // checks if string is long enough, if so continue and add the substring to result to multiply it
        if (str.length() > 2) {
            for (int i = 0; i < n; i++) {
                result += str.substring(0,3);

            }
            return result;
        } else {
            for (int i = 0; i < n; i++) {
                // just repeats the string n times if string is shorter than 3
                result += str;
            }
            return result;
        }
    }

    // count number of "xx" in string, overlapping is allowed, "xxx" is 2 xx and xxxx is 3 xx
    public static int countXX(String str) {
        // counter
        int count = 0;
        // for loop to loop through string till iterator reaches string length
        for (int i = 0; i < str.length()-1; i++) {
            // if string of index 0-2 equals "xx", add to counter,
            // and then 'i' gets +1 and shows substring 1,3 next iteration, and so on
            if (str.substring(i, i+2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    // if the first instance of x is a double x, return true else return false
    public static boolean doubleX(String str) {
        // starts loop
        for (int i = 0; i < str.length()-1; i++) {
            // if char at string index i is x, continue
            if (str.charAt(i) == 'x') {
                // if next char at string index i + 1 is also x, return true, else return false
                if (str.charAt(i+1) == 'x') {
                    return true;
                } return false;
                // this early return false will make it so the loop doesn't have to loop through
                // whole loop to get to 'return false', as if there is one x, and it's not followed by another x
                // it already failed the requirements
            }
        } return false;
    }

    // return a string with every other char from original string
    public static String stringBits(String str) {
        String result = "";
        // for each loop, the i increment goes up by 2 to skip one letter and adds to result string to return
        for (int i = 0; i < str.length(); i = i+2) {
            result += str.charAt(i);
        } return result;
    }

    // return a string with every loop it adds one more letter into the substring
    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i);
        } return result + str;
    }

    // if there are multiple instances of the final two characters in the string,
    // return count of them NOT including final two characters
    public static int last2(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            // this line says if current two characters in iteration are equal to final two characters,
            // AND we are not on the final two characters of iteration, add to counter
            if (str.substring(i, i+2).equals(str.substring(str.length()-2, str.length())) && i != str.length()-2) {
                count++;
            }
        } return count;
    }

    // return count of 9 in array
    public static int arrayCount9(int[] nums) {
        int count = 0;
        // loop through array
        for (int i = 0; i < nums.length; i++) {
            // if index of iteration equals 9, add to count
            if (nums[i] == 9) {
                count++;
            }
        } return count;
    }

    // if one of the first four elements is 9, return true, else return false
    public static boolean arrayFront9 (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // returns false if iteration is past 4 meaning the first four elements have not equaled 9 yet
            if (i == 4) {
                return false;
            }
            if (nums[i] == 9) {
                return true;
            }
        } return false;
    }

    // return true if sequence 1,2,3 appears in array
    public static boolean array123(int[] nums) {
        // checks if array is greater than 3
        if (nums.length > 3) {
            // loops through array
            for (int i = 0; i < nums.length-1; i++) {
                // if index of i, i + 1, i + 2 equals the sequence 1,2,3, return true, else return false
                if (nums[i] == 1) if (nums[i+1] == 2) if (nums[i+2] == 3) return true;
            } return false;
            // if nums length is equal to 3, and if the sequence is there, return true, else return false;
        } else if (nums.length == 3) return (nums[0] == 1 && nums[1] == 2 && nums[2] == 3);
        return false;
    }

    public static int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.substring(i, i+1).equals(b.substring(i, i+1))) {
                count++;
            }
        } return count;
    }

    public static void main(String[] args){

        boolean a = WarmupTwo.doubleX("x");
        System.out.println(a);

        int b = WarmupTwo.last2("axxxaaxx");
        System.out.println(b);

    }
}
