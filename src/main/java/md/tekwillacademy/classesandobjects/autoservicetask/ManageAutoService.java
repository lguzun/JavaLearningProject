package md.tekwillacademy.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        // Object declaration and initialization
        Car toyotaObject = new Car("Yaris");
        toyotaObject.color = "Silver";

        Car KiaObject = new Car("Kia", "Silver","SportAge");

        Garage autoBossObject = new Garage("Dacia");
        Garage autoLuxObject = new Garage("Decebal","AutoLux");


        Worker workerObject = new Worker("Jhon", 25, 50.00);
        Tool toolObject = new Tool("hummer");

        System.out.println("Print for toyotaObject with model: " + toyotaObject.model + " and color: " + toyotaObject.color);
        System.out.println("Print for garageObject with address: " + autoLuxObject.address + " and name " + autoLuxObject.name);
        System.out.println("Print for toolObject with tool name " + toolObject.name);
        System.out.println("Print for workerObject with name " + workerObject.name + " and age " + workerObject.age);
    }



}
