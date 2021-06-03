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
		System.out.println("请输入价格");
		DandC = scan.nextFloat();
		
		
		dollar = (int) (DandC / 1);
		twoD = dollar/2;
		oneD = dollar-twoD*2;
		
		fifC = (int)((DandC%1)*100)/50;
		tweC = (int)((DandC%1*100)-50*fifC)/20;
		tenC = (int)((DandC%1*100)-50*fifC-20*tweC)/10;
		fiveC = (int)((DandC%1*100)-50*fifC-20*tweC-10*tenC)/5;
		
		System.out.println("5美分硬币数量"+fiveC);
		System.out.println("10美分硬币数量"+tenC);
		System.out.println("20美分硬币数量"+tweC);
		System.out.println("50美分硬币数量"+fifC);
		System.out.println("1美元硬币数量"+oneD);
		System.out.println("2美元硬币数量"+twoD);
}
}
