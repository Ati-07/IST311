import java.util.List;

public class Album implements Comparable<Album> {
    private int id;
    private List<String> artists;
    private String title;
    private int numSongs;

    /**
     * Constructs an Album object with the specified parameters.
     *
     * @param id       the ID of the album
     * @param artists  the list of artists associated with the album
     * @param title    the title of the album
     * @param numSongs the number of songs in the album
     */
    public Album(int id, List<String> artists, String title, int numSongs) {
        this.id = id;
        this.artists = artists;
        this.title = title;
        this.numSongs = numSongs;
    }

    public int getId() {
        return id;
    }

    /**
     * Returns the list of artists associated with the album.
     *
     * @return the list of artists associated with the album
     */
    public List<String> getArtists() {
        return artists;
    }
    public String getTitle() {
        return title;
    }
    public int getNumSongs() {
        return numSongs;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + " -- " + artists.toString();
    }

    @Override
    public int compareTo(Album other)
    {
        return Integer.compare(numSongs, other.numSongs);
    }


}
