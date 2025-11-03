public class Course {
    private String subject;

    public Course(String subject){
        setSubject(subject);
    }

    private void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return this.subject;
    }
}
