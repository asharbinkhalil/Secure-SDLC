import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MusicLibraryDemo {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        User user = new User();

        // 1. User creates a music library and adds songs and playlists
        System.out.println("1) Adding songs to library");
        Playlist SongList = new Playlist("All Songs");
        SongList.addSong(new Song("Buhay Bariyaa"));
        SongList.addSong(new Song("Aafaree"));
        SongList.addSong(new Song("Dama dam mast kalandar"));
        musicLibrary.addPlaylist(SongList);

        Playlist PlayList1 = new Playlist("80's Pakistani");
        PlayList1.addSong(new Song("Aay jaa waan"));
        PlayList1.addSong(new Song("Qasam us waqt kee"));
        musicLibrary.addPlaylist(PlayList1);
        System.out.println();

        // 2. User selects "All Songs" to iterate through all songs
        System.out.println("2)");
        CustomIterator songIterator = musicLibrary.createSongIterator();
        user.iterateSongs(songIterator);
        System.out.println();

        // 3. User selects a specific playlist to iterate through its songs
        System.out.println("3)");
        CustomIterator playlistIterator = musicLibrary.createPlaylistIterator("80's Pakistani");
        user.iteratePlaylist(playlistIterator);
        System.out.println();

        // 4. Adding and removing songs
        System.out.println("4)");
        musicLibrary.addSong(new Song("Sitaron se aage jahan aur bhi hain"));
        musicLibrary.removeSong("Aafaree");
        songIterator = musicLibrary.createSongIterator();
        user.iterateSongs(songIterator);
        System.out.println();

        // 5. Playlist modification
        System.out.println("5)");
        PlayList1.addSong(new Song("Chandni raatien"));
        PlayList1.removeSong("Aay jaa waan");
        playlistIterator = musicLibrary.createPlaylistIterator("80's Pakistani");
        user.iteratePlaylist(playlistIterator);
        System.out.println();

        // 6. Playlist reordering
        System.out.println("6)");
        PlayList1.reorderSongs(0, 1);
        playlistIterator = musicLibrary.createPlaylistIterator("80's Pakistani");
        user.iteratePlaylist(playlistIterator);
        System.out.println();

        // 7. End of iteration
        System.out.println("7)");
        user.notifyEndOfIteration();
    }
}

class MusicLibrary {
    private Map<String, Playlist> playlists;

    public MusicLibrary() {
        playlists = new HashMap<>();
    }

    // functions to overlaod
    public void addSong(Song song) {}

    public void removeSong(String songName) {}
    // functions to overlaod

    public void addPlaylist(Playlist playlist) {
        playlists.put(playlist.getName(), playlist);
    }

    public CustomIterator createSongIterator() {
        List<Song> SongList = new ArrayList<>();
        for (Playlist playlist : playlists.values()) {
            SongList.addAll(playlist.getSongs());
        }
        return new SongIterator(SongList);
    }

    public CustomIterator createPlaylistIterator(String playlistName) {
        Playlist playlist = playlists.get(playlistName);
        if (playlist != null) {
            return playlist.createIterator();
        }
        return null;
    }
}

class Song {
    private String name;

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String songName) {
        songs.removeIf(song -> song.getName().equals(songName));
    }

    public void reorderSongs(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && fromIndex < songs.size() && toIndex >= 0 && toIndex < songs.size()) {
            Song songToMove = songs.remove(fromIndex);
            songs.add(toIndex, songToMove);
        }
    }

    public CustomIterator createIterator() {
        return new PlaylistIterator();
    }

    public List<Song> getSongs() {
        return songs;
    }

    private class PlaylistIterator implements CustomIterator {
        private int index;

        public boolean NextExists() {
            return index < songs.size();
        }

        public Object next() {
            if (NextExists()) {
                return songs.get(index++);
            }
            return null;
        }
    }
}

class SongIterator implements CustomIterator {
    private List<Song> songs;
    private int index;

    public SongIterator(List<Song> songs) {
        this.songs = songs;
        this.index = 0;
    }

    public boolean NextExists() {
        return index < songs.size();
    }

    public Object next() {
        if (NextExists()) {
            return songs.get(index++);
        }
        return null;
    }
}

class User {
    public void iterateSongs(CustomIterator Iterator) {
        while (Iterator.NextExists()) {
            Song song = (Song) Iterator.next();
            System.out.println("Playing song: " + song.getName());
        }
    }

    public void iteratePlaylist(CustomIterator Iterator) {
        while (Iterator.NextExists()) {
            Song song = (Song) Iterator.next();
            System.out.println("Playing song from playlist: " + song.getName());
        }
    }

    public void notifyEndOfIteration() {
        System.out.println("End of playlist or song list.");
    }
}

interface CustomIterator {
    boolean NextExists();

    Object next();
}
