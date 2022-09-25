package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //algorithm1(10000);//O(n * log(n))
        //b) O(n^2)
        //c) O(n) algorithm3(10000);
        factorial(12);
        System.out.println(counter);
        //d) O(n)


    }


    public static void algorithm1(int n){
        //int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                arrayList.add(i * j);
            }
        }
    }

    public static void algorithm3(int n) {
        //int n = 10000;
        int counter = 0;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                arrayList.add(i * j);
                n--;
                counter++;
            }
        }
        System.out.println(counter);
    }




    public static int counter = 0;

    public static int factorial(int n) {


        counter++;
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

}
