
package assigmentjava;


public class MyArrayList<T> {
     
    
    private int size;
    private Object arr[];
    private final int capacity;
    
    
    
    public MyArrayList(){
      size =0 ; 
      capacity = 5; 
      arr = new Object[capacity]; 
        
    } 
     public void ensurecapcity() {
        int newSize = arr.length * 2;
        Object[] newArray = new Object[newSize];
        for (int i = 0; i < arr.length; i++) { // O(n )
            newArray[i] = arr[i];
        }
        arr = newArray;

    }
     
         public void add(T e) { // o(1) constant 
        if (arr.length == size) {
            ensurecapcity(); // O(N) Linear 
        }
        arr[size] = e;
        size++;
//        arr[size++] =e;
    }
       public int getsize() {
        return size;
    }
       
        public void addbyindex(T e, int index) {  //  O(n)
        if (index < 0 || index > getsize()) {
            throw new IndexOutOfBoundsException("Size " + size + "index " + index);
        } else if (size == index) {
            add(e);
        } else {
            for (int i = getsize(); i >= index; i--) { // O(n)

                arr[i + 1] = arr[i];
            }
            arr[index] = e;
            size++;
        }

    }
      public T get(int i) {  // o(1) not lenear
        if (i < 0 || i > getsize()) {
            throw new IndexOutOfBoundsException("Size " + size + "index " + i);

        } else {
            return (T) arr[i];
        }

    }

    public boolean Isempty() {  // Time Complexity O(1) constant 
        return size == 0;

    } 
        public void Clear() { //O(1)
        arr = new Object[capacity]; // [null,null,null,....]
        size = 0;
    }
        
         public T removeByIndex(int index) { //O(n)
        T element = (T) arr[index];
        if (index < 0 || index > getsize()) {
            throw new IndexOutOfBoundsException("Size " + size + "index " + index);
        } else {

            for (int i = index; i <= getsize() - 1; i++) {
                arr[i] = arr[i + 1];
            }

            size--;
        }
        return element;
    }
         
       public int indexOf(T e) { // O(n)
        int index = -1;

        for (int i = 0; i < getsize(); i++) {
            if (arr[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean contains(T e) { // O(n)
        boolean flag = false;
        for (int i = 0; i < getsize(); i++) {
            if (arr[i].equals(e)) {
                flag = true;
            }
        }
        return flag;
    }   
       
    
     public String PrintArray() {
        String str = "[ ";
        for (int i = 0; i < getsize(); i++) {
            str += arr[i] + ",";
        }
        return str + " ]";
    }
     
      public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < size; i++) {
            result.append(arr[i]);
            if(i < size - 1)
                result.append("\n");
        }
        return result.toString();
    }
     
       public boolean delete(T e) {
        if (!contains(e)) {
            return false;
        }
        removeByIndex(indexOf(e));
        return true;

    }
       
       
       public int lastindexOf(T e) {//o(n)

        int index = -1;
        for (int i = getsize() - 1; i >= 0; i--) {
            if (arr[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;

    }
}
