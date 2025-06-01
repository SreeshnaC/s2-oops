import java.util.Scanner;
class employee{
    int empid;
    String name;
    double salary;
    String address;

    employee(int empid,String name,double salary,String address){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
    void display(){
        System.out.println("--------");
        System.out.println("EMPLOYEE ID:"+empid);
        System.out.println("NAME:"+name);
        System.out.println("SALARY:"+salary);
        System.out.println("ADDEESS:"+address);
    }
}
class teacher extends employee{
    String dept;
    String sub;

    teacher(int empid,String name,double salary,String address,String dept,String sub){
        super(empid, name, salary, address);
        this.dept=dept;
        this.sub=sub;
    }
    void display(){
        super.display();
        System.out.println("DEPARTMENT:"+dept);
        System.out.println("SUBJECT:"+sub);
    }
}
public class teacherinfo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of teachers:");
        int n=sc.nextInt();
        sc.nextLine();

        teacher[] t = new teacher[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("enter the details of teacher"+(i+1)+":");
            System.out.println("EMP ID:");
            int empid=sc.nextInt();
            sc.nextLine();
            System.out.println("NAME:");
            String name=sc.nextLine();
            System.out.println("SALARY:");
            double salary=sc.nextDouble();
            sc.nextLine();
            System.out.println("ADDRESS:");
            String address=sc.nextLine();
            System.out.println("DEPARTMENT:");
            String dept=sc.nextLine();
            System.out.println("SUBJECT:");
            String sub=sc.nextLine();

            t[i]=new teacher(empid,name,salary,address,dept,sub);
        }
        System.out.println("---TEACHER DETAILS---");
        for(int i = 0;i < n; i++){
            t[i].display();
        }
        sc.close();
    }
}