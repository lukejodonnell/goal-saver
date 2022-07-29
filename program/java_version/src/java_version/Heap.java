package java_version;

public class Heap 
{
    int size;
    Card h[] = new Card[52];
    
    void init52Deck()
    {
    	int value = 0;
    	for(int i=0; i<52; i++)
    	{
    		char s[] = {'d', 'c', 'h', 's'};
    		if(value>12)
    		{
    			value = 0;
    		}
    		
    		int quad = i/13;
    		h[i] = new Card(i, s[quad], value);
    		value++;
    	}
    }
    
    void printCardNum(int i)
    {
    	h[i].print();
    }
    
    public Heap()
    {
    	
    }
    
    void example()
    {
    	for(int i=0; i<100; i++)
    	{
    		int quad = i/25;
    		if(quad==0)
    		{
//    			do thing
    		}
    		else if(quad==1)
    		{
//    			do other thing
    		}
    		else if(quad==3)
    		{
//    			do yet a third thing
    		}
    		else
    		{
//    			do nothing real quick
    		}
    	}
    }
}
