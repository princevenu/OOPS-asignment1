public class Triangle {

    Double base;
    Double Height;
    Double AreaOfTriangle;

 

    public Double getAreaOfTriangle() {
        return this.AreaOfTriangle;
    }

   

    public void CalcArea() {
        AreaOfTriangle = (Double) ((base * Height) / 2);
    }

    Triangle(Double base, Double height) {
        
        this.base = base;
        this.Height = height;
        CalcArea();
    }
}
