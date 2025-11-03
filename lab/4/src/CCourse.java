import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class CCourse {
    public List<CStudent> students;
    private String courseName;

    public CCourse(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String addGrade(int fn, int grade){
        for(CStudent student: students){
            if(fn == student.fn){
                student.addScore(grade);
                return "Student added";
            }
        }
        throw new StudentNotFound("Student not found");
    }

    public String addScores(int fn, int[] grades){
        for(CStudent student: students){
            if(fn == student.fn){
                for(int grade: grades){
                    student.addScore(grade);
                }
                return "Grades added.";
            }
        }
        throw new StudentNotFound("Student not found");
    }

    public String displayScores(){
        String res = "";

        for(CStudent student: students){
            res += (student.name + ":" + "\n");
            for(int grade: student.scores){
                res += (grade + ", ");
            }
            res += "\n";
            res += ("grade's score: " + student.getGrade());

        }
        return res;
    }

    public void addStudent(String name, int fn){
        this.students.add(new CStudent(name, fn));
    }

    public String getName(){
        return this.courseName;
    }
}
