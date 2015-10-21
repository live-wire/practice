
public class Leaf {
	
	public int data;
	public Leaf left;
	public Leaf right;
	
	public Leaf()
	{
		this.left = null;
		this.right = null;
		this.data = 0;
	}
	public Leaf(int a)
	{
		this.data = a;
		this.left = null;
		this.right = null;
	}

}
