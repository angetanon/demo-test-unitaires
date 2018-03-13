package demo_test_unitaires.demo_test_unitaires;

import dev.utils.StringUtils;

public class TestStringUtils {

	public static void main(String[] args) {

		int distance = StringUtils.levenshteinDistance("fille", "fillette");
		if (distance != 3) {
			throw new RuntimeException("la distance n'est pas exacte, elle doit être égale à 3");
		}

		distance = StringUtils.levenshteinDistance("petit", "petit");
		if (distance != 0) {
			throw new RuntimeException("la distance n'est pas exacte, elle doit être égale à 0");
		}

		distance = StringUtils.levenshteinDistance("google", "gonfler");
		if (distance != 3) {
			throw new RuntimeException("la distance n'est pas exacte, elle doit être égale à 3");
		}

		distance = StringUtils.levenshteinDistance("dring", "ring");
		if (distance != 1) {
			throw new RuntimeException("la distance n'est pas exacte, elle doit être égale à 1");
		}

		try {
			distance = StringUtils.levenshteinDistance(null, null);
		} catch (RuntimeException e) {
			System.out.println(e);

		}
		
		distance = StringUtils.levenshteinDistance("aviron", "avion");
		if (distance != 1) {
			throw new RuntimeException("la distance n'est pas exacte, elle doit être égale à 1");
		}


	}

}
