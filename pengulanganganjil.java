import java.util.Scanner;
    class pengulanganganjil{
        public static void main(String []args){
            
            System.out.println("============Pengulangan Ganjil==========");
            Scanner input = new Scanner(System.in);
            System.out.print("Banyak bilangan ganjil yang ingin diulang (dari 0) :");
            int loop = input.nextInt();

                for(int i = 1; i<=loop*2; ++i){

                    if(i%2==0){
                        continue;
                    }
                    System.out.println(i);
                }
                input.close();
        }
    }
