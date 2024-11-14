package Programs_Exercises;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:MM:SS");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
	}

}
