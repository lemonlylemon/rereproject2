/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345954069
 */
public class IntellectualPropertyCase extends EthicsCase{
    private String ipType;
    
    /*
    Constructs a new IntellectualPropertyCase object, subclass of EthicsCase.
    
    @param caseTitle the title of the case
    @param description the description of the case
    @param ipType the type of ip the case is about
    */
    public IntellectualPropertyCase(String caseTitle, String description, String ipType) {
        super(caseTitle, description, "Intellectual Property Case");
        this.ipType = ipType;
    }
    
    /*
    Get the ip type of this case.
    
    @return ipType ip type of this case
    */
    public String ipType(){
        return ipType;
    }
    
    /*
    Return a string representation of IntellectualPropertyCase including caseTitle, description, category, ipType.
    
    @return a string representation of this case
    */
    public String toString() {
        return super.toString() + " " + ipType;
    } 
}
