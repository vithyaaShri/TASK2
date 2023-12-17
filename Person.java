public class Person {
    String name;
    int age;
    public Person(){
        this.age=18;
        this.name="Angel";
    }
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void Display(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }
}
