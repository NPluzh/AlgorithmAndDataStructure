package homework2;

import java.util.Comparator;

public class NotebookPriceComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook notebook, Notebook t1) {
        return (-1) * Double.compare(notebook.getPrice(), t1.getPrice());
    }
}
