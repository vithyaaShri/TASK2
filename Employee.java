public class Employee extends Person{
    
    int empId;
    int salary;

    public Employee(String name,int age,int empid,int salary){
        super(age,name);
        this.empId=empid;
        this.salary=salary;
    }
    
}
