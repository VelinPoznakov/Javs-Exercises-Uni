public abstract class Patient {
    public String name;
    public String adress;
    public String EGN;

    public Patient(String name, String adress, String EGN) {
        this.name = name;
        this.adress = adress;
        this.EGN = EGN;
    }

    public abstract void cure(String medicals);
}
