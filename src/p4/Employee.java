package p4;

public final class Employee extends Person{

    String company;


    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void info() {
        //super.info();
        System.out.println("Name: " + name);
        System.out.printf("Works in %s \n", company);
    }
}
