import java.util.Scanner;
    public class arrayMahasiswa {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Mahasiswa: ");
    int jumlahMahasiwa = input.nextInt();
    int[] umurMahasiswa = new int [jumlahMahasiwa];
        for (int i = 0; i < jumlahMahasiwa; i++) {
        System.out.print("Umur Mahasiswa Ke-" + (i + 1) + ": ");
        umurMahasiswa[i] = input.nextInt();
        }
    System.out.println("");
    System.out.println("Data Umur Mahasiswa");
        for (int i = 0; i < jumlahMahasiwa; i++){
        System.out.println("Umur Mahasiswa Ke-" + (i + 1) + ": " + umurMahasiswa[i]);
        }  
        input.close();
    }
}
