package homework2;

import java.util.Comparator;

public class NotebookRamComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook notebook, Notebook t1) {
        return (-1) * Integer.compare(notebook.getRam(),t1.getRam());
    }
}
