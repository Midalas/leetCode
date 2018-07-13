
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode811 {

	public static void main(String[] args) throws Exception {
		String[] cpdomains = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		List<String> x = subdomainVisits(cpdomains);
		System.out.println();
	}

	public static List<String> subdomainVisits(String[] cpdomains) {
		List<String> result = new ArrayList<String>();
		List<String> temp = new ArrayList<String>();
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		for (int i = 0; i < cpdomains.length; i++) {
			String[] arr = cpdomains[i].split(" ");
			int visitNum = new Integer(arr[0]);
			String domain = arr[1];

			while (domain.indexOf(".") != -1) {
				if (countMap.containsKey(domain)) {
					countMap.put(domain, countMap.get(domain) + visitNum);
				} else {
					temp.add(domain);
					countMap.put(domain, visitNum);
				}
				domain = domain.substring(domain.indexOf(".") + 1, domain.length());
			}
			if (countMap.containsKey(domain)) {
				countMap.put(domain, countMap.get(domain) + visitNum);
			} else {
				temp.add(domain);
				countMap.put(domain, visitNum);
			}
		}

		for (String ym : temp)
			result.add(countMap.get(ym) + " " + ym);
		return result;
	}
}
