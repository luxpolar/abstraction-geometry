package ar.com.ada.geometry.abst;

import java.util.Objects;

public abstract class Figure {
    protected Double area;


    public Figure() {

    }

    public Figure(Double area) {
        this.area = area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    public abstract String showArea();

    @Override
    public String toString() {
        return "Figure { area = " + area + " }";
    }

    @Override
    public int hashCode() {
        return -4 * Objects.hash(this.area);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Figure)) return false;
        Figure that = (Figure) obj;
        return this.area.equals(that.area);
    }
}
