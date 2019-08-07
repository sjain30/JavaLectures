package com.company.Lec22;

import java.util.*;

public class AdjacencyList<T> {

    private LinkedList<Vertex> vertices;

    public AdjacencyList() {
        this.vertices = new LinkedList<>();
    }

    public void add(T value)
    {
        vertices.add(new Vertex(value));
    }

    public void AddEdge(T first, T second)
    {
        Vertex f = get(first);
        Vertex s = get(second);
        if(f!=null && s!=null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }

    private Vertex get(T value) {
        for (Vertex node: vertices) {
            if (node.value.equals(value)){
                return node;
            }
        }
        return null;
    }

    public void display()
    {
        for (Vertex vertex: vertices) {
            System.out.print(vertex.value+" => ");
            for (Vertex padosi:vertex.neighbours) {
                System.out.print(padosi.value+" ");
            }
            System.out.println();
        }
    }


    private class Vertex{
        private T value;
        private LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }

    public void breadthfirst()
    {
        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList();
        Vertex v = vertices.get(0);
        set.add(v);
        queue.add(v);
        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            System.out.print(top.value+" ");
            for (Vertex padosi: top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

    public boolean bfSearch(T item)
    {
        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList();
        Vertex v = vertices.get(0);
        set.add(v);
        queue.add(v);
        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            if (top.value.equals(item)){
                return true;
            }
            for (Vertex padosi: top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }
        return false;
    }

    public void levelorder()
    {
        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList();
        Vertex v = vertices.get(0);
        set.add(v);
        queue.add(v);
        queue.add(null);
        int level=0;
        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            if (top==null){
                queue.add(null);
                level++;
                continue;
            }
            System.out.print(top.value+"level "+level+" ");
            for (Vertex padosi: top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

    public boolean bipartite()
    {
        Set<Vertex> red = new HashSet<>();
        Set<Vertex> green = new HashSet<>();
        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList();
        Vertex v = vertices.get(0);
        set.add(v);
        red.add(v);
        queue.add(v);
        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            if (red.contains(top)){
                for (Vertex padosi: top.neighbours) {
                    if (!set.contains(padosi)) {
                        green.add(padosi);
                        queue.add(padosi);
                        set.add(padosi);
                    }
                    if (red.contains(padosi)){
                        return false;
                    }
                }
            }
            else if (green.contains(top)){
                for (Vertex padosi: top.neighbours) {
                    if (!set.contains(padosi)) {
                        red.add(padosi);
                        queue.add(padosi);
                        set.add(padosi);
                    }
                    if (green.contains(padosi)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void DFT()
    {
        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> queue = new Stack<>();
        Vertex v = vertices.get(0);
        set.add(v);
        queue.add(v);
        while (!queue.isEmpty()){
            Vertex top = queue.pop();
            System.out.print(top.value+" ");
            for (Vertex padosi: top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

}
