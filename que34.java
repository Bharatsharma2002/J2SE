import java.util.Scanner;
class Employee{
    private int empNo ;
    static private  int  empCount ; 
    private static int totalSalary;
    private int salary;

    public Employee(int empNo , int salary ){
        this.empNo = empNo;
        this.salary = salary;
        totalSalary = totalSalary+salary;
        empCount++;
    }
    public int getEmpNo(){
        return this.empNo;
    } 
    public int getSalary(){
        return this.salary;
    }
    public int getTotalSalary(){
        return totalSalary;
    }
    public int totalEmployee(){
        return empCount;
    }
}
class Testmain{
    public static void main(String[] args){
        Employee[] arr;
        
        Scanner sc = new Scanner (System.in);

        arr = new Employee[3];

        int empNo = 1;
        for(int i=0 ; i<arr.length ; i++){
            
            System.out.print("Enter the Salary of Employee "+ empNo+" : ");
            int salary = sc.nextInt();
            if (salary>0){
            arr[i] = new Employee(empNo , salary);
            empNo++;
            }
            else 
            {
                System.out.println("Invalid input please Re-enter value ");
                System.out.println();
                i--;
            }
    }
       //System.out.println("Employee_No. : "+ arr[0].getEmpNo()+"  Salary : "+arr[0].getSalary());
       // System.out.println("Employee_No. : "+ arr[1].getEmpNo()+"  Salary : "+arr[1].getSalary());
       // System.out.println("Employee_No. : "+ arr[2].getEmpNo()+"  Salary : "+arr[2].getSalary());
       System.out.println();
       System.out.println("Total number of employee : "+arr[0].totalEmployee());
       System.out.println();
       System.out.println("TotalSalary : "+ arr[0].getTotalSalary()); 
       sc.close();
    }
}