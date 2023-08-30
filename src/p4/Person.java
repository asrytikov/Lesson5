package p4;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void info(){
        System.out.println("Name: " + name);
    }
}
