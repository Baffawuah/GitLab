/*
constructor requires a room number
adds a $40 surcharge which is based on the room number
*/
public class HotelSuite extends HotelRoom
{
	public HotelSuite(int rn)
	{
        super(rn);
        //HotelRoom h = new HotelRoom();
                
		//call constructor in base class (HotelRoom)
        if(getRoomNo() <= 299) 
        {
            setRate(69.95);
        }
        else 
        {
            setRate(89.95);
        }
        setRate(getRate() + 40);
	}
}