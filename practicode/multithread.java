class MyThread extends Thread{
	private String shape;

	MyThread(String shape){
		this.shape=shape;
	}

	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println(shape +" -Side length:"+i);

			try{
				Thread.sleep(100);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
class Main{
	public static void main(String[]args){
		MyThread triangle=new MyThread("Tricangle");
		MyThread square=new MyThread("square");
		MyThread rectangle=new MyThread("rectangle");
		MyThread circle=new MyThread("circle");

		triangle.start();
		square.start();
		rectangle.start();
		circle.start();
	}
}

