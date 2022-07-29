package java_version;

class StarBox
{
	int side;
	
	void specPrint(int s, boolean tag)
	{
		boolean oddIterant = true;
		for(int squareIterant=1; squareIterant<=s; squareIterant++)
		{
			int halfSquareIterant=squareIterant/2;
			if (squareIterant%2==0)
			{
				oddIterant = false;
			}
			else
			{
				oddIterant = true;
			}
			for(int line=1; line<=squareIterant; line++)
			{
				for(int numb=1; numb<=squareIterant; numb++)
				{
					if(line==1 || line==squareIterant)
					{
						System.out.print("$ ");
					}
					else if(numb==1 || numb==squareIterant)
					{
						System.out.print("$ ");
					}
					else if(tag && oddIterant && line==halfSquareIterant+1 && numb==halfSquareIterant+1)
					{
						System.out.print("X ");
					}
					else if(tag && !oddIterant)
					{
						if(line==halfSquareIterant+1 || line==halfSquareIterant)
						{
							if(numb==halfSquareIterant+1 || numb==halfSquareIterant)
							{
								System.out.print("X ");
							}
							else
							{
								System.out.print("  ");
							}
						}
						else
						{
							System.out.print("  ");
						}
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		System.out.println();
		}
	}
	
	void print()
	{
		specPrint(side, true);
	}
	public StarBox(int constructorSide)
	{
		System.out.println("One arg Constructor called");
		side = constructorSide;
	}

	public StarBox() 
	{
		System.out.println("Zero arg Constructor called");
//		just allocate memory
	}
}


public class HelloWorldExample 
{

	public static void main(String[] args) 
	{		
		System.out.println("helloworld");
		
		StarBox sb = new StarBox(8);
		
		sb.print();
//		
//		Card aceOfSpades = new Card(1, 's', 1);
//		aceOfSpades.print();
//		aceOfSpades.display();
//		
//		Heap deck = new Heap();
//		deck.init52Deck();
//		for(int i=0; i<52; i++)
//		{
//		    deck.printCardNum(i);
//		}
//		
//		String a[] = {"applejack", "Bran", "Maiskolben", "Olive"};
//		for(String k : a)
//		{
//			System.out.println(k);
//		}
	}

}
