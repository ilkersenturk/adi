package AutomationLibraray.adi;



public class App 
{
    public static void main( String[] args )
    {
         
    	
    	// datatype , objectname = new datatype;
    	Book  mybook = new Book("Oliver","Oracle",123.45,500);
    	
    	System.out.println(mybook);
    	
    	
    	String mymethodResult = mybook.toString();
    	
    	System.out.println(mymethodResult);
    	
    	//  print book title
    	System.out.println(mybook.title);
       
    	
    	// print remaining pages

    	System.out.println(mybook.getRemainingPageCount());
    	
    	// okunan sayfa
    	
    	mybook.setTotalfinishedPages(100);
    	
    	System.out.println(mybook.getRemainingPageCount());
    	
    	
    	// Before set price
    	System.out.println(mybook.getPrice());
    	
    	// after setting price
    	mybook.setPrice(78.65);
    	System.out.println(mybook.getPrice());    	
    	
    	mybook.discount();
    	
    	
    	System.out.println(mybook.getPrice());
    	
    	
    }
}
