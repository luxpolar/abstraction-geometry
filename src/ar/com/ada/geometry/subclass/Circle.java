package ar.com.ada.geometry.subclass;

import ar.com.ada.geometry.abst.Figure;

import java.util.Objects;

public class Circle extends Figure {
    protected Double radius;

    public Circle() {

    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, Double area) {
        this.radius = radius;
        this.area = area;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }


    public String showArea() {
        Double area = Math.PI * radius * radius;
        setArea(area);
        return "Área del círculo = " + area
                + ", radio = " + radius +
                ", pi = " + Math.PI;
    }

    @Override
    public String toString() {
        return "Circle { radius = " + radius + " }";
    }

    @Override
    public int hashCode() {
        return -5 * Objects.hash(this.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Circle)) return false;
        Circle that = (Circle) obj;
        return this.radius.equals(that.radius) && super.equals(that);
    }
}
