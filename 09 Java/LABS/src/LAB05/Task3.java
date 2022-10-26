package LAB05;

public class Task3 {
    // 3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
    public static void main(String[] args) {
        String text = "Фу! Это бяка необыкновенная! — сказала Оля сморщив курносый носик усыпанный веснушками и отодвинула тарелку с хлопьями от себя подальше.";
        String replacedWord = "бяка";
        String censorship = "[вырезано цензурой]";
        System.out.printf(replacementWord(text, replacedWord, censorship));
    }

    private static String replacementWord(String text, String replacedWord, String censorship) {
        return text.replaceAll(replacedWord, censorship);
    }
}
