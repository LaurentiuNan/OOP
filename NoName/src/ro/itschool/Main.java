package ro.itschool;

public class Main {

    public static void main(String[] args) {
        House casaMea = new House("Gabi's House");
        casaMea.color = "Verde";
        casaMea.numberOfDoors = 10;

        System.out.println("Metrii patrati " + casaMea.meters);

        House casaVecinului = new House("Gheorghe's house");
        casaVecinului.color = "Albastru";
        casaVecinului.numberOfDoors = 12;

        User gabriel = new User("Ionescu","Gabrie",28);

    }
}
