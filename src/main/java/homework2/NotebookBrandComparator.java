package homework2;

import java.util.Comparator;

public class NotebookBrandComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook notebook, Notebook t1) {
        return notebook.getBrand().compareTo(t1.getBrand());
    }


}
