package singleton;

/*
The singleton class must provide a global access point to get the instance of the class.A singleton should be used
when managing access to a resource which is shared by the entire application, and it would be destructive to potentially have
multiple instances of the same class.
In this Example, we are making singleton object of Prime Minister of any country .Because there will be only one Prime Minister
of the country. So we initialize it only one time and than we get Instance of it. The object Instance will not change.
however we can change the name of Prime Minister.
 */

public class driver {

    public static void main(String[] args) {
        singleton PrimeMinister = singleton.getInstance();
        PrimeMinister.setName("Imran Khan");
        System.out.println("Prime Minister = "+PrimeMinister.getName()+ "Object "+PrimeMinister);

        singleton PrimeMinister2 = singleton.getInstance();
        PrimeMinister2.setName("Nawaz Khan");
        System.out.println("Prime Minister = "+PrimeMinister.getName()+ "Object "+PrimeMinister);

    }



}
