package GraphPackage;

public class road {
//===================================================================Properties
	private int slope;
	private String roadSurface;
	private int crowed;
	private Boolean TrafficButton;//if trafficbutton in cross return true, else return false
	private double length;
	private int traffic;
	private double averageSpeed; //m/s
	private boolean cross;
	private boolean ImpossibleSurface;
	private boolean stairsupport;//have stair support or no stair
	private boolean broken;
	private double width;

	
//===================================================================constructor
public road(double width,boolean broken,int slope, String roadSurface, Boolean TrafficButton,double length,boolean cross,double averageSpeed,boolean ImpossibleSurface,boolean stairsupport){
	this.width=width;
	this.broken=broken;
	this.slope=slope;
	this.roadSurface=roadSurface;
	this.TrafficButton=TrafficButton;
	this.length=length;
	this.cross=cross;
	this.averageSpeed=averageSpeed;
	this.ImpossibleSurface=ImpossibleSurface;
	this.stairsupport=stairsupport;

}
//private boolean acc=Accessibility(roadCondition, stairsupport,ImpossibleSurface,slope);
//private double safe=safety(slope, roadCondition, roadSurface, TrafficButton, cross,acc);
//private double difficulty=diff(roadSurface, cross, acc,slope );
//private double time=time(roadSurface, acc, slope, averageSpeed,length);
//===================================================================Methods



private boolean Accessibility(double width,boolean broken, boolean stairsupport, boolean ImpossibleSurface,int slope){
	if(width>=90&&broken==false&&stairsupport==true&&ImpossibleSurface==false&&Math.abs(slope)<=36) {
		return true;}
	else
		return false;
	}
 
private double safety(int slope, String roadSurface,boolean TrafficButton, boolean cross) {
	double score=0.0;

	int acrossscore=30;

	double roaddiff =10.0;

	
	if(isAcc()==false)

		return 0.0;
	

	else {

		

		if(roadSurface.equals("indoorfloor"))

			roaddiff=1.0;

		if(roadSurface.equals("asphalt"))

			roaddiff=0.9;

		if(roadSurface.equals("graystone"))

			roaddiff=0.8;

		if(roadSurface.equals("stiled"))

			roaddiff=0.7;

		if(roadSurface.equals("rtiled"))

			roaddiff=0.6;

		if(roadSurface.equals("cobblestone"))

			roaddiff=0.5;

		if(roadSurface.equals("vrcobblestone"))

			roaddiff=0.4;

		if(roadSurface.equals("granitecobble"))

			roaddiff=0.2;

		if(roadSurface.equals("cobbleLargeDeep"))

			roaddiff=0.1;

}

	if(cross==false) {

		acrossscore=20;

	}
	
	else {
		
		if(TrafficButton=true)
			acrossscore=10;
		else {
			acrossscore=0;
		}}
	score=roaddiff*40+((36-Math.abs(slope))/36)*40 + acrossscore;
	
	return score;
	}


private double diff(String roadSurface, boolean cross,int slope ) {

	double score=0.0;

	int acrossscore=30;

	double roaddiff =10.0;

	if(isAcc()==false)

		return 0;

	

	else {

		

		if(roadSurface.equals("indoorfloor"))

			roaddiff=1.0;

		if(roadSurface.equals("asphalt"))

			roaddiff=0.9;

		if(roadSurface.equals("graystone"))

			roaddiff=0.8;

		if(roadSurface.equals("stiled"))

			roaddiff=0.7;

		if(roadSurface.equals("rtiled"))

			roaddiff=0.6;

		if(roadSurface.equals("cobblestone"))

			roaddiff=0.5;

		if(roadSurface.equals("vrcobblestone"))

			roaddiff=0.4;

		if(roadSurface.equals("granitecobble"))

			roaddiff=0.2;

		if(roadSurface.equals("cobbleLargeDeep"))

			roaddiff=0.1;

}

	if(cross==true) {

		acrossscore=0;

	}

	

	double sc = roaddiff*40+((36-Math.abs(slope))/36)*30 + acrossscore;

	return  sc;
}



private double time(String roadSurface, int slope, double averageSpeed,double length) {
	double time=9999999999999999.999;
	if(isAcc()==false)
		return time;
	double roaddiff = 0.0;
	if(roadSurface.equals("indoorfloor"))
		roaddiff=1.0;
	if(roadSurface.equals("asphalt"))
		roaddiff=1.04;
	if(roadSurface.equals("graystone"))
		roaddiff=1.08;
	if(roadSurface.equals("stiled"))
		roaddiff=1.12;
	if(roadSurface.equals("rtiled"))
		roaddiff=1.16;
	if(roadSurface.equals("cobblestone"))
		roaddiff=1.2;
	if(roadSurface.equals("vrcobblestone"))
		roaddiff=1.24;
	if(roadSurface.equals("granitecobble"))
		roaddiff=1.28;
	if(roadSurface.equals("cobbleLargeDeep"))
		roaddiff=1.32;
	if(slope==0)
		time=roaddiff*length/averageSpeed;
	else {
		if(slope>0)
			time=(slope*0.02+1)*roaddiff*length/averageSpeed;
		else
			time=(1-slope*0.02)*roaddiff*length/averageSpeed;
	}
	return time;
}

private double stotal(String roadSurface2, int slope2, double averageSpeed2, double length2, boolean cross2, Boolean trafficButton2) {
	return 0.6*getSafe()+0.4*getDifficulty();
}

public int getSlope() {
	return slope;
}

public void setSlope(int slope) {
	this.slope = slope;
}

public String getRoadSurface() {
	return roadSurface;
}

public void setRoadSurface(String roadSurface) {
	this.roadSurface = roadSurface;
}

public Boolean getTrafficButton() {
	return TrafficButton;
}

public void setTrafficButton(Boolean trafficButton) {
	TrafficButton = trafficButton;
}


public double getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public double getAverageSpeed() {
	return averageSpeed;
}

public void setAverageSpeed(double averageSpeed) {
	this.averageSpeed = averageSpeed;
}

public boolean isCross() {
	return cross;
}

public void setCross(boolean cross) {
	this.cross = cross;
}


public boolean isImpossibleSurface() {
	return ImpossibleSurface;
}

public void setImpossibleSurface(boolean impossibleSurface) {
	ImpossibleSurface = impossibleSurface;
}

public boolean isStairsupport() {
	return stairsupport;
}

public void setStairsupport(boolean stairsupport) {
	this.stairsupport = stairsupport;
}

public boolean isAcc() {
	return Accessibility(width,broken,stairsupport,ImpossibleSurface,slope);
}

public double getSafe() {
	return safety(slope, roadSurface, TrafficButton, cross);
}


public double getDifficulty() {
	return diff(roadSurface, cross,slope );
}



public double getTime() {
	return time(roadSurface, slope, averageSpeed,length);
}



public double getstotal() {
	return stotal(roadSurface,slope,averageSpeed,length,cross,TrafficButton);
}




@Override
public String toString() {
	return "road [slope=" + slope + ", roadSurface=" + roadSurface + ", crowed=" + crowed + ", TrafficButton="
			+ TrafficButton + ", roadCondition=" + ", length=" + length + ", traffic=" + traffic
			+ ", averageSpeed=" + averageSpeed + ", cross=" + cross + ", ImpossibleSurface=" + ImpossibleSurface
			+ ", stairsupport=" + stairsupport + ", getSafe()=" + getSafe() + ", getDifficulty()=" + getDifficulty()
			+ ", getTime()=" + getTime() + ", getstotal()=" + getstotal() + "]";
}

}


// private double time(String roadSurface, boolean acrossroad, boolean accessibility,int slope ) 
		
		
		
		
		
		
		
		
	
	
	

