import java.util.ArrayList;
import java.util.stream.Collectors;

public class WordsFunction {
    public static ArrayList<String> getWords(ArrayList<String> startWords) {
        int wordsSize;
        char lastLetter;
        char firstLetterOfFirstWord;
        int j = 1;

        ArrayList<String> words = new ArrayList<>();
        words.addAll(startWords.stream().distinct().collect(Collectors.toList()));
        wordsSize = words.size();

        ArrayList<String> resultWords = new ArrayList<>();
        resultWords.add(words.get(0));

        firstLetterOfFirstWord = words.get(0).toLowerCase().charAt(0);

        ArrayList<String> constantWords = new ArrayList<>();
        constantWords.addAll(words);

        while(resultWords.size() < wordsSize && j < wordsSize && firstLetterOfFirstWord != resultWords.get(resultWords.size() - 1).toLowerCase().charAt(resultWords.get(resultWords.size() - 1).length() - 1)){
            resultWords.clear();
            words.clear();

            words.addAll(constantWords);
            resultWords.add(words.get(j));

            firstLetterOfFirstWord = resultWords.get(0).toLowerCase().charAt(0);

            lastLetter = resultWords.get(0).toLowerCase().charAt(resultWords.get(0).length() - 1);
            words.remove(j);

            int i = 0;
            for(; i < words.size(); ){
                if(lastLetter == words.get(i).toLowerCase().charAt(0)){
                    resultWords.add(words.get(i));
                    lastLetter = words.get(i).toLowerCase().charAt(words.get(i).length() - 1);
                    words.remove(i);
                    i = 0;
                }
                else i++;
            }
            j++;
        }
        if(resultWords.size() < wordsSize){
            System.out.println("This words cannot be placed in the sequence we need.");
            resultWords.clear();
        }
        return resultWords;
    }
}
