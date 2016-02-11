import java.util.ArrayList;


public class SimplifiedDebts {
	
	public static ArrayList<Person> input = new ArrayList<Person>();
	public static ArrayList<Person> stack = new ArrayList<Person>();

	
	public static void simplify()
	{
		int i=0;
		while(i<input.size())
		{
			
			if(input.get(i).amount!=0)
			{
				
				if(stack.isEmpty())
				{
					System.out.println("Added to stack="+input.get(i).name+" "+input.get(i).amount);
					stack.add(input.get(i));
				}
				else if(stack.get(0).amount*input.get(i).amount<0)
				{
					Person temp = new Person(input.get(i).amount,input.get(i).name,"");
					
					
					while(temp.amount!=0)
					{
						if(stack.isEmpty())
						{
							System.out.println("Added to stack="+temp.name+" "+temp.amount);
							stack.add(temp);
							break;
						}
						else if(Math.abs(temp.amount)>=Math.abs(stack.get(0).amount))
						{
									temp.amount=temp.amount+stack.get(0).amount;
									System.out.println("Pays/gets paid="+stack.get(0).name+" "+stack.get(0).amount+" "+temp.name);
									stack.remove(0);
						}
						else if(Math.abs(temp.amount)<Math.abs(stack.get(0).amount))
						{
							
							Person a = new Person(stack.get(0).amount,stack.get(0).name,"");
							a.amount += temp.amount;
							System.out.println("Pays/gets paid="+temp.name+" "+temp.amount+" "+stack.get(0).name);
							stack.set(0,a);
							temp.amount=0;
						}
						
					}
					
					
				}
				else if(stack.get(0).amount*input.get(i).amount>0)
				{
					System.out.println("Added to stack="+input.get(i).name+" "+input.get(i).amount);
					stack.add(input.get(i));
				}
				
			}
			else
			{
				System.out.println(0+" ");
			}
			
			i++;
		}
		if(!stack.isEmpty())
		{System.out.println("Failure!!");}
		
	}
	
	
}
