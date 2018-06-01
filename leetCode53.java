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

public class leetCode53 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1};
		int x=maxSubArray(nums);
		System.out.println(x);
	}

	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int max = 0;
		if (nums.length < 1)
			return 0;
		if (FirstPositiveNumber(nums) <= 0) {
			return FirstPositiveNumber(nums);
		}
		for (int i = 0; i < nums.length; i++) {
			if (sum + nums[i] > 0) {
				sum += nums[i];
				max = sum > max ? sum : max;
			} else {
				sum = 0;
			}
		}
		return max;
	}
	private static int FirstPositiveNumber(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0){
				return nums[i];
			}
			max = nums[i] > max ? nums[i] : max;
		}
		return max;
	}

}
