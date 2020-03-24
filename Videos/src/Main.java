import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		ArrayList<User> userList;
		User logUser;
		String logUserName,logPassWord;
		boolean isUserExist,isOtherUser;
		int counter;
		Scanner input;
		
		input = new Scanner (System.in);
		
		//adding user to array list using "createUser" method
		userList = new ArrayList<User>();
		isOtherUser = true;
		counter=0;
		
		do 
		{
		System.out.println("Enter a new user");	
		userList.add(counter,createUser(input));		
		counter++; 
		System.out.println("Do you want to add other user?");
		String userAnswer = input.next().toLowerCase();
		boolean isAnswerCorrect = false;
			while (!isAnswerCorrect) 
			{
				if(userAnswer.equals("si")) 
				{
					isAnswerCorrect=true;
					
				}else if(userAnswer.equals("no"))
				 {
					isAnswerCorrect=true;
					isOtherUser=false;
				 }else 
				  {
					System.out.println("ERROR! Answer should be SI or NO");
					System.out.println("Do you want to add other user?");
					userAnswer = input.next().toLowerCase();
				  }
				
			}
		
		} while (isOtherUser);
		
		// Entering user to logging
		System.out.println("Enter your \"username\"");
		logUserName = input.next();
		System.out.println("Enter your \"password\"");
		logPassWord = input.next();
		
		// checking is User exist in the list
		for(int i =0 ; i< userList.size(); i++) 
		{
			if (userList.get(i).UserName.equals(logUserName)) 
			{
				if(userList.get(i).PassWord.equals(logPassWord)) 
				{
					logUser = userList.get(i);
					i=userList.size();
					System.out.println("Welcome "+logUser.Name);
					isUserExist = true;
				}else 
				 {
					System.out.println("this user do not exist");
					isUserExist = false;
				 }
				
			}
		}
			
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
		
		return user;
	}

	

}
