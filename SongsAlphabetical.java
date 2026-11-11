// SongsAlphabetical.java
// Exercise 2: same two arrays as Exercise 1, but output the songs in
// alphabetical order using bubble sort. The artist array is swapped in
// parallel so each song stays paired with its artist.
public class SongsAlphabetical {
    public static void main(String[] args) {
        String[] songs = {
            "Shape of You", "Blinding Lights", "Someone Like You", "Hallelujah",
            "Perfect", "Billie Jean", "Bohemian Rhapsody", "Imagine",
            "Hotel California", "Hey Jude"
        };
        String[] artists = {
            "Ed Sheeran", "The Weeknd", "Adele", "Jeff Buckley",
            "Ed Sheeran", "Michael Jackson", "Queen", "John Lennon",
            "Eagles", "The Beatles"
        };

        // Bubble sort the songs alphabetically (case-insensitive)
        int n = songs.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (songs[j].compareToIgnoreCase(songs[j + 1]) > 0) {
                    // swap songs
                    String tempSong = songs[j];
                    songs[j] = songs[j + 1];
                    songs[j + 1] = tempSong;
                    // swap the matching artists in parallel
                    String tempArtist = artists[j];
                    artists[j] = artists[j + 1];
                    artists[j + 1] = tempArtist;
                }
            }
        }

        System.out.println("Songs in alphabetical order:");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
