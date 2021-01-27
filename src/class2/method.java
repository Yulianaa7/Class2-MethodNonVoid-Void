/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class method {
    //deklarasi variabel
    String nama, predikat, namamapel, kelas;
    int nilai,absen;
    //method void isi
    void isi(){
        //membuat scanner
        Scanner input = new Scanner(System.in);
        //membuat judul
        System.out.println("========= PENDATAAN NILAI SISWA/I =========");
        //agar user dapat memasukkan nama, kelas, nama mapel, no.absen, dan nilai
        System.out.print("Masukkan Nama Siswa/i         : ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas Siswa/i        : ");
        kelas = input.nextLine();
        System.out.print("Masukkan Nama Mata Pelajaran  : ");
        namamapel = input.nextLine();
        System.out.print("Masukkan No. Absen Siswa/i    : ");
        absen = input.nextInt();
        System.out.print("Masukkan Nilai                : ");
        nilai = input.nextInt();   
    }
    //membuat method non void nama untuk memanggil nama yang dimasukkan user di method void
    String nama(){
        return nama;
    }
    //membuat method non void kelas untuk memanggil kelas yang dimasukkan user di method void
    String kelas(){
        return kelas;
    }
    //membuat method non void absen untuk memanggil no.absen yang dimasukkan user di method void
    int absen(){
        return absen;
    }
    //membuat method non void namamapel untuk memanggil nama mata pelajaran yang dimasukkan user di method void
    String namamapel(){
        return namamapel;
    }
    //membuat method non void nilai untuk memanggil nilai yang dimasukkan user di method void
    int nilai(){
        return nilai;
    }
    //membuat method non void predikat untuk menampilkan predikat
    String predikat(){
        //percabangan ketentuan nilai dan predikat
        if(nilai>=85){
            System.out.println("Predikat            : A");
        }else if(nilai>=75){
            System.out.println("Predikat            : B ");
        }else if(nilai>=70){
            System.out.println("Predikat            : C");
        }else{
            System.out.println("Predikat            : D");
        }
        return predikat;
    }
}
    

