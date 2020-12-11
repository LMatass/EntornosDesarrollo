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
        //Instalacion del programa 1
        c1.getOperatingSystem().Install(c1, s1);
        //Instalacion del programa 2
        c1.getOperatingSystem().Install(c1, s2);

        //Muestra software instalado
        System.out.println("El software instalado es: ");
        for (int i = 0; i < os1.getosSoftware().size();i++){
            System.out.println(os1.getosSoftware().get(i).getSoftwareName());
        }
        //Muestra espacio disponible
        System.out.println(c1.getHardDisk());

        //Desinstalar programa 1
        c1.getOperatingSystem().Unistall(c1, s1);

        //Desinstalar programa 2
        c1.getOperatingSystem().Unistall(c1,s2);
        System.out.println("El software instalado es: ");

        //Muestra software instalado
        for (int i = 0; i < os1.getosSoftware().size();i++){
            System.out.println(os1.getosSoftware().get(i).getSoftwareName());
        }

        //FOrmateo del ordenador 1
        c1.formateo();

        //Ver espacio libre
        System.out.println(c1.getHardDisk());
    }
}
