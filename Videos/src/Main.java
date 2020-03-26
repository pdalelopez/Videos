import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static boolean isUserExist;
	
	public static void main(String[] args) 
	{
		ArrayList<User> usersList;
		String logUserName,logPassWord;
		User logUser;
		Scanner input;
		
		
		input = new Scanner (System.in);
		isUserExist = true;
		
		//adding user to array list using "createUser" method
		usersList = new ArrayList<User>();
		usersList = createUserList(input);
		
		// Entering user to logging
		System.out.println("Enter your \"username\"");
		logUserName = input.next();
		System.out.println("Enter your \"password\"");
		logPassWord = input.next();
		
		//checking user
		logUser = checkUser(logUserName,logPassWord,usersList);
		
		
		//Running the application
		
		
		if(isUserExist) 
		{
			System.out.println("Welcome "+logUser.getName());
			System.out.println("Running");
			System.out.println("Running");
			System.out.println("Running");
			System.out.println("Running");
			System.out.println("Finish");
		}else 
		 {
			System.out.println("this user do not exist");
			System.out.println("Fatal ERROR");
		 }	
	}
	
		
	
	
	
	
	
	
	
	
	
	
	// method checks if User exist in the list
	
	public static User checkUser(String logUserName,String logPassWord,ArrayList<User> usersList ) 
	{
		
		User logUser = new User();
		
		for(User user: usersList) 
		{
			if ((user.getUserName().equals(logUserName))&&((user.getPassWord().equals(logPassWord)))) 
			{
					logUser = user;
			}else 
			 {
				isUserExist = false;
			 }
			
		}
		return logUser;
	 }
	
	//create user'list
	
	public static ArrayList<User> createUserList (Scanner input)
	{
		ArrayList<User> usersList = new ArrayList<User>();
		boolean isOtherUser,isRightAnswer;
		String userAnswer;
		
		isOtherUser = true;
		do 
		{
		System.out.println("Enter a new user");	
		usersList.add(createUser(input));		 
		
		System.out.println("Do you want to add other user?");
		userAnswer = input.next().toLowerCase();
		
		isRightAnswer = false;
			do
			{
				if(userAnswer.equals("si"))
				{
					isRightAnswer=true;
					
				}else if(userAnswer.equals("no"))
				 {
					isRightAnswer=true;
					isOtherUser = false;
					
					
				 }else 
				  {
					System.out.println("ERROR! Answer should be SI or NO");
					System.out.println("Do you want to add other user?");
					userAnswer = input.next().toLowerCase();
				  }	
			} while (!isRightAnswer);
		
		} while (isOtherUser);
		
		return usersList;
	}
	
	// create new user
	public static User createUser(Scanner input) 
	{
		String userName,name,lastName,passWord;
		User user;
		System.out.println("username");
		userName = input.next();
		System.out.println("name");
		name = input.next();
		System.out.println("lastname");
		lastName =input.next();
		System.out.println("passWord");
		passWord = input.next();
		user= new User(userName,name,lastName,passWord);
		
		System.out.println(user);
		
		return user;
	}

	

}
