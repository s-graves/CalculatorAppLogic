import java.util.ArrayList;

//Test Comment
public class Tokenizer {
	
	String mathString;
	ArrayList<String>tokens = new ArrayList<String>();
	
	public Tokenizer(String input)
	{
		mathString = input;
		
	}
	public void tokenizeString()
	{
		String str = "";
		String type = "";
		for(int i = 0; i < mathString.length(); i++)
		{
			if(Character.isDigit(mathString.charAt(i)))
			{
				if(type.equals("number") || type.equals(""))
				{
					str += mathString.charAt(i);
					type ="number";
				}
				else
				{
					tokens.add(str);
					str = "";
					str += mathString.charAt(i);
					type = "number";
				}
			}
			if(Character.isLetter(mathString.charAt(i)))
			{
				if(type.equals("letter") || type.equals(""))
				{
					str += mathString.charAt(i);
					type = "letter";
				}
				else
				{
					tokens.add(str);
					str = "";
					str += mathString.charAt(i);
					type = "letter";
				}
			}

			else if(!Character.isLetter(mathString.charAt(i)) && !Character.isDigit(mathString.charAt(i)))
			{
				if(mathString.charAt(i) != ' ')
				{
					if(!str.equals(""))
					{
						tokens.add(str);
						str = "";
					}
					str += mathString.charAt(i);
					tokens.add(str);
					str = "";
				}
			}
		}
		if(!str.equals(""))
		{
			tokens.add(str);
		}
		System.out.println(tokens);
	}
}
