import java.util.Scanner;
public class pekerja {
    public static void main(String[]args){
        int honor = 3000000;
        Scanner input = new Scanner(System.in);
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. DAMAI SEJAHTERA");
        System.out.print("Masukkan Nama Karyawan : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Golongan : ");
        int golongan = input.nextInt();
        System.out.print("Masukkan Pendidikan (1 untuk SMU/2 untuk D3/3 untuk S1) : ");
        int pendidikan = input.nextInt();
        System.out.print("Masukkan Jumlah Jam Kerja (perharinya) : ");
        int waktu = input.nextInt();

        if(golongan==1){
            System.out.println("Karyawan yang bernama :" +nama);
            System.out.println("Honor yang diterima ");
            
            if(pendidikan==1){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*5/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*5/100+honor*5/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*5/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*5/100+honor*5/200));;
                }
    
            }else if(pendidikan==2){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*10/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*5/100+honor*10/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*10/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*5/100+honor*10/200));;
                }
            }else if(pendidikan==3){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*15/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*5/100+honor*15/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*5/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*15/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*5/100+honor*15/200));;
                }
            }
        }else if(golongan==2){
            System.out.println("Karyawan yang bernama :" +nama);
            System.out.println("Honor yang diterima ");
            
            if(pendidikan==1){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*5/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*10/100+honor*5/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*5/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*10/100+honor*5/200));;
                }
    
            }else if(pendidikan==2){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*10/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*10/100+honor*10/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*10/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*10/100+honor*10/200));;
                }
            }else if(pendidikan==3){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*15/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*10/100+honor*15/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*10/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*15/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*10/100+honor*15/200));;
                }
        }    
        }else if(golongan==3){
            System.out.println("Karyawan yang bernama :" +nama);
            System.out.println("Honor yang diterima ");
            
            if(pendidikan==1){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*5/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*15/100+honor*5/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*5/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*15/100+honor*5/200));;
                }
    
            }else if(pendidikan==2){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*10/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*15/100+honor*10/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*10/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*15/100+honor*10/200));;
                }
            }else if(pendidikan==3){
                if (waktu>8){
                    int lembur=(waktu-8);
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*15/200);
                    System.out.println("Honor Lembur : " + lembur*2500);
                    System.out.println("Total Honor yang diterima : "+ (honor+honor*15/100+honor*15/200+lembur*2500));
                }else if (waktu<=8){
                    System.out.println("Honor Tetap : 3.000.000");
                    System.out.println("Tunjangan Jabatan : " + honor*15/100);
                    System.out.println("Tunjangan Pendidikan : " + honor*15/200);
                    System.out.println("Total Honor yang diterima : "+(honor+honor*15/100+honor*15/200));;
                }
            }
        }
        input.close();
    }
}
