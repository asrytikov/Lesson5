package p5;

public class Employee extends Person{

    private String bank;

    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }

    @Override
    public void info() {
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
