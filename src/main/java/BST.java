import java.util.ArrayList;


public class BST 
{
	public Leaf top;

	public BST(int a)
	{
		this.top = new Leaf(a);
		
	}
	
	public boolean contains(Leaf up,int element)
	{
		if(up.data == element)
			return true;
		
		boolean x = false;
		boolean y = false;
		if(up.left!=null)
			x = contains(up.left,element);
		if(up.right!=null)
			y = contains(up.right,element);
		
		return x||y?true:false;
	}
	
	public int findCommonParent(Leaf up,int element1,int element2)
	{
		if(contains(up, element1) && contains(up, element2))
		{
			
				if(up.left!=null && contains(up.left, element1) && contains(up.left, element2)) 
				{
					return findCommonParent(up.left, element1, element2);
				}
				else if(up.right!=null && contains(up.right, element1) && contains(up.right, element2))
				{
					return findCommonParent(up.right, element1, element2);
				}
				else
					return up.data;
			
		}
		return 999;
	}
	
	public void add(Leaf up,int a)
	{
		if(up.data < a)
		{
			if(up.right == null)
			{
				up.right = new Leaf(a);
			}
			else
			{
				add(up.right, a);
			}
		}
		else
		{
			if(up.left == null)
			{
				up.left = new Leaf(a);
			}
			else
			{
				add(up.left,a);
			}
		}
	 }
	
	public void printTree(Leaf up)
	{
		if(up.left!=null)
		{
			printTree(up.left);
		}
		System.out.println(up.data);
		if(up.right!=null)
		{
			printTree(up.right);
		}
		
	}
	
	public void printStructure()
	{
		ArrayList<Leaf> queue1 = new ArrayList<Leaf>();
		ArrayList<Leaf> queue2 = new ArrayList<Leaf>();
		queue1.add(this.top);
		while(true)
		{
			if(queue1.isEmpty()&&queue2.isEmpty())
				break;
			if(!queue1.isEmpty())
			{
				while(!queue1.isEmpty())
				{
					if(queue1.get(0).left!=null)
						queue2.add(queue1.get(0).left);
					if(queue1.get(0).right!=null)
						queue2.add(queue1.get(0).right);
					System.out.print(queue1.get(0).data+" ");
					queue1.remove(0);
					
				}
				System.out.print("\n");
			}
			else if(!queue2.isEmpty())
			{
				while(!queue2.isEmpty())
				{
					if(queue2.get(0).left!=null)
						queue1.add(queue2.get(0).left);
					if(queue2.get(0).right!=null)
						queue1.add(queue2.get(0).right);
					System.out.print(queue2.get(0).data+" ");
					queue2.remove(0);
					
				}
				System.out.print("\n");	
			}
		
		
		}
	}
	public int treeWidthLeft()
	{
		return width(0,0,this.top,0);
	}
	public int treeWidthRight()
	{
		return width(0, 1, this.top, 0);
	}
	
	private int width(int wide,int side,Leaf up,int maxWidth)
	{
		if(wide>maxWidth)
			maxWidth=wide;
		if(side==0)
		{
			
			if(up.left!=null && up.right!=null)
			{
				return Math.max(width(wide+1,side,up.left,maxWidth), width(wide-1,side,up.right,maxWidth));
			}
			else if(up.left!=null)
			{
				return width(wide+1,side,up.left,maxWidth);
			}
			else if(up.right!=null)
			{
				return width(wide-1,side,up.right,maxWidth);
			}
			else
			{
				return maxWidth;
			}
			
		}
		else
		{
			
			if(up.left!=null && up.right!=null)
			{
				return Math.max(width(wide-1,side,up.left,maxWidth), width(wide+1,side,up.right,maxWidth));
			}
			else if(up.left!=null)
			{
				return width(wide-1,side,up.left,maxWidth);
			}
			else if(up.right!=null)
			{
				return width(wide+1,side,up.right,maxWidth);
			}
			else
			{
				return maxWidth;
			}
			
			
		}
		
		
	}
	
	private void printLeftArm(Leaf up)
	{
		
		if(up.left==null&&up.right==null)
		{}
		else if(up.left!=null)
		{
			System.out.print(up.data+" ");
			printLeftArm(up.left);
		}
		else if(up.right!=null)
		{
			System.out.print(up.data+" ");
			printLeftArm(up.right);
		}
	}
	private void printRightArm(Leaf up)
	{
		
		if(up.left==null&&up.right==null)
		{}
		else if(up.right!=null)
		{
			printRightArm(up.right);
			System.out.print(up.data+" ");
		}
		else if(up.left!=null)
		{
			printRightArm(up.left);
			System.out.print(up.data+" ");
		}
		
	}
	private void printLeaves(Leaf up)
	{
		if(up.left==null&&up.right==null)
			System.out.print(up.data+ " ");
		if(up.left!=null)
			printLeaves(up.left);
		if(up.right!=null)
			printLeaves(up.right);
	}
	public void printBoundry()
	{
	System.out.print(this.top.data+" ");
	if(top.left!=null)
		printLeftArm(this.top.left);
	printLeaves(this.top);
	if(top.right!=null)
		printRightArm(this.top.right);
	}
	
	public BST reverse(Leaf up)
	{
		BST reverse = new BST(up.data);
		reversal(up,reverse.top);
		return reverse;
	}
	private void reversal(Leaf original,Leaf mirror)
	{
		mirror.data = original.data;
		if(original.left!=null)
		{
			mirror.right = new Leaf();
			reversal(original.left,mirror.right);
		}
		if(original.right!=null)
		{
			mirror.left=new Leaf();
			reversal(original.right,mirror.left);
		}
		
	}
	
	 
	
	
}
