import org.jetbrains.annotations.NotNull;

public class Software {
    //Declaracion variables
    private String softwareName;
    private String softwareVersion;
    private double softwareSpaceRequiriment;
    private double softwareRamMemmoryRequiriment;

    //Constructor
    public Software(String n, String v, double s, double r){
        this.softwareName = n;
        this.softwareVersion = v;
        this.softwareSpaceRequiriment = s;
        this.softwareRamMemmoryRequiriment = r;
    }

    //Getters y Setters
    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public double getSoftwareSpaceRequiriment() {
        return softwareSpaceRequiriment;
    }

    public void setSoftwareSpaceRequiriment(int softwareSpaceRequiriment) {
        this.softwareSpaceRequiriment = softwareSpaceRequiriment;
    }

    public double getSoftwareRamMemmoryRequiriment() {
        return softwareRamMemmoryRequiriment;
    }

    public void setSoftwareRamMemmoryRequiriment(int softwareRamMemmoryRequiriment) {
        this.softwareRamMemmoryRequiriment = softwareRamMemmoryRequiriment;
    }

}
