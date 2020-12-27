
public class Member { //modifier public name member
	
	private String name; // modifier = private, type = String, int, name = name, age
	private int age;


	public Member(String a, int b) //Constructor = Member
	{
	name = a;
	age = b;
	}

	// List of getter: modifier = public, return type = String, name = name
	public String getName() // getters return fields
	{
	return name;
	}
	// setter set fields
	public void setName(String newname) // List of setter: modifier = public, return type = void, name = newname
	{
	name = newname;
	}

	public int getAge() // List of getter: modifier = public, return type = int, name = age
	{
	return age;
	}

	public void setAge(int newage)// List of setter: modifier = public, return type = void, name = newage
	{
	age = newage;
	}

	public void printInfo() //List of method: modifier = public, return type = void, name = printInfo
	{
	System.out.println("name " + getName());
	System.out.println("age " + getAge());
	System.out.println("**********************************");
	}

}
