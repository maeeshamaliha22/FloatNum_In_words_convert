import java.util.Scanner;


public class NumbersInWords {

	public static String[] unit= {"Zero","One","Two","Three","Four","Five", 
					"Six","seven","Eight","Nine","Ten","Eleven",
					"Twelve","Thirteen","Fourteen","Fifteen","Sixteen",
					"Seventeen","Eighteen","Nineteen"};

public static String[] ten= {"","","Twenty","Thirty","Fourty","Fifty",
				"Sixty","Seventy","Eighty","Ninety" };

public static String[] hundred= {"","One hundred","Two hundred","Three hundred","Four hundred","Five hundred",
				"Six hundred","Seven hundred","Eight hundred","Nine hundred"};

public static String[] thousand= {"","One thousand","Two thousand","Three thousand","Four thousand","Five thousand",
				"Six thousand","Seven thousand","Eight thousand","Nine thousand"};

public static String convert_Numbers( float num)
{
	String sfloat = new String();
	sfloat = Float.toString(num);
	
	int len = sfloat.length();
	int idx =sfloat.lastIndexOf('.');
	String s1 =  sfloat.substring(idx+1,len);
	
	int result = Integer.parseInt(s1);
	
	if(num<0)
	{
	return "Amount can not be negative";
	}

	if(num>=0.0  && num<=19.9)
	{
	System.out.println(unit[(int) (num)]+  " Taka and " + ten[(result/10)] +" "+ unit[(result%10)] +" paisa");
	}
	
	if(num>=20.0 && num<100)
	{
	System.out.println(ten[(int)(num/10)] + " " + unit[(int)(num%10)] +" Taka and "+ ten[(result/10)]+" " +unit[(result%10)] +" paisa");
	}
	
	if(num>=100.0 && num<1000)
	{
	System.out.println(hundred[(int)(num/100)]+" " + ten[(int)((num%100)/10)] + " " + unit[(int)(num%10)] +" Taka and "+ ten[(result/10)]+" " +unit[(result%10)] +" paisa");
	}
	
	if(num>=1000 && num<100000)
	{
	System.out.println(thousand[(int)(num/1000)]+" "+hundred[(int)((num%1000)/100)]+" "+ten[(int)((num%100)/10)]+" "+ unit[(int)(num%10)]+" taka and "+ten[(result/10)]+" "+unit[(result%10)]+ " paisa");
	}
	return null;

}
	

	public static void main(String[] args)
	{
		
		float num;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter amount to convert in texts");
		num=s.nextFloat();
		System.out.println(convert_Numbers(num));
		
		
		
	}

}
