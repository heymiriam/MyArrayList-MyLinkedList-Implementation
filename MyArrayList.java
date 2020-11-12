package collections.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class MyArrayList implements List, RandomAccess {
  private static final int DEFAULT_SIZE = 10;
  private Object[] elementData;
  private int size;

  public static void main(String[] args) {
    ArrayList<Object> color = new ArrayList<>();
    color.add("blue");
    color.add("yellow");
    color.add("green");
    color.add("red");
    color.add("orange");
    color.add("purple");
    color.add("grey");
    color.add("black");
    color.add("white");
  }

  public MyArrayList() {
    // TODO: Implement Me
    elementData = new Object[DEFAULT_SIZE];

  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity >= 0) {
      elementData = new Object[initialCapacity];
    } else {
      throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }
  }

  public MyArrayList(Collection c) {
    elementData = c.toArray();
  }

  @Override
  public int size() {
    // TODO: Implement Me

    return size;
  }

  @Override
  public boolean isEmpty() {
    // TODO: Implement Me
    return size == 0;
  }

  @Override
  public boolean contains(Object o) {
    // TODO: Implement Me

    return indexOf(o) != -1;
  }

  @Override
  public Iterator iterator() {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public Object[] toArray() {
    // TODO: Implement Me
    return Arrays.copyOf(elementData, size);
    //return new Object[0];
  }

  @Override
  public Object[] toArray(Object[] a) {
    // DO NOT NEED TO IMPLEMENT
    return new Object[0];
  }

  @Override
  public boolean add(Object o) {
    // TODO: Implement Me
    if (size == elementData.length) {
      elementData = grow(size + 1);
    }
    elementData[size] = o;
    size++;
    return true;
  }


  private Object[] grow(int minCapacity) {
    return elementData = Arrays.copyOf(elementData, minCapacity + minCapacity / 2);
  }

  @Override
  public boolean remove(Object o) {
    // TODO: Implement Me

    int index = indexOf(o);
    if(index == -1){
      return false;
    }

    // find the index of Object o; (linear search)
    // shift all the elements after the index to left
    remove(index);
    return true;
  }

  @Override
  public boolean containsAll(Collection c) {
    // TODO: Implement Me
    for(Object cont : c){
      if(contains(cont)){
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    // TODO: Implement Me
    return false;
  }

  @Override
  public boolean addAll(int index, Collection c) {
    // TODO: Implement Me
    boolean element = true;
    for (Object d : c){
      element = add(c);
    }
    return element;
  }

  @Override
  public boolean removeAll(Collection c) {
    // TODO: Implement Me
    boolean elem = true;
    for (Object d : c){
      elem = remove(c);
    }
    return elem;
  }

  @Override
  public boolean retainAll(Collection c) {
    // TODO: Implement Me
    return false;
  }

  @Override
  public void clear() {
    // TODO: Implement Me
    for (int i = 0; i < size; i++) {
      elementData[i] = null;
    }
  }

  @Override
  public Object get(int index) {
    // TODO: Implement Me
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return elementData[index];
  }

  @Override
  public Object set(int index, Object element) {
    // TODO: Implement Me
    Object elem = get(index);
    elementData[index] = element;
    return elem;
  }

  @Override
  public void add(int index, Object element) {
    // TODO: Implement Me
    if(index < 0 || index >size){
        throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }
    if(index == 0){
        add(element);
    }
    for (int i = 0; i < index - 1; i++) {

    }
      size++;
  }


  @Override
  public Object remove(int index) {
    // TODO: Implement Me
    if(index < 0){
      remove(elementData);
      index--;
    }

    return null;
  }

  @Override
  public int indexOf(Object o) {
    // TODO: Implement Me
    for(int i = 0; i < size; i++){
      return i;
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    // TODO: Implement Me
    for(int i = 0; i < size-1; i--){
      return i;
    }
    return size-1;
  }

  @Override
  public ListIterator listIterator() {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public ListIterator listIterator(int index) {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    // TODO: Implement Me
    return null;
  }

}