import java.util.ArrayList;

public class WordsFunction {
    public static ArrayList<String> getWords(ArrayList<String> words, int wordsSize) {
        char lastLetter;
        ArrayList<String> resultWords = new ArrayList<>();
        ArrayList<String> constantWords = new ArrayList<>();
        constantWords.addAll(words);
        int j = 0;
        while(resultWords.size() < wordsSize && j < wordsSize){
            resultWords.clear();
            words.clear();
            words.addAll(constantWords);
            resultWords.add(words.get(j));
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
