package RegularExpresion;

import java.util.Scanner;

public class Regular {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入有效手机号码：");
		String mobile = "";
		while (true) {
			mobile = scan.nextLine();
			if (Validate.isMobile(mobile)) {
				break;
			} else {
				System.out.println("输入不正确，请重新输入！");
			}
		}

		System.out.println("请输入有效固定电话号码：");
		String phone = "";
		while (true) {
			phone = scan.nextLine();
			if (Validate.isPhone(phone)) {
				break;
			} else {
				System.out.println("输入不正确，请重新输入！");
			}
		}

		System.out.println("请输入有效邮箱号码：");
		String mail = "";
		while (true) {
			mail = scan.nextLine();
			if (Validate.isMail(mail)) {
				break;
			} else {
				System.out.println("输入不正确，请重新输入！");
			}
		}
		System.out.println("录入完毕！");
	}

}
