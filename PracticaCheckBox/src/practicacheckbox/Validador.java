/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacheckbox;

/**
 *
 * @author alberto
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {

	static private String regEx = "\\b\\d{8}[A-Z&&[^ÑOUI]]|\\b[XYZ]\\d{7}[A-Z&&[^ÑOUI]]";
	static Pattern patron = Pattern.compile(regEx);

	public static boolean checkEstructura(String identificador) {
		Matcher checker = patron.matcher(identificador);
		return checker.find();
	}

}
