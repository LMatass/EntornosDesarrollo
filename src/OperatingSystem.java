import java.util.ArrayList;
public class OperatingSystem {
    //Declaracion variables
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private Boolean osOnlyCommand;
    private double osSpaceRequirement;
    private double osRamMemmoryRequiriment;
    private ArrayList<Software> osSoftware = new ArrayList<Software>();
    public OperatingSystem(){

    }
    //COnstructor
    public OperatingSystem(String n, String v, String a, Boolean o, int s, int r) {
        this.osName = n;
        this.osVersion = v;
        this.osArchitecture = a;
        this.osOnlyCommand = o;
        this.osSpaceRequirement = s;
        this.osRamMemmoryRequiriment = r;

    }
    //Metodos
    //Getters y setters
    public String getOsName() {
        return osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public Boolean getOsOnlyCommand() {
        return osOnlyCommand;
    }

    public double getOsSpaceRequirement() {
        return osSpaceRequirement;
    }

    public double getOsRamMemmoryRequiriment() {
        return osRamMemmoryRequiriment;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public void setOsOnlyCommand(Boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public void setOsRamMemmoryRequiriment(int osRamMemmoryRequiriment) {
        this.osRamMemmoryRequiriment = osRamMemmoryRequiriment;
    }

    public ArrayList<Software> getosSoftware(){
        return osSoftware;
    }
    public void SoftwareInstallation (Software osSoftware){
        this.osSoftware.add(osSoftware);
    }
    public void SoftwareUninstallation (Software osSoftware){
        this.osSoftware.remove(osSoftware);
    }

}
