//package POJOclass;

public class Employee 
{
	private int id;
	private String name;
	private String email;
	private String designation;
	private long mob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", designation=" + designation + ", mob="
				+ mob + "]";
	}
	public void showEmployee(Employee e1)
	{
		System.out.println("Emp_Id:\t\t"+id);
		System.out.println("Name:\t\t"+name);
		System.out.println("Mobile No:\t"+mob);	
		System.out.println("Designation:\t"+designation);
		System.out.println("Email_Id:\t"+email);	
	}

}
