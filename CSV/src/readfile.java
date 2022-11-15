
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readfile {
	private List<String> l1=new ArrayList<>();
	private List<String> l2=new ArrayList<>();
	private List<String> l3=new ArrayList<>();
	private List<String> l4=new ArrayList<>();
	private List<String> l5=new ArrayList<>();
	private List<String> l6=new ArrayList<>();
	private List<String> l7=new ArrayList<>();
	
	private List<String> l8=new ArrayList<>();
	private List<String> l9=new ArrayList<>();
	private List<String> l0=new ArrayList<>();
	private List<String> l11=new ArrayList<>();
	
	private List<String>[] data=new List[11];
	
	private Scanner sc;
	private String id="";
	private String name="";
	private String x="";
	private String y="";
	private String z="";
	private String time="";
	
	public void opentxt() {
		try {
			sc=new Scanner(new File("C:\\Users\\cz152\\Desktop\\log.txt"));
			System.out.println("open success");
		}
		catch(Exception E) {
			System.out.println("open error");
			
		}
	}
	
	public void readtxt() {
		double an=0;
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			int position=line.indexOf("|");
			id=line.substring(0, position);

			
			
			
			line=line.substring(position+1);
			position=line.indexOf("|");
			name=line.substring(0,position);
			
			
			line=line.substring(position+2);
			position=line.indexOf(",");
			x=line.substring(0,position);
			
			line=line.substring(position+1);
			position=line.indexOf(",");
			y=line.substring(0,position);
			
			line=line.substring(position+1);
			position=line.indexOf("]");
			z=line.substring(0,position);
			
			line=line.substring(position+2);
			time=line.substring(0);
			
			
			
			if((!id.equals("218"))&&(!name.equals("Samsung Linear Acceleration Sensor"))&&(!name.equals("K6DS3TR Gyroscope"))) {
				l1.add(id);
				l2.add(name);
				l3.add(x);
				l4.add(y);
				l5.add(z);
				l6.add(time);
				
				double angle=0.0;
				if(id.equals("218")||id.equals("220")) {
					
					angle=Math.atan(Double.parseDouble(y)/Math.sqrt(Double.parseDouble(x)*Double.parseDouble(x)+Double.parseDouble(z)*Double.parseDouble(z)));
					angle=angle*180/Math.PI;
					l7.add(Double.toString(angle));
				}
				else {
					l7.add("angle");
				}
			}
			
			if((!id.equals("218"))&&(!name.equals("K6DS3TR Accelerometer"))&&(!name.equals("K6DS3TR Gyroscope"))) {
				l8.add(x);
				l9.add(y);
				l0.add(z);
				
				double angle=0.0;
				if(id.equals("218")||id.equals("220")) {
					
					angle=Math.atan(Double.parseDouble(y)/Math.sqrt(Double.parseDouble(x)*Double.parseDouble(x)+Double.parseDouble(z)*Double.parseDouble(z)));
					angle=angle*180/Math.PI;
					l11.add(Double.toString(angle));
				}
				else {
					l11.add("noise");
				}
			}
			
		}
		
//		while(sc.hasNext()) {
//			
//		}
	}
	
	
	public void close() {
		sc.close();
	}
	
	public double d(double x) {
		double sump=0;

		double avep=0;

		for(int p=1;p<l11.size();p++) {
			
				sump+=Double.parseDouble(l11.get(p));

			
		}
		avep=sump/l11.size();
		

		return x-avep/2;
	}
	
	public List<String>[] getData() {
		data[0]=l1;
		data[1]=l2;
		data[2]=l3;
		data[3]=l4;
		data[4]=l5;
		data[5]=l6;
		data[6]=l7;
		data[7]=l8;
		data[8]=l9;
		data[9]=l0;
		data[10]=l11;
		return data;
	}
	
	public List<String> getnoise(){
		return l8;
	}
	
	public int size() {
		return l1.size();
	}
	
	
	
}
