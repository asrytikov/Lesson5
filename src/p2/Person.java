package p2;

public class Person {

    private String name;
    Account account;

    Person(String name, String password){
        this.name = name;
        account = new Account(password);
    }

    void info(){
        System.out.printf("Account login: %s \t Password: %s \n", name, account.password);
    }

    public class Account{
        private String password;

        Account(String password){
            this.password = password;
        }

        void info(){
            System.out.printf("Account login: %s \t Password: %s \n", Person.this.name, password);
        }
    }

}
