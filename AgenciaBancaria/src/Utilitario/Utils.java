package Utilitario;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

	static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");
	
	public static String doubleToString(Double var) {
		return formatandoValores.format(var);
	}
	
}
