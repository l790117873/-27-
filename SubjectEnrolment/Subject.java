package SubjectEnrolment;

public class Subject {
	private String id;
	private String name;
	
	
	public Subject() {
		super();
	}


	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "课程代码:"+id + "\t课程名:" + name;
	}

}

