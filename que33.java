class Person{
    private String name;
    private int age = 18 ;

    public void setName(String name){
    this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

class  Testmain{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Bharat");
        System.out.println("Name : "+p.getName()+",  Age : " + p.getAge());
    }
}