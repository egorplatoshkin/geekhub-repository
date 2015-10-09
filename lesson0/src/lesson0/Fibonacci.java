package lesson0;

/**
 * Created by USER on 07.10.2015.
 */
public class Fibonacci {
    public void buildSequence(int border){
        int firstNumb = 0, secondNumb = 1;
        if (border == 1) {
            System.out.print(firstNumb );
        } else {
            System.out.println(firstNumb + ", " + secondNumb);
        }
        int result = 0;
        for (int i = 2; i < border ; i++) {
            result = firstNumb + secondNumb;
            firstNumb = secondNumb;
            secondNumb = result;
            System.out.print(", " + result);
        }
        System.out.println();
    }
}
