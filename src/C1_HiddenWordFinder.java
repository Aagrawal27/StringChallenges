/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {
    public int y =0;
    public int x =0;
    public int z =0;


    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }

    public C1_HiddenWordFinder() {
        String sentence = "This startisend a test startHelloend string.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {

        System.out.println(sentence.substring(sentence.indexOf("start")+5,sentence.indexOf("end")));

    }

}
