// package POJOclass; //Optional You can create your own package
import java.util.*;


public class Operation
{
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String WHT_BGR = "\u001B[47m";
	public static final String PURP_BGR = "\u001B[45m";
	public static final String CYAN	   = "\u001B[36m";
	public static final String YELLOW = "\u001B[33m";
	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Employee> emp = new ArrayList<Employee>();
	public static void create() throws InterruptedException
	{
		int cnt = 1;
		while(cnt != 0) 
		{
			Employee e = new Employee();
			
			//Taking inputs
			System.out.println("Enter EMP_ID: ");
			int emp_id = sc.nextInt();
			e.setId(emp_id);

			System.out.println("Enter Employee Name: ");
			String ename = sc.next();
			e.setName(ename);

			System.out.println("Enter Designation: ");
			String des = sc.next();
			e.setDesignation(des);

			// adding to ArrayList at id position
			emp.add(e);

			Thread.sleep(1000);
			System.out.println("Want to add more?\n press 1 to add \nPress 0 to exit");
			int val = sc.nextInt();

			if(val == 1) {
				continue;
			}
			else {
				System.out.println("***Dhanyawad***");
				break;
			}
		}
	}
	public static void read(int e_id) throws EmployeeDoesNotExist
	{
		int ch=0;
		for(int i=0; i<emp.size(); i++)
		{
			Employee e = emp.get(i);
			if(e_id == e.getId()) {
				System.out.println("Emp_Id:\t\t"+e.getId());
				System.out.println("Name:\t\t"+e.getName());
				System.out.println("Designation:\t"+e.getDesignation());
				ch=1;
			}
		}
		if(ch==0) {
			throw new EmployeeDoesNotExist("UserDoesnotExist Exception");
		}
	}

	public static void read(String name) 
	{
		
		for(int i=0; i<emp.size(); i++) {
			Employee e1 = emp.get(i);
			System.out.println("Name:\t\t"+RED +e1.getName()+RESET);
			System.out.println("Id:\t\t"+ CYAN+ e1.getId()+RESET);
			System.out.println("Designation:\t"+ YELLOW+ e1.getDesignation()+RESET);
			System.out.println("\n");
		}
	}
	
	public static void update(int oldId, int newId)
	{
		for(int i=0; i< emp.size(); i++)
		{
			
			Employee e1 = emp.get(i);
			if(oldId == e1.getId())
			{
				e1.setId(newId); 
				break;
			}
		}
		System.out.println("ID Updated Sucessfully!!!!");
	}

	public static void update(int id, String desig)
	{
		for(int i=0; i< emp.size(); i++)
		{
			Employee e1 = emp.get(i);
			
			if(id == e1.getId())
			{
				e1.setDesignation(desig); 
				break;
			}
		}
		System.out.println("Designation Updated Sucessfully!!!!");
	}
	public static void delete(int Id) 
	{
		for(int i=0; i<emp.size(); i++)
		{
			Employee e1 = emp.get(i);
			if(Id == e1.getId())
			{
				emp.remove(e1);
			}
		}
	}
}
