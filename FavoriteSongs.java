// FavoriteSongs.java
// Exercise 1: store 10 favorite songs and their artists in two parallel arrays,
// then output a list of songs and artists.
public class FavoriteSongs {
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

        System.out.println("Favorite Songs and Artists:");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
