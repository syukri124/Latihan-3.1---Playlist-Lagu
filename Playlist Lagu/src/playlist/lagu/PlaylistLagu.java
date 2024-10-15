package playlist.lagu;

class Song {
    String title;
    Song next;

    // Konstruktor
    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

public class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);

        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist kosong.");
            return;
        }

        Song current = head;
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

        myPlaylist.addSong("Song 1");
        myPlaylist.addSong("Song 2");
        myPlaylist.addSong("Song 3");

        System.out.println("Playlist:");
        myPlaylist.displayPlaylist();
    }
}

