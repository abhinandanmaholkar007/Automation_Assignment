package dependent;
import independent.Address;

public class Student {
    public void studentMethod()
    {
        System.out.println("Inside Student class method");
        Address address=new Address();
        address.addressMethod();
    }

    public static void main(String[] args) {
        System.out.println("Start the execution");
        Student student=new Student();
        student.studentMethod();
        System.out.println("Stop the execution");
    }
}

