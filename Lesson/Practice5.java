import java.util.*;

public class Practice5
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the 2nd number: ");
        int num1 = b.nextInt();
        num = num + num1;
        num1 = num - num1;
        num = num - num1;
        System.out.println("Before the swapping");
        System.out.println("Now the 1st number is " + num);
        System.out.println("Now the 2nd number is " + num1);
    }
}