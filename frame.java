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
		System.out.println("������frame�ĳ���");
		length = scan.nextDouble();
		scan.nextLine();
		
		
		System.out.println("������frame������");
		type = scan.nextLine();
		
		System.out.println("������frame��crowns����");
		crowns = scan.nextInt();
		
		scan.nextLine();
		System.out.println("������frame����ɫ");
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
		System.out.println("frame�ļ۸�Ϊ��" + price + "$");
	}
}
