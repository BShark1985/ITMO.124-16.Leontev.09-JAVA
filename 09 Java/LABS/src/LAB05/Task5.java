package LAB05;

public class Task5 {
    // 5.	Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами
    public static void main(String[] args) {
        System.out.println("The given string is:\nThis is a test string");
        String string = "This is a test string";

        reverse(string);

    }

    public static void reverse(String string){
        String[] words = new StringBuilder(string).reverse().toString().split(" ");
        StringBuilder strb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--){
            strb.append(words[i]).append(" ");
        }
        System.out.println("The string reversed word by word is:\n" + strb);
    }
}
