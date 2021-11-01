import java.util.*;

class Ans{

  public static void Circle(){
    Scanner s = new Scanner(System.in);
    int radius;
    System.out.println("Enter the radius");
    radius = s.nextInt();
    System.out.println("Circumference is "+(2*3.14*radius)+" and area is "+(3.14*radius*radius));
  }

  public static void main(String[] args) {
    Circle();
  }
}
