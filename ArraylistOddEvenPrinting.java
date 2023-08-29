import java.util.ArrayList;
import java.util.List;

public class ArraylistOddEvenPrinting {

	public static void main(String[] args) 
	{
		List l =new ArrayList();
		for(int i=0;i<=99;i++)
		{   
			l.add(i+1);
		}
		
		for(Object l1:l)
		{
			if((Integer)l1%2==0)
			{
				//System.out.println("Even"+(Integer)l1);	
			}
			else
			{
				System.out.println("Odd"+(Integer)l1);
			}
			
		}

	}

}
