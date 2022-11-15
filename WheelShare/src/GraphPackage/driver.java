package GraphPackage;

import ADTPackage.LinkedDictionary;
import ADTPackage.LinkedStack;
import ADTPackage.StackInterface;

public class driver {
	private static DirectedGraph<String> mg = new DirectedGraph<>();
	private static LinkedDictionary<String,Vertex> ld=new LinkedDictionary<>();
	
	public static void main(String[] args) {
		mg.addVertex("A", 0, 50);
		mg.addVertex("B", 0, 25);
		mg.addVertex("C", 0, 6);
		mg.addVertex("D", 0, 0);
		mg.addVertex("E", 6, -15);
		mg.addVertex("F", 6, 0);
		mg.addVertex("G", 6, 6);
		mg.addVertex("H", 6, 25);
		mg.addVertex("I", 6, 50);
		mg.addVertex("J", 6, 100);
		mg.addVertex("K", 25, 35);
		mg.addVertex("L", 20, 6);
		mg.addVertex("M", 10, 30);
		mg.addVertex("N", 25, -15);
		mg.addVertex("O", 15, -15);
		mg.addVertex("P", 38, -15);
		mg.addVertex("Q", 38, -35);
		mg.addVertex("R", 38, 6);
		mg.addVertex("S", 38, 35);
		mg.addVertex("T", 50, 35);
		mg.addVertex("U", 50, 6);
		mg.addVertex("V", 60, 40);
		mg.addVertex("W", 55, 100);

//		public boolean addEdge(T begin, T end, double width, boolean broken,int slope, String roadSurface, boolean TrafficButton,double length,boolean cross,double averageSpeed,boolean ImpossibleSurface,boolean stairsupport)
		
		mg.addEdge("A", "B", 97, false, 0, "indoorfloor", false, 25, false, 2, false, true);
		mg.addEdge("B", "C", 97, false, 0, "stiled", false, 19, false, 2, false, true);
		mg.addEdge("C", "D", 200, false, 4, "asphalt", true, 6, true, 2, false, true);
		mg.addEdge("A", "I", 200, false, -3, "asphalt", false, 6, true, 2, false, true);
		mg.addEdge("B", "H", 200, false, -3, "asphalt", false, 6, true, 2, false, true);
		mg.addEdge("C", "G", 200, false, -4, "asphalt", true, 6, true, 2, false, true);
		mg.addEdge("D", "F", 230, false, -2, "asphalt", true, 6, true, 2, false, true);
		mg.addEdge("J", "I", 150, false, -10, "asphalt", false, 50, false, 2, false, true);
		mg.addEdge("J", "W", 300, false, 0, "graystone", false, 49, false, 2, false, true);
		mg.addEdge("I", "M", 250, false, 8, "stiled", false, 20.5, false, 2, false, true);
		mg.addEdge("H", "G", 150, false, 5, "asphalt", false, 19, false, 2, false, true);
		mg.addEdge("G", "F", 150, false, 3, "graystone", false, 6, false, 2, false, true);
		mg.addEdge("F", "E", 150, false, 6, "asphalt", false, 15, false, 2, false, true);
		mg.addEdge("M", "K", 169, false, 9, "asphalt", false, 16, false, 2, false, true);
		mg.addEdge("E", "O", 300, false, -3, "asphalt", false, 9, false, 2, false, true);
		mg.addEdge("K", "S", 150, false, 0, "asphalt", false, 13, false, 2, false, true);
		mg.addEdge("K", "R", 150, false, 0, "asphalt", false, 32, false, 2, false, true);
		mg.addEdge("S", "R", 190, false, 13, "stiled", false, 29, false, 2, false, true);
		mg.addEdge("L", "R", 150, false, 0, "asphalt", false, 18, false, 2, false, true);
		mg.addEdge("R", "N", 193, false, 0, "graystone", false, 25, false, 2, false, true);
		mg.addEdge("O", "N", 150, false, 0, "asphalt", false, 10, false, 2, false, true);
		mg.addEdge("N", "P", 150, false, 0, "asphalt", false, 13, false, 2, false, true);
		mg.addEdge("R", "P", 166, false, 2, "asphalt", false, 21, false, 2, false, true);
		mg.addEdge("P", "Q", 150, false, 0, "asphalt", false, 20, false, 2, false, true);
		mg.addEdge("T", "S", 100, false, 4, "asphalt", false, 12, false, 2, false, true);
		mg.addEdge("T", "U", 150, false, 20, "graystone", false, 29, false, 2, false, true);
		mg.addEdge("U", "P", 140, false, -2, "graystone", false, 24, false, 2, false, true);
		mg.addEdge("R", "U", 190, false, -10, "asphalt", false, 12, false, 2, false, true);
		mg.addEdge("R", "T", 150, false, 3, "stiled", false, 31, false, 2, false, true);
		mg.addEdge("T", "V", 180, false, 0, "asphalt", false, 11, false, 2, false, true);
		mg.addEdge("H", "M", 150, false, 20, "asphalt", false, 20, false, 2, false, false);//it has a stair between two vertices, so we give false to stair support
		mg.addEdge("Q", "U", 180, false, 50, "asphalt", false, 40, false, 2, false, true);//It is too high slope between Q and V
		mg.addEdge("K", "L", 150, false, 20, "grass", false, 20, false, 2, true, true);//the road type is grass which mean it is impossible surface.
		
		
//		//T begin, T end, double width, boolean broken,int slope, String roadSurface, boolean TrafficButton,double length,boolean cross,double averageSpeed,boolean ImpossibleSurface,boolean stairsupport
		
			
		
	}
	
	
	public static void circleCheck() {
		
	}
}
