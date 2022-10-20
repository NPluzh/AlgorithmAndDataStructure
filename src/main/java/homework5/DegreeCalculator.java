package homework5;

public class DegreeCalculator {
    public static int degree (int num, int pow){
        if (pow == 0){
            return 1;
        }
        return num * degree(num, pow - 1);
    }
}
