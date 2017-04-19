package edu.georgiasouthern.cr04956.architecturelab9;

/**
 * Created by Cameron Rhodes on 4/18/2017.
 */

public enum AwardWinner {


    BERNERS_LEE ("Tim Berners-Lee", "The Queen's College, Oxford", 2016, true, "CITATION"),
    DIFFIE ("Whitfield Diffie", "MIT", 2015, true, "CITATION"),
    HELLMAN ("Martin Hellman", "Stanford", 2015, true, "CITATION"),
    STONEBRAKER ("Michael Stonebraker", "Princeton", 2014, true, "CITATION"),
    LAMPORT ("Leslie Lamport", "Brandeis", 2013, true, "CITATION"),
    GOLDWASSER ("Shafi Goldwasser", "UC Berkeley", 2012, true, "CITATION"),
    MICALI ("Silvio Micali", "UC Berkeley", 2012, true, "CITATION"),
    PEARL ("Judea Pearl", "New York University Tandon School of Engineering", 2011, true, "CITATION"),
    VALIANT ("Leslie Valiant", "University of Warwick", 2010, true, "CITATION"),
    THACKER ("Charles P. Thacker", "UC Berkeley", 2009, true, "CITATION"),
    LISKOV ("Barbara Liskov", "Stanford", 2008, true, "CITATION"),
    CLARKE ("Edmund M. Clarke", "Cornell", 2007, true, "CITATION"),
    EMERSON ("Ernest Allen Emerson", "Harvard", 2007, true, "CITATION"),
    SIFAKIS ("Joseph Sifakis", "University of Grenoble", 2007, true, "CITATION"),
    ALLEN ("Frances Elizabeth Allen", "University of Michigan", 2006, true, "CITATION"),
    NAUR ("Peter Naur", "Copenhagen University", 2005, false, "CITATION"),
    CERF ("Vinton Cerf", "UCLA", 2004, true, "CITATION"),
    KAHN ("Robert Kahn", "Princeton", 2004, true, "CITATION"),
    KAY ("Alan Kay", "University of Utah", 2003, true, "CITATION"),
    ADLEMAN ("Leonard Adleman", "UC Berkeley", 2002, true, "CITATION"),
    RIVEST ("Ronald Rivest", "Yale", 2002, true, "CITATION"),
    SHAMIR ("Adi Shamir", "Weizmann Institute of Science", 2002, true, "CITATION"), //2002
    DAHL ("Ole-Johan Dahl", "University of Oslo", 2001, false, "CITATION"),
    NYGAARD ("Kristen Nygaard", "University of Oslo", 2001, false, "CITATION"),
    YAO ("Andrew Yao", "University of Illinois at Urbana-Champaign", 2000, true, "CITATION"),
    BROOKS ("Frederick Brooks", "Harvard", 1999, true, "CITATION"),
    GRAY("Jim Gray", "UC Berkeley", 1998, false, "CITATION"),
    ENGELBART ("Douglas Engelbart", "UC Berkeley", 1997, false, "CITATION"),
    PNUELI ("Amir Pnueli", "Weizmann Institute of Science", 1996, false, "CITATION"),
    BLUM ("Manuel Blum", "MIT", 1995, true, "CITATION"),
    FEIGENBAUM ("Edward Feigenbaum", "Carnegie Mellon", 1994, true, "CITATION"),
    REDDY ("Dabbala Rajagopal \"Raj\" Reddy", "Stanford", 1994, true, "CITATION"),
    HARTMANIS ("Juris Hartmanis", "Caltech", 1993, true, "CITATION"),
    STEARNS ("Richard Stearns", "Princeton", 1993, true, "CITATION"),
    LAMPSON ("Butler Lampson", "UC Berkeley", 1992, true, "CITATION"),
    MILNER("Robin Milner", "King's College", 1991, false, "CITATION"),
    CORBATO ("Fernando Corbató", "MIT", 1990, true, "CITATION"),
    KAHAN ("William Kahan", "University of Toronto", 1989, true, "CITATION"),
    SUTHERLAND ("Ivan Sutherland", "MIT", 1988, true, "CITATION"),
    COCKE ("John Cocke", "Duke University", 1987, false, "CITATION"),
    HOPCROFT ("John Hopcroft", "Stanford", 1986, true, "CITATION"),
    TARJAN ("Robert Tarjan", "Stanford", 1986, true, "CITATION"),
    KARP ("Richard Karp", "Harvard", 1985, true, "CITATION"),
    WIRTH ("Niklaus Wirth", "UC Berkeley", 1984, true, "CITATION"),
    RITCHIE ("Dennis Ritchie", "Harvard", 1983, false, "CITATION"),
    THOMPSON ("Ken Thompson", "UC Berkeley", 1983, true, "CITATION"),
    COOK ("Stephen Cook", "Harvard", 1982, true, "CITATION"),
    CODD ("Edgar Codd", "University of Michigan", 1981, false, "CITATION"),
    HOARE ("Tony Hoare", "Moscow State University", 1980, true, "CITATION"),
    IVERSON ("Kenneth Iverson", "Harvard", 1979, false, "CITATION"),
    FLOYD ("Robert Floyd", "University of Chicago", 1978, false, "CITATION"),
    BACKUS ("John Backus", "Columbia University", 1977, false, "CITATION"),
    RABIN ("Michael Rabin", "Princeton", 1976, true, "CITATION"),
    SCOTT ("Dana Scott", "Princeton", 1976, true, "CITATION"),
    NEWELL ("Allen Newell", "Carnegie Mellon", 1975, false, "CITATION"),
    SIMON ("Herbert Simon", "University of Chicago", 1975, false, "CITATION"),
    KNUTH ("Donald Knuth", "Caltech", 1974, true, "CITATION"),
    BACHMAN ("Charles Bachman", "University of Pennsylvania", 1973, true, "CITATION"),
    DIJKSTRA ("Edsger Dijkstra", "University of Amsterdam", 1972, false, "CITATION"),
    MCCARTHY ("John McCarthy", "Princeton", 1971, false, "CITATION"),
    WILKINSON ("Jim Wilkinson", "Trinity College", 1970, false, "CITATION"),
    MINSKY("Marvin Minsky", "Princeton", 1969, false, "CITATION"),
    HAMMING ("Richard Hamming", "University of Illinois at Urbana-Champaign", 1968, false, "CITATION"),
    WILKES ("Maurice Wilkes", "University of Cambridge", 1967, false, "CITATION"),
    PERLIS ("Alan Perlis", "MIT", 1966, false, "CITATION");


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
