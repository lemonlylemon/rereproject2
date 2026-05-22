/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345954069
 */
public class PrivacyCase extends EthicsCase {
    private String dataType;
    
    /*
    Constructs a new PrivacyCase object, subclass of EthicsCase.
    
    @param caseTitle the title of the case
    @param description the description of the case
    @param dataType the type of data the case is about
    */
    public PrivacyCase(String caseTitle, String description, String dataType) {
        super(caseTitle, description, "Privacy Case");
        this.dataType = dataType;
    }
    
    /*
    Get the data type of this case.
    
    @return dataType data type of this case
    */
    public String getDataType() {
        return dataType;
    }
    
    /*
    Return a string representation of PrivacyCase including caseTitle, description, category, dataType.
    
    @return a string representation of this case
    */
    public String toString() {
        return super.getCaseTitle() + " is a " + dataType;
    }
}
