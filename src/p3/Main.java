package p3;

public class Main {

    public static void main(String[] args) {
        Math.Factorial factorial = Math.getFactorial(5);
        System.out.printf("Factorial number %d = %d \n", factorial.getKey(), factorial.getResult());
    }

}
