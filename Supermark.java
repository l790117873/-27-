package DataPasswrod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Supermark {
	public static void main(String[] args) {
		String aLine;
		
		String productName;
		double price;
		int number;
		double total;
		String lsh;
		String prefix;
		String no="0000";
		
		int count=0;
		int saleNumber=0;
		double totalMoney=0;
		
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
		prefix=df.format(new Date());
		Scanner scan=new Scanner(System.in);
		String msg="流水号\t\t商品名称\t商品数量\t单价\t总价\n";
		
		while(!(aLine=scan.nextLine()).equals("0000")){
			String arr[]=aLine.split(",|，");
			productName=arr[0];
			price=Float.parseFloat(arr[1]);
			number=Integer.parseInt(arr[2]);
			
			
			total=price*number;
			
			no=generateNo(no);
			lsh=prefix+no;
			
			msg=msg+lsh+"\t"+productName+"\t"+price+"\t"+number+"\t"+total+"\n";
			count++;
			saleNumber=saleNumber+number;
			totalMoney=totalMoney+total;
		}
		msg=msg+"总计:销售笔数"+count+",销售数量";
				
				
		
	}
	public static String generateNo(String lastNo){
		String newNo=String.valueOf(Integer.parseInt(lastNo)+1);
		int zeroNumber=4-newNo.length();
		for(int i=0;i<zeroNumber;i++){
			newNo="0"+newNo;
		}
		
		return newNo;
		
	}

}
