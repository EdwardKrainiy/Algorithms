import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Караганда");
        words.add("Воронеж");
        words.add("Киев");
        words.add("Жданов");
        words.add("Жданов");
        words.add("Витебск");
        words.add("Архангельск");
        System.out.println(WordsFunction.getWords(words));
    }
}

