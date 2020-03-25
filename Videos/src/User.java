
public class User 
{	
	
	private String UserName,Name, LastName,PassWord;
	
	public User() 
	{
		
	}
	
	public User(String userName, String name,String lastName,String passWord) 
	{
		this.UserName = userName;
		this.Name = name;
		this.LastName = lastName;
		this.PassWord = passWord;
	}
	
	public String getUserName() 
	{
		return UserName;
	}

	public void setUserName(String userName) 
	{
		UserName = userName;
	}

	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		Name = name;
	}

	public String getLastName() 
	{
		return LastName;
	}

	public void setLastName(String lastName) 
	{
		LastName = lastName;
	}

	public String getPassWord() 
	{
		return PassWord;
	}

	public void setPassWord(String passWord) 
	{
		PassWord = passWord;
	}

	@Override
	public String toString() {
		return "User [UserName=" + getUserName() + ", Name=" + getName() + ", LastName=" + getLastName() + ", PassWord=" + getPassWord()
				+ "]";
	}

	
	
	
	
	

}
