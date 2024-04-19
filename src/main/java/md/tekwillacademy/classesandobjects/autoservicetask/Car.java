package md.tekwillacademy.classesandobjects.autoservicetask;

public class Car {
    String name;
    String color;
    String model;
    int numberOfDoors;

    //Constructor with parametres
    public Car (String nameInputParam, String colorInputParam, String model){
    this.name= nameInputParam;
    this.color = colorInputParam;
    this.model = model;
    System.out.println("This is constructor with parameters");
    }

    //Constructor with one param
    public Car (String modelInputParam) {
    this.model = modelInputParam;
        System.out.println("This is constructor with one parameter: " + this.model);
    }
}

