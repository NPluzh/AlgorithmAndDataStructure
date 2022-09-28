package homework3;

import java.util.Arrays;
import java.util.stream.Stream;

public class DequeImpl<T> implements Deque<T> {

    private Object[] data;
    private int size;

    public DequeImpl(int size) {
        this.data = new Object[size];
        this.size = 0;
    }

    @Override
    public boolean pushRight(T item) {
        if(isFull()){
            return false;
        }
        data[size++] = item;
        return true;
    }

    @Override
    public boolean pushLeft(T item) {
        if(isFull()){
            return false;
        }
        data = Stream.concat(Stream.of(item),Arrays.stream(data).limit(size)).toArray();
        size++;
        return true;
    }

    @Override
    public T poolRight() {
        if (isEmpty()){
            return null;
        }
        T peek = peekRight();
        data[--size] = null;
        return peek;
    }

    @Override
    public T poolLeft() {
        if (isEmpty()){
            return null;
        }
        T peek = peekLeft();

        //костыль в котором убираем первый элемент и добавляем его в конец в виде потока, а потом уже в массиве делаем null
        Stream<T> streamWithoutOne = (Stream<T>) Arrays.stream(data).skip(1);
        Stream<T> newStream = Stream.concat(streamWithoutOne, Stream.of(peek));
        data = newStream.toArray();
        data[data.length-1] = null;
        size--;
        return peek;

    }

    @Override
    public T peekRight() {
        if (isEmpty()){
            return null;
        }
        return (T) data[size-1];
    }

    @Override
    public T peekLeft() {
        if (isEmpty()){
            return null;
        }
        return (T) data[0];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    public void print (){
        Arrays.stream(data).forEach(System.out::println);
    }
}
