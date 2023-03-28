package toString;

public class Run {
    public static void main(String[] args){
        Student s = new Student();
        s.name="sam";
        s.age=23;
        Address address = new Address();
        address.address1="25 king street";
        address.city="toronto";
        address.province="ontario";
        s.address=address;
       System.out.println(s.name);
        System.out.println(s.address);

    }
}
