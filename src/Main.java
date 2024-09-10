import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //1.1
        int[] firstMassive = new int[3];
        firstMassive[0] = 1;
        firstMassive[1] = 2;
        firstMassive[2] = 3;

        //1.2
        double[] secondMassive = {1.57, 7.654, 9.986};

        //1.3
        int [] tenOfFibonacci = {1, 1, 2, 3, 5, 8, 13, 21, 0, 0};
        tenOfFibonacci[8] = 34;
        tenOfFibonacci[9] = 55;

        //2
        int i = 0;
        for (; i < firstMassive.length; i++) {
            /*System.out.print(firstMassive[i]);*/
            if (i < firstMassive.length - 1){
                /*System.out.print(", ");*/
            }
        }
        /*System.out.println();*/
        i = 0;
        for (; i < secondMassive.length; i++) {
            /*System.out.print(secondMassive[i]);*/
            if (i < secondMassive.length - 1){
                /*System.out.print(", ");*/
            }
        }
        /*System.out.println();*/
        i = 0;
        for (; i < tenOfFibonacci.length; i++) {
            /*System.out.print(tenOfFibonacci[i]);*/
            if (i < tenOfFibonacci.length - 1){
                /*System.out.print(", ");*/
            }
        }
        /*System.out.println();*/

        //3
        i = firstMassive.length - 1;
        for (; i >= 0; i--) {
            /*System.out.print(firstMassive[i]);*/
            if (i > 0) {
                    /*System.out.print(", ");*/
            }
        }
        /*System.out.println();*/
        i = secondMassive.length - 1;
        for (; i >= 0; i--) {
            /*System.out.print(secondMassive[i]);*/
            if (i > 0) {
                /*System.out.print(", ");*/
            }
        }
        /*System.out.println();*/
        i = tenOfFibonacci.length - 1;
        for (; i >= 0; i--) {
            /*System.out.print(tenOfFibonacci[i]);*/
            if (i > 0) {
                /*System.out.print(", ")*/;
            }
        }
        /*System.out.println();*/

        //4
        i = 0;
        for (; i < firstMassive.length; i++) {
            if (firstMassive[i] % 2 != 0) {
                firstMassive[i] = firstMassive[i] + 1;
            }
        }
        System.out.println(Arrays.toString(firstMassive));
    }
}
