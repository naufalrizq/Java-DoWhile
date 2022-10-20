/**Algoritma
 * 1.Meminta masukkan bilangan bulat 
 * 2.Mengecek apabila angka yang diinput adalah angka "Strong"
 * 3.Jika true, maka output "YA"
 * 4.Jika false, maka output "BUKAN"
 */

import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		int angka,jumlah = 0,temp,remp;
		Scanner s = new Scanner(System.in);
		angka = s.nextInt();
		temp = angka;
		s.close();
		while(angka>0){
			remp = angka%10;
			int fact = 1;
			for(int i=1;i<=remp;i++){
				fact = fact*i;
			}
			angka = angka/10;
			jumlah = jumlah + fact;
			}
			if(temp == jumlah)
			System.out.println("YA");
			else
			System.out.println("BUKAN");
		}

		}
		
	

