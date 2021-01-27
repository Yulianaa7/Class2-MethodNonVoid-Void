/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author Yuliana
 */
public class Class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //untuk membuat objek class
        method nilai = new method();
        nilai.isi(); //memanggil method void yang ada di class "method"
        System.out.println("");
        //membuat judul
        System.out.println("============= HASIL NILAI =============");
        //memanggil method-method non void yang ada di class "method"
        System.out.println("Nama                : "+nilai.nama());
        System.out.println("Kelas               : "+nilai.kelas());
        System.out.println("No. Absen           : "+nilai.absen());
        System.out.println("Nama Mata Pelajaran : "+nilai.namamapel());
        System.out.println("Nilai               : "+nilai.nilai());
        nilai.predikat();
    }
    
    
}
