// Buatlah program yang menampilkan nama, departemen tempat bekerja, gaji pegawai berdasarkan pengalaman kerja dengan kondisi berikut ini: 

//  Pengalaman kerja kurang dari 1 tahun, pendapatannya sebesar 3.000.000 
//  Pengalaman kerja 1-2 tahun, pendapatannya sebesar 4.000.000 
//  Pengalaman kerja diatas 2 tahun, pendapatannya sebesar 5.000.000 
//  Departemen kerja terdiri dari: Produksi, Marketing dan Inventory 

import java.util.Scanner;

public class pekerjaan{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Pegawai : ");
        String nama = input.nextLine();
        
        System.out.println("====Dapartemen Produksi/Marketing/Iventory====");

            System.out.println("1. Produksi");
            System.out.println("2. Marketing");
            System.out.println("3. Iventory");

        System.out.print("Pilih Departmen : ");
        String Departemen = input.nextLine();
        // if (Departemen == 1){
            System.out.println("========== Opsi Pengalaman ========");
            System.out.println("1. Lama bekerja dalam Tahun");
            System.out.println("2. Lama bekerja dalam Bulan");

            System.out.print("Pilih opsi pengalaman : ");
            int pengalaman = input.nextInt();
            
            if(pengalaman == 1){
                System.out.print("Masukan Lama  : ");
                int lamatahun = input.nextInt();
                    if(lamatahun<1){
                    System.out.println("Gaji = 3.000.000");
                    }else if(lamatahun>=1 && lamatahun<=2){
                    System.out.println("Gaji = 4.000.000");
                    }else{
                    System.out.println("Gaji = 5.000.000");
                    }
            }else if(pengalaman == 2){
                System.out.print("Masukan Lama  : ");
                int lamabulan = input.nextInt();
                    if(lamabulan<12){
                    System.out.println("Gaji = 3.000.000");
                    }else if(lamabulan>=12&& lamabulan<=24){
                    System.out.println("Gaji = 4.000.000");
                    }else{
                    System.out.println("Gaji = 5.000.000");
                    }
            

            input.close();
                // }else if(Pengalaman >= 1 && Pengalaman <= 2 ){
                //     System.out.println("Gaji 4.000.000");
                // }else{
                //     System.out.println("Gaji 5.000.000");
                }
            }
            
    }