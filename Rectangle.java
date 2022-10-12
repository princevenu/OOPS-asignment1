public class Rectangle {
    private Double length;     
    private Double width;      
    private Double area;       

    public Double getLength() {
        return this.length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getArea() {
        return this.area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    private void CalcArea() {
        area = length * width;
    }

    Rectangle(Double length, Double width) {
        
        this.length = length;
        this.width = width;
        CalcArea();
    }

}
