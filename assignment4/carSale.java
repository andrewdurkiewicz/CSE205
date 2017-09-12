public class carSale
{

  public static void main(String[] args)
  {
      Car c1 = new Car(2001, "toyota", "camry");
      System.out.println(c1);



      c1.setOwner("janaka", "699 S. Mill ave", "4807899689");
      System.out.println(c1);
  }

}