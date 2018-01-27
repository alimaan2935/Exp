import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;

public class WordSet {

    private static int MAX_WORDS = 50;
    private String[] words;
    private int size;

    public WordSet() {
        words = new String[MAX_WORDS];
        size = 0;
    }

    public String addWord(String word) {

        if (size < 51) {
            words[size] = word;
            size++;

            return "The word - " +word+ " - has been added";
        }else {
            return "List is full";
        }
    }

    public int numberOfWords() {
        return size;
    }

    public boolean search(String valueToSearch) {
        if (Arrays.asList(words).contains(valueToSearch)) {
            return true;
        }else {
            return false;
        }
    }

}

