package com.iii.pel.jasperreports;

import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class JasperTestMainMethod1 {
	
	public static Connection getJDBCConnection() throws  Exception {
		Connection dbCon=null;
		String userName = "P11_AI_LIVE";
		String passWord = "P11_AI_LIVE";
		String jdbcURL = "jdbc:oracle:thin:@192.168.1.131:19330:wenxt19";
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	
		
		try{
			System.out.println("welcome to getConnectionforXDOCS      "+userName+"  "+passWord+"  "+jdbcURL+"  "+jdbcDriver+"  ");
			Class.forName(jdbcDriver);
			dbCon = DriverManager.getConnection(jdbcURL,userName,passWord);
			dbCon.setAutoCommit(false);
			
			System.out.println("dbCon     "+dbCon);
			
		}catch(Exception e){
			
			
			e.printStackTrace();
		}
		return dbCon;
	}
	
	public static void main(String[] args) throws Exception{
		
		Connection con = getJDBCConnection();

	
		HashMap param1 = new HashMap<>();
		param1.put("POL_NO", "100148");
		File jasperName = new File("D:/SampleofLoanCalculation.jrxml");
	    JasperReport jr = JasperCompileManager.compileReport(jasperName.getAbsolutePath());	    
		JasperPrint jp = JasperFillManager.fillReport(jr, param1, con);
		
		JasperViewer.viewReport(jp, false);
				
//		ba1 = JasperExportManager.exportReportToPdf(jp);
//		System.out.println("Bal   : "+ba1.length);
//		
//		String outputFilePath = "D:/TestPDFJapser.pdf";		
//		
//		PREMIASchedule ps = new PREMIASchedule();
//		List<InputStream> list = new ArrayList<>();
//		list.add(new ByteArrayInputStream(ba1));
//		ps.doMerge(list, new ByteArrayOutputStream());
//
//		
//		String fileName = getFileName(ba1, REP_KEY_NO, REP_ID, downloadFileName);
//		
//		try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
//		    // Write the byte array to the file
//		    fos.write(ba1);
//		    System.out.println("PDF saved to: " + outputFilePath);
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
	}
	
	
}
