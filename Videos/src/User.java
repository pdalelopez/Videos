
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class User 
{	
	
	private String UserName,Name, LastName,PassWord;
	private ArrayList<Video> VideoList;
	private Date registerDate;
	
	public User() 
	{	
	}
	public User(String userName, String name,String lastName,String passWord) throws Exception 
	{
		this.setUserName(userName);
		this.setName(name);
		this.setLastName(lastName);
		this.setPassWord(passWord);
		this.setRegisterDate(new Date());
		this.setVideoList(new ArrayList<Video>());
		
	}
	
	public String getUserName() 
	{
		return UserName;
	}
	public void setUserName(String userName) throws Exception 
	{
		if(userName.equals(""))
		{
			throw new NullValueException("invalit userName, NULL VALUE");
		}else {
			UserName = userName;	
		}
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) throws Exception 
	{
		if(name.equals(""))
		{
			throw new NullValueException("invalit Name, NULL VALUE");
		}else {
			Name = name;	
		}
	}
	public String getLastName() 
	{
		return LastName;
	}
	public void setLastName(String lastName) throws Exception 
	{
		if(lastName.equals(""))
		{
			throw new NullValueException("invalit LastName, NULL VALUE");
		}else {
			LastName = lastName;	
		}
	}
	public String getPassWord()
	{
		return PassWord;
	}
	public void setPassWord(String passWord) throws Exception 
	{
		if(passWord.equals(""))
		{
			throw new NullValueException("invalit PassWord, NULL VALUE");
		}else {
			PassWord = passWord;	
		}
	}
	public Date getRegisterDate()
	{
		return registerDate;
	}
	public void setRegisterDate(Date registerDate)
	{
		this.registerDate = registerDate;
	}
	public ArrayList<Video> getVideoList() 
	{
		return VideoList;
	}
	public void setVideoList(ArrayList<Video> videoList) 
	{
		this.VideoList = videoList;
	}
	public String getEncodePassWord()
	{
		String encodePassWord="****";
		for (int i = 0; i < this.PassWord.length(); i++)
		{
			encodePassWord+="*";
		}
		return encodePassWord;
	}
	
	public void addVideoInList(Video newVideo) 
	{
		getVideoList().add(newVideo);
		
	}
	public Video createVideo(Scanner input) throws Exception
	{
		
		Video newVideo;
		newVideo = new Video();
		
		newVideo.setUrl(JOptionPane.showInputDialog("Video's URl"));
		newVideo.setTytle(JOptionPane.showInputDialog("Video,s Tytle"));
		newVideo.addTagsInVideo(input);
		
		System.out.println("----------------");
		System.out.println(newVideo);
		System.out.println("----------------");
		
		return newVideo;
	}

	@Override
	public String toString() 
	{
		return "User [UserName=" + getUserName() + ", Name=" + getName() + ", LastName=" + getLastName() + ", PassWord=" + getEncodePassWord()
				+ ", Videos=" +getVideoList()+"]";
	}

	
	

}
