package edu.georgiasouthern.cr04956.architecturelab9;

/**
 * Created by Cameron Rhodes on 4/18/2017.
 */

public enum AwardWinner {


    BERNERS_LEE ("Tim Berners-Lee", "MIT", 2016, true, "CITATION"),
    DIFFIE ("Whitfield Diffie", "SCHOOL", 2015, true, "CITATION"),
    HELLMAN ("Martin Hellman", "SCHOOL", 2015, true, "CITATION"),
    STONEBRAKER ("Michael Stonebraker", "SCHOOL", 2014, true, "CITATION"),
    LAMPORT ("NAME", "SCHOOL", 2013, true, "CITATION"),
    GOLDWASSER ("NAME", "SCHOOL", 2012, true, "CITATION"),
    MICALI ("NAME", "SCHOOL", 2012, true, "CITATION"),
    PEARL ("NAME", "SCHOOL", 2011, true, "CITATION"),
    VALIANT ("NAME", "SCHOOL", 2010, true, "CITATION"),
    THACKER ("NAME", "SCHOOL", 2009, true, "CITATION"),
    LISKOV ("NAME", "SCHOOL", 2008, true, "CITATION"),
    CLARKE ("NAME", "SCHOOL", 2007, true, "CITATION"),
    EMERSON ("NAME", "SCHOOL", 2007, true, "CITATION"),
    SIFAKIS ("NAME", "SCHOOL", 2007, true, "CITATION"),
    ALLEN ("NAME", "SCHOOL", 2006, true, "CITATION"),
    NAUR ("NAME", "SCHOOL", 2005, false, "CITATION"),
    CERF ("NAME", "SCHOOL", 2004, true, "CITATION"),
    KAHN ("NAME", "SCHOOL", 2004, true, "CITATION"),
    KAY ("NAME", "SCHOOL", 2003, true, "CITATION"),
    ADLEMAN ("NAME", "SCHOOL", 2002, true, "CITATION"),
    RIVEST ("NAME", "SCHOOL", 2002, true, "CITATION"),
    SHAMIR ("NAME", "SCHOOL", 2002, true, "CITATION"), //2002
    DAHL ("NAME", "SCHOOL", 2001, false, "CITATION"),
    NYGAARD ("NAME", "SCHOOL", 2001, false, "CITATION"),
    YAO ("NAME", "SCHOOL", 2000, true, "CITATION"),
    BROOKS ("NAME", "SCHOOL", 1999, true, "CITATION"),
    GRAY("NAME", "SCHOOL", 1998, false, "CITATION"),
    ENGELBART ("NAME", "SCHOOL", 1997, false, "CITATION"),
    PNUELI ("NAME", "SCHOOL", 1996, false, "CITATION"),
    BLUM ("NAME", "SCHOOL", 1995, true, "CITATION"),
    FEIGENBAUM ("NAME", "SCHOOL", 1994, true, "CITATION"),
    REDDY ("NAME", "SCHOOL", 1994, true, "CITATION"),
    HARTMANIS ("NAME", "SCHOOL", 1993, true, "CITATION"),
    STEARNS ("NAME", "SCHOOL", 1993, true, "CITATION"),
    LAMPSON ("NAME", "SCHOOL", 1992, true, "CITATION"),
    MILNER("NAME", "SCHOOL", 1991, false, "CITATION"),
    CORBATO ("NAME", "SCHOOL", 1990, true, "CITATION"),
    KAHAN ("NAME", "SCHOOL", 1989, true, "CITATION"),
    SUTHERLAND ("NAME", "SCHOOL", 1988, true, "CITATION"),
    COCKE ("NAME", "SCHOOL", 1987, false, "CITATION"),
    HOPCROFT ("NAME", "SCHOOL", 1986, true, "CITATION"),
    TARJAN ("NAME", "SCHOOL", 1986, true, "CITATION"),
    KARP ("NAME", "SCHOOL", 1985, true, "CITATION"),
    WIRTH ("NAME", "SCHOOL", 1984, true, "CITATION"),
    RITCHIE ("NAME", "SCHOOL", 1983, false, "CITATION"),
    THOMPSON ("NAME", "SCHOOL", 1983, true, "CITATION"),
    COOK ("NAME", "SCHOOL", 1982, true, "CITATION"),
    CODD ("NAME", "SCHOOL", 1981, false, "CITATION"),
    HOARE ("NAME", "SCHOOL", 1980, true, "CITATION"),
    IVERSON ("NAME", "SCHOOL", 1979, false, "CITATION"),
    FLOYD ("NAME", "SCHOOL", 1978, false, "CITATION"),
    BACKUS ("NAME", "SCHOOL", 1977, false, "CITATION"),
    RABIN ("NAME", "SCHOOL", 1976, true, "CITATION"),
    SCOTT ("NAME", "SCHOOL", 1976, true, "CITATION"),
    NEWELL ("NAME", "SCHOOL", 1975, false, "CITATION"),
    SIMON ("NAME", "SCHOOL", 1975, false, "CITATION"),
    KNUTH ("NAME", "SCHOOL", 1974, true, "CITATION"),
    BACHMAN ("NAME", "SCHOOL", 1973, true, "CITATION"),
    DIJKSTRA ("NAME", "SCHOOL", 1972, false, "CITATION"),
    MCCARTHY ("NAME", "SCHOOL", 1971, false, "CITATION"),
    WILKINSON ("NAME", "SCHOOL", 1970, false, "CITATION"),
    MINSKY("NAME", "SCHOOL", 1969, false, "CITATION"),
    HAMMING ("NAME", "SCHOOL", 1968, false, "CITATION"),
    WILKES ("NAME", "SCHOOL", 1967, false, "CITATION"),
    PERLIS ("NAME", "SCHOOL", 1966, false, "CITATION");


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
