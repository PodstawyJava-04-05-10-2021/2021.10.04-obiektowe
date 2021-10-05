public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Adres address;

    Client(String name1, String surname1, int age1, long pesel1, String street1, String postalCode1) {
        this(name1, surname1, age1, pesel1);
        this.address = new Adres(street1, postalCode1);
    }

    Client(String name, String surname, int age, long pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    Client() {

    }

    int add(int a, int b) {
        sayHello();
        int wynik;
        wynik = a + b;
        System.out.println(this.name);
        return wynik;
    }

    void sayHello() {
        System.out.println("Witam !!");
    }

    void sayHello(int a) {
        //System.out.println("Witam !!");
    }

    void sayHello(String a) {
        //System.out.println("Witam !!");
    }

    void sayHello(String a, int b) {
        //System.out.println("Witam !!");
    }
}
