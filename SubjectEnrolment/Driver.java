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
				System.out.println("输入无效，请重新选择");
				break;
			}
			choice = menu();
		}
		System.out.println("bye,欢迎下次继续使用");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("=========欢迎使用WTU选课系统=========");
		System.out.println("1.创建课程");
		System.out.println("2.学生选课");
		System.out.println("3.打印名单");
		System.out.println("4.退出系统");
		System.out.println("===============================");
		System.out.print("请选择（1～4）:");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void create() {
		Scanner scan = new Scanner(System.in);
		if (enroll != null) {
			System.out.println("选课以创建，是否更新创建(y/n):");
			String choice = scan.nextLine();
			if (choice.equalsIgnoreCase("n")) {
				return;
			}
		}

		System.out.println("请输入课程代码:");
		String subjectId = scan.nextLine();
		System.out.println("请输入课程名称:");
		String subjectName = scan.nextLine();
		Subject subj = new Subject(subjectId, subjectName);
		System.out.println("请输入学年:");
		int year = scan.nextInt();
		System.out.println("请输入学期:");
		int semeter = scan.nextInt();
		System.out.println("请输入最大人数:");
		int max = scan.nextInt();
		enroll = new Enroll(year, semeter, subj, max);
		System.out.println("创建成功，信息如下:");
		System.out.println(subj.toString());
		System.out.println("学年:"+year+"\t学期:"+semeter+"\t最大人数:"+max);
	}

	public static void add() {
		if (enroll == null) {
			System.out.println("请先创建课程再执行该功能！");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学号:");
		String stuId = scan.nextLine();
		if (enroll.indexOf(stuId) >= 0) {
			System.out.println("学号" + stuId + "已存在！不能再选！");
			return;
		}
		System.out.println("请输入姓名:");
		String stuName = scan.nextLine();
		Student stu = new Student(stuId, stuName);
		if (enroll.add(stu)) {
			System.out.println("祝贺你选课成功，请认真上课！");
			System.out.println("目前选课人数:" + enroll.size());
		} else {
			System.out.println("很抱歉课程人数已满，选课失败！");
		}

	}

	public static void print() {
		if (enroll == null) {
			System.out.println("请先创建课程再执行该功能！");
			return;
		}
		System.out.println(enroll.toString());
	}
}