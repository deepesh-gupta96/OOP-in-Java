package com.company;

class Circle {
    private double radius;
    private double area;
    private double diameter;
    Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }
    public void setRadius(double r) {
        this.radius = r;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }
    public double getRadius() {
        return radius;
    }
    private void computeDiameter() {
        diameter = 2*radius;

    }
    private void computeArea() {
        area = Math.PI * radius * radius;
    }
    public double getDiameter() {
        return diameter;
    }
    public double getArea() {
        return area;
    }
}
