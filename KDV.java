import java.util.Scanner;
public class KDV {

	public static void main(String[] args) {		
		Scanner kb=new Scanner(System.in);
		System.out.println("Fiyat giriniz: ");
		double fiyat=kb.nextDouble();
		double kdvOran=(fiyat<=1000)?0.18:0.08;
		double kdvTutar=fiyat*kdvOran;
		double kdvliFiyat=kdvTutar+fiyat;
		System.out.println("KDV'siz tutar: "+fiyat);
		System.out.println("KDV oraný: "+kdvOran);
		System.out.println("KDV tutarý: "+kdvTutar);
		System.out.println("KDV'li tutar: "+kdvliFiyat);
	}

}
