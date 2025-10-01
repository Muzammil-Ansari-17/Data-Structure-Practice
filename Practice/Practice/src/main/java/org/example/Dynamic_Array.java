package org.example;

public class Dynamic_Array {
    private int[] arr;
    private int size;

    public Dynamic_Array(int capacity){
        this.arr = new int[capacity];
        this.size = 0;
    }
    public void insert(int item){
        if(size == arr.length){
            resize();
        }
        arr[size] = item;
        size++;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        for (int i = index; i < size; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    public int indexof(int value){
        for (int i = 0; i < size; i++) {
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void update(int index, int value){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        for (int i = 0; i < size; i++) {
            arr[index] = value;
        }
    }
    private void resize(){
        int newcapacity = arr.length*2;
        int[] newarr = new int[newcapacity];

        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        arr = newarr;
    }


    public void display(){
        for (int x :arr){
            System.out.println(x);
        }
    }
}


