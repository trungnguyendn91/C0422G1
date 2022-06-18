package ss10_arraylist.bai_tap.array_list;

import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    MyList(int capacity){
        if (capacity >=0){
            elements = new Object[DEFAULT_CAPACITY];
        }else {
            throw new IllegalArgumentException("capacity = "+capacity);
        }
    }
    public int size(){
        return this.size;
    }
    public void clear(){

        for (int i = 0; i<elements.length ;i++){
            elements[i] = null;
        }
    }
    public void ensureCapacity(int minCapacity){
        if (minCapacity >=0){
            int newSize = this.elements.length+ minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }else throw new IllegalArgumentException("minCapacity = "+minCapacity);
    }
    public boolean add(E element){
        if (elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    }
}
