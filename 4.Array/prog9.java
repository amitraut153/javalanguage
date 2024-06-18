class ArrayDemo9{
	public static void main(String[]args){
		int arr[]={10,200};
		int arr1[]={10,200};

		System.out.println(arr);
		System.out.println(arr1);

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr1[1]));
	}
}
