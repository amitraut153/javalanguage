class Employee{
	int empId=10;
	String str="Kanha";

	void empInfo(){
		System.out.println("Id= "+ empId);
		System.out.println("Name= "+ str);
	}
}
class MainDemo{
	public static void main(String[]args){
		Employee obj=new Employee();
		obj.empInfo();
	
		System.out.println(obj.empId);
		System.out.println(obj. str);
	}
}
