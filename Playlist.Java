import java.util.ArrayList; 
import java.util.Arrays;


public class Playlist {

    public static void main(String[] args) {
//Creating Array of songs
        String[] favoriteSongs = {"Queen - Bohemian Rhapsody", "Ex Factor - The Fugees", "Aint no sunshine - Bill Withers",
         "Uptown Funk - Bruno Mars", "Blinding Lights - The Weeknd"};

            System.out.println(favoriteSongs[0]);
            System.out.println(favoriteSongs[1]);
            System.out.println(favoriteSongs[2]);

//Creating ArrayList of songs
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

            desertIslandPlaylist.add("Island in the Sun - Weezer");
            desertIslandPlaylist.add("Somewhere over the rainbow");
            desertIslandPlaylist.add("Margaritaville");
            desertIslandPlaylist.add("Hawaii");

            System.out.println(desertIslandPlaylist);
//Adding all the songs from favoriteSongs to the desertIslandPlaylist

favoriteSongs.addAll(Arrays.asList(desertIslandPlaylist)); 

        
    }

    }
