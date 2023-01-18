package assignment13;

public class NumericData {
        public static void main(String[] args) {
            System.out.println("Execution start");
            //we are not able to handle check exception
            try{
                int a=90/0;}
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("Execution Stop");
        }
    }


