class vehicle{
    int speed;
    int fuel;
}
class Car extends vehicle{
    void start(){
        System.out.println("Car started at speed "+speed);;
    }
    void stop(){
        System.out.println("car stopped");
    }
}
class Bike extends Car{
    @Override
    void start(){
        System.out.println("Bike started at speed "+speed);;
    }
    @Override
    void stop(){
        System.out.println("Bike stopped");
    }
}
public class TestVehicle {
    public static void main(String[] args) {
        Car c=new Car();
        c.speed=80;
        c.start();
        c.stop();

        Bike b=new Bike();
        b.speed=60;
        b.start();
        b.stop();
    }
}
