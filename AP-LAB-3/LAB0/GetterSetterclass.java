public class GetterSetterclass {
    
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        GetterSetterclass gs = new GetterSetterclass();
        gs.setName("John");
        gs.setAge(25);
        System.out.println("Name: " + gs.getName());
        System.out.println("Age: " + gs.getAge());
        gs.setAge(-5);
    }
}
