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
    
    public IntellectualPropertyCase(String caseTitle, String description, String ipType) {
        super(caseTitle, description, "Intellectual Property Case");
        this.ipType = ipType;
    }
    
    public String ipType(){
        return ipType;
    }
    
    public String toString() {
        return super.toString() + " " + ipType;
    } 
}
