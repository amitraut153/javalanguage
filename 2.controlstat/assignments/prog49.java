// 1C3 4B2 9A1
// 16C3 25B2 36A1
// 49C3 64B2 81A1
class NFor19{
	public static void main(String[]args){
		int N1=1;
		char ch='A';
		int N2=3;
		for(int i=1; i<=3; i++){
			ch='C';
			N2=3;
			for(int j=1; j<=3; j++){
				System.out.print(N1*N1 +""+ch+""+N2 + " ");
				N1++;
				ch--;
				N2--;
			}
			System.out.println();
		}
	}
}

