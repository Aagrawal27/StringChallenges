import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * Problem: You are given a long string containing multiple hidden words.
 * Write a function that finds and prints
 * the word hidden between two markers ("*" and "~").
 * Identify the song hidden in the text!
 */


public class C2_HiddenWordHardMode {
    public int y =0;
    public int x =0;
    public int z =0;

    public static void main(String[] args) {
        C2_HiddenWordHardMode c = new C2_HiddenWordHardMode();
    }

    public C2_HiddenWordHardMode() {
        findHiddenLyrics("hidden_lyrics.txt");
    }

    public void findHiddenLyrics(String fileName) {

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for(int i=0; i<line.length(); i++) {
                    if(line.charAt(i)=='*'){
                        y=i;
                        z=1;
                    }
                    if(line.charAt(i)=='~'&& z==1){
                        x=i;
                        z=0;
                        System.out.println(line.substring(y, x));
                    }else if(z==1&&i==line.length()-1){
                        System.out.println(line.substring(y));
                    }

                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
