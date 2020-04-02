import java.util.ArrayList;
import java.util.Scanner;

public class Video 
{
	String Url,Tytle;
	ArrayList<String> Tags;

	
	
	public Video (String url, String tytle) 
	{
		this.setUrl(url);
		this.setTytle(tytle) ;
		this.setTags(new ArrayList<String>());
	
	}
	public Video() 
	{
	}

	public String getTytle() 
	{
		return Tytle;
	}
	public void setTytle(String tytle) 
	{
		Tytle = tytle;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public ArrayList<String> getTags() 
	{
		return Tags;
	}
	public void setTags(ArrayList<String> tags)
	{
		this.Tags = tags;
	}
	public void addTagsInVideo(Scanner input) 
	{
		
		boolean isOtherTag,isRightAnswer;
		String userAnswer;
		
		isOtherTag = true;
		do 
		{
		System.out.println("Enter a new tag");
		getTags().add(input.next());
		
		
		System.out.println("Do you want to add other tag?");
		userAnswer = input.next().toLowerCase();
		
		isRightAnswer = false;
			do
			{
				if(userAnswer.equals("tes"))
				{
					isRightAnswer=true;
					
				}else if(userAnswer.equals("no"))
				 {
					isRightAnswer=true;
					isOtherTag = false;
					
					
				 }else 
				  {
					System.out.println("ERROR! Answer should be YES or NO");
					System.out.println("Do you want to add other tag?");
					userAnswer = input.next().toLowerCase();
				  }	
			} while (!isRightAnswer);
		
		} while (isOtherTag);
	}

	@Override
	public String toString() {
		return " [Tytle=" + getTytle() +  ", Url=" + getUrl()+", Tags=" + getTags() +"]";
	}
}