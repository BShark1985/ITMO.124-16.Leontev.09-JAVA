package LAB05;

public class Task4 {
    // 4.	Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
    public static void main(String[] args) {
        String text = "Ехал Грека через реку,\n" +
                "Видит Грека – в реке рак.            \n" +
                "Сунул Грека руку в реку, -\n" +
                "Рак за руку Греку ЦАП !";
        String checkWord = "Грека";
        int numberRepetitions = countRepetitions(text, checkWord);
        System.out.println("В тексте " + numberRepetitions + " вхождений слова " + checkWord);
    }

    public static int countRepetitions(String text, String checkWord) {
        int textSize = text.length();
        String[] res = text.split(checkWord);
        if (textSize == res.length) {
            return 0;
        }
        return res.length - 1;
    }
}
