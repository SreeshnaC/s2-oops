class product{
    int pcode;
    String pname;
    int price;

    product(int pcode,String pname,int price){
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
    void display(){
        System.out.println("product code:"+pcode);
        System.out.println("product name:"+pname);
        System.out.println("product price:"+price);
        System.out.println();
    }
    static void findLowest(product p1,product p2,product p3){
        if(p1.price < p2.price && p1.price < p3.price)
        {
               System.out.println("product\t" +p1.pname + "\thas the lowest price with price:"+p1.price);
        }
        else if(p2.price < p1.price && p2.price < p3.price)
        {
               System.out.println("produc\t" +p2.pname+ "\thas the lowest price with price:" +p2.price);
        }
        else{
                 System.out.println("product\t" +p3.pname+ "\thas the lowest price with price:" +p3.price);
        }
    }
}
public class productdemo{
    public static void main(String[] args){
        product obj1 = new product(101, "clock", 40000);
        product obj2 = new product(102,"fan",10000);
        product obj3 = new product(103,"tv",25000);
        obj1.display();
        obj2.display();
        obj3.display();
        product.findLowest(obj1,obj2,obj3);
    }
}