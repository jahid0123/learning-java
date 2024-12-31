package classTwenty;

import java.util.Collections;

public class OrderedPair<K, V> implements Pair {

    private K key;
    private V value;



    public OrderedPair(K key, V value) {
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

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("Even", "Hello");
        Pair<Integer, String> p3 = new OrderedPair<Integer, String>(8, "Value");



    }
}
