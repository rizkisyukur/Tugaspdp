import java.util.Scanner;
class Inputnilai {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Mata Kuliah 1 : ");
        int c = input.nextInt();
        // c=nilai mata kuliah 1

        System.out.print("Masukkan Nilai Mata Kuliah 2 : ");
        int d = input.nextInt();
        //d=nilai mata kuliah 2

        System.out.print("Masukkan Nilai Mata Kuliah 3 : ");
        int e = input.nextInt();
        //e=nilai mata kuliah 3

        double f = ((c+d+e)/3d); 
        //f=nilai Rata-Rata

        System.out.println("===== Data Nilai Mahasiswa =====");
        System.out.println("Nilai Mata kuliah 1 : "+c);
        System.out.println("Nilai Mata kuliah 2 :"+d);
        System.out.println("Nilai Mata kuliah 3 :"+e);
        System.out.println("Nilai Rata-rata :"+f);
        System.out.println("================================");

        input.close();

            



  }
}

