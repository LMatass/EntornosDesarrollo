public class Test {
    public static void main(String[] args) {
        //Objeto de ordenador llamado c1
        Computer c1 = new Computer("c1", 100 , 4);
        //Objeto de sistema operativo llamado os1
        OperatingSystem os1 = new OperatingSystem("s1", "10", "64", true, 20 , 2);
        //Objetos software
        Software s1 = new Software("s1", "1", 0.5 , 1);
        Software s2 = new Software("s2", "10", 0.2 , 0.6);

        c1.installOperatingSystem(os1);
        System.out.println(c1.getOperatingSystem().getOsName());

    }
}
