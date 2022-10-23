
package homework8;


import java.util.LinkedList;

public class HashTableImpl<K, V> implements HashTable<K, V> {
    // private final Item<K, V>[][] data;// массив массивов
    private final LinkedList<Item<K, V>>[] data;//массив из связанных списков item-ов
    private final Item<K, V> emptyItem;
    private int size;

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("key: %s -> value: %s", key, value);
        }
    }

    public HashTableImpl(int initialCapacity) {
        this.data = new LinkedList[initialCapacity];//создание массива связанных списков
       // this.data = new Item[initialCapacity * 2];
        emptyItem = new Item<>(null, null);
    }

    public HashTableImpl() {
        this(16);
    }

    @Override
    public boolean put(K key, V value) {
        if (size() == data.length) {
            return false;
        }
        int indexFromHashFunc = hashFunc(key);
        int n = 0;


        if( data[indexFromHashFunc] == null){//если список пуст, то создать его
            data[indexFromHashFunc] = new LinkedList<>();
        }
        //добавить в начало списка элемент в начало списка не зависимо от того есть ли коллизия или нет
        data[indexFromHashFunc].addFirst(new Item<>(key, value));
        size++;
        return true;
    }

    private boolean isKeysEquals(Item<K, V> item, K key) {
        if (item == emptyItem) {
            return false;
        }
        return (item.getKey() == null) ? (key == null) : (item.getKey().equals(key));
    }

    private int hashFunc(K key) {
        return Math.abs(key.hashCode() % data.length);
    }

    @Override
    public V get(K key) {
        int index = indexOf(key);
        for (Item<K, V> item:data[index]) {
            if(item.getKey() == key){
                return item.getValue();
            }

        }
        return null;
    }

    private int indexOf(K key) {
        int indexFromHashFunc = hashFunc(key);
        return indexFromHashFunc;
    }

    @Override
    public V remove(K key) {
        int index = indexOf(key);
        for (Item<K,V> item: data[index]) {
            if (item.getKey() == key){
                data[index].remove(item);//удаление из связного списка найденного элемента
                size--;
                return item.getValue();
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(String.format("%s = [%s]%n", i, data[i]));
        }
        return sb.toString();
    }
}
