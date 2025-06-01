import java.util.Scanner;
class employee{
    int eno;
    String name;
    double salary;

    employee(int eno,String name,double salary){
        this.eno=eno;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("EMP NO:"+eno);
        System.out.println("NAME:"+name);
        System.out.println("SALARY:"+salary);
    }
}
public class Empp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of teachers:");
        int n=sc.nextInt();
        sc.nextLine();

        employee[] e = new employee[n];
        for(int i=0;i<n;i++){

            System.out.println("--employee info--");
            System.out.println("enter eno:");
            int eno=sc.nextInt();
            sc.nextLine();
            System.out.println("enter name:");
            String name=sc.nextLine();
            System.out.println("enter salary:");
            double salary=sc.nextDouble();

            e[i] =new employee(eno,name,salary);
        }
        System.out.println("--details--");
        for(int i=0;i<n;i++){
            e[i].display();
        }
        sc.close();
    }
}
