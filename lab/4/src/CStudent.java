import java.util.ArrayList;
import java.util.List;

public class CStudent {
    protected String name;
    protected List<Integer> scores;
    protected int fn;

    public CStudent(String name, int fn) {
        this.name = name;
        this.scores = new ArrayList<>();
        this.fn = fn;
    }

    public double getGrade(){
        int sum = 0;
        int counter = 0;

        for(int grade : scores){
            sum += grade;
            counter++;
        }
        return (double)sum/counter;
    }

    public void addScore(int score){
        scores.add(score);
        System.out.println("Score added.");
    }
}
