
package pbo02.pkg10116374.latihan24.perbandingan;
import java.util.Scanner;

/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan proses perbandingan dua nilai
 *
 */
public class PBO0210116374Latihan24Perbandingan {
    public static void perbandinganNilai(int nilai1, int nilai2){
        if(nilai1 > nilai2){
            System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
        }else if(nilai1 < nilai2){
            System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
        }else{
            System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
        }
    }
    public static void main(String[] args) {
    // TODO code application logic here
    int nilai1, nilai2;
        boolean kondisi = true;
        String ulangi = "Ya";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("======Program Perbandingan Nilai======");
        do {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = keyboard.nextInt();
            System.out.print("Masukkan nilai kedua   : ");
            nilai2 = keyboard.nextInt();
                
            perbandinganNilai(nilai1, nilai2);
            
            System.out.println("");
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = keyboard.next();
            System.out.println("");
            
            if("Ya".equals(ulangi)){
                kondisi = true;
            }else{
                kondisi = false;
            }
        } while (kondisi);
    
    }   
}
