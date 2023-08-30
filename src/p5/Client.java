package p5;

public class Client extends Person{

    private String bank;

    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }

    @Override
    public void info() {
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
