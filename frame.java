package frame;

import java.util.Scanner;

public class frame {
	public static void main(String[] args) {
		
		double width = 1.0;
		double length;
		double crowns;
		double price = 0.0;
		
		String type;
		String colour;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入frame的长度");
		length = scan.nextDouble();
		scan.nextLine();
		
		
		System.out.println("请输入frame的种类");
		type = scan.nextLine();
		
		System.out.println("请输入frame的crowns数量");
		crowns = scan.nextInt();
		
		scan.nextLine();
		System.out.println("请输入frame的颜色");
		colour = scan.nextLine();
		
		if(type.equals("regular"))
		{
			price += (width + length)*0.15 + width*length*0.09 + crowns*0.35;
		}
		else if(type.equals("fancy"))
		{
			price += (width + length)*0.25 + width*length*0.09 + crowns*0.35;
		}
		
		if(colour != "")
		{
			price += (width + length)*0.1;
		}
		System.out.println("frame的价格为：" + price + "$");
	}
}
