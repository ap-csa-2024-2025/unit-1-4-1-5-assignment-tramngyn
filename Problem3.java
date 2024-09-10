public class Problem3
{
  public static void main(String[] args)
  {
    int value = 9021; 
    System.out.println("This is the value: " + value);
    System.out.println("Here are the digits:");
    System.out.println(value/10/10/10 % 10);
    System.out.println(value/10/10 % 10);
    System.out.println(value/10 % 10);
    System.out.println(value % 10);
  }
}
