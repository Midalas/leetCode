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

import org.apache.commons.io.FileUtils;

import mi.ImageHelper;
import mi.ImageParam;
import mi.miConstant;
import mi.miUtil;
@SuppressWarnings("unused")
public class test{
	 public static void main(String[] args) throws Exception {

		 insert("aigis",1000,2000);
           
  }
	 
	 
	 
	private void generalFile() throws ClassNotFoundException, SQLException, IOException, InterruptedException{
		 generalMiFile("cheng");
		 generalMiFile("yucheng");
		 generalMiFile("aigis");
		 generalMiFile("unitia");
		 generalMiFile("rebless");
	 }
	 
	 public static void generalMiFile(String tableName) throws ClassNotFoundException, SQLException, IOException, InterruptedException{
			Connection conn = null;
			String url =  miConstant.jdbcAdress;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			String sql="SELECT userId,password FROM "+tableName+" WHERE statu='Y' order by userId";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
//			String path=miConstant.webappPath;
			String path="C:\\Users\\xsz\\Desktop\\dmm\\";			
			File fout = new File(path+tableName+".txt");
			FileOutputStream fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			while (rs.next()) {
				bw.write(rs.getString("userId")+","+rs.getString("password"));
				bw.newLine();
			}		
			bw.close();
			fos.close();
			rs.close();
			conn.close();
			Thread.sleep(2000);
		
	}
	 
	 private static void insert(String tableName,int begin,int end) throws ClassNotFoundException, SQLException{
		 Connection conn = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(miConstant.jdbcAdress);
			Statement stmt = conn.createStatement();
			for(int i=begin;i<end;i++){
			String sql = "insert into "+tableName+" (userId,tableName,statu) values ("+i+",'"+tableName+"',"+"'signed')";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			}
	 }
	 
	 private void copyFile() throws IOException{
		 File f = new File("C:\\Users\\xsz\\Desktop\\7x2\\7x807.jpg");
		 for(int i=808;i<1000;i++){
		 FileUtils.copyFile(f, new File("C:\\Users\\xsz\\Desktop\\7x2\\7x"+i+".jpg"));;	
		 }
	 }
	 
	 
	
}
