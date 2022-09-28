package homework3;

public class Main {
    public static void main(String[] args) {
        testTask1();
        testTask2();
    }

    private static void testTask1() {
        int[] exercise1 = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};//11
        int[] exercise2 = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10,11,  13, 14, 15, 16};///12
        int[] exercise3 = {1, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 15, 16};//2
        int[] exercise4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 16};//15
        int[] exercise5 = {2, 3, 4, 5, 6, 7, 8};//1
        int[] exercise6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};//15
        int[] exercise7 = {};//1
/*
        System.out.println(whatsMissing(exercise1));
        System.out.println(whatsMissing(exercise2));
        System.out.println(whatsMissing(exercise3));
        System.out.println(whatsMissing(exercise4));
        System.out.println(whatsMissing(exercise5));
        System.out.println(whatsMissing(exercise6));
        System.out.println(whatsMissing(exercise7));

        System.out.println(whatsMissing2(exercise1));
        System.out.println(whatsMissing2(exercise2));
        System.out.println(whatsMissing2(exercise3));
        System.out.println(whatsMissing2(exercise4));
        System.out.println(whatsMissing2(exercise5));
        System.out.println(whatsMissing2(exercise6));
        System.out.println(whatsMissing2(exercise7));
*/

        System.out.println(binaryFindMissing(exercise1));
        System.out.println(binaryFindMissing(exercise2));
        System.out.println(binaryFindMissing(exercise3));
        System.out.println(binaryFindMissing(exercise4));
        System.out.println(binaryFindMissing(exercise5));
        System.out.println(binaryFindMissing(exercise6));
        System.out.println(binaryFindMissing(exercise7));


    }

    public static int whatsMissing(int[] arr) {
        // известно, что массив без пропуска имеет все числа от 1 до n
        // посчитаем сумму 1+2+3...+n
        // и сумму нашего массива
        // их разница и будет пропущенное число

        int sumCorrect = 0;
        int sumMistake = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMistake += arr[i];
        }

        for (int i = 0; i < arr.length+1; i++) {
            sumCorrect += i+1;
        }

        return sumCorrect-sumMistake;
    }

    public static int whatsMissing2(int[] arr) {//перебор
        if(arr.length == 0){
            return 1;
        }

        if(arr[0]!=1){
            return 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != i+1){
                return arr[i]-1;
            }
        }

        return arr.length+1;
    }

    public static int binaryFindMissing(int[] arr){
        if(arr.length != 0){//если массив не нулевой
            if(arr[arr.length-1] == arr.length){// на случай если число последнее в списке
                return arr.length + 1;
            }
        }
        int left = 0;
        int right = arr.length - 1;
        while (left<right){
         int med = (left+right)/2;
         if(!(med+1 == arr[med])){//если ошибка в левой части, включая середину
             right = med;
         }else{
             left = med+1;
         }
        }

        return left+1;
    }

    private static void testTask2() {
        DequeImpl<String> deq = new DequeImpl<String>(3);
        deq.pushRight("один");
        deq.pushRight("два");

        deq.pushLeft("ноль");
        deq.poolLeft();

        deq.print();

    }

}
