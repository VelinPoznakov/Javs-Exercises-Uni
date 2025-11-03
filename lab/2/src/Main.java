public class Main {
    public static void main(String[] args) {
        //1
        Course c1 = new Course("math");
        Teacher t1 = new Teacher("john", "12121212", c1);
        System.out.println(t1.getCourse().getSubject());

        //2
        Student s1 = new Student("john", "25.03.2002",
                121224242, 2.50, 3.50, 4.50);
        s1.newGrade("PIK", 6.00);

        //3
        Laptop l1 = new Laptop(200.00, "Intel I9", 32, 1000);
        Laptop l2 = new Laptop(300.00, "Intel I7", 16, 500);
        l1.compare(l2);
        l2.info();

        //4
        Multiproccessor p1 = new Multiproccessor(20, 10, 4.2);
        p1.processor();
        p1.time(60);
        p1.info();
    }
}