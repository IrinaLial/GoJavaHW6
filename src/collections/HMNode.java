package collections;

public class HMNode  <K,V> {
    K key;
    V value;
    HMNode <K, V> prev;

    HMNode ( K key , V value , HMNode <K, V> prev ) {
        this.value = value;
        this.key = key;
        this.prev = prev;
    }
}
