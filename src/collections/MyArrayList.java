package collections;

public class MyArrayList <T> {

    private T[]array;

    public MyArrayList ( T[] array ) {
        this.array = array;
    }
    public void add(T value ){
        Object [] myArray = new Object[array.length + 1];
        System.arraycopy ( array,0,myArray,0,array.length );
        myArray[myArray.length - 1]=value;
        array = (T[]) myArray;
    }
    public void remove(int index ) {
        Object[] myArray = new Object[ array.length - 1 ];
            System.arraycopy ( array , 0 , myArray , 0 , index );
            System.arraycopy(array,(index +1),myArray,index,(array.length - index - 1));
            array = (T[]) myArray;
    }
    public int size(){
        return array.length;
    }
    public void clear(){
        array = (T[]) new Object [0];
    }
    public T get(int index){
        return array[index];
    }
    public void show() {
        if (array.length == 0) {
            System.out.println("This list is empty");
        }
        else {
            for ( int i = 0 ; i < array.length - 1 ; i++ ) {
                System.out.print ( array[ i ] + " " );
            }
            System.out.println ( array[ array.length - 1 ] );
        }}

}

