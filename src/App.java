import gui.web.A;

public class App {
    public static void main(String[] args) {
        Client[] tab = new Client[5];

        Client c = new Client();

        tab[0] = c;

        System.out.println(tab[0]);

        c.name = "Mateusz";
        c.surname = "Bereda";
        c.age = 45;
        c.pesel = 35463465;

        Adres address = new Adres();
        address.street = "Ogrodowa";
        address.no = "6/4";
        address.postalCode = "31-313";
        address.city = "Kraków";

        c.address = address;

        Client c2 = new Client();
        c2.name = "Jan";
        c2.surname = "Kowalski";

        Client c3 = new Client();
        Client c4 = c3;

        c3.name = "Mateusz";

        System.out.println(c3.name);
        System.out.println(c4.name);

        c4.name = "Janusz";

        System.out.println(c3.name);
        System.out.println(c4.name);

        int i = 5;
        int b = 5;

        System.out.println(i == b);

        Client clinet1 = new Client();
        clinet1.name = new String("Mateusz");
        clinet1.surname = "Bereda";
        clinet1.age = 30;
        clinet1.pesel = 3634556;

        Client client2 = new Client();
        client2.name = new String("Mateusz");
        client2.surname = "Bereda";
        client2.age = 30;
        client2.pesel = 3634556;

        System.out.println(clinet1 == client2);

        System.out.println(clinet1.age == client2.age);

        System.out.println(client2.add(4,6));

        clinet1.sayHello("adsfg", 7);

        Client c5 = new Client("Jan", "Kowalski", 50, 345345, "Ogrodowa", "31-313");
        System.out.println(c5.name);
        System.out.println(c5.surname);
        System.out.println(c5.age);
        System.out.println(c5.pesel);

        int i2 = 0;


        A a = new A();
        gui.window.A a2 = new gui.window.A();


    }
}