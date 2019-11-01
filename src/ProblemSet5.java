/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {
    
    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();

        //do not forget empty strings
        ps.surroundMe("null", "6789");
        ps.endsMeet("123456789", 11);
        ps.middleMan("1234567");
        ps.isCentered("12345", "234");
        ps.countMe("My name is Emily", 's');
        ps.triplets("aaaa");
        System.out.println(ps.addMe("111"));
    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {
        String message = "";
        if (in != null && out != null && out.length() == 4) {
            message += out.substring(0, 2);
            message += in;
            message += out.substring(out.length() - 2);
        } else {
            message = in;
        }
        return message;
    }
    
    /*
     * Exercise 2.
     * 
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */
    
    public String endsMeet(String text, int n) {
        if (text == null || text.length() < 1 || text.length() > 10 || n < 1 || n > text.length()) {
            return text;
        }
        String message = "";
        message += text.substring(0, n);
        message += text.substring((text.length() - n));
        return message;
    }
    
    /*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
     */
    
    public String middleMan(String text) {
        if (text == null || text.length() % 2 == 0 || text.length() < 3) {
            return text;
        }
        String message = "";

        int firstIndexNum = ((text.length() - 1) / 2) - 1;
        int lastIndexNum = ((text.length() + 1) / 2) + 1;

        message += text.substring(firstIndexNum, lastIndexNum);
        return message;
    }
    
    /*
     * Exercise 4.
     * 
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    
    public boolean isCentered(String text, String target) {
        if (middleMan(text).equals(target)) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     */
    
    public int countMe(String text, char suffix) {
        int counter = 0;
        if (text == null || !Character.isAlphabetic(suffix)) {
            return -1;
        }
        for (int i = 1; i <= text.length(); i++) {
            if (text.charAt(i - 1) == suffix && i < text.length()) {
                if (text.charAt(i) == ' ') {
                    counter++;
                }
            } else if (text.charAt(i - 1) == suffix && i == text.length()) {
                counter++;
            }
        }
        return counter;
    }
    
    /*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     */
    
    public int triplets(String text) {
        if (text == null) {
            return -1;
        }
        if (text.length() < 3) {
            return 0;
        }
        
        int stringLength = text.length() - 1;
        int counter = 0;
        for (int i = 0; i < stringLength; i++) {
            if ((i + 2) <= stringLength) {
                if (text.charAt(i) == text.charAt(i + 1) && text.charAt(i) == text.charAt(i + 2)) {
                    counter++;
                }
            } else {
                break;
            }
        }
        return counter;
    }
    
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {
        return 2;
    }
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */
    
    public long sequence(String text) {
        return 2;
    }
    
    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    
    public String intertwine(String a, String b) {
        return "";
    }
    
    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     */
    
    public boolean isPalindrome(String text) {
        return false;
    }
}
