import java.util.Scanner;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        String[] nimMahasiswa = new String[jumlahMahasiswa];
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            namaMahasiswa[i] = input.next();
            
            System.out.print("Masukkan NIM mahasiswa ke-" + (i+1) + ": ");
            nimMahasiswa[i] = input.next();
            
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        
        int nilaiTertinggi = nilaiMahasiswa[0];
        int indexMahasiswaTertinggi = 0;
        
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
                indexMahasiswaTertinggi = i;
            }
        }
        
        System.out.println("Mahasiswa dengan nilai tertinggi adalah:");
        System.out.println("Nama: " + namaMahasiswa[indexMahasiswaTertinggi]);
        System.out.println("NIM: " + nimMahasiswa[indexMahasiswaTertinggi]);
        System.out.println("Nilai: " + nilaiMahasiswa[indexMahasiswaTertinggi]);
        
        input.close();
    }
    
}