package com.vortex.vortex;

public class Game {
    private String name;
    private String directory;
    private String platform;
    private String icon; // Caminho para o ícone do jogo
    private long hoursPlayed;

    public Game(String name, String directory, String platform, String icon, long hoursPlayed) {
        this.name = name;
        this.directory = directory;
        this.platform = platform;
        this.icon = icon;
        this.hoursPlayed = 0;
    }



    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDirectory() {return directory;}

    public void setDirectory(String directory) {this.directory = directory;}

    public String getPlatform() {return platform;}

    public void setPlatform(String platform) {this.platform = platform;}

    public String getIcon() {return icon;}

    public void setIcon(String icon) {this.icon = icon;}

    public long getHoursPlayed() {return hoursPlayed;}

    public void setHoursPlayed(long hoursPlayed) {this.hoursPlayed += hoursPlayed;}
}
