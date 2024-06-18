class Demo{
	void fun(String str){

		System.out.println("string");
	}
	void fun(StringBuffer str1){

		System.out.println("In StringBuffer");
	}
}

class Client{
	public static void main(String[]args){
		Demo obj= new Demo();
		obj.fun("Core2web");
		obj.fun(new StringBuffer("Core2web"));
		//obj.fun(null);	string and stringbuffer both can see this null that means error occupied
	}
}

