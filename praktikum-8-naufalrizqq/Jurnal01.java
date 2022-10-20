/**Algoritma
 * 1.Meminta masukkan zat radioaktif dan jumlah hari
 * 2.Mengkalkulasi sisa zat radio aktif(R) dalam berapa hari (N)
 * 3.Hasil bilangan riil sisa zat radio aktif dalam format 3 angka belakang koma
 */
import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		
		Scanner s = new Scanner(System.in);
		int radioAktif = s.nextInt();
		int hari = s.nextInt();
		
		int pangkat = hari/10;
		int rasio = 2;
		int i = 1; 
		s.close();
		//while loop
		while(i < pangkat){
			rasio *=2;
			i++;
		}
		double rumus = (double)radioAktif / rasio;
		
		System.out.printf("%.3f\n",rumus);
	}
}
