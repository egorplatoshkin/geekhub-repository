package lesson0;

/**
 * Created by USER on 07.10.2015.
 */
public class Factorial {
    public int count(int number){
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result *= i;
        }
        return result;
    }
}
