package ar.com.ada.geometry.subclass;

import ar.com.ada.geometry.abst.Figure;

import java.util.Objects;

public class Rectangle extends Figure {
    protected Double base;
    protected Double hight;

    public Rectangle() {

    }

    public Rectangle(Double base, Double hight) {
        this.base = base;
        this.hight = hight;
    }

    public Rectangle(Double base, Double hight, Double area) {
        this.base = base;
        this.hight = hight;
        this.area = area;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHight() {
        return hight;
    }

    public void setHight(Double hight) {
        this.hight = hight;
    }

    @Override
    public String showArea() {
        Double area = base * hight;
        this.setArea(area);
        return "Área del rectángulo = " + this.area +
                ", base = " + this.base +
                ", altura = " + this.hight;
    }

    @Override
    public String toString() {
        return "Rectangle { base = " + base + ", hight = " + hight + " }";
    }

    @Override
    public int hashCode() {
        return -5 * Objects.hash(this.base, this.hight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Rectangle)) return false;
        Rectangle that = (Rectangle) obj;
        return this.base.equals(that.base) &&
                this.hight.equals(that.hight) &&
                super.equals(that);
    }
}
