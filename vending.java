import java.util.Scanner;

public class vending {
	public static void main(String[] args) {
		
		float DandC;
		int dollar;
		int fiveC;
		int oneD;
		int twoD;
		
		int tenC;
		int tweC;
		int fifC;

		Scanner scan = new Scanner(System.in);
		System.out.println("������۸�");
		DandC = scan.nextFloat();
		
		
		dollar = (int) (DandC / 1);
		twoD = dollar/2;
		oneD = dollar-twoD*2;
		
		fifC = (int)((DandC%1)*100)/50;
		tweC = (int)((DandC%1*100)-50*fifC)/20;
		tenC = (int)((DandC%1*100)-50*fifC-20*tweC)/10;
		fiveC = (int)((DandC%1*100)-50*fifC-20*tweC-10*tenC)/5;
		
		System.out.println("5����Ӳ������"+fiveC);
		System.out.println("10����Ӳ������"+tenC);
		System.out.println("20����Ӳ������"+tweC);
		System.out.println("50����Ӳ������"+fifC);
		System.out.println("1��ԪӲ������"+oneD);
		System.out.println("2��ԪӲ������"+twoD);
}
}
