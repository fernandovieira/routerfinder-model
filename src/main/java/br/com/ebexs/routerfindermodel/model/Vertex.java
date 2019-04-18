package br.com.ebexs.routerfindermodel.model;

import java.util.Objects;

public class Vertex {

    private String locale;

    public Vertex() {

    }

    public Vertex(String locale) {
        this.locale = locale;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(locale, vertex.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale);
    }
}
