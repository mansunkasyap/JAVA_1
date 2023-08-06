// package POJOclass;
import java.util.*;
public class Application 
{
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String WHITE_BGR = "\u001B[47m";
	public static final String PURP_BGR = "\u001B[45m";
	public static void main(String[] args) throws InterruptedException, EmployeeDoesNotExist
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(RED+WHITE_BGR+"\t***Welcome Habibi ***\t");
			System.out.println("\t___Options___\t");
			System.out.println("1. Create new Employee\t");
			System.out.println("2. Read an employee details\t");
			System.out.println("3. Update an Employee\t");
			System.out.println("4. Delete an employee details\t");
			System.out.println("5. Exit>>>\t"+ RESET);

			System.out.println("Select an Option: ");
			int opt = sc.nextInt();
			Thread.sleep(1000);

			switch (opt)
			{
          //__CREATE__
			case 1:
				Operation.create();
				break;
        //____READ____
			case 2:
				System.out.println("1. To read with id");
				System.out.println("2. To Read All");
				int op = sc.nextInt();

				if(op == 1)
				{
					System.out.println(PURP_BGR+"Enter employee id to get details:"+RESET);
					int id = sc.nextInt();
					try {
						Operation.read(id);
					}catch(EmployeeDoesNotExist e) {
						System.out.println(e.showMsg());
					}
				}
				else if(op ==2)
				{
					System.out.println(PURP_BGR+"Enter " +"yes " +"to get details:"+RESET);
					String n = sc.next();
					Operation.read(n); 
				}
				break;

				//____UPDATE_____
			case 3:
				System.out.println("\t****Select Option****\t");
				System.out.println("1. Enter id to Update id");
				System.out.println("2. Enter Designation to update Desi");
				int option = sc.nextInt();
				switch(option)
				{ 
				case 1:
					System.out.print("Enter old ID:");
					int oldId = sc.nextInt();
					System.out.println("Enter new ID");
					int newID = sc.nextInt();
					Operation.update(oldId, newID);
					break;
				case 2:
					System.out.print("Enter ID & New Designation");
					int Id = sc.nextInt();
					String uname = sc.next();
					Operation.update(Id, uname);
					break;
				default:
					System.out.println("Invalid Option");
				}
				break;
        //___DELETE___
			case 4:
				System.out.println("Enter ID to delete the data");
				int ID = sc.nextInt();
				Operation.delete(ID); 
				break;
			case 5:
				System.out.println("Successfully Exit !!");
				return;

			}
		}

	}
}
