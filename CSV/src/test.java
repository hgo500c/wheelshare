import java.util.List;

public class test {
	
	public static void main(String[] args) {
		List<String>[] data=new List[6];
		data[0].add("1");
		String x="asdfasdfasdf";
		System.out.println(x.indexOf("d"));
		x=x.substring(x.indexOf("d")+1);
		System.out.println(data[0].get(0));
	}
}
