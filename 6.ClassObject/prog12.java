class Employee2{
	int empId=10;
	String name="Kanha";
	void empInfo(){
		System.out.println("Id= "+ empId);
		System.out.println("Name= "+ name);
	}
}
class MainDemo2{
	public static void main(String[]args){
		Employee2 emp1=new Employee2();
		Employee2 emp2=new Employee2();

		emp1.empInfo();
		emp2.empInfo();
		System.out.println("-----------------------");

		emp2.empId=20;
		emp2.name= "Rahul";

		emp1.empInfo();
		emp2.empInfo();

	}
}
