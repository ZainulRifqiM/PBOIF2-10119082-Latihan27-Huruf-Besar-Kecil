/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi Program :Huruf Besar Kecil
 */
public class PBOIF210119082Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Masukan Kalimat: ");
       kalimat = scanner.nextLine();
        
        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();
        
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf besar: " + hurufBesar);
        System.out.println("Huruf kecil: " + hurufKecil);
        System.out.println("Developed by : Zainul Rifqi Muwaffaq");
    }
    
}
