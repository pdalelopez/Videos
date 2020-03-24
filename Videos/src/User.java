
public class User 
{	
	
	private String UserName,Name, LastName,PassWord;
	
	public User(String userName, String name,String lastName,String passWord) 
	{
		this.UserName = userName;
		this.Name = name;
		this.LastName = lastName;
		this.PassWord = passWord;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return PassWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	
	
	
	
	

}
