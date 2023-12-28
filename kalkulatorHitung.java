import java.util.Scanner;
    public class kalkulatorHitung {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        double c,d;
        System.out.print("Pilih Operasi Yang diinginkan (+, *,): ");
        char operation = input.next().charAt(0);
        switch(operation){
            case '+':
                System.out.print("Masukan Angka 1: ");
                a = input.nextInt();
                System.out.print("Masukan Angka 2: ");
                b = input.nextInt();
                kalkulatorHitung hasil = new kalkulatorHitung() ;
                System.out.println("Hasil penjumlahan: " + hasil.kal(a, b));
                break;
            case '*':
                System.out.print("Masukan Angka 1: ");
                c = input.nextInt();
                System.out.print("Masukan Angka 2: ");
                d = input.nextInt();
                kalkulatorHitung hasil2 = new kalkulatorHitung() ;
                System.out.println("Hasil perkalian: " + hasil2.kal(c, d));
                break;
        }
        input.close();
        }

        // Method tambah() dengan dua parameter bertipe integer
        public int kal(int a, int b) {
        return a + b;
        }

        // Method tambah() dengan dua parameter bertipe double
        public double kal(double c, double d) {
        return c * d;
        }
    }
 
