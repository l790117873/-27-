package RegularExpresion;

import java.util.Scanner;

public class Regular {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ч�ֻ����룺");
		String mobile = "";
		while (true) {
			mobile = scan.nextLine();
			if (Validate.isMobile(mobile)) {
				break;
			} else {
				System.out.println("���벻��ȷ�����������룡");
			}
		}

		System.out.println("��������Ч�̶��绰���룺");
		String phone = "";
		while (true) {
			phone = scan.nextLine();
			if (Validate.isPhone(phone)) {
				break;
			} else {
				System.out.println("���벻��ȷ�����������룡");
			}
		}

		System.out.println("��������Ч������룺");
		String mail = "";
		while (true) {
			mail = scan.nextLine();
			if (Validate.isMail(mail)) {
				break;
			} else {
				System.out.println("���벻��ȷ�����������룡");
			}
		}
		System.out.println("¼����ϣ�");
	}

}
