package br.com.ebexs.routerfindermodel.model;

import java.util.Comparator;
import java.util.Objects;

public class RouteModel implements Comparator<RouteModel> {

    private String from;
    private String to;
    private String price;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getPrice() {
        return price;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {

        return this.getFrom() + "," + this.getTo() + "," + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteModel that = (RouteModel) o;
        return Objects.equals(from, that.from) &&
                Objects.equals(to, that.to) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int compare(RouteModel routeModel, RouteModel nextRouteModel) {
        return routeModel.getFrom().compareTo(nextRouteModel.getFrom());
    }
}
