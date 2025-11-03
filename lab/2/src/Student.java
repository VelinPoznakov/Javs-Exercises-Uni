public class Student extends People{
    public int number;
    public double gradePik;
    public double gradeTe;
    public double gradePpe;

    public Student(String name, String birth, int number, double gradePik, double gradeTe, double gradePpe) {
        super(name, birth);
        this.number = number;
        this.gradePik = gradePik;
        this.gradeTe = gradeTe;
        this.gradePpe = gradePpe;
    }

    public void newGrade(String subject, double grade) {
        switch (subject){
            case "PIK":
                this.gradePik = grade;
                break;
            case "TE":
                this.gradeTe = grade;
                break;
            case "PPE":
                this.gradePpe = grade;
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

}
