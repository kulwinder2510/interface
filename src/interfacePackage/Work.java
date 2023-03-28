package interfacePackage;

public interface Work {
    int a=10;

    default void playing() {
        System.out.println("playing in work");
    }
void Work();
static void display(){
    System.out.println();
}
}

