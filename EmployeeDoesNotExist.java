package POJOclass;
public class EmployeeDoesNotExist extends Exception{
	private String msg;
	EmployeeDoesNotExist(String msg){
		this.msg = msg;
	}
	public String showMsg(){
		return msg;
	}
}
