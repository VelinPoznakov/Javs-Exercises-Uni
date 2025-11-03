public class SickPatient extends Patient {
    public String EPK;
    public boolean isSick = false;
    public String dayOfSickness;

    public SickPatient(String name, String adress, String EGN,
                       String EPK, String dayOfSickness) {
        super(name, adress, EGN);
        this.EPK = EPK;
        this.dayOfSickness = dayOfSickness;
    }
    public void sick(){
        this.isSick = true;
    }


    @Override
    public void cure(String medicals) {
        // format ( 1 - name )
        this.EPK += (medicals + " is taken");
    }
}
