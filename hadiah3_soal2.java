// Tugas Hadiah pertemuan3 Nomor 2
// melakukan pengimputan Data di dalam Java Import Class Scanner Masuk ke Program

import java.util.Scanner;

public class hadiah3_soal2 {
	
public static void main(String[] args) {
		
		int umur;
		String alamat,nama;
		
	Scanner input = new Scanner(System.in);
	
System.out.println("Tugas Hadiah pertemuan3 Nomor 2");
System.out.println("\n");
	
System.out.print("Masukkan nama anda : ");
	nama = input.nextLine();
	
System.out.print("Masukkan alamat anda : ");
	alamat = input.nextLine();

System.out.print("Masukkan umur anda : ");
	umur = input.nextInt();

System.out.println("\n");
	
	
	System.out.println("Saudara : " + nama);
	System.out.println("Tinggal di : " + alamat);
	System.out.println("Berumur : " + umur + " tahun");


	}
		
}