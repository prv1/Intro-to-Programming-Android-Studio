/*
 * Phillip Viau
 * 02/19/2016
 * child class that inherits parent variable and implements DVD
 */
package pti.edu;

/**
 *
 * @author phillipviau
 */
public class DVDSoundTrack extends SoundTrack implements DVD { // child class that inherits parent and implements an interface
    
    // instanced variable
    protected String format;
    
    
    //default constructor
    public DVDSoundTrack(String title, String artist, String language, String format){
        super(title, artist, language); // passes variables to parent class
        this.format = format;   // assigns passed variable to instance variable
    }
    
    
    // accesor and returns String variable
    @Override
    public String getTitle(){
        return title; // returns title variable to accessor
    }
    
    // accesor and returns String variable
    @Override
    public String getArtist(){
        return artist;  // returns artist variable to accessor
    }
    
    // accesor and returns String variable
    @Override
    public String getLanguage(){
        return language;    // returns language variable to accessor
    }
    
    // accesor and returns integer variable from interface
    @Override
    public String getFormat(){
        return format;  // returns format variable to accessor
    }
}
