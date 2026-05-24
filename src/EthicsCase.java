/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345954069
 */
public class EthicsCase {
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;
    private static int caseCount = 0; //counts how many EthicsCase objects have been created
    
    /*
    Constructs a new EthicsCase object.
    
    @param caseTitle the title of the case
    @param description the description of the case
    @param category the category of the case
    */
    public EthicsCase(String caseTitle, String description, String category) {
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
        verdict = new Verdict();
        caseCount++;
    }
    
    /*
    Get the title of this case.
    
    @return caseTitle title of this case
    */
    public String getCaseTitle() {
        return caseTitle;
    }
    
    /*
    Get the description of this case.
    
    @return description description of this case
    */
    public String getCaseDescription() {
        return description;
    }
    
    /*
    Get the category of this case.
    
    @return category category of this case
    */
    public String getCategory() {
        return category;
    }
    
    
    /*
    Get the amount of cases in total
    
    @return the caseCount counted cases in total
    */
    
    public static int getCaseCount() {
        return caseCount;
    }
    
    /*
    Return a string representation of EthicsCase including caseTitle, description, category.
    
    @return a string representation of this case
    */
    public String toString() {
        return caseTitle + " is " + description + " of " + category;
    }
}
