package prefinal;

import java.util.Comparator;

public class ComparadorTamanio implements Comparator<String> {

	@Override
	public int compare(String s0, String s1) {
		return Integer.compare(s0.length(), s1.length());
	}

}
