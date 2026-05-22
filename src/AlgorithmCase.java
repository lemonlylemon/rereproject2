/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345954069
 */
public class AlgorithmCase extends EthicsCase{
    private String biasType;
    
    /*
    Constructs a new AlgorithmCase object, subclass of EthicsCase.
    
    @param caseTitle the title of the case
    @param description the description of the case
    @param biasType the type of bias the case is about
    */
    public AlgorithmCase(String caseTitle, String description, String biasType) {
        super(caseTitle, description, "Misinformation Case");
        this.biasType = biasType;
    }
    
    /*
    Get the bias type of this case.
    
    @return biasType bias type of this case
    */
    public String getBiasType() {
        return biasType;
    }
    
    /*
    Return a string representation of AlgorithmCase including caseTitle, description, category, biasType.
    
    @return a string representation of this case
    */
    public String toString() {
        return super.getCaseTitle() + " is a " + biasType;
    }
}
