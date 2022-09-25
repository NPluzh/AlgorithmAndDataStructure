package homework2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Notebook[] arrNotebook;
        arrNotebook = Notebook.rand(10000);//генерация массива
        Comparator<Notebook> NotebookComparator = new NotebookPriceComparator() // создание компаратора с приоритетами
                .thenComparing(new NotebookRamComparator())
                .thenComparing(new NotebookBrandComparator());
        Arrays.sort(arrNotebook,NotebookComparator);// сама сортировка
        info(arrNotebook);// вывод на экран отсортированного массива
    }

    public static void info(Notebook[] smbArr){
        for (int i = 0; i < smbArr.length; i++) {
            System.out.println((i+1) + "-ый ноутбук: "+ smbArr[i].toString());
        }
    }
}
