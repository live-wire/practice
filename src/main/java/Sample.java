import java.util.ArrayList;


public class Sample {

	/**
	 * @param args
	 */
	
	public static ArrayList<Integer> x = new ArrayList<Integer>();
	public ArrayList<Integer> y ;
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample v = new Sample();
		v.y = new ArrayList<Integer>();
		v.y.add(12);
		v.y.add(14);
		x = v.y;
		v.y.remove(0);
		System.out.println(x.size()+" "+v.y.size());
		
		
	}
	

}
