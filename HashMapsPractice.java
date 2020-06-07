import java.util.HashMap;
import java.util.Set;
public class HashMapsPractice {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("something to prove", "Sum 2 Prove by Lil Baby");
        tracklist.put("poke my chest out", "I Don't stress by Nippsey Hussle");
        tracklist.put("what would you do for love", "Do For Love by 2pac");
        tracklist.put("whose world is this", "The World Is Yours by Nas");
        String selectedSong = tracklist.get("what would you do for love");
        System.out.println(selectedSong);

        Set<String> Lyrics = tracklist.keySet();
        for(String Track: Lyrics) {
            System.out.println(Track);
            // the above prints lyrics
            System.out.println(tracklist.get(Track));
            // the above prints the song name and the artist it is by;
        }
    }
}