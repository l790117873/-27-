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
		info="ѧ��"+this.year+",ѧ��"+this.semester+"\n";
		info=info+this.subj.toString()+"\n";
		info="ѧ��ѡ���������:\n";
		info=info+"���\tѧ��\t����"+"\n";
		for(int i=0;i<count;i++){
			info=info+(i+1)+"\t"+stus[i].toString()+"\n";
		}
		info=info+"ѡ������:"+this.count;
		return info;
	}

}