import java.util.ArrayList;

public class Video 
{
	String Url,Tytle;
	ArrayList<String> Tags;

	
	
	public Video (String url, String tytle) throws Exception
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
		return this.Tytle;
	}
	public void setTytle(String tytle) throws Exception
	{
		if(tytle.equals(""))
		{
			throw new NullValueException("invalit tytle, NULL VALUE");
		}else {
			this.Tytle = tytle;	
		}
		
	}
	public String getUrl() 
	{
		return this.Url;
	}
	public void setUrl(String url) throws Exception
	{
		if(url.equals(""))
		{
			throw new NullValueException("invalit tytle, NULL VALUE");
		}else {
			this.Url = url;	
		}
	}
	public ArrayList<String> getTags() 
	{
		return this.Tags;
	}
	public void setTags(ArrayList<String> tags)
	{
		this.Tags = tags;
	}
	public void addTagsInVideo(String tag) 
	{
	getTags().add(tag);	
	}

	@Override
	public String toString() {
		return "Videos--->[Tytle=" + this.getTytle() +  ", Url=" + this.getUrl()+", Tags=" + this.getTags() +"]";
	}
}