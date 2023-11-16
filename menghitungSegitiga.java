import java.util.Scanner;
class menghitungSegitiga{
    
    static int Segitiga(int alasSegitiga,int tinggiSegitiga){

        int luasSegitiga = alasSegitiga * tinggiSegitiga/2;
        return luasSegitiga;
        
    }

    public static void main(String []args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Alas Segitiga :");
        int alasSegitiga = input.nextInt();
        System.out.print("Masukkan Tinggi Segitiga :");
        int tinggiSegitiga =input.nextInt();
        
        System.out.println("Luas Segitiga dari Alas Segitiga " + alasSegitiga + " dan Tinggi Segitiga " + tinggiSegitiga + " adalah : "+ Segitiga(alasSegitiga,tinggiSegitiga));
        
        input.close();
    }
    
    
        


    
}
