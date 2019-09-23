public class person
{
	private String name;
	private String email;
	private String panNumber;
	public person(String name, String email, String panNumber)
	{
		this.name=name;
		this.email=email;
		this.panNumber=panNumber;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPanNumber()
	{
		return panNumber;
	}
}