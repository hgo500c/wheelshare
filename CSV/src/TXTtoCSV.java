import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TXTtoCSV {
	
	public static void main(String[] args) {
		readfile rf=new readfile();
		rf.opentxt();
		rf.readtxt();
		try {
			PrintWriter pw=new PrintWriter(new File("C:\\Users\\cz152\\Desktop\\csv\\test.csv"));
			StringBuilder sb=new StringBuilder();
			rf.readtxt();
			
			for(int i=0;i<rf.size();i++) {
				sb.append(rf.getData()[0].get(i));
				sb.append(",");
				sb.append(rf.getData()[1].get(i));
				sb.append(",");
				sb.append(rf.getData()[2].get(i));
				sb.append(",");
				sb.append(rf.getData()[3].get(i));
				sb.append(",");
				sb.append(rf.getData()[4].get(i));
				sb.append(",");
				sb.append(rf.getData()[5].get(i));
				sb.append(",");
				sb.append(rf.getData()[6].get(i));
				sb.append(",");
				
				if(i!=0) {
				double angle=0;
				
//				if(rf.getnoise().size()>i) {
//					sb.append(rf.getData()[10].get(i));
//					sb.append(",");
//				}
				
				
				if(rf.getnoise().size()>i) {
//					double nx=Double.parseDouble(rf.getData()[2].get(i))-Double.parseDouble(rf.getData()[7].get(i));
//					double ny=Double.parseDouble(rf.getData()[3].get(i))-Double.parseDouble(rf.getData()[8].get(i));
//					double nz=Double.parseDouble(rf.getData()[4].get(i))-Double.parseDouble(rf.getData()[9].get(i));
//					angle=
//							Math.atan(
//									ny
//									/
//									Math.sqrt(
//											nx
//													*
//													nx
//															+
//															nz
//																	*nz
//																			));
//					angle=angle*180/Math.PI;
					angle=rf.d(Double.parseDouble(rf.getData()[6].get(i)));
					
					
						sb.append(angle);
						sb.append("\n");
					
				}}else {
					sb.append("true");
					sb.append("\n");
				}
			}
			
			pw.write(sb.toString());
			pw.close();
			
			
			
			System.out.println("finished");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rf.close();
	}
	
	
	
	
	
}
