package LAB05;

public class Task2 {
    // 2.	Написать метод, который проверяет является ли слово палиндромом.
    public static void main(String[] args) {
        String text = "Казак";
        checkPalindrome(text);
    }

    public static void checkPalindrome(String s){
        String lowerCaseString = s.toLowerCase();
        StringBuilder reverseText = new StringBuilder(lowerCaseString);
        reverseText.reverse();
        if(lowerCaseString.equals(reverseText.toString())){
            System.out.println("Слово '" + s + "' является палиндромом");
        }else{
            System.out.println("Слово '" + s + "' не является палиндромом");
        }
    }
}
