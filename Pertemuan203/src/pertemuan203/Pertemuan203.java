
package pertemuan203;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dtain = new Scanner(System.in);
        //deklarasi variabel
        Double pi, luas;
        int r = 0;
        String nilai="";
        //deskripsi
        pi = 3.14;
        
        System.out.println("Hitung Luas Lingkaran");
        System.out.println("Input Nilai Jari-jari");
        nilai = dtain.nextLine();
        r = Integer.parseInt(nilai);
        //proses
        luas = pi * r * r;
        
        //output
        System.out.print("Luas Lingkaran: "+luas);
        
    }
    
}
