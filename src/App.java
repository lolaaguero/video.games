import java.util.ArrayList;
import java.util.List;

import service.VideoGame;

public class App {

    public static void main(String[] args) throws Exception {

        List<VideoGame> videoGamesList = new ArrayList<VideoGame>();

        VideoGame vg1 = new VideoGame(1, "Banjo Kazooie", "Nintendo 64", 4, "Platform");
        VideoGame vg2 = new VideoGame(2, "Mario Party 3", "Nintendo 64", 4, "Platform");
        VideoGame vg3 = new VideoGame(3, "Age of Empires", "PC", 1, "Strategy");
        VideoGame vg4 = new VideoGame(4, "Counter Strike", "PC", 1, "Shooter");
        VideoGame vg5 = new VideoGame(5, "GTA", "PC", 1, "Shooter");

        videoGamesList.add(vg1);
        videoGamesList.add(vg2);
        videoGamesList.add(vg3);
        videoGamesList.add(vg4);
        videoGamesList.add(vg5);

        for (VideoGame videoGame : videoGamesList) {
            System.out.println("Name: " + videoGame.getName() + " / " + 
                "Console: " + videoGame.getConsole() + " / " + 
                "Number of Players: " + videoGame.getNumPlayers());
        }

        vg1.setName("Banjo Kazooie 2");
        vg1.setNumPlayers(1);

        vg5.setName(" Grand Theft Auto: Vice City Stories");
        vg5.setNumPlayers(4);

        System.out.println("---------------");
        System.out.println("Nintendo 64 Video Games:");
        for (VideoGame videoGame : videoGamesList) {
            if (videoGame.getConsole().equals("Nintendo 64")) {
                System.out.println(videoGame.toString());
            }
        }

    }

}
