package java_core_prg;

public class switchWeek {
	int Dayno;
	public void getDayNo(int Dayno)
	{
		this.Dayno= Dayno;
	}
	
	public String DaysName() {
		
		switch(Dayno)
		{
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuseday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "no match found";
		}
	}

}
