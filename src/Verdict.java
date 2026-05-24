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
    private static final String DEFAULT_TITLE = "Unknown";
    private static final String DEFAULT_VERDICT = "Pending";
    private static final String DEFAULT_REASON = "No reason provided";
    
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
    Sets the name of this verdict's case.
    
    @param title title of case
    */
    public void setCaseName(String title) {
        this.caseTitle = title;
    }
    
    /*
    Gets the name of this verdict's case.
    
    @return caseTitle title of case
    */
    public String getCaseTitle() {
        return caseTitle;
    }
    
    /*
    Sets the reason of this verdict.
    
    @param reason reason of the verdict
    */
    public void setReason (String reason) {
        this.reason = reason;
    }
    
    /*
    Gets the reason of this verdict.
    
    @return reason reason of the verdict
    */
    public String getReason(){
        return reason;
    }
    
    /*
    Sets the student's verdict of this verdict object.
    
    @param verdict student's verdict of the verdict
    */
    public void setStudentVerdict(String verdict){
        this.studentVerdict = verdict;
    }
    
    /*
    Gets the student's verdict of this verdict object.
    
    @return studentVerdict student's verdict of the verdict
    */
    public String getStudentVerdict() {
        return studentVerdict;
    }
}
