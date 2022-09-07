// 37)Create class Tile to store the edge length of a square tile , and create another 
// class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) 
// in Floor class with Tile as argument to calculate the whole 
// number of tiles needed to cover the floor completely.

class SquareTile {
    private int length ;

    public SquareTile(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the length of Tile : ");
        int a = sc.nextInt();
        this.length = a;

    } 
    
    public int getTileArea(){
    return length*length;
    }

}

class Floor{

    private int length ;
    private int width ; 

    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    public Floor(){
        System.out.println("Enter the length of Floor");
        int length = sc.nextInt();
        this.length = length;
        
        System.out.println("Enter the width of Floor");
        int width = sc.nextInt();
        this.width = width;        
    }

    public int getFloorArea(){
        return this.length*this.width;
    }

    public void setLength(int length ){
        this.length = length ;
    }

    public void setwidth(int width ){
        this.width = width ;
    }

    public int  getFloorwidth(){
       return  this.width  ;
    }

    public int getFloorLength(){
        return  this.length  ;
     }

     public int NumberofTiles(SquareTile st,Floor f){
         int count =0 ;
         count = f.getFloorArea()/st.getTileArea();
         return count;
     }

}
class Testmain{
    public static void main(String[] args){
       
        SquareTile st = new SquareTile();
        System.out.println("Area of a Tile : "+st.getTileArea());

        Floor f = new Floor();
        System.out.println("Area of Floor : " + f.getFloorArea());

        System.out.println("Number of tile needed : "+ f.NumberofTiles(st , f));


    }
}