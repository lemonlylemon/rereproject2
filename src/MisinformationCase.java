/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345954069
 */
public class MisinformationCase extends EthicsCase {
    private String mediaType;
    
    /*
    Constructs a new MisinformationCase object, subclass of EthicsCase.
    
    @param caseTitle the title of the case
    @param description the description of the case
    @param mediaType the type of media the case is about
    */
    public MisinformationCase(String caseTitle, String description, String mediaType){
        super(caseTitle, description, "Misinformation Case");
        this.mediaType = mediaType;
    }
    
    /*
    Get the media type of this case.
    
    @return mediaType media type of this case
    */
    public String getMediaType(){
        return mediaType;
    }
    
    /*
    Return a string representation of MisinformationCase including caseTitle, description, category, mediaType.
    
    @return a string representation of this case
    */
    @Override
    public String toString(){
        return super.toString() + " " + mediaType;
    }
    
}
