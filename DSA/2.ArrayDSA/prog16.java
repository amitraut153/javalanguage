/*  Given the char array(lowercase)
    Return the count of pair(i,j) 
*/


class CharArray{
	public static void main(String[]args){
		char arr[]=new char[]{'a','b','e','g','a','g'};
		int N=6;
		int count=0;
		int itr=0;
		for(int i=0; i<N; i++){
			if(arr[i]=='a'){
				for(int j=i+1; j<N; j++){
					if(arr[j]=='g')
						count++;
					itr++;
				}
			}
		}
		System.out.println(count);
		System.out.println(itr);
	}
}


