/*
 * Phillip Viau
 * 02/19/2016
 * Parent class that is a base class for children classes
 */
package pti.edu;

/**
 *
 * @author phillipviau
 */
public abstract class SoundTrack { // abstract class for children classes
    // instanced varables
    protected String title, artist, language;
    
    // default constructor with passed variables
    public SoundTrack(String title, String artist, String language){
        this.artist = artist; // assigns passed variable to instance variable
        this.language = language;   // assigns passed variable to instance variable
        this.title = title; // assigns passed variable to instance variable
    }
    
    // abstract accessors called from children classes
    public abstract String getTitle();
    public abstract String getArtist();
    public abstract String getLanguage();
}
