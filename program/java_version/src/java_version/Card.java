package java_version;

public class Card 
{
	int id;
	char suit;
	int value;
	
	void print()
	{
		System.out.println("card id: " + id + " it is the " + suit + " of " + value);
	}
	
	boolean checkMidPoint(int total, int current)
	{
		boolean odd;
		int half=total/2;
		if(total%2==0)
		{
			odd = false;
		}
		else
		{
			odd = true;
		}
		
		if(odd)
		{
			if(current==half+1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(current==half || current==half+1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	boolean checkCenter(int width, int height, int currentWidth, int currentHeight)
	{
		
		if(checkMidPoint(height, currentHeight) && checkMidPoint(width, currentWidth))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void display(int width, int height)
	{
		for(int row=1; row<=height; row++)
		{
			for(int column=1; column<=width; column++)
			{
				if(row==1 || row==height || column==1 || column==width)
				{
					System.out.print("$ ");
				}
				else if(checkCenter(width, height, column, row))
				{
					System.out.print("X ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	void display()
	{
		this.display(7, 9);
	}
	
	public Card()
	{
		//Nothing
	}
	
	public Card(int id, char suit, int value)
	{
		this.id = id;
		this.suit = suit;
		this.value = value;
	}
}
