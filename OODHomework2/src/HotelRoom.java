public class HotelRoom
{
	//define attributes
	private int roomNo;
	private double roomRate;

	//constructor methods
	public HotelRoom()
	{
		roomNo = 0;
		roomRate = 0;
	}
	public HotelRoom(int rn)
	{
		roomNo = rn;
		
		this.roomNo = roomNo;
        
        if(roomNo == 0 || roomNo > 1000) 
        {
            System.out.println("Room number cannot be 0 or more then 1000");
            System.exit(0);
        }
        if(this.roomNo <= 299) 
		{
            this.roomRate = 69.95;
        }   
		else 
		{
            this.roomRate = 89.95;
        }
    }
	//get and set methods for room attribute
	public int getRoomNo()
	{
		return roomNo;
	}
	public void setRoomNo(int rn)
	{
		roomNo = rn;
	}
	//get and set methods for rate attribute
	public double getRate()
	{
		return roomRate;
	}
	
	public void setRate(double rr)
	{
		roomRate = rr;
	}
	public void writeOutput()
	{
		System.out.println("Room Number: " + roomNo);
		System.out.println("Room Rate: " + roomRate);
	}
}