package src.by.lwo;
import src.by.ecp.Circle;

public class StartCircle {
    public static void main(String[] args) {
      Circle c = new Circle(1.23);
      System.out.println("----- Мы получили данные из другого класса -----");
      System.out.println(c.getRadius());
   }
}
