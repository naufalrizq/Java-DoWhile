/**Algoritma
 * 1.Menginput deret bilangan yang diakhiri dengan angka 0
 * 2.Menghitung rata rata dari deret bilangan tadi
 * 3.Hasil rata rata akan keluar dengan format 2 angka dibelakang koma
 */

import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
	
		int angka;
		int a =0;
        double jumlah = 0;
        Scanner s = new Scanner (System.in);
        do{
			a++;
            angka = s.nextInt();
            jumlah += angka;
			
        }while (angka != 0);
        System.out.printf("%.2f", jumlah/(a-1));
		s.close();
	}
}
