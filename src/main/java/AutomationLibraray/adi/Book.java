package AutomationLibraray.adi;

public class Book {

	

	public String title;
	private String author;
	private Integer totalPagesOfBook;
	private Double price;
	private Integer totalfinishedPages;
	private Integer remainingPages;

	/*
	 * Every book has
	 * title : String
	 * Author : String,
	 * price : Double,
	 * Pages : integer,
	 * Read : integer	
	 * Remaining : integer
	 */
	
	
	Book(String titleName,String authorName, Double priceValue, Integer totalPage){
		
		this.title = titleName;
		this.author = authorName;
		this.price = priceValue;
		this.totalPagesOfBook = totalPage;
		this.totalfinishedPages = 0;
		this.remainingPages = this.totalPagesOfBook - this.totalfinishedPages;
		
	}
	
	//acces modifier , return datatype, methodname,
	public String toString()
	{
		
		
		return "Book title is "+ this.title + " book authoer is " + this.author;
		
	}
	
	
	// GetPage method
	public Integer getTotalPage() {
		
		return this.totalPagesOfBook;
	}
	
	// read page method
	public void setTotalfinishedPages(Integer pageCount) {
		
		this.totalfinishedPages = pageCount;
		
	}
	
	public Integer getTotalfinishedPages() {
		
		return this.totalfinishedPages;
	}
	
	public Integer getRemainingPageCount() {
		
		
		return this.totalPagesOfBook - this.totalfinishedPages;
	}
	
	public Double getPrice() {
		
		return this.price;
	}
	
	
	public void setPrice(Double newPrice) {
		
		this.price = newPrice;
	}
	
	
	// create a method , if okunan page is more than 100, set the price to 50;
	// and if remaining page is lesss than 150 set the price to 200
	// discount 
	
	public void discount() {
		
		if(this.totalfinishedPages >= 100) {
			this.price = 50.00;
		}
		if(this.remainingPages < 150) {
			this.price = (double) 200;
		}
		
	}
	
	
	
}
