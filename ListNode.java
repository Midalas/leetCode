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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;

import mi.ImageHelper;
import mi.ImageParam;
import mi.miConstant;
import mi.miUtil;

@SuppressWarnings("unused")
public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public static void main(String[] args) throws Exception {
		ListNode l1 = new ListNode(1);
		addNode(l1, 2);
		addNode(l1, 3);
		ListNode l2 = new ListNode(-1);
		addNode(l2, 0);
		addNode(l2, 3);
		System.out.println(mergeTwoLists(l1, l2));

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(-1);
		int size = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (l1 != null) {
			list.add(l1.val);
			l1 = l1.next;
			size++;
		}
		while (l2 != null) {
			list.add(l2.val);
			l2 = l2.next;
			size++;
		}
		int[] array = new int[size];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			addNode(result, array[i]);
		}

		return result.next;
	}

	private static ListNode createListNode(int[] a){
		if(a.length<1)
			return null;
		ListNode l=new ListNode(a[0]);
		ListNode temp=l;
		for(int i=1;i<a.length;i++){
			temp.next=new ListNode(a[i]);
			temp=temp.next;
		}
		return l;
	}
	
	private static void addNode(ListNode l, int val) {
		ListNode temp = l;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new ListNode(val);
	}

}
