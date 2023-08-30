package p1;

public class Main {

    public static void main(String[] args) {
        Person katya = new Person("Katya");
        System.out.println(katya.getName());
        changePerson(katya);
        System.out.println(katya.getName());
    }

    static void changePerson(Person person){
        person = new Person("Ivan");
        person.setName("Nickolay");
    }

    static void changeName(Person person){
        person.setName("Ivan");
    }
}
