import static java.lang.Boolean.TRUE;

/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {
    public int y =0;
    public int x =0;
    public int z =0;

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        for(int i=0; i<post.length(); i++) {

            if(post.charAt(i)=='#'){
                y=i;
                z=1;
            }
            if(post.charAt(i)==' '&& z==1){
                x=i;
                z=0;
                System.out.println(post.substring(y, x));
            }else if(z==1&&i==post.length()-1){
                System.out.println(post.substring(y));
            }

        }

    }

}
