import java.util.Scanner;
class Product {
     private int pId ;
     private int price ;
     private int quantity ;
     private static int totalAmount ;
    
     protected Product(int pId , int price , int quantity ){       
        this.pId = pId;
        this.price = price ;
        this.quantity = quantity;
        
        }    

    public int getTotalAmount(Product arr[]){
       int totalAmount=0;
        for (int i=0 ; i<arr.length ; i++){
        totalAmount = totalAmount + (arr[i].getPrice() * arr[i].getQuantity());
        }
        return totalAmount;
    }  

    public int highPricePid(Product arr[]){
        int c=0;
        for (int i=0 ; i<arr.length ; i++){
            int max = arr[i].getPrice();
            if (arr[i].getPrice()>max)
             c = i;
        }
        System.out.println("Value of c : "+ c);
        System.out.println("Value of id : "+arr[c].getId());
        return arr[c].getId();

    }
    
    
    public int getId(){
        return this.pId;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
}
class XYZ{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Product[] arr;
    arr = new Product[2];
    
        int pId = 1;
        for(int i=0 ; i<arr.length ; i++){
        System.out.print("Enter the price of Product "+ pId+" : ");
        int price = sc.nextInt();
          
        System.out.print("Enter the Quantity of product "+ pId+" : ");
        int quantity = sc.nextInt();
              
        arr[i] = new Product(pId , price , quantity);
        pId++;
        
        }

        System.out.println(arr[0].getTotalAmount(arr) );
        System.out.println(arr[1].highPricePid(arr));
    }

    
}