class MyThread extends Thread{

	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}

	public void run(){

		System.out.println(Thread.currentThread());
	}
}

class ThreadGroupDemo{
	public static void main(String[]args){

		ThreadGroup pthreadGp=new ThreadGroup("Core");
		MyThread obj1=new MyThread(pthreadGp,"C");
		MyThread obj2=new MyThread(pthreadGp,"Java");
		MyThread obj3=new MyThread(pthreadGp,"Python");

		obj1.start();
		obj2.start();
		obj3.start();
	

		ThreadGroup cthreadGp=new ThreadGroup(pthreadGp,"Incubator");

		MyThread obj4=new MyThread(cthreadGp,"Flutter");
		MyThread obj5=new MyThread(cthreadGp,"ReactJS");
		MyThread obj6=new MyThread(cthreadGp,"SpringBoot");

		obj4.start();
		obj5.start();
		obj6.start();
	}
}



