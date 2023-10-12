
import java.util.Scanner;
class pengulanganwhile{
    public static void main(String []args){
         System.out.print("Banyak Pengulangan :");
        Scanner loop = new Scanner(System.in);
        int input = loop.nextInt();
        System.out.print("Kata yang ingin diulang :");
        Scanner kata = new Scanner(System.in);
        String input2 = kata.nextLine();
            int i = 1;
            while(int i <= loop){
               
                System.out.println(input2);
            }
            loop.close();
            kata.close();
 }
}