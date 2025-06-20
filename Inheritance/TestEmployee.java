class employee{
    String name;
    int salary;
}
class manager extends employee{
    void assigntask(){
        System.out.println("manger "+name+" assigning tasks");
    }
}
class developer extends employee{
    void writecode(){
        System.out.println("developer "+ name+" is writing java code");
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        manager m =new manager();
        m.name="prince";
        m.assigntask();
        developer d =new developer();
        d.name="rohan";
        d.writecode();   
    }
}
