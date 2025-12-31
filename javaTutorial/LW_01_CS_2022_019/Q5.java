import java.util.Scanner;

 class Circle {
    private double radius;

    Circle(double r){
        radius = r;
    }

    Circle(){
        radius = 0;
    }

    double computeArea(){
        return  Math.PI*radius*radius;
    }

    double computeCircumference(){
        return 2 * Math.PI*radius;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter inner radius(ri)");
        double ri = sc.nextDouble();

        System.out.println("Enter outer radius(ro)");
        double ro = sc.nextDouble();

        Circle inner = new Circle(ri);
        Circle outer = new Circle(ro);


    }
}

