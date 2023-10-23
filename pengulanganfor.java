
import java.util.Scanner;
 class pengulanganfor{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak Pengulangan :");
        int loop = input.nextInt();
        System.out.print("Kata yang ingin diulang :");
        String kata = input.next();
            
            for(int i=1; i <= loop; ++i){
               
                System.out.println(kata);
            }
            input.close();
 }
}