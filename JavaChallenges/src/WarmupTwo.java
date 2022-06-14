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

    // return count of positions where they contain the same length 2 substring in same index positions in strings
    public static int stringMatch(String a, String b) {
        // makes counter
        int count = 0;
        // if 'a' string is shorter than 'b' string then it should max the for loop with a so it doesn't go out of
        // index range
        if (a.length() < b.length()) {
            // for every item in a, check if substring 0,2 and so on is equal to the same index of b substring, if so
            // increase count
            for (int i = 0; i < a.length()-1; i++) {
                if (a.substring(i, i+2).equals(b.substring(i, i+2))) {
                    count++;
                }
            } return count;
        } else {
            // if "a" isn't shorter than b.length, then continue with this which is the same as above, comparing
            // substring of 'a' to substring of 'b'
            for (int i = 0; i < b.length()-1; i++) {
                if (a.substring(i, i+2).equals(b.substring(i, i+2))) {
                    count++;
                }
            } return count;
        }
    }

    // get rid of 'x' unless it is the first or last character in string
    public static String stringX(String str) {
        // create empty string
        String result = "";
        // loop through string
        for (int i = 0; i < str.length(); i++) {
            // if 'i' is at the first index and that character is 'x', add it to result
            if (i == 0 && str.charAt(0) == 'x') {
                result += 'x';
                // if 'i' is at the end of the string and it is equal to 'x', add 'x' to end of string
            } else if (i == str.length()-1 && str.charAt(str.length()-1) == 'x') {
                result += 'x';
            } // if those prior statements aren't true then it should add the
            // string character the iteration is currently at
            else if (str.charAt(i) != 'x') {
                result += str.charAt(i);
            }
        } return result;
    }

    // return string made of chars at indexes 0,1,4,5,8,9, so plus one then plus 3 etc...
    public static String altPairs(String str) {
        String result = "";
        // for loop with i being added onto within loop instead at end of statement 3
        for (int i = 0; i < str.length(); i = i) {
            // adding char at string index 'i' to new string
            result += str.charAt(i);
            // if i's remainder is 0, it should only add one as it is an even number,
            // else it should add 3 because it is an odd
            if (i % 2 == 0) {
                i += 1;
            } else i += 3;
        }
        return result;
    }

    public static void main(String[] args){

        boolean a = WarmupTwo.doubleX("x");
        System.out.println(a);

        int b = WarmupTwo.last2("axxxaaxx");
        System.out.println(b);

        String c = WarmupTwo.altPairs("ThisThatTheOther");
        System.out.println(c);

    }
}
