package java_from_0;

class Human
{
	private int age=15;
	private String Name;
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void SetName(String Name)
	{
		this.Name =Name;
	}
}

public class Enclapsuale {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human obj = new Human();
		obj.getAge();
		System.out.println(obj.getAge());
		
		
		obj.SetName("Sriram");
		
		System.out.println(obj.getName());

	}

}
