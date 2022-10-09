package homework3;

public interface Deque<T> {

    boolean pushRight (T item);

    boolean pushLeft (T item);

    T poolRight ();

    T poolLeft ();

    T peekRight();

    T peekLeft();

    boolean isEmpty();

    boolean isFull();



}
