class StackDemo{
	static void fun(int x){

		fun(++x);
	}

	public static void main(String[]args){

		try{
			fun(1);
		}catch(StackOverflowError obj){

		System.out.println("Exception in thread"+Thread.currentThread().getName());

		}
	}
}

