
public class WordResult extends WordSet {

    public static void main(String[] args) {

        WordSet wordSet = new WordSet();

        System.out.println(wordSet.addWord("Any Word"));

        System.out.println(wordSet.numberOfWords());

        System.out.println(wordSet.search("Hello"));

        System.out.println(wordSet.search("Any Word"));


    }
}