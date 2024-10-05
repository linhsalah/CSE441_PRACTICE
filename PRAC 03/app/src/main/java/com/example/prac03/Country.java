package com.example.prac03;

public class Country {
    private String name;
    private String capital;
    private long population;
    private String area;
    private String density;
    private String worldShare;
    private int flagResource;

    public Country(String name, String capital, long population, String area, String density, String worldShare, int flagResource) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.density = density;
        this.worldShare = worldShare;
        this.flagResource = flagResource;
    }

    public String getName() { return name; }
    public String getCapital() { return capital; }
    public long getPopulation() { return population; }
    public String getArea() { return area; }
    public String getDensity() { return density; }
    public String getWorldShare() { return worldShare; }
    public int getFlagResource(){return flagResource;}
}