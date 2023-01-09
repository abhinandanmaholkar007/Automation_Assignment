public class Test4 {
static void m1()
{
    System.out.println("Inside 0 arg m1");
}

 int m1(int a) {
    System.out.println("Inside 1 args m1 " + a);
    return a;
}

    public static void main(String[] args) {
        Test4.m1();
        Test4.m1();
    }
}
