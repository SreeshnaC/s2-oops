import java.util.Scanner;
interface shape{
    double area();
    double perimeter();
}
class circle implements shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class rectangle implements shape{
    double length;
    double width;
    rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}
public class shapecalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("-----MENU-----");
            System.out.println("1)calculate the area and perimeter of circle:");
            System.out.println("2)calculate the area and perimeter of rectangle:");
            System.out.println("3)exit");
            System.out.println("enter your choice:");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the radius of circle:");
                    double radius=sc.nextDouble();
                    circle circle=new circle(radius);
                    System.out.println("area of the circle:"+circle.area());
                    System.out.println("perimeter of the circle:"+circle.perimeter());
                    break;
                case 2:
                    System.out.println("enter the length of the rectangle:");
                    double length=sc.nextDouble();
                    System.out.println("enter the width of the rectangle:");
                    double width=sc.nextDouble();
                    rectangle rectangle=new rectangle(length, width);
                    System.out.println("area of the rectangle:"+rectangle.area());
                    System.out.println("erimeter of the rectangle:"+rectangle.perimeter());
                    break;
                case 3:
                    System.out.println("exiting the program");
                    break;
                default:
                    System.out.println("invalid choice please try again!");
            }
        }
        while(choice!=3);
        sc.close();
    }

}