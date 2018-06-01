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

public class leetCode55 {

	public static void main(String[] args) throws Exception {
		 int[] nums = { 2,1,1,0,0};
//		int[] nums = { 1,1,0,1};
		boolean x = canJump(nums);
		System.out.println(x);

	}

	public static boolean canJump(int[] nums) {
		int i = 0;
		while (i < nums.length-1) {
			int max = Integer.MIN_VALUE;
			int step = 0;
			if (nums[i] == 0) {
				return false;
			}	
			for (int j = 0; j <= nums[i]; j++) {
				if (i + j >= nums.length - 1) {
					return true;
				}
				if (nums[i + j] + j >= max) {
					max = nums[i + j] + j;
					step = j;
				}
			}
			i += step;
		}
		return true;
	}

	

}
