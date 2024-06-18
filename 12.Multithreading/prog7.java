class MyThread extends Thread{

	public void run(){
		System.out.println(Thread.currentThread());

	}
}

class ThreadDemo{
	public static void main(String[]args){

		System.out.println(Thread.currentThread());

		MyThread obj=new MyThread();
		obj.start();

		try{
			Thread.sleep(100);
		}
		catch(InterruptedException ie){

		}
		Thread.currentThread().setName("Core2Web");
		System.out.println(Thread.currentThread());
	}
}
