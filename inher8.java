class OneBHK{
    private int roomArea;
    private int hallArea;
    private int price ;

    public OneBHK(){
      roomArea = 0;
      hallArea = 0;
      price  = 0;
    }

    public OneBHK(int roomArea , int hallArea , int price){
    this.roomArea = roomArea;
    this.hallArea = hallArea;
    this.price = price ;      
    }

    public void show(){
    System.out.println("Area of Room : "+ roomArea +"\n"+"Area of Hall : "+ hallArea +"\n"+"Price of Flate : "+price );
        
    }


}