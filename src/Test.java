public class Test {
    public static void main(String[] args) {

        //Objeto de ordenador llamado c1
        Computer c1 = new Computer("c1", 4 , 100);

        //Objeto de sistema operativo llamado os1
        OperatingSystem os1 = new OperatingSystem("s1", "10", "64", true, 20 , 2);

        //Objetos software
        Software s1 = new Software("s1", "1", 0.5 , 1);
        Software s2 = new Software("s2", "10", 0.2 , 0.6);
        //Instalacion sistema operativo
        c1.installOperatingSystem(os1);

        //Instalacion software 1
        install(c1, s1);

        //Instalacion software 2
        install(c1, s2);

        //Muestra por pantalla todo el software instalado
        System.out.println("El software instalado es: ");
        for (int i = 0; i < os1.getosSoftware().size();i++){
            System.out.println(os1.getosSoftware().get(i).getSoftwareName());
        }

        //Desinstalar programa 1
        unistall(c1, s1);

        //Desinstalar programa 2
        unistall(c1, s2);

        //FOrmateo del ordenador 1
        c1.formateo();
        System.out.println(c1.getHardDisk());

    }
        //Metodo installar
        private static void install(Computer computer, Software software) {
            if (computer.getHardDisk()>software.getSoftwareSpaceRequiriment()&&computer.getRamMemory()>software.getSoftwareRamMemmoryRequiriment()){
                computer.getOperatingSystem().SoftwareInstallation(software);
                computer.setHardDisk(computer.getHardDisk()-software.getSoftwareSpaceRequiriment());
                computer.setRamMemory(computer.getRamMemory()-software.getSoftwareRamMemmoryRequiriment());
        }
            else{
                System.out.println("Error no hay espacio o memoria RAM suficiente, programa no instalado");
        }
    }
        //Metodo desinstalar
        private static void unistall(Computer computer, Software software){
            computer.getOperatingSystem().SoftwareUninstallation(software);
            computer.setHardDisk(computer.getHardDisk() + software.getSoftwareSpaceRequiriment());
            computer.setRamMemory(computer.getRamMemory() + software.getSoftwareSpaceRequiriment());
        }
}
