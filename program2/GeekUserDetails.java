import java.util.Date; 
// We can check that column name in "GeekUserDetails" is 
// matching with each and every field here. It is always good 
// to have the same column name and field name here 
public class GeekUserDetails { 
	private int geekUserId; 
	private String geekUsername; 
	private int numberOfPosts; 
	public int getNumberOfPosts() { return numberOfPosts; } 

	public int getGeekUserId() { return geekUserId; } 

	public void setGeekUserId(int geekUserId) 
	{ 
		this.geekUserId = geekUserId; 
	} 

	public String getGeekUsername() { return geekUsername; } 

	public void setGeekUsername(String geekUsername) 
	{ 
		this.geekUsername = geekUsername; 
	} 

	public void setNumberOfPosts(int numberOfPosts) 
	{ 
		this.numberOfPosts = numberOfPosts; 
	} 

	private String createdBy; 
	private Date createdDate; 

	public String getCreatedBy() { return createdBy; } 

	public void setCreatedBy(String createdBy) 
	{ 
		this.createdBy = createdBy; 
	} 

	public Date getCreatedDate() { return createdDate; } 

	public void setCreatedDate(Date createdDate) 
	{ 
		this.createdDate = createdDate; 
	} 
}
