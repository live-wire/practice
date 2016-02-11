
package pack2;
public class Trial2 implements Cloneable,InterOne,InterTwo {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Trial2 abc = new Trial2();
		
		int axz =0;
		try{
		Trial2 copy = (Trial2)abc.clone();
		if(copy.equals(abc))
			System.out.println("WooHoo");
		}
		catch(Exception e)
		{
		}
		
	}

	public void fun() {
		// TODO Auto-generated method stub
		
	}

}
