package ir.shahriaarrr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();

        Scanner in = new Scanner(System.in);
        double a;
        int x;

        System.out.println("Hi, welcom to Circle program\n");
        System.out.print("Give me the radius of the circle: ");
        a = in.nextDouble();
        c1.set_radius(a);

        while (true){
            System.out.println("1 --> Calculate the circumference of circle\n2 --> Calculate the area of circle\n3 --> exit");
            System.out.print("your choice: ");
            x = in.nextInt();

            if(x == 1){
                c1.circumference();
            }else if(x == 2){
                c1.area();
            }else if (x == 3){
                break;
            }else{
                System.out.println("\nError! Please select one of the following three options\n");
            }
        }
    }
}
