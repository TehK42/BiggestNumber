import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x,y,z;

        System.out.println("First number is : ");
        x = input.nextInt();

        System.out.println("Second number is : ");
        y = input.nextInt();

        System.out.println("Third number is : ");
        z = input.nextInt();

        if(x > y && x > z) {
            System.out.println("The biggest number is " + x);
        }
        else if(y > z){
            System.out.println("The biggest number is " + y);
        }
        else{
            System.out.println("The biggest number is " + z);
        }


    }
}
