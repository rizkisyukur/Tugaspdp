import java.util.Scanner;
class Inputnilai {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String a = input.nextLine();
        // a=nama

        System.out.print("Masukkan NIM : ");
        int b = input.nextInt();
        // b=NIM

        System.out.print("Masukkan Nilai Tugas : ");
        int c = input.nextInt();
        // c=nilai tugas

        System.out.print("Masukkan Nilai UTS : ");
        int d = input.nextInt();
        //d=nilai UTS

        System.out.print("Masukkan Nilai UAS : ");
        int e = input.nextInt();
        //e=nilai UAS

        double f = (c*30/100d+d*30/100d+e*40/100d); 
        //f=nilai Akhir

        System.out.println("===== Data Nilai Mahasiswa =====");
        System.out.println("Nama : "+a);
        System.out.println("NIM : "+b);
        System.out.println("Nilai Tugas : "+c);
        System.out.println("Nilai UTS :"+d);
        System.out.println("Nilai UAS :"+e);
        System.out.println("Nilai Akhir :"+f);
        System.out.println("================================");

            if(f>=60){
                System.out.println(a+"LULUS");
            } else if(f<60){
                System.out.println(a+"Tidak LULUS");
            }

        input.close();

            



  }
}

