
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
			e.printStackTrace();
		}
		try
		{
			user2= new User("kello","Kelvin","lopez","0987");
			usersList.add(user2);
		} catch (Exception e)
		{
			e.printStackTrace();
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
					newUser = createUser(input);
					usersList.add(newUser);
					System.out.println(usersList.toString());
				} catch (Exception e)
				{
					e.printStackTrace();
				}
				
			
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
						System.out.println("2-Show Video'list");
						System.out.println("3-Search one video  by key word or tag");
						System.out.println("4-Log-out");
						String loggedUserAnswer = input.next();
						
						switch (loggedUserAnswer)
						{
						case "1":
							Video newVideo = loggedUser.createVideo(input);
							loggedUser.addVideoInList(newVideo);
							break;
						case "2":
							System.out.println(loggedUser.getVideoList().toString());
							break;
						case "3":
							System.out.println("la #3");
							break;
						case "4":
							isAnotherLogAction= false;
							break;
						default:
							System.out.println("It is not a rigth choise");
							break;
						}
					System.out.println("----------------");
					}while(isAnotherLogAction);
				}else 
				 {
					System.out.println("this user do not exist");
				 }	
				
				break;
			case "3":
				System.out.println("Closing App");
				System.out.println(".");
				System.out.println(".");
				System.out.println("Closed");
				isAnotherAction = false;
				break;

			default:
				System.out.println("It is not a rigth choise");
				break;
			}
		System.out.println("----------------");	
		} while (isAnotherAction);
		
	}
	
	
	
	
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
	public static User createUser(Scanner input) throws Exception 
	{
		User newUser;
		newUser = new User();
		
		System.out.println("username");
		newUser.setUserName(input.next());
		System.out.println("name");
		newUser.setName(input.next());
		System.out.println("lastname");
		newUser.setLastName(input.next());
		System.out.println("passWord");
		newUser.setPassWord(input.next());
		newUser.setRegisterDate(new Date());
		System.out.println("----------------");
		System.out.println(newUser);
		System.out.println("----------------");
		
		return newUser;
	}


}
