package ch13;

class C13_3{
	public static void main(String[] args) {
		Thread first=new MyThread("A");
		first.setPriority(Thread.MIN_PRIORITY);
		Thread second=new MyThread("B");
		second.setPriority(Thread.NORM_PRIORITY+1);
		Thread third=new MyThread("C");
		third.setPriority(Thread.MAX_PRIORITY);
		first.start();
		second.start();
		third.start();
	}
}

class MyThread extends Thread{
	String message;
	public MyThread(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.print(message+" "+getPriority()+" ");
		}
	}
	
}


