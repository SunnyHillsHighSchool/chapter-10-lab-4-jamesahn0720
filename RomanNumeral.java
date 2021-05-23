//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{

	roman = str;

	}

	public RomanNumeral(Integer orig)
	{

	number = orig;

	}

	public void setNumber(Integer num)
	{


	number = num;


	}

	public void setRoman(String rom)
	{

	roman = rom;

	}

	public Integer getNumber()
	{
		Integer sum = 0;
		while(roman.length()>0)
    {
      for(int i = 0; i < LETTERS.length; i++)
      {
        if(roman.indexOf(LETTERS[i])==0)
        {
          sum+=NUMBERS[i];
          roman = roman.substring(LETTERS[i].length());
          i=LETTERS.length;
        }
      }
    }
    return sum;
	}

	public String toString()
	{
		String s = "";
    while(number>0)
    {
      for(int i = 0; i < NUMBERS.length; i++)
      {
        if(number>=NUMBERS[i])
        {
          s = s+LETTERS[i];
          number-=NUMBERS[i];
          i=NUMBERS.length;
        }
      }
    }
    return s;
	}
}
