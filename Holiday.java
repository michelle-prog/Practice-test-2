public class Holiday{
	private String name;
	private int day;
	private String month;

	public Hoilday(String a, int b, String c){
	name = a;
	day = b;
	month = c;
	}

	public static inSameMonth(
	if name == month){
	System.out.println("True");
	}else{
	System.out.println("False");
	}

	public static double avgDate(
	Holiday[] holiday){
	int sum = 0;
	for(int i = 0; i < holiday.length; ++);{
	sum = sum + holiday(i).day;
	}
return((double)sum/holiday.length);
	}
	Holiday holiday = new Holiday("Independence day",4,"July");
}