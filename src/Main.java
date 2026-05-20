/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345954069
 */
public class Main {
    
    public static void main(String args[]) {
        PrivacyCase privacyCase = new PrivacyCase("Data Leak Case", "Company exposed user emails publicly", "Personal Data");
        privacyCase.verdict = new Verdict("Data Leak Case", "Unethical", "Personal Data"); 
        
        System.out.println(privacyCase);
    }
}
