class One{
    One(int x){
        System.err.println(x);
    }
}
class Two extends One { 
    Two(int x){
        super(x);
    }
}
public class prob4app {
    public static void main(String[] args) {
        One OneObj=new One(1);
        Two TwoObj=new Two(2);
    }
}