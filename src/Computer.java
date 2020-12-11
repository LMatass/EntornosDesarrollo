public class Computer {
    //Declaracion de variables
    private String name;
    private double ramMemory;
    private double hardDisk;
    private  OperatingSystem operatingSystem;

    //Constructor
    public Computer (String n, int r, int h){
        this.name = n;
        this.ramMemory = r;
        this.hardDisk = h;
        this.operatingSystem = null;
    }

    //metodo instalar sistema operativo
    public void installOperatingSystem(OperatingSystem s){
        if (this.hardDisk > s.getOsSpaceRequirement() && this.ramMemory > s.getOsRamMemmoryRequiriment()){
            this.setOperatingSystem(s);
            this.setHardDisk(this.hardDisk - s.getOsSpaceRequirement());
            this.setRamMemory(this.ramMemory - s.getOsRamMemmoryRequiriment());
        } else {
            System.out.println("No hay espacio suficiente para instalar el sistema operativo");
        }
    }

    //Getters y setters
    public double getHardDisk() {
        return this.hardDisk;
    }

    public double getRamMemory() {
        return this.ramMemory;
    }

    public String getName() {
        return this.name;
    }

    public void setHardDisk(double hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setRamMemory(double ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void formateo(){
        this.hardDisk = hardDisk + operatingSystem.getOsSpaceRequirement();
        this.operatingSystem = operatingSystem;
        this.ramMemory = ramMemory + operatingSystem.getOsRamMemmoryRequiriment();
    }
}
