package ro.sci.camping.domain;

import java.awt.image.BufferedImage;
import java.io.File;


public class Campsite extends AbstractModel{

	//User user sau userID?;
	String name;
	Region region;
	//String villageCity; //Not necessary for search 
	CampsiteLocation campsiteLocation;
	
	
	String description; //this will be displayed on the campsite page
	String shortDescription; //this will be displayed when hovering in the map 
	File image; // image to be displayed on campsite page
	File smallImage;  //image to be displayed on hover on the map 
	
	String accommodationAvailable; 
	String foodDrinksGroceries;
	String activitiesAvailable;
	boolean swimmingPool;
	boolean childrenPlayground;
	String sportsGames;
	String toiletFacilities;
	String cookingFacilities;
	String internet;
	String paymentMethods;
	String prices;
	
	
}
