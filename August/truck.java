package August;

public class truck {
    // attribute
    String color;
    String model;

    public void solution(){
        System.out.println("color :" + color);
        System.out.println("model :" + model);
    }
    public static void main(String[] args) {
        // create a object of the class, we can acces the attributes and method.
        truck mytTruck = new truck();

        // accessing the attributes.
        mytTruck.color = "red";
        mytTruck.model = "HP";

        // calling method.
        mytTruck.solution();      
    }
    
}
