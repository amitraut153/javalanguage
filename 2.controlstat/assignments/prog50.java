// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1 
// F 5 D 3 B 1 
// F 5 D 3 B 1
class NFor20{
	public static void main(String[]args){
		for(int i=1; i<=6; i++){
			int N=6;
			char ch='F';
			for(int j=1; j<=6; j++){
				if(j %2==0){
					System.out.print(N+" ");
				}
				else{
					System.out.print(ch +" ");
				}
				N--;
				ch--;
			}
			System.out.println();
		}
	}
}
