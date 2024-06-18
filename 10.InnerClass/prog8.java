
// Anonymous Inner Class
class Demo{

	int x=10;
	void marry(){

		System.out.println("Kriti Sanon");
	}
}

class Client{
	public static void main(String[]args){
		Demo obj=new Demo(){
		       //new Client$1
			void marry(){

				System.out.println("Shraddha");
			}
		};
		obj.marry();
	}
}
