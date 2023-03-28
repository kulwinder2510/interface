package interfacePackage1;

public class InterfaceExample implements WaterBottle {
    public static void main(String[] args) {
        System.out.println(color);
        InterfaceExample ex = new InterfaceExample();
        ex.display();
    }
    @Override
    public void display() {
        System.out.println("it is filled");
    }
}

