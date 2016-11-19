/*
 * Phillip Viau
 * 02/19/2016
 * child class that inherits parent variable and implements Etune
 */
package pti.edu;

/**
 *
 * @author phillipviau
 */
public class EtuneSoundTrack extends SoundTrack implements Etune {  // child class that inherits parent and implements an interface
    // instanced variable
    protected int encryption;
    
    // default constructor
    public EtuneSoundTrack(String title, String artist, String language, int encryption){
        super(title, artist, language); // passes variables to parent class
        this.encryption = encryption;   // assigns passed variable to instance variable
    }
    
    // accesor and returns String variable
    @Override
    public String getTitle(){
        return title;   // returns title variable to accessor
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
    public int getEncryption(){
        return encryption;  // returns encryption variable to accessor
    }
}
