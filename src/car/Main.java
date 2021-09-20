package car;

class Car{
   
    	public static int noOfDoor,noOfSeats, stepnee;
    	Car()
    	{
    		
    	}
    	  Car(int noOfDoor,int noOfSeats,int stepnee)
    	  {
    		  this.noOfDoor=noOfDoor;
    		  this.noOfSeats=noOfSeats;
    		  this.stepnee=stepnee;
    	  }
    	  public void show()
    	  {
    		  System.out.println("no of doors in car : "+noOfDoor);
    		  System.out.println("no of seats in car : "+noOfSeats);
    		  System.out.println("no of stepnee in car : "+stepnee);
    		  
    	  }
        
    
}
class CarUtilities extends Car
{
	public String musicsystem, radio, bumpper, numberplate;
	CarUtilities(String m,String r,String b,String nu)
	{
		super(noOfDoor,noOfSeats, stepnee);
		 musicsystem =m;
		 radio=r;
		 bumpper=b;
		 numberplate=nu;
	}
	 public void show()
	  {
		  super.show();
		  System.out.println("music system in car : "+musicsystem );
		  System.out.println("radio in car : "+radio);
		  System.out.println("bumpper in car : "+bumpper);
		  System.out.println("numberplate in car : "+numberplate);
		  
		  
	  }
}
class CarInterior extends Car
{
	public String seatCover, seatCoverColor;
	CarInterior(String s,String col)
	{
		//super(noOfDoor,noOfSeats, stepnee);
		seatCover=s;
		seatCoverColor=col;
	}
	 public void show()
	  {
		 // super.show();
		  System.out.println("seat cover in car : "+seatCover );
		  System.out.println("seatCoverColor in car : "+seatCoverColor);
		 
		  
		  
	  }
	
}
public class Main {
	public static void main(String args[])
	{
		
		Car xq=new Car(4,4,1);
		CarUtilities x= new CarUtilities("present","present","present","present");
		x.show();
		CarInterior ex = new CarInterior("present","black");
		ex.show();
		
		
		
		
	}
	

}

