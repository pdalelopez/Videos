
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main 
{
	static boolean isUserExist;
	
	public static void main(String[] args) 
	{
		ArrayList<User> usersList;
		Scanner input;
		input = new Scanner (System.in);
		usersList = new ArrayList<User>();
		boolean isAnotherAction;
		
		User user1,user2;
		try
		{
			user1= new User("pdale","pedro","lopez","1234");
			usersList.add(user1);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());;
		}
		try
		{
			user2= new User("kello","Kelvin","lopez","0987");
			usersList.add(user2);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());;
		}

		
		
		isAnotherAction = true;
		do
		{
		
			System.out.println("What do yo want to do?");
			System.out.println("----------------");
			System.out.println("1-Register");
			System.out.println("2-Log-in");
			System.out.println("3-Exit application");
			System.out.println("----------------");
			String userAnswer = input.next();
		
			switch (userAnswer)
			{
			
			case "1":
				//adding user to array list using "createUser" method
				User newUser;
				
				try
				{
					newUser = createUser();
					usersList.add(newUser);
					System.out.println(usersList.toString());
				} catch (Exception e)
				{
					System.out.println(e.getMessage());;
				}
				
				 System.out.println("----------------");
				break;
			
			case "2":
				// Entering user to logging
				String logUserName,logPassWord;
				User loggedUser;
				System.out.println("Enter your \"username\"");
				logUserName = input.next();
				System.out.println("Enter your \"password\"");
				logPassWord = input.next();
			
				//checking user
				loggedUser = checkUser(logUserName,logPassWord,usersList);
				
				//Running the application
				if(isUserExist) 
				{
					System.out.println("----------------");
					System.out.println("Welcome "+loggedUser.getName());
					System.out.println("----------------");
					boolean isAnotherLogAction;
					isAnotherLogAction = true;
					do
					{	
						System.out.println("You can do:");
						System.out.println("1-Create a video");
						System.out.println("2-Show video'list");
						System.out.println("3-Search one video by key word or tag");
						System.out.println("4-Log-out");
						String loggedUserAnswer = input.next();
						
						switch (loggedUserAnswer)
						{
						
						case "1":
							Video newVideo;
							try
							{
								newVideo = loggedUser.createVideo(input);
								loggedUser.addVideoInList(newVideo);
							} catch (Exception e)
								{
								System.out.println(e.getMessage());
								}
							break;
						
						case "2":
							System.out.println(loggedUser.getVideoList().toString());
							break;
						
						case "3":
							System.out.println("Enter one word");
							ArrayList<Video> videoCollection = new ArrayList<Video>();
							String keyWord = input.next();
							
							for (Video userVideo : loggedUser.getVideoList())
							{
								if(userVideo.getTytle().contains(keyWord)) 
								{
									videoCollection.add(userVideo);
								}else 
								{
									for (String videoTag : userVideo.getTags())
									{
										if(videoTag.contains(keyWord)) 
										{
											videoCollection.add(userVideo);
											break;
										}
									}
								}
							}
							
							if (videoCollection.size()==0) 
							{
								System.out.println("There are not video matching with the key word: "+keyWord);
							}else
							{
								System.out.println(videoCollection);
							}
							
							break;
						
						case "4":
							isAnotherLogAction= false;
							break;
						
						default:
							System.out.println("It is not a rigth choise");
							break;
						}
					}while(isAnotherLogAction);
				}else 
				 {
					System.out.println("this user do not exist");
				 }	
				System.out.println("----------------");
				break;
			
			case "3":
				System.out.println("Closing App");
				System.out.println(".");
				System.out.println(".");
				System.out.println("Closed");
				isAnotherAction = false;
				input.close();
				break;

			default:
				System.out.println("It is not a rigth choise");
				System.out.println("----------------");
				break;
			}
		} while (isAnotherAction);
		
	}
//---------------------------------------------------------------------------------------------------
	
	// method checks if User exist in the list
	
	public static User checkUser(String logUserName,String logPassWord,ArrayList<User> usersList ) 
	{
		
		User logUser = null;
		
		for(User user: usersList) 
		{
			if (user.getUserName().equals(logUserName) &&(user.getPassWord().equals(logPassWord))) 
			{
					logUser = user;
					isUserExist = true;
					break;
			}
		}
		if (logUser == null)
		 {
			isUserExist = false;
		 }
		return logUser;
	 }
	

	// create new user
	public static User createUser() throws Exception 
	{
		User newUser;
		newUser = new User();
		
		System.out.println("username");
		newUser.setUserName(JOptionPane.showInputDialog("UserName"));
		System.out.println("name");
		newUser.setName(JOptionPane.showInputDialog("name"));
		System.out.println("lastname");
		newUser.setLastName(JOptionPane.showInputDialog("lastname"));
		System.out.println("passWord");
		newUser.setPassWord(JOptionPane.showInputDialog("passWord"));
		newUser.setRegisterDate(new Date());
		newUser.setVideoList(new ArrayList<Video>());
		return newUser;
	}


}

class NullValueException extends Exception
{
	public NullValueException()
	{
	}
	public NullValueException(String error_message) 
	{
		super(error_message);
	}
}
