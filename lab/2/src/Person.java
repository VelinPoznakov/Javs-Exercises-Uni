public class Person {
    private String name;
    private String egn;

    public Person(String name, String egn) {
        setName(name);
        setEgn(egn);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setEgn(String egn) {
        this.egn = egn;
    }

    public String getEgn() {
        return egn;
    }
}
