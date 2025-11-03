public class Teacher extends Person{
    private Course course;

    public Teacher(String name, String egn, Course course) {
        super(name, egn);
        setCourse(course);
    }

    private void setCourse(Course course) {
        this.course = course;
    }
    public Course getCourse() {
        return course;
    }
}
