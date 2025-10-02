package org.example;
//24F-CS-154
//Muzammil Ahmed

public class Dynamic_Array {
    int[] arr;
     int size;

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
        for (int i = index; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[size -1 ] = 0;
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
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        arr[index] = value;
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
        for (int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

    }
}


