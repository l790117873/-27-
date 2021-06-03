package SubjectEnrolment;

public class Enroll {
	private int year;
	private int semester;
	private Subject subj;
	private Student stus[];
	
	private int count;
	
	public Enroll(int year,int semester,Subject subj,int max){
		this.year=year;
		this.semester=semester;
		this.subj=subj;
		stus=new Student[max];
		
	}
	public boolean add(Student stu){
		if(stu==null){
			return false;
		}
		if(count>=stus.length){
			return false;
		}
		stus[count]=stu;
		count++;
		return true;
	}
	public Student get(int index){
		return stus[index];
	}
	public int size(){
		return this.count;
	}
	public int indexOf(String id){
		for(int i=0;i<this.count;i++){
			if(stus[i].getId().equals(id)){
				return i;
			}
		}
		
		return -1;
		
	}
	public String toString(){
		String info;
		info="学年"+this.year+",学期"+this.semester+"\n";
		info=info+this.subj.toString()+"\n";
		info="学生选课情况如下:\n";
		info=info+"序号\t学号\t姓名"+"\n";
		for(int i=0;i<count;i++){
			info=info+(i+1)+"\t"+stus[i].toString()+"\n";
		}
		info=info+"选课人数:"+this.count;
		return info;
	}

}