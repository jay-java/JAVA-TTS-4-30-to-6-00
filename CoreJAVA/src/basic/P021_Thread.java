package basic;
class ByRunnable extends Thread implements Runnable{

	@Override
	public void run() {
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i+" : "+t);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class MyThread extends Thread{
	public void run() {
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i+" : "+t);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class P021_Thread {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i+" : "+t);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
