// The purpose of this class is to model a television
// Emmett Parker and 2017-12-01
public class Television
{
	
    	private String MANUFACTURER;//stores the manufacturer


    	 private int SCREEN_SIZE;//how large the screen is

    	 private boolean powerOn;//state of power

    	 private int channel;//what channel the tv is on

    	 private int volume;//how loud it is
		 
		 //takes in values and sets initial values
		 public Television(String brand, int size){
   		powerOn = false;
   		volume = 20;
   		channel= 2;
		MANUFACTURER=brand;
		SCREEN_SIZE=size;

    }
	//Sets channel
	public void setChannel(int c)
	{
		channel = c;
	}
	//returns channnel 
	public int getChannel()
	{
		return channel;
	}
	//Sets volume
	public void setVolume(int v)
	{
		volume = v;
	}
	//returns volume
	public int getVolume()
	{
		return volume;
	}
	//returns manufacturer 
	public String getManufacturer()
	{
			return MANUFACTURER;
	}
	//returns screen size
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	//increases volume
	public void increaseVolume()
	{
			volume++;
	}
	//decreases volume
	public void decreaseVolume()
	{
		volume--;
	}
	//Turns power on and off
	public void power()
	{
		powerOn = !powerOn;
	}
		 
}