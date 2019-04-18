package br.com.ebexs.routerfindermodel.model;

import java.util.ArrayList;
import java.util.List;

public class RouteFind {

    private String price = "0";
    private int total = 0;
    private int interaction = 0;
    private Boolean walkThrough = false;
    private Vertex nextVertex = null;
    private List<String> route ;

    public RouteFind() {
        this.route = new ArrayList<>();
    }

    public Vertex getNextVertx() {
        return nextVertex;
    }

    public void setNextVertex(Vertex nextVertex) {
        this.nextVertex = nextVertex;
    }

    public Boolean getWalkThrough() {
        return walkThrough;
    }

    public void setWalkThrough(Boolean walkThrough) {
        this.walkThrough = walkThrough;
    }

    public int getInteraction() {
        return interaction;
    }

    public void setInteraction(int interaction) {
        this.interaction = interaction;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRoute(String route) {
        this.route.add(route);
    }

    public List<String> getRoute () {
        return route;
    }
}
