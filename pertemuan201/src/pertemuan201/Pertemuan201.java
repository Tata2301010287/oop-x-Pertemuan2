
package pertemuan201;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author INSTIKI
 *TGL: 15 Maret 2025 
 * */
public class Pertemuan201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mhs = "Antonia Tatarianingish Abur";
        String nim = "2301010287";
        
        BufferedReader dtin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("membaca input keyboard");
        try{
            System.out.print("Input Nama: ");
            mhs = dtin.readLine();
            System.out.print("Input NIM: ");
            nim = dtin.readLine();
        }catch(IOException e){
            System.out.println("Terjadi masalah pembacaan keyboard");
    }
        
        System.out.printf("Mahasiswa dengan nama %s, memiliki NIM %s",mhs,nim);
    }
    
}
