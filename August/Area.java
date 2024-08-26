package August;

public class Area {
    public Integer solution(int lenght, int width){
        return lenght * width;
    }
    public static void main(String[] args) {
        Area calculate = new Area();
        int result = calculate.solution(3, 9);
        System.out.println("The area of rectangle is :" + result);
        
    }
    
}
