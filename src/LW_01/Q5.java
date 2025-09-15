package LW_01;


class Circle{
    private double radius;

    public void radius(double r){
        radius= r;

    }
    public Double Area(){
        return Math.PI*radius*radius;

    }
    public Double Circumference(){
        return 2*Math.PI*radius;


    }
}

public class Q5 {
    public static void main(String[] args){
        Circle inner = new Circle();
        Circle outer = new Circle();

        inner.radius(3);
        outer.radius(7);

        double area = outer.Area() - inner.Area();
        System.out.println("The faded area is " + area);

    }
}
