import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame{
    public static void main(String agrs[]){
        int max  , random_num , user_num ;
        Random r = new Random();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Upper limit :");
        max = sc.nextInt();
        random_num = r.nextInt(max)+1;
        while (true) {
            System.out.println("");
            System.out.println("Enter Your Guess : ");
            user_num = sc.nextInt();
            if(random_num == user_num){
                System.out.println("Ohhh! Niceeee , You Guessed it right");
                break;
            }
            else if(user_num > random_num){
                System.out.println("");
                System.out.println("Number is lower that this.");
            }
            else{
                System.out.println("");
                System.out.println("Number is Higher that this.");
            }
        }
        sc.close();
        System.out.println("");
        System.out.println("End!");
    }  
}