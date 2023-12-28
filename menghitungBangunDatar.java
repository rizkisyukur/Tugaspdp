import java.util.Scanner;
public class menghitungBangunDatar {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println("=== Program Menghitung Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("Silahkan Pilih (1/2/3) :");
        pilihan = input.nextInt();
        switch(pilihan){
        case 1:
            persegi();
            break;
        case 2:
            segitiga();
            break;
        case 3:
            lingkaran();
            break;
        }
    input.close();
    }
    static void persegi(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung Persegi ===");
        System.out.print("Masukan panjang sisi = ");
        int pSisi = input.nextInt();
        int s = pSisi;
        int luas =s*s;
        int keliling = 4*s;
        System.out.println("Luas perseginya adalah = " + luas);
        System.out.println("Keliling Perseginya adalah = " + keliling);
        input.close();
    }
 
    static void segitiga(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung Segitiga ===");
        System.out.print("Masukan panjang alas = ");
        int alas = input.nextInt();
        System.out.print("Masukan panjang tinggi = ");
        int tinggi = input.nextInt();
        double luas =(0.5*(alas*tinggi));
        int keliling = 3*alas;
        System.out.println("Luas Segitiganya adalah = " + luas);
        System.out.println("Keliling Segitiganya adalah = " + keliling);
    input.close();
    }

    static void lingkaran(){
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        System.out.println("=== Menghitung Lingkaran ===");
        System.out.print("Masukan panjang jari-jari = ");
        int r = input.nextInt();
        double luas =(phi*(r*r));
        double keliling = (2*phi*r);
        System.out.println("Luas Lingkarannya adalah = " + luas);
        System.out.println("Keliling Lingkarannya adalah = " + keliling);
        input.close();
    }
}