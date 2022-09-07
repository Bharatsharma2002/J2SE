import java.util.Scanner;
class Arithmatic {
    private int  a;
    private int  b;
    private static int  u;

    Arithmatic(){
        this.a = 0;
        this.b = 0;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }
    
    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int sum(){
         this.u = this.a+this.b;
        return u;
    }
    public int divide(){
        this.u = this.a/this.b;
       return u;
    }
    public int multiply(){
        this.u = this.a*this.b;
       return u;
    }
    public int subtract(){
        this.u = this.a-this.b;
       return u;
    }
}

class Testmain{
    public static void main(String[] args){
        Arithmatic obj = new Arithmatic();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second value : ");
        int  b = sc.nextInt();
        
        obj.setA(a);
        obj.setB(b);
        System.out.println("Sum of given number : "+obj.sum());
        System.out.println("Subtract of given number : "+obj.subtract());
        System.out.println("Multiply of given number : "+obj.multiply());
        System.out.println("Divides of given number : "+obj.divide());       
    }
}