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

public class leetCode50 {

	public static void main(String[] args) throws Exception {

		double x = myPow(2.00000, -2);
		System.out.println(x);
	}

	public static double myPow(double x, int n) {
		if(n==0)
			return 1;
		double result;
		int a = n;
		int b = 1;
		while (a % 2 == 0) {
			a /= 2;
			b++;
		}
		result = Math.pow(x, a);
		for (int i = 1; i < b; i++) {
			result *= result;
		}
		return result;
	}

}
