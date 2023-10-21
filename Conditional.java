public class Conditional {
    public static void main(String[] args) {
        // salary it is in integer value.
    int salary  =  34456;
        // Using if condition.
    if (salary >10000){
        // If the salary is more then 10000 it will give you the bonous of 2000.
        salary = salary + 2000;

    }
        //  Using else condition.
     else{
        // else it will give you the bonous of 1000.
        salary = salary + 1000;

     }
    //  Printing the salary.
     System.out.println(salary);

    }
    
}
    
// Expected output is.
// 36456
