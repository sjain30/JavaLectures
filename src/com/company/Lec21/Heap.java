package com.company.Lec21;

import java.util.ArrayList;

public class Heap <T extends Comparable<T>> {

    private ArrayList<T> list;

    public Heap() {
        this.list = new ArrayList<>();
    }

    public int parent(int index){
        return (index-1)/2;
    }

    public int left(int index){
        return (index*2)+1;
    }

    public int right(int index){
        return (index*2)+2;
    }

    public void add(T item){
        list.add(item);
        upheap(list.size()-1);
    }

    private void upheap(int index) {
        if (index==0){
            return;
        }
        int p=parent(index);
        if (list.get(p).compareTo(list.get(index))>0){
            swap(p,index);
            upheap(p);
        }
    }

    public T delete() throws Exception {
        if (list.isEmpty()){
            throw new Exception("Heap empty");
        }
        T removed = list.get(0);
        T last= list.remove(list.size() - 1);
        if (!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
//        if (list.size()>1) {
//            list.set(0, list.remove(list.size() - 1));
//            downheap(0);
//        }
//        else {
//            list.remove(0);
//        }
        return removed;
    }

    private void downheap(int index) {

        int min=index;
        int left = left(index);
        int right = right(index);
        if (left<list.size() && list.get(min).compareTo(list.get(left))>0){
            min=left;
        }
        if (right<list.size() && list.get(min).compareTo(list.get(right))>0){
            min=right;
        }
        if (min!=index) {
            swap(index, min);
            downheap(min);
        }
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public void display(){
        System.out.println();
        for (T entity: list) {
            System.out.print(entity+" ");
        }
    }
}
