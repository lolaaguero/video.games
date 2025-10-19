package service;

public class VideoGame {

    private int code;
    private String name;
    private String console;
    private int numPlayers;
    private String category;

    public VideoGame() {
    }

    public VideoGame(int code, String name, String console, int numPlayers, String category) {
        this.code = code;
        this.name = name;
        this.console = console;
        this.numPlayers = numPlayers;
        this.category = category;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getConsole() {
        return console;
    }
    public void setConsole(String console) {
        this.console = console;
    }
    public int getNumPlayers() {
        return numPlayers;
    }
    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "VideoGame [code=" + code + ", name=" + name + ", console=" + console + ", numPlayers=" + numPlayers
                + ", category=" + category + "]";
    }

}
