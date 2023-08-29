
public class MoveAllUppercaseToEnd
{

	public static void main(String[] args)
	{
		String str="abrFTkYMop";
		String append="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<='A' || str.charAt(i)<='Z')
			{
				append=append+str.charAt(i);
				str=str.replace(""+str.charAt(i), "");
				i--;	
				
			}
		}
		str=str+append;
		System.out.println(str);

	}

}
