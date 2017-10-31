package collections;

public class MyHashMap <K,V> {
    private int size = 0;
    private HMNode <K, V> node;

    public void put ( K key , V value ) {
        if ( node == null ) {
            node = new HMNode <> ( key , value , null );
            size++;
        } else {
            if ( this.get ( key ) != null ) {
                System.out.println ( "Key is already used!" );
            } else {
                this.node = new HMNode <> ( key , value , this.node );
                size++;
            }
        }
    }
    public void clear ( ) {
        for ( HMNode <K, V> n = node ; n != null ; ) {
            HMNode <K, V> next = n.prev;
            n.key = null;
            n.value = null;
            n = next;
        }
        node = null;
        size = 0;
    }

    public int size ( ) {
        return size;
    }

    public V get ( K key ) {
        HMNode <K, V> valueNode = node;
        if ( valueNode == null ) return null;
        while ( ! valueNode.key.equals ( key ) ) {
            if ( valueNode.prev == null ) return null;
            valueNode = valueNode.prev;
        }
        return valueNode.value;
    }

    public void remove(K key) {
        int count = 0;
        HMNode<K, V> iterator = node;
        HMNode<K, V> Iterator1 = node;
        do {
            if (iterator.key.equals(key) && iterator.prev == null) {
                Iterator1.prev = null;
                size--;
                break;
            } else if (iterator.key.equals(key)) {
                iterator.key = iterator.prev.key;
                iterator.value = iterator.prev.value;
                iterator.prev = iterator.prev.prev;
                size--;
                break;
            }
            Iterator1 = iterator;
            iterator = iterator.prev;
            count++;

        } while (size != count);
    }
    public void show() {
        HMNode<K, V> valueNode = node;
        if (valueNode == null) {
            System.out.println("The hash map is empty");
            return;
        }
        do {
            System.out.println(valueNode.key + ":" + valueNode.value);
            valueNode = valueNode.prev;
        } while (valueNode != null);
    }
}
