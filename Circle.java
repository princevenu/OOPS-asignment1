public class Circle {
    private Double radius;      
    final Double PI = 3.14159;   

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea(){
        return PI*(radius*radius);
    }
}
