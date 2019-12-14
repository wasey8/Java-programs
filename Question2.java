//package Question2;

//Student class
class student {
	private String name;
	private int rollno;
	private String department;
	
	void show() {
		System.out.println("Name:" + name +" "+"Roll:"+" "+ rollno +" "+"Department:" + department);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name ;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	void show3() {
		System.out.println("\n______Students information:_______ ");
	}

	}

//Course class

class course {
	private int id;
	private String name;
	
	void show1() {
		System.out.println("ID:" + id +" "+"Name:" + name);
	}
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	void show2() {
		System.out.println("\n______Course information:_______ ");
	}
}

//Main class
class main {
	public static void main (String[] args) {
		student s1=new student();
		student s2=new student();
		student s3=new student();
		student s4=new student();
		student s5=new student();
		course c1=new course();
		course c2=new course();
		s1.show3();
        s1.setName("Wasey");
		s1.setRollno(1345);
		s1.setDepartment("Cse");
		s1.show();
		s2.setName("Aleeza");
		s2.setRollno(15);
		s2.setDepartment("ee");
		s2.show();
		s3.setName("Ibtahaj");
		s3.setRollno(134);
		s3.setDepartment("Cs");
		s3.show();
		s4.setName("Bilal");
		s4.setRollno(345);
		s4.setDepartment("se");
		s4.show();
		s5.setName("Sohail");
		s5.setRollno(5);
		s5.setDepartment("ir");
		s5.show();
		c1.show2();
		c1.setid(12);
		c1.setname("Calculas");
		c1.show1();
		c2.setid(14);
		c2.setname("Linear algebra");
		c2.show1();
		c2.setid(1);
		c2.setname("Pakistan studies");
		c2.show1();
		c2.setid(43);
		c2.setname("Programming");
		c2.show1();
		c2.setid(77);
		c2.setname("Islamiyat");
		c2.show1();
			
		}
}


