class MyThread extends Thread{
	public void run(){

		for(int i=0; i<10; i++){
			System.out.println("In Thread-0");
		}
	}
}

class ThreadDemo{
	public static void main(String[]args){

		MyThread obj=new MyThread();
		obj.start();
		try{
			obj.join();
		}
		catch(InterruptedException ie){

		}

		for(int i=0; i<10; i++){
			System.out.println("In main");
		}
	}
}

