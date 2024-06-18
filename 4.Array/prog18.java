class ArrayDemo10{

	void fun(int []arr){
		arr[1]=70;
		arr[2]=80;
	}

	public static void main(String[]args){
		int arr[]={10,20,30,40};

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));

		ArrayDemo10 obj=new ArrayDemo10();

		obj.fun(arr);

		for(int x:arr){
			System.out.println(x);
		}
		int x=70;
		int y=80;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}

