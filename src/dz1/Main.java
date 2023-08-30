package dz1;

public class Main {
    public static void main(String[] args) {
        /*
        Д/з Д/з Дан одномерный массив из 50 элементов. Массив заполнен числами от -50 до 50.
        Найти количество отрицательных элементов, количество положительных элементов, количество нулей.
        Найти сумму всех положительных элементов и отрицательных элементов отдельно.
        Найти среднее по массиву.
        Массив можно заполнить случайными числами без использования ручного ввода, подумайте + погуглите, как это сделать.
         */
        int[] array = new int[50];

        for (int i = 0; i< array.length; i++){
            array[i] = 50 - (int)(Math.random()*101);
            System.out.print(array[i] + " ");
        }
        int negativCount = 0;
        int positivCount = 0;
        int zeroCount = 0;
        int sumNegativ = 0;
        int sumPositiv = 0;
        int sum = 0;
        int count = 0;

        for (int el:array) {
            sum += el;

            if (el>0){
                positivCount++;
                sumPositiv += el;
            } else if (el<0) {
                negativCount++;
                sumNegativ += el;
            }else{
                zeroCount++;
            }
        }
        System.out.println();
        System.out.println("Count positiv:" + positivCount);
        System.out.println("Count negativ:" + negativCount);
        System.out.println("Count zero:" + zeroCount);
        System.out.println("Sum positiv:" + sumPositiv);
        System.out.println("Sum negativ:" + sumNegativ);
        System.out.println("Average: " + sum/ array.length);


    }
}