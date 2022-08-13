package Assignment3;

import java.sql.Date;
import java.text.DateFormat;

public class Util {

	public static String dateAsString(Date d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
	}
}
