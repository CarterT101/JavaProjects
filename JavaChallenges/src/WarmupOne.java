import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarmupOne {
    // if it is a weekday and NOT vacation, return false, if it is a weekday AND vacation, return true,
    // if it is not a weekday and IS vacation, return true
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    // if both ARE smiling, or NEITHER are smiling, return true
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }
    // return sum of two int values, if they are both the same, return double their sum
    public static int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else return a + b;
    }

    // return absolute value of difference of n and 21 unless n is over 21, then return double the abs difference
    public static int diff21(int n) {
        if (n > 21) {
            return Math.abs(((21 - n) * 2));
        } else return Math.abs(21 - n);
    }

    // if talking is true during certain hours, return true
    public static boolean parrotTrouble(boolean talking, int hour) {
        if ( talking && (hour < 7 || hour > 20)) {
            return true;
        } else return false;
    }

    // if a or b is 10 or the sum of them == 10 then return true
    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else return false;
    }

    // if n is within 100 or 200, return true
    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    // return true if one is negative, not both, unless boolean negative is true then both HAVE to be negative
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else return (a < 0 && !(b < 0)) || (b < 0 && !(a < 0));
    }

    // return string with "not" added to the front if it doesn't have it already
    public static String notString(String str) {
        if (str.indexOf("not") == 0) {
            return str;
        } else return "not ".concat(str);
    }

    // remove the character at specific index
    public static String missingChar(String str, int n) {
        return str.replace(Character.toString(str.charAt(n)), "");
    }

    // return string with first and last index switched
    public static String frontBack(String str) {
        // if string length is less than or equal to 1, just return string
        if (str.length() <= 1) return str;
        // grabs the middle of the string, from 1st index to the second to last index
        String mid = str.substring(1, str.length()-1);
        // returns string with last character in first spot and mid, and first character in last spot
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

    // return the first three characters of string repeated three times, unless the string length is shorter than 3,
    // then just repeat three times
    public static String front3(String str) {
        String result = "";
        if (str.length() >= 3) {
            // this is the newer way to do below code however website
            // doesn't support
            // return (str.substring(0, 3)).repeat(3);
            for (String word: Collections.nCopies(3, str.substring(0, 3))) {
                result += word;
            }
            return result;
        } else {
            for (String word: Collections.nCopies(3, str.substring(0, str.length()))) {
                result += word;
            }
            return result;
        }
    }

    // grab the last index and put it at the beginning and at the end
    public static String backAround(String str) {
        // this grabs the last string character and converts it to string, adding it to the original string,
        // and then adding that same string character again to the end
        String result = Character.toString(str.charAt(str.length()-1)) + str +
                Character.toString(str.charAt(str.length()-1));
        return result;
    }

    // check if number is multiple of 3 or 5
    public static boolean or35(int n) {
        // if the remainder of 'n' is equal to 0 when constantly subtracting 3 or 5, it is divisible by 3 or 5,
        // so return true
        if (n % 5 == 0 || n % 3 == 0) {
            return true;
        }
        return false;
    }

    // take first 2 characters and return string with them at beginning and end, if the string is less than 2 characters
    // just use whatever characters there are
    public static String front22(String str) {
        // checks if string length is long enough to do task, if not just repeat string 3 times to make it so the
        // characters are at beginning and end of original string
        if (str.length() <= 2) {
            String result = "";
            for (String word: Collections.nCopies(3, str.substring(0, str.length()))) {
                result += word;
            }
            return result;
        } else {
            // return first 2 characters then original string then first two characters again and end
            return str.substring(0,2) + str + str.substring(0,2);
        }
    }

    // if it starts with 'hi' return true
    public static boolean startHi(String str) {
        // checks if string is long enough to say "hi"
        if (str.length() >= 2) {
            // if the string "hi" equals index 0-2 of "str", return true else return false
            if ("hi".equals(str.substring(0, 2))) {
                return true;
            } else return false;
        } else return false;
    }

    // return true if one value is greater than 100 and the other one is less than 0
    public static boolean icyHot(int temp1, int temp2) {
        // cakes comparisons to make sure temps are correct
        return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
    }

    // return true if one parameter is within 10 and 20 inclusive...
    public static boolean in1020(int a, int b) {
        return (20 >= a && a >= 10) || (20 >= b && b >= 10);
    }

    // return true if one of the ints is within 13 and 19 inclusive...
    public static boolean hasTeen(int a, int b, int c) {
        return (19 >= a && a >= 13) || (19 >= b && b >= 13) || (19 >= c && c >= 13);
    }

    // makes sure one of the parameters is true but not both
    public static boolean loneTeen(int a, int b) {
        // '^' is a comparison operator, one of them can be true but not both
        return (19 >= a && a >= 13) ^ (19 >= b && b >= 13);
    }

    // if string del appears starting at index 1, return string where 'del' has been deleted
    public static String delDel(String str) {
        // checks if 'str' length is long enough to hold 'del'
        if (str.length() > 3) {
            // if first index through third equals "del", return str with replaced characters to get rid of "del"
            if (str.substring(1, 4).equals("del")) {
                return str.replace("del", "");
            }
        }
        // return str if str.length() is not greater 3
        return str;
    }

    // if "ix" is in the beginning 3 characters, return true
    public static boolean mixStart(String str) {
        // checking if str.length can fit "ix"
        if (str.length() > 2) {
            // if index 1-3 equals "ix" return true, else return false
            if (str.substring(1, 3).equals("ix")) {
                return true;
            }
        }
        return false;
    }

    // return string made of first 2 characters (if present),
    // only include first char if it is o and second only if it is z
    public static String startOz(String str) {
        // creates empty string to add onto
        String result = "";
        // makes sure str is long enough
        if (str.length() >= 1) {
            if (Character.toString(str.charAt(0)).equals("o")) {
                // if "o", add it to result
                result += "o";
            }
            if (str.length() > 1) {
                if (Character.toString(str.charAt(1)).equals("z")) {
                    result += "z";
                }
            }
        }
        return result;
    }

    // return largest of three ints
    public static int intMax(int a, int b, int c) {
        // Adding to class Integer array to then return an int value and finding the max of the list
        Integer[] intList = {a, b, c};
        return (int) Collections.max(Arrays.asList(intList));
    }

    // return value closest to 10, if they are equal distance return 0
    public static int close10(int a, int b) {
        // finds the absolute value of 10 - value to find distance and adds both values to list
        Integer[] intList = {Math.abs(10-a), Math.abs(10-b)};
        // if list of index 0 is less than list of index 1, that means 'a' is less distance so it should be returned
        if (intList[0] < intList[1]) {
            return a;
            // else if the distance between 10 and the value a and b is the same distance, return 0
        } else if (intList[0].equals(intList[1])) {
            return 0;
            // else that means b is a smaller distance, therefore return b
        } else return b;
    }

    //
    public static boolean in3050(int a, int b) {
        if ((a >= 30 && 40 >= a) && (b >= 30 && 40 >= b) || (a >= 40 && 50 >= a) && (b >= 40 && 50 >= b)) {
            return true;
        }
        return false;
    }

    // return large value that is in range 10 and 20 inclusive or 0 if neither in range
    public static int max1020(int a, int b) {
        // if either a or b is within range, continue
        if ((20 >= a && a >= 10) || (20 >= b && b >= 10)) {
            // if b works, continue, if not return a
            if ((20 >= b && b >= 10)) {
                // if a is within bounds, continue, if not return b if it made it this far
                if (a >= b && a <= 20) {
                    return a;
                } else return b;
            } else return a;
        } else return 0;
    }

    // if the count of char 'e' is between 1 and 3, return true, else return false
    public static boolean stringE(String str) {
        // setting up counter
        int count = 0;
        // for each character in str, compare that char to char 'e', and if it equals then add 1 to count var
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        // if count is between 1 and 3, return true, else return false
        if (3 >= count && count >= 1) {
            return true;
        }
        return false;
    }

    // return true if their final digit is the same
    public static boolean lastDigit(int a, int b) {
        // this is constantly subtracting 10 to find the remainder of a and b and if they are equal, return true
        if (a % 10 == b % 10) {
            return true;
        } else return false;
    }

    // return final 3 chars in upper case unless there are 3 or less characters, then just uppercase them all
    public static String endUp(String str) {
        // creating two empty strings to add onto later on
        String beginStr = "";
        String endStr = "";
        if (str.length() > 3) {
            // if string length is greater than 3, continue and make beginStr
            beginStr = str.substring(0, str.length()-3);
            // gets final 3 characters of string and uppercase them
            endStr = (str.substring(str.length()-3, str.length())).toUpperCase();
            // returns concatenated string
            return beginStr + endStr;
        }
        else return str.toUpperCase();
    }

    // return every character separated every nTh time combined in a string
    public static String everyNth(String str, int n) {
        // creates empty string to add onto
        String result = "";
        // loops through string length and adds every character separated by "n" times
        for (int i = 0; i < str.length(); i+=n) {
            result += str.charAt(i);
        } return result;
    }

    public static void main(String[] args){

        boolean a = WarmupOne.sleepIn(true, true);

        System.out.println(a);

        a = WarmupOne.monkeyTrouble(false, false);
        System.out.println(a);

        int b = WarmupOne.sumDouble(7, 7);
        System.out.println(b);

        String c = WarmupOne.frontBack("code");
        System.out.println(c);

        c = WarmupOne.front3("Ja");
        System.out.println(c);

        c = WarmupOne.backAround("cat");
        System.out.println(c);

        b = WarmupOne.max1020(21, 10);
    }
}
