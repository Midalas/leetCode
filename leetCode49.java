package test;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.apache.commons.io.FileUtils;

import mi.ImageHelper;
import mi.ImageParam;
import mi.miConstant;
import mi.miUtil;

@SuppressWarnings("unused")

public class leetCode49 {

	public static void main(String[] args) throws Exception {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		// 输出:
		// [
		// ["ate","eat","tea"],
		// ["nat","tan"],
		// ["bat"]
		// ]
		groupAnagrams(strs);
		System.out.println();
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		List<String> strsList = new ArrayList<String>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			String temp = hashStr(strs[i]);
			if (!map.containsKey(temp))
				map.put(temp, new ArrayList<String>());
			map.get(temp).add(strs[i]);
		}
		return new ArrayList<List<String>>(map.values());
	}

	private static String hashStr(String str) {
		String result = "";
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		return String.valueOf(temp);
	}

}
