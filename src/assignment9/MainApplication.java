package assignment9;

public class MainApplication {
    public static void main(String[] args) {
        Addition addition=new Addition();
        addition.add(300,394);
        Addition_Varagrs additionVaragrs=new Addition_Varagrs();
        additionVaragrs.add(485,685,487735,374,273);
    }
}
class Addition{
    public void add(int number1, int number2){
        int sum=number1+number2;
        System.out.println("sum is --> "+sum);

    }

}

class Addition_Varagrs{
    public void add(int... number)
    {
        int sum=0;
        System.out.println("size of argument --> "+number.length);
        for  (int number1: number) sum += number1;
        System.out.println("sum of varargs method --> "+sum);
    }

}
