package LAB05;
import java.util.*;

public class Task1 {
    // 1.	Написать метод для поиска самого длинного слова в тексте.
    public static void main(String[] args) {
        String str1 = "Ищем самое длинное слово в тексте";
        String[] words1 = str1.split(" ");
        System.out.println("Самое длинное слово в тексте: " + maxLengthWord(words1));
    }

    private static String maxLengthWord(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].toLowerCase();
        }
        Arrays.sort(s);
        int len = 0;
        String longest = "";
        for (String string : s) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
            }
        }
        return longest;
    }
}
