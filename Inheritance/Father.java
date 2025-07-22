class grandfather{
    String name="prince";
    void laugh(){
        System.out.println("hahaah");
    }
}
public class Father extends grandfather {
    int age=16;
    void play(){
        System.out.println("playing");
    }
    public static void main(String[] args) {
        Father f=new Father();
        System.out.println(f.age);
        System.out.println(f.name);
        f.play();
        f.laugh();
    }
}
