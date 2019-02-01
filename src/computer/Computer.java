package computer;

public class Computer {

    private String operatingSystem;
    private double processTact;
    private int memory;
    private int hardDrive;

    public Computer() {

        this.operatingSystem = "Windows";
        this.processTact = 3.3;
        this.memory = 16;
        this.hardDrive = 500;
    }

    public Computer(String operatingSystem, double processTact, int memory, int hardDrive) {
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    
    public void info(){
        System.out.println("Operating System: " + this.operatingSystem);
        System.out.println("Process tact: " + this.processTact);
        System.out.println("Memory: " + this.memory);
        System.out.println("Hard Drive: " + this.hardDrive);
    }
    
//    GET AND SET START

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getProcessTact() {
        return processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

//    GET AND SET END
    
}


