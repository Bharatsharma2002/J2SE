class MathOperation{
    
    public float multiply(float val1 , float val2 , float val3){
        return val1*val2*val3;
    }

    public int multiply(int val1 , int val2){
        return val1*val2;
    }

    public int multiply(int arr[]){
        int sum=1;
        for (int j=0 ; j<arr.length ; j++)
        sum = sum*arr[j];

        return sum;
    }

    public double multiply(double val1 , int val2){
        return val1*val2;
    }
}

class Testmain{
    public static void main(String[] args){
        MathOperation obj = new MathOperation();

        int arr[]={23,56,12,86,23};

        System.out.println("3 Float digit multiplication : "+obj.multiply(32.5f,48.5f,23.4f));

        System.out.println("Integer Multiplication : "+obj.multiply(35,48));

        System.out.println("Array Element Multiplication : "+obj.multiply(arr));

        System.out.println("Double and Integer Multiplication : "+obj.multiply(35.64,48));
    }
}