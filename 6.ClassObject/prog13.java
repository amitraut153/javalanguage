class Employee3{
	int empId=10;
	String name="Kanha";

	static int y=50;

	void empInfo(){
		System.out.println("Id= "+ empId);
		System.out.println("Name= "+ name);
		System.out.println("Y= "+ y);
	}
}
class MainDemo3{
	public static void main(String[]args){
		Employee3 emp1=new Employee3();
		Employee3 emp2=new Employee3();

		emp1.empInfo();
		emp2.empInfo();
		System.out.println("--------------------------------------");

		emp2.empId=20;
		emp2.name="Rahul";
		emp2.y=5000;

		emp1.empInfo();
		emp2.empInfo();
	}
}

