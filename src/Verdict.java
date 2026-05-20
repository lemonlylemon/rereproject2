/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345954069
 */
public class Verdict {
    private String caseTitle;
    private String studentVerdict;
    private String reason;
    private String DEFAULT_TITLE;
    private String DEFAULT_VERDICT;
    private String DEFAULT_REASON;
    
    public Verdict(){
        this.caseTitle = DEFAULT_TITLE;
        this.studentVerdict = DEFAULT_VERDICT;
        this.reason = DEFAULT_REASON;
    }
    
    public Verdict(String caseTitle, String verdict, String reason) {
        this.caseTitle = caseTitle;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    /*
    
    */
    
    public void setCaseName(String title) {
        this.caseTitle = title;
    }
    
    public String getCaseTitle() {
        return caseTitle;
    }
    
    public void setReason (String reason) {
        this.reason = reason;
    }
    
    public String getReason(){
        return reason;
    }
    
    public void setStudentVerdict(String verdict){
        this.studentVerdict = verdict;
    }
    
    public String getStudentVerdict() {
        return studentVerdict;
    }
}
