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
        if ( index == 0 ) {
            System.arraycopy ( array , 1 , myArray , 0 , myArray.length );
        }else {
            System.arraycopy ( array,0,myArray,0,index );
            System.arraycopy(array,(index +1),myArray,index,(array.length - index - 1));

        }
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
/* another variant:


   public class MyArrayList<T> {
   private final int INIT_SIZE = 16;
   private final int CUT_RATE = 4;
   private Object[] array = new Object[INIT_SIZE];
   private int pointer = 0;


   Добавляет новый элемент в список. При достижении размера внутреннего
   массива происходит его увеличение в два раза.

   public void add(T item) {
    if(pointer == array.length-1)
        resize(array.length*2); // увеличу в 2 раза, если достигли границ
    array[pointer++] = item;}


    Возвращает элемент списка по индексу.

    public T get(int index) {
        return (T) array[index];}


    Удаляет элемент списка по индексу. Все элементы справа от удаляемого
    перемещаются на шаг налево. Если после удаления элемента количество
    элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
    то внутренний массив уменьшается в два раза, для экономии занимаемого
    места.

    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);   если элементов в CUT_RATE раз меньше чем
                                      длина массива, то уменьшу в два раза
    }
    Возвращает количество элементов в списке
    public int size() {
        return pointer;}

    Вспомогательный метод для масштабирования
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
 */

