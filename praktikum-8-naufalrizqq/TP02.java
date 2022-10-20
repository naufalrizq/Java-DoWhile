/**Algoritma
 * 1.Meminta masukkan bilangan bulat 1 < N < 10.000.000 (N)
 * 2.Membalik N yang telah diinput
 * 3.Output hasil angka yang telah dibalik
 */

import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		int angka, balik = 0;
     
		Scanner s = new Scanner(System.in);
		angka = s.nextInt();
		while( angka != 0 )
		{
			balik = balik * 10;
			balik = balik + angka%10;
			angka = angka/10;
		}
		System.out.println(balik);
		s.close();
	}
}
