import java.util.Scanner;

class TakingInput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name");
        String name=sc.nextLine();

        System.out.println("Enter any number");
        int num=sc.nextInt();

        
        System.out.println("Name is: "+name);
        System.out.println("Your number is "+num);
    }
}