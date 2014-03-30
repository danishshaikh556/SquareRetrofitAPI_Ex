
public class people {

	/*public people(String name,String country,String twitter)
	{
		this.name=name;
		this.country=country;
		this.twitter=twitter;
	}
	*/
	public people(String author,String title,String publisher,String lastCheckedOutBy,String categories)
	{
		this.author=author;
		this.categories=categories;
		this.lastCheckedOutBy=lastCheckedOutBy;
		this.publisher=publisher;
		this.title=title;
	}
	//public String name,twitter,country;
  public String title,author,publisher,lastCheckedOutBy,categories;
}
