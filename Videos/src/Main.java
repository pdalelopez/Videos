import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		ArrayList<User> userList;
		User logUser;
		String logUserName,logPassWord;
		boolean isOtherUser;
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
					System.out.println();
					userAnswer = input.next().toLowerCase();
				  }
				
			}
		
		} while (isOtherUser);
		
		

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
