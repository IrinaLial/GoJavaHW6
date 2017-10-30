package collections;

public class LLNode<T> {
    T item;
    LLNode<T> prev;
    LLNode<T> next;

    LLNode(T item, LLNode<T> next, LLNode<T> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
