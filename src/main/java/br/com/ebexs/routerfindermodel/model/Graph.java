package br.com.ebexs.routerfindermodel.model;

import java.util.HashMap;
import java.util.Map;

public class Graph {

    private Map<Vertex, Map<Vertex, String>>  node;

    public Graph() {
        node = new HashMap<>();
    }

    public void addGraph(Vertex vertexFrom, Map<Vertex, String> vertexTo) {
        node.put (vertexFrom, vertexTo);
    }

    public Map<Vertex, Map<Vertex, String>> getNode() {
        return node;
    }

    public void setNode(Map<Vertex, Map<Vertex, String>>  node) {
        this.node = node;

    }
}
