package ch5;

//不同类型消息的传递示例。

class Student {
	public String	name;
	public char		sex;
	public int		no;
	public int		age;
	
	Student(int cno, String cname, char csex, int cage){
		name=cname;
		sex=csex;
		no=cno;
		age=cage;
	}
	
	public void showNo() {System.out.println("No:"+no);}
	public void showName() {System.out.println("Name:"+name);}
	public void showSex() {System.out.println("Sex:"+sex);}
	public void showAge() {System.out.println("Age:"+age);}
}

class StudentScore {
	private int no;
	private double score;
	public void sendScore(int cno, double cscore) {
		no=cno;
		score=cscore;
	}
	void printScore() {System.out.println("No:"+no+"  score:"+score);}
}

class C5_1 {
	public static void main(String[] args) {
		
	}
}
