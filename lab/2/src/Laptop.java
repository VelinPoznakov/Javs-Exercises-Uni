public class Laptop extends smartDevice {
    private int sizeRam;
    private int sizeDisk;

    public Laptop(double power, String processor, int sizeRam, int sizeDisk) {
        super(power, processor);
        setSizeRam(sizeRam);
        setSizeDisk(sizeDisk);
    }

    public void compare(Laptop laptop) {
        if(this.sizeRam > laptop.sizeRam && this.sizeDisk > laptop.sizeDisk) {
            System.out.println("the first is better");
        }
        else{
            System.out.println("the second is better");
        }
    }

    public void info(){
        System.out.println("Laptop with " + getProcessor() + " processor, "
        + getSizeRam() + " RAM, " + getSizeDisk() + " Disk, "
        + getPower() + " power.");
    }

    public void setSizeRam(int sizeRam) {
        this.sizeRam = sizeRam;
    }

    public int getSizeRam() {
        return sizeRam;
    }

    public void setSizeDisk(int sizeDisk) {
        this.sizeDisk = sizeDisk;
    }

    public int getSizeDisk() {
        return sizeDisk;
    }
}
