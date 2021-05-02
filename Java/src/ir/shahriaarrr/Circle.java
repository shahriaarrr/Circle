package ir.shahriaarrr;

public class Circle {
    private final double PI = 3.14;
    private double radius;

    public void set_radius(double radius) {
        this.radius = radius;
    }

    public void circumference(){
        this.radius *= 2;
        System.out.println("\n" + PI * this.radius  + "\n");
    }

    public void area(){
        System.out.printf("\n%2f\n" , PI * Math.pow(this.radius, 2));
    }
}
