package RegularExpresion;

public class Validate {
	public static boolean isMobile(String mobile) {
		String regex = "1[358]\\d{9}";
		if (mobile.matches(regex)) {
			return true;
		} else {
			return false;

		}

	}

	public static boolean isPhone(String phone) {
		String regex = "(0\\d[2,3]-?)?[1-9]\\d{7}";
		if (phone.matches(regex)) {
			return true;
		} else {
			return false;

		}

	}

	public static boolean isMail(String mail) {
		String regex = "\\w{1,}@(\\w{1,}.){1,}\\w{1,}";
		if (mail.matches(regex)) {
			return true;
		} else {
			return false;

		}

	}
}
