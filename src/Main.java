import collections.MyArrayList;
import collections.MyHashMap;
import collections.MyLinkedList;
import collections.MyQueue;
import collections.MyStack;

public class Main {
    private static MyArrayList <String> myArrayList;
    private static MyLinkedList <Integer> myLinkedList;
    private static MyHashMap <Integer, String> myHashMap;
    private static MyStack <Float> myStack;
    private static MyQueue <Character> myQueue;

    public static void main ( String[] args ) {
        init ( );
        showAll ( );
        addOneToAll ( );
        showAll ( );
        showElement ( );
        showAll ( );
        removeElement ( );
        showAll ( );
        popAndPoll ( );
        showAll ( );
        clearAll ( );
        showAll ( );
        addOneToAll ( );
        showAll ( );
    }

    private static void init ( ) {
        myArrayList = new MyArrayList <> ( new String[] { "Cat" , "Dog" , "Pig" } );
        myLinkedList = new MyLinkedList <> ( new Integer[] { 53 , 54 , 55 } );
        myHashMap = new MyHashMap <> ( );
        myHashMap.put ( 2 , "Two" );
        myHashMap.put ( 10 , "Ten" );
        myHashMap.put ( 18 , "Eighteen" );
        myStack = new MyStack <> ( );
        myStack.add ( 7f );
        myStack.add ( 14f );
        myStack.add ( 20f );
        myQueue = new MyQueue <> ( );
        myQueue.add ( 'b' );
        myQueue.add ( 'l' );
        myQueue.add ( 'u' );
    }

    private static void showAll ( ) {
        System.out.println ( "MyArrayList:" );
        myArrayList.show ( );
        System.out.println ( );
        System.out.println ( "MyLinkedList:" );
        myLinkedList.show ( );
        System.out.println ( );
        System.out.println ( "MyHashMap:" );
        myHashMap.show ( );
        System.out.println ( );
        System.out.println ( "MyStack:" );
        myStack.show ( );
        System.out.println ( );
        System.out.println ( "MyQueue:" );
        myQueue.show ( );
        System.out.println ( );
    }

    private static void addOneToAll ( ) {
        System.out.println ( "Add 1 element to each collection:" );
        System.out.println ( );
        myArrayList.add ( "Horse" );
        myLinkedList.add ( 56 );
        myHashMap.put ( 26 , "Twenty six" );
        myStack.add ( 27f );
        myQueue.add ( 'e' );
    }

    private static void showElement ( ) {
        System.out.println ( "Getting last element from each collection (but first from MyQueue):" );
        System.out.println ( );
        System.out.println ( "MyArrayList:" );
        System.out.println ( myArrayList.get ( myArrayList.size ( ) - 1 ) );
        System.out.println ( );
        System.out.println ( "MyLinkedList:" );
        System.out.println ( myLinkedList.get ( myLinkedList.size ( ) - 1 ) );
        System.out.println ( );
        System.out.println ( "MyHashMap:" );
        System.out.println ( myHashMap.get ( 26 ) );
        System.out.println ( );
        System.out.println ( "MyStack:" );
        System.out.println ( myStack.peek ( ) );
        System.out.println ( );
        System.out.println ( "MyQueue:" );
        System.out.println ( myQueue.peek ( ) );
    }

    private static void removeElement ( ) {
        System.out.println ( "Removing 1 element from each collection:" );
        System.out.println ( );
        myArrayList.remove ( 1 );
        myLinkedList.remove ( 2 );
        myHashMap.remove ( 10 );
        myStack.remove ( 1 );
        myQueue.remove ( 2 );
    }

    private static void popAndPoll ( ) {
        System.out.println ( "Pop from stack and poll from queue:" );
        System.out.println ( );
        System.out.println ( "MyStack:" );
        System.out.println ( myStack.pop ( ) );
        System.out.println ( "MyQueue:" );
        System.out.println ( myQueue.poll ( ) );
        System.out.println ( );
    }

    private static void clearAll ( ) {
        System.out.println ( "Clear all collections:" );
        System.out.println ( );
        myArrayList.clear ( );
        myLinkedList.clear ( );
        myHashMap.clear ( );
        myStack.clear ( );
        myQueue.clear ( );
    }
}
