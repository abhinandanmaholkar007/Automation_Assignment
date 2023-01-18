package assignment9;

public class TrafficSignal {
    enum EnumClass{
        GREEN,
        YELLOW,
        RED,
    }

    public static void main(String[] args) {

        EnumClass enumVariable=EnumClass.RED;
        switch(enumVariable){
            case RED :
                System.out.println("Stop");
                break;
            case GREEN:
                System.out.println("GO");
                break;
            case YELLOW:
                System.out.println("Look and go");

        }}
}


