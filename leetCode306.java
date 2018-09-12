package leetCode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

import mi.AigisInfoDto;
import mi.miConstant;

@SuppressWarnings("unused")
public class leetCode306 {
	public static void main(String[] args) throws Exception {

		boolean x = isAdditiveNumber("101");// 17862451178624617862473572493
		System.out.println(x);
	}

	// runtime 1ms
	
	//找出符合要求的前两个数
	public static boolean isAdditiveNumber(String num) {
		int length = num.length();
		int len1 = 1;
		int len2 = 1;
		while (len1 + len1 < length) {
			String firstNum = num.substring(0, len1);
			String secendNum = num.substring(len1, len1 + len2);
			String thirdNum = addStrings(firstNum, secendNum);
			int len3 = thirdNum.length();

			if (len1 + len2 + len3 > length) {
				len1++;
				len2 = 1;
				continue;
			}
			if (secendNum.charAt(0) == '0' && len2 > 1) {
				len2++;
				continue;
			}
			if (num.substring(len1 + len2, len1 + len2 + len3).equals(thirdNum)) {
				if (check(num.substring(len1 + len2, length), firstNum, secendNum))
					return true;
			}
			len2++;
		}
		return false;
	}

	//验证是否是累加数
	private static boolean check(String num, String firstNum, String secendNum) {
		String thirdNum = addStrings(firstNum, secendNum);
		if (num.length() < 1)
			return true;
		if (num.length() < thirdNum.length())
			return false;
		int len3 = thirdNum.length();
		return thirdNum.equals(num.substring(0, len3)) ? check(num.substring(len3, num.length()), secendNum, thirdNum)
				: false;

	}

	//字符串加法
	public static String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry > 0; i--, j--) {
			int x = i < 0 ? 0 : num1.charAt(i) - '0';
			int y = j < 0 ? 0 : num2.charAt(j) - '0';
			int sum = x + y + carry;
			sb.append(sum % 10);
			carry = sum / 10;
		}
		return sb.reverse().toString();
	}
}
