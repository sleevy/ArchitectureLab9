package edu.georgiasouthern.cr04956.architecturelab9;

/**
 * Created by Cameron Rhodes on 4/18/2017.
 */

public enum AwardWinner {


    BERNERS_LEE ("Tim Berners-Lee", "MIT", 2016, true, "");


    private final String name;
    private final String school;
    private final int year;
    private final boolean alive;
    private final String citation;

    AwardWinner(String name, String school, int year, boolean alive, String citation) {
        this.name = name;
        this.school = school;
        this.year = year;
        this.alive = alive;
        this.citation = citation;
    }

    String getName() {return name;}
    String getSchool() {return school;}
    int getYear() {return year;}
    boolean isAlive() {return alive;}
    String getCitation() {return citation;}
}
