package collections;

public class MyLinkedList <T> {
    private LLNode <T> first;
    private LLNode <T> last;

    public MyLinkedList ( LLNode <T> first , LLNode <T> last ) {
        this.first = first;
        this.last = last;
    }

    public MyLinkedList ( T[] items ) {
        first = new LLNode <> ( items[ 0 ] , null , null );
        last = first;

        for ( int i = 1 ; i < items.length ; i++ ) {
            add ( items[ i ] );
        }
    }

    public void add ( T item ) {
        if ( first.item == null ) {
            last = first = new LLNode <> ( item , null , null );
        } else {
            LLNode <T> node = new LLNode <T> ( item , null , last );
            last.next = node;
            last = node;
        }
    }

    public void clear ( ) {
        for ( LLNode <T> node = first ; node != null ; ) {
            LLNode <T> next = node.next;
            node.item = null;
            node.next = null;
            node.prev = null;
            node = next;
        }
    }

    private LLNode <T> getNode ( int index ) {
        LLNode <T> iterator = first;

        if ( iterator == null ) return null;
        if ( index == 0 ) return first;

        while ( index > 0 ) {
            iterator = iterator.next;
            index--;
        }
        return iterator;
    }

    public void remove ( int index ) {
        if ( first == last ) {
            clear ( );
            return;
        }
        LLNode <T> node = getNode ( index );
        final LLNode <T> next = node.next;
        final LLNode <T> prev = node.prev;

        if ( prev == null ) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }
        if ( next == null ) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        node.item = null;
    }

    public T get ( int index ) {
        LLNode <T> iterator = first;

        if ( iterator == null ) return null;
        if ( index == 0 ) return first.item;

        while ( index > 0 ) {
            iterator = iterator.next;
            index--;
        }
        return iterator.item;
    }

    public int size ( ) {
        if ( first.item == null ) return 0;
        int size = 1;
        LLNode <T> node = first;
        while ( node.next != null ) {
            size++;
            node = node.next;
        }
        return size;
    }
    public void show() {
        LLNode<T> iterator = first;
        if (iterator.item == null) System.out.println("This list is empty.");
        else {
            do {
                System.out.print("" + iterator.item + " ");
                iterator = iterator.next;
            } while (iterator != null);
            System.out.println();
        }
    }
}
