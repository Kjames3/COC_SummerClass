import java.util.Scanner;

public class Chapter12_Program1 {
    public static void printSmallTriangle(Triangle triangle1, Triangle triangle2) {
        if (triangle1.getArea() < triangle2.getArea()) {
            System.out.println("Triangle with smaller area:");
            triangle1.printInfo();
        } else if (triangle1.getArea() > triangle2.getArea()) {
            System.out.println("Triangle with smaller area:");
            triangle2.printInfo();
        } else {
            System.out.println("Both triangles have the same area.");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Triangle triangle = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle.setBase(scanner.nextDouble());
        triangle.setHeight(scanner.nextDouble());

        triangle2.setBase(scanner.nextDouble());
        triangle2.setHeight(scanner.nextDouble());

        printSmallTriangle(triangle, triangle2);
        scanner.close();
    }
}

class Triangle {
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2.0;
    }

    public void printInfo() {
        System.out.printf("Base: %.2f\n", base);
        System.out.printf("Height: %.2f\n", height);
        System.out.printf("Area: %.2f\n", getArea());
    }
}
