package com.tosin.firstImplementation;

public class Array {
    private int count;
    private int[] firstArray;

    public Array(int length){
        this.firstArray = new int[length];

    }

    public void addItem(int item){

        if(firstArray.length == count){
            int [] secondAray = new int[count * 2];
            for (int i = 0; i < firstArray.length; i++) {
             secondAray[i] = firstArray[i];
            }
            secondAray = firstArray;
        }
        firstArray[count++] = item;
    }
}
