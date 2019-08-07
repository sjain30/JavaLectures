package com.company.Lec23;

import java.util.*;

public class GraphUsingMap<T> {

    private Map<T,Vertex> VertexMap = new HashMap<>();

    class Vertex{
        private T value;
        private Map<T,Vertex> neighbours;
        private Map<Vertex,Integer> weights;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new HashMap<>();
            this.weights = new HashMap<>();
        }

        private void addneighbours(Vertex padosi, int wieght)
        {
            neighbours.put(padosi.value,padosi);
            weights.put(padosi,wieght);
        }
    }

    public void addvertex(T value)
    {
        VertexMap.putIfAbsent(value,new Vertex(value));
    }

    public void addEdge(T first, T second, int weight)
    {
        Vertex vf = VertexMap.get(first);
        Vertex vs = VertexMap.get(second);
        if (vf!=null && vs!=null){
            vf.addneighbours(vs,weight);
            vs.addneighbours(vf,weight);
        }
    }

    public void DFT(T start){
        Vertex vertex = VertexMap.get(start);
        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        set.add(vertex);
        stack.add(vertex);
        while (!stack.isEmpty()){
            Vertex front = stack.pop();
            System.out.print(front.value+" ");
            for (Vertex padosi: front.neighbours.values()) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.add(padosi);
                }
            }
        }
    }

    class Edge  {
        private Vertex start;
        private Vertex end;
        private int value;

        public Edge(Vertex start, Vertex end, int value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }
//
//        @Override
//        public int compareTo(Edge o) {
//            return this.value-o.value;
//        }
    }

    private boolean union(Vertex f, Vertex s, Map<Vertex,Vertex> parent)
    {
        Vertex first = Find(parent,f);
        Vertex second = Find(parent,s);
        if (first!=second){
            parent.put(first,second);
            return true;
        }
        return false;
    }

    private Map<Vertex,Vertex> parentnull(){
        Map<Vertex,Vertex> parent = new HashMap<>();
        for (Vertex value: VertexMap.values()) {
            parent.put(value,null);
        }
        return parent;
    }

    private Vertex Find(Map<Vertex, Vertex> parent, Vertex value) {
        while (parent.get(value)!=null){
            value=parent.get(value);
        }
        return value;
    }

    public GraphUsingMap<T> kruskal()
    {
        GraphUsingMap<T> graph= new GraphUsingMap<>();
        ArrayList<Edge> Edges= new ArrayList<>();
        for (Vertex vertex: VertexMap.values()) {
            graph.addvertex(vertex.value);
            for (Vertex padosi:vertex.neighbours.values()) {
                int weight=vertex.weights.get(padosi);
                Edges.add(new Edge(vertex,padosi,weight));
            }
        }
        Edges.sort((o1, o2) -> o1.value-o2.value);
        Map<Vertex,Vertex> parent=parentnull();
        for (Edge edge:Edges) {
            if (union(edge.start,edge.end,parent)){
                graph.addEdge(edge.start.value,edge.end.value,edge.value);
            }
        }
        return graph;
    }
}
