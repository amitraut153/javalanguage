class Project{
	String progName="Online Edu";
	int noOfEmp=20;

	void clientInfo(){
		String ClientName="Core2Web";
		System.out.println(ClientName);
		System.out.println(progName);
		System.out.println(noOfEmp);
	}
}
class C2W{
	public static void main(String[]args){
		Project obj=new Project();
		obj.clientInfo();
	}
}
