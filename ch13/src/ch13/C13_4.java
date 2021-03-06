package ch13;

/**
 * 	生产者与消费者的同步问题
 */
class C13_4{
	
	public static void main(String[] args) {
		HoldInt h=new HoldInt();	//h为监控器
		ProduceInt p=new ProduceInt(h);
		ConsumeInt c=new ConsumeInt(h);
		p.start();
		c.start();
	}
	
}

class HoldInt{
	
	private int sharedInt;
	
	private boolean writeAble=true;	//writeAble=true 表示生产者线程能生产新数据
	
	public synchronized void set(int val) //临界区程序段，也称为同步方法
	{	
		while(!writeAble) {
			try { wait(); } 
			catch(Exception e) { }
		} 
		//生产者被唤醒后继续执行下面的语句
		writeAble=false;
		sharedInt=val;
		this.notify();
	}
	
	public synchronized int get() //同步方法
	{	
		while(writeAble) 
		{ //消费者线程不能消费数据时进入等待状态
			try { wait(); }
			catch (Exception e) { }
		}
		//消费者被唤醒后继续执行下面的语句
		writeAble=true;
		this.notify();
		return sharedInt;
	}
	
}

//ProduceInt是生产者
class ProduceInt extends Thread{
	
	private HoldInt hi;

	public ProduceInt(HoldInt hiForm) {
		// TODO Auto-generated constructor stub
		hi=hiForm;
	}
	
	public void run() {
		for(int i=0; i<4; i++) {
			hi.set(i);
			System.out.println("产生的新数据是："+i);
		}
	}
	
}

//ConsumeInt是消费者
class ConsumeInt extends Thread{
	
	private HoldInt hi;

	public ConsumeInt(HoldInt hiForm) {
		// TODO Auto-generated constructor stub
		hi=hiForm;
	}
	
	public void run() {
		for(int i=0; i<4; i++) {
			int val=hi.get();
			System.out.println("读取到的数据是："+val);
		}
	}
}