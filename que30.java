import java.util.Scanner;
class Area {
    private double radius;
    private  double area;

    public void setRadius(double r){
        this.radius = r ;
    }

    public void CalArea(){
        this.area = this.radius*this.radius*3.14;
    }

    public double display(){
        
        return area;
    }
}

class Testmain{
    public static void main(String[] args){
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        double r = sc.nextDouble();

        obj.setRadius(r);
        obj.CalArea();
        System.out.println(obj.display());
        sc.close();
    }
}
