public class Multiproccessor {
    private int countProcessors;
    private int coresPerProcessor;
    private double ghz;

    public Multiproccessor(int countProcessors, int coresPerProcessor, double ghz) {
        setCountProcessors(countProcessors);
        setCoresPerProcessor(coresPerProcessor);
        setGhz(ghz);
    }

    public double processor(){
        if(((0.7 * this.coresPerProcessor) * (0.8 * this.countProcessors) * this.ghz) > 1){
            return (0.7 * this.coresPerProcessor) * (0.8 * this.countProcessors) * this.ghz;
        }
        else{
            return 1;
        }
    }

    public double time(double t){
        return t * this.processor();
    }

    public void info(){
        System.out.println("Processors: " + this.countProcessors
                + "Cores: " + this.coresPerProcessor
                + "Ghz: " + this.ghz);
    }

    public void setCountProcessors(int countProcessors) {
        this.countProcessors = countProcessors;
    }

    public int getCountProcessors() {
        return countProcessors;
    }

    public void setCoresPerProcessor(int coresPerProcessor) {
        this.coresPerProcessor = coresPerProcessor;
    }

    public int getCoresPerProcessor() {
        return coresPerProcessor;
    }

    public void setGhz(double ghz) {
        this.ghz = ghz;
    }

    public double getGhz() {
        return ghz;
    }
}
