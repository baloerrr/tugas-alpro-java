package tugas14_datamahasiswa;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Tugas14_DataMahasiswa {
    
    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        String mahasiswa[][] = new String[10][3];
        
        System.out.println("Masukkan Data Mahasiswa");
            for(int i = 0; i < 10; i++) {
                System.out.println("Data ke-" + (i + 1));
                for(int j = 0; j < 3; j++) {
                    if((i < 10) && (j < 1))
                        System.out.println("NIM: ");
                    if((i < 10) && (j == 1))
                         System.out.println("Nama: ");
                    if((i < 10) && (j == 2))
                         System.out.println("Jurusan: ");
                    mahasiswa[i][j] = input.next();
                }
             }
            
            System.out.println("");
                for(int i = 0; i < 10; i++) {
                    System.out.println("Data ke-" + (i + 1));
                    for(int j = 0; j < 3; j++) {
                        if((i < 10) && (j < 1))
                        System.out.println("NIM: ");
                        if((i < 10) && (j == 1))
                         System.out.println("Nama: ");
                        if((i < 10) && (j == 2))
                         System.out.println("Jurusan: ");
                        System.out.println(mahasiswa[i][j] +" ");
                    }
                }
    
//    Scanner input = new Scanner(System.in);
//    
//    public void masukData(String nim[][], String nama[][], String jurusan[][]){
//         for(int i = 0; i < 10; i++) {
//             System.out.println("Data ke-" + (i+ 1));
//            for(int j = 0; j < 3; j++) {
//                System.out.println( "Masukkan NIM: ");
//                nim[i][j] = input.next();
//                System.out.println( "Masukkan Nama: ");
//                nama[i][j] = input.next();
//                System.out.println( "Masukkan Jurusan: ");
//                jurusan[i][j] = input.next();
//
//            }
//        }
//    }
//    
//    public void tampilData(String nim[][], String nama[][], String jurusan[][]) {
//        for(int i = 0; i < 10; i++) {
//            for(int j = 0; j < 3; j++) {
//                  System.out.println("NIM:" + nim[i][j]);
//                  System.out.println("Nama:" + nama[i][j]);
//                  System.out.println("Jurusan:" + jurusan[i][j]);
//            }
//        }
//    }
//    
//    public static void main(String args[]) {
//        String nim[][] = new String[10][1];
//        String nama[][] = new String[10][2];
//        String jurusan[][] = new String[10][3];
//        Tugas14_DataMahasiswa dataMahasiswa = new Tugas14_DataMahasiswa();
//        System.out.println("Masukkan Data Mahasiswa");
//        System.out.println("");
//        dataMahasiswa.masukData(nim, nama, jurusan);
//        System.out.println("Daftar Mahsiswa");
//        dataMahasiswa.tampilData(nim, nama, jurusan);
//    }
    
    }
}
