package SubjectEnrolment;


import java.util.Scanner;

public class Driver {
	private static Enroll enroll = null;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int choice = menu();
		while (choice != 4) {
			switch (choice) {
			case 1:
				create();
				break;
			case 2:
				add();
				break;
			case 3:
				print();
				break;
			default:
				System.out.println("������Ч��������ѡ��");
				break;
			}
			choice = menu();
		}
		System.out.println("bye,��ӭ�´μ���ʹ��");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("=========��ӭʹ��WTUѡ��ϵͳ=========");
		System.out.println("1.�����γ�");
		System.out.println("2.ѧ��ѡ��");
		System.out.println("3.��ӡ����");
		System.out.println("4.�˳�ϵͳ");
		System.out.println("===============================");
		System.out.print("��ѡ��1��4��:");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void create() {
		Scanner scan = new Scanner(System.in);
		if (enroll != null) {
			System.out.println("ѡ���Դ������Ƿ���´���(y/n):");
			String choice = scan.nextLine();
			if (choice.equalsIgnoreCase("n")) {
				return;
			}
		}

		System.out.println("������γ̴���:");
		String subjectId = scan.nextLine();
		System.out.println("������γ�����:");
		String subjectName = scan.nextLine();
		Subject subj = new Subject(subjectId, subjectName);
		System.out.println("������ѧ��:");
		int year = scan.nextInt();
		System.out.println("������ѧ��:");
		int semeter = scan.nextInt();
		System.out.println("�������������:");
		int max = scan.nextInt();
		enroll = new Enroll(year, semeter, subj, max);
		System.out.println("�����ɹ�����Ϣ����:");
		System.out.println(subj.toString());
		System.out.println("ѧ��:"+year+"\tѧ��:"+semeter+"\t�������:"+max);
	}

	public static void add() {
		if (enroll == null) {
			System.out.println("���ȴ����γ���ִ�иù��ܣ�");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ��:");
		String stuId = scan.nextLine();
		if (enroll.indexOf(stuId) >= 0) {
			System.out.println("ѧ��" + stuId + "�Ѵ��ڣ�������ѡ��");
			return;
		}
		System.out.println("����������:");
		String stuName = scan.nextLine();
		Student stu = new Student(stuId, stuName);
		if (enroll.add(stu)) {
			System.out.println("ף����ѡ�γɹ����������ϿΣ�");
			System.out.println("Ŀǰѡ������:" + enroll.size());
		} else {
			System.out.println("�ܱ�Ǹ�γ�����������ѡ��ʧ�ܣ�");
		}

	}

	public static void print() {
		if (enroll == null) {
			System.out.println("���ȴ����γ���ִ�иù��ܣ�");
			return;
		}
		System.out.println(enroll.toString());
	}
}