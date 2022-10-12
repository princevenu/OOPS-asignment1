import java.text.DecimalFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Boolean input = false;
        String units="";
        System.out.println("Select an option..");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        

        while (!input) {
            int sel = sc.nextInt();
            sc.nextLine();
            if(sel>0 && sel<=3){
            System.out.println("enter unit of measurement");
            units = sc.nextLine();
            }
            switch (sel) {
                case 1:
                    input = true;
                    Circle circle = new Circle();
                    System.out.println("enter radius of the circle in "+units+" 's");
                    Double radi = sc.nextDouble();
                    while (radi <= 0) {
                        System.out.println("Please enter a valid number:");
                        radi = sc.nextDouble();
                    }

                    circle.setRadius(radi);
                    System.out.println(df.format(circle.getArea())+" "+units+"'s");
                    break;
                case 2:
                    System.out.println("enter base of the triangle in "+units+"'s");
                    Double base = sc.nextDouble();
                    while (base <= 0) {
                        System.out.println("Please enter a valid number:");
                        base = sc.nextDouble();
                    }
                    System.out.println("enter height of the triangle in "+units+"'s");
                    Double height = sc.nextDouble();
                    while (height <= 0) {
                        System.out.println("Please enter a valid number:");
                        height = sc.nextDouble();
                    }
                    Triangle triangle = new Triangle(base, height);
                    System.out.println("Area of Triangle : " + df.format(triangle.getAreaOfTriangle())+""+units+"'s");
                    input = true;
                    break;
                case 3:
                    System.out.println("enter length of the rectangle in "+units+"'s");
                    Double len = sc.nextDouble();
                    while (len <= 0) {
                        System.out.println("Please enter a valid number:");
                        len = sc.nextDouble();
                    }
                    System.out.println("enter width of the rectangle in "+units+"'s");
                    Double wid = sc.nextDouble();
                    while (wid <= 0) {
                        System.out.println("Please enter a valid number:");
                        wid = sc.nextDouble();
                    }
                    Rectangle rectangle = new Rectangle(len, wid);
                    System.out.println("Area of rectangle : " +df.format( rectangle.getArea())+" "+units+"'s");
                    input = true;
                    break;
                default:
                    System.out.println("please select valid option");
            }
        }
        sc.close();

    }
}
