public class smartDevice {
    private double power;
    private String processor;
    public boolean isOn = false;

    public smartDevice(double power, String processor) {
        setPower(power);
        setProcessor(processor);
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void Status(){
        if(isOn){
            System.out.println("the device is on");
        }
        else{
            System.out.println("the device is off");
        }
    }
    public void powerOn(){
        isOn = true;
    }
    public void powerOff(){
        isOn = false;
    }
}
