/**Algoritma
 * 1.Meminta masukkan deret bilangan yang diakhiri dengan angka 0
 * 2.Menghitung penjumlahan dari N yang diinput
 * 3.Hasil penjumlahan deret angka
 */

import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		
		int angka;
        int jumlah = 0;
        Scanner s = new Scanner (System.in);
        do{
            angka = s.nextInt();
            jumlah += angka;
        }while (angka != 0);
        System.out.println(jumlah);
		s.close();
	}
}
