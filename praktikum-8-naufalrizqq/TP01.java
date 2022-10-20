/**Algoritma
 * 1.Menginput bilangan bulat antara 60 < N < 10.000.000(N)
 * 2.Menghitung jumlah waktu yang dibutuhkan untuk amoeba membelah diri menjadi (N)
 * 3.Output total waktu yang dibutuhkan
 */

import java.util.Scanner;
public class TP01 {

	public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
		int amoeba = s.nextInt();
		int membelah = 0;
		boolean lanjut = true;
		while(lanjut){
			if(amoeba <= 30){
				lanjut = false;
			} else if(amoeba != 30){
				amoeba /= 2;
				membelah++;
			}
		}
                System.out.println(membelah*15);
				s.close();	
}
}
