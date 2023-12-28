class matriks{
    public static void main(String[] args){
    int[][] x = {{2, 5, 3}, {4, 1, 6}};
    int[][] y = {{1, 4, 3}, {3, 2, 1}};
    int baris = 2;
    int kolom = 3;
    int[][] z = new int[baris][kolom];
    System.out.println("=== PENJUMLAHAN MATRIK ===");
    //ini untuk menampilkan matrik 1
    System.out.println("MATRIK 1");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) { 
            System.out.print(x[i][j] + " ");
            }
        System.out.println();
        }
        //ini untuk menampilkan matrik 2
    System.out.println("MATRIK 2");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) { 
            System.out.print(y[i][j] + " ");
            }
        System.out.println();
        }
    // proses penjumlahan matrik 1 dan 2
    System.out.println("Hasil Penjumlahan Matrix 1 dan Matrix 2 adalah : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
            z[i][j] = x[i][j] + y[i][j]; 
            System.out.print(z[i][j] + " ");
            }
        System.out.println();
        }
    }
}