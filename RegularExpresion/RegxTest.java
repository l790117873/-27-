package RegularExpresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "eajghjfa13026196285aefgaha13308563619sazgfsuehgf18883130422ahgfaea4654534sdgs6135421jhgdf";
		String regex = "1[358]\\d{9}";
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(line);
		while (mat.find()) {
			String mobile = mat.group();
			System.out.println(mobile);
		}
	}
}
