import java.util.Scanner;
public class pengulanganganjil{
    public static void main(String []args){
        System.out.println("===Pengulangan Bilangan Ganjil===");
        Scanner loop = new Scanner(System.in);
        System.out.print("Banyak bilangan ganjil :");
        int input = loop.nextInt();
       
        
            for(int i=1; i <= input*2; ++i){
                
                if(i%2 == 0){
                    continue;
                }
               
                System.out.println(i);
            }
            loop.close();
 }
}
