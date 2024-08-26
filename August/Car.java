package August;

public class Car {

    // Attributes.
    String color;
    String make;
    int year;

    // method, displays the attributes.
    public void displaymethod(){
        System.out.println("Color" + color);
        System.out.println("Make" + make);
        System.out.println("Year" + year);
    }


    public static void main(String[] args) {
    //    object of the class.
    Car mycar = new Car();

    // set the attribbutes through the object.
    mycar.color = "Green";
    mycar.make = "Toyoat";
    mycar.year = 2010;
    // called method through object.
    mycar.displaymethod();
}
    
}
