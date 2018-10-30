package leetCode;

import java.util.HashSet;
import java.util.Set;

public class leetCode929 {
	public static void main(String[] args) throws Exception {
		String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int x=numUniqueEmails(emails);
		System.out.println();
	}

	//runtime 90ms
	public static int numUniqueEmails(String[] emails) {
		int res = 0;
		Set<String> set = new HashSet<String>();
		for (String mail : emails) {
			String[] split = mail.split("@");
			split[0]=split[0].replace(".", "");
			if (split[0].indexOf("+") != -1) {
				split[0] = split[0].substring(0,split[0].indexOf("+"));
			}
			String newmail = split[0] + "@" + split[1];
			if (!set.contains(newmail)) {
				set.add(newmail);
				res++;
			}
		}
		return res;
	}
}
