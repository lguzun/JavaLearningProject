package md.tekwillacademy.classesandobjects.autoservicetask;

public class Tool {
    String name;
    double price;
    double weight;

    public Tool (String name){
        this.name = name;
        System.out.println("This is constructor with one parameter for tool: " + this.name);
    }

    public Tool (){
        System.out.println("Constructor with no parameters for tool " + this.name+ "and for weight " + this.weight );
    }
}
