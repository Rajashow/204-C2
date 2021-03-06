package lab4;
/**
 * Makes a tv with 
 * manufacturer. The manufacturer attribute will hold the brand name. This cannot change
 * 	once the television is created, so will be a named constant.
 * screenSize. The screenSize attribute will hold the size of the television screen.
 * 	This cannot change once the television has been created so will be a named constant.
 * powerOn. The powerOn attribute will hold the value true if the power is on, and false if the
 * 	power is off.
 * channel. The channel attribute will hold the value of the station that the television is showing.
 * volume. The volume attribute will hold a number value representing the loudness (0 being no
 * 	sound).with 
*@author Rajashow 
* 2018/26/2
*/

public class Television {
/**
 * manufacturer. The manufacturer attribute will hold the brand name. This cannot change
once the television is created, so will be a named constant.
screenSize. The screenSize attribute will hold the size of the television screen.
This cannot change once the television has been created so will be a named constant.
powerOn. The powerOn attribute will hold the value true if the power is on, and false if the
power is off.
channel. The channel attribute will hold the value of the station that the television is showing.
volume. The volume attribute will hold a number value representing the loudness (0 being no
sound).
 * */
	Boolean powerOn;
	final String MANUFACTURER;
	final	int SCREEN_SIZE;
	int volume,channel;
	
	/**
	 * makes an instance of television 
	 * it also Initialize the powerOn field to false (power is off), the volume to 20, and the channel to 2.
	 * @param manufacturer:String - The manufacturer attribute will hold the brand name. This cannot change once the television is created, so will be a named constant.
	 * @param screenSize:int - The screenSize attribute will hold the size of the television screen.This cannot change once the television has been created so will be a named constant.
	 * */
	public Television(String manufacturer, int screenSize) {
this.MANUFACTURER=manufacturer;
this.SCREEN_SIZE=screenSize;
this.powerOn= false;
this.volume=20;
this.channel=2;
	}
/**
 * The power method will toggle the power between on and off, changing the value stored in the powerOn field from true to false or from false to true.
 * */
	public void power() {
		powerOn = !powerOn;
		
	}
/**
 *  The getScreenSize method will return the constant value stored in the SCREEN_SIZE field.
 * @return SCREEN_SIZE:int; tv's screen size
 * */
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	/**
	 *  The getManufacturer method will return the constant value stored in the MANUFACTURER field.
	 * @return MANUFACTURER:String -the Manufacturer's brand name
	 * */
	public String getManufacturer() {
		return MANUFACTURER;
	}
/**
 * The setChannel method will store the desired station in the channel field
 * @param station:int - the station you want to tune into for the tv
 * */
	public void setChannel(int station) {
this.channel=station;		
	}

	/**
	 *  The increaseVolume method will increase the value stored in the volume field by 1.
	 * */
	public void increaseVolume() {
volume++;		
	}
	/**
	 *   The getChannel method will return the value stored in the channel field
	 * @return channel:int; the current channel number
	 * */
	public int getChannel() {
		return this.channel;
	}
	/**
	 *    The getVolume method will return the value stored in the volume field.
	 * @return volume:int; the current volume of the tv
	 * */
	public int getVolume() {
		return this.volume;
	}
	/**
	 *  The increaseVolume method will decrease the value stored in the volume field by 1.
	 * */
	public void decreaseVolume() {
volume--;		
	}

}
