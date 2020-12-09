public class Computer {
    //Declaracion de variables
    private String name;
    private int ramMemory;
    private int hardDisk;
    private  OperatingSystem operatingSystem;

    //Constructor
    public Computer (String n, int r, int h){
        this.name = n;
        this.ramMemory = r;
        this.hardDisk = h;
        this.operatingSystem = null;
    }

    //metodos
    public void installOperatingSystem(OperatingSystem s){
        if (this.hardDisk > s.getOsSpaceRequirement() && this.ramMemory > s.getOsRamMemmoryRequiriment()){
            this.setOperatingSystem(s);
            this.setHardDisk(this.hardDisk - s.getOsSpaceRequirement());
            this.setRamMemory(this.ramMemory - s.getOsRamMemmoryRequiriment());
        } else {
            System.out.println("No hay espacio");
        }

    }

    //Getters y setters
    public int getHardDisk() {
        return this.hardDisk;
    }

    public int getRamMemory() {
        return this.ramMemory;
    }

    public String getName() {
        return this.name;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setRamMemory(int ramMemory) {
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

}
