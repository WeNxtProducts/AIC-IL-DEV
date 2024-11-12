package com.iii.pel.jasperreports;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import com.iii.apps.persistence.ConnectionManager;
import com.iii.apps.persistence.PremiaCryptograph;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class jasperMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
//		Connection con = getJDBCConnection();

		
//		HashMap param1 = new HashMap<>();
//		param1.put("POL_NO", "4008");
//		File jasperName = new File("D:/MaturityClaimCalculation.jrxml");
//	    JasperReport jr = JasperCompileManager.compileReport(jasperName.getAbsolutePath());	    
//		JasperPrint jp = JasperFillManager.fillReport(jr, param1, con);
//		
//		JasperViewer.viewReport(jp, false);
	
		
//		String userName = PremiaCryptograph.decrypt(ConnectionManager.ENCRYPTION_KEY, resourceBundleDatabase.getString("login_db_user_name"));
//		String passWord = PremiaCryptograph.decrypt(ConnectionManager.ENCRYPTION_KEY, resourceBundleDatabase.getString("login_db_password"));
//		String jdbcURL = PremiaCryptograph.decrypt(ConnectionManager.ENCRYPTION_KEY, resourceBundleDatabase.getString("login_db_url"));
//		String jdbcDriver = PremiaCryptograph.decrypt(ConnectionManager.ENCRYPTION_KEY, resourceBundleDatabase.getString("jdbc.datasource.driver"));
	
		String userName = PremiaCryptograph.encrypt(ConnectionManager.ENCRYPTION_KEY, "P11_AI_LIVE");
		String passWord = PremiaCryptograph.encrypt(ConnectionManager.ENCRYPTION_KEY, "P11_AI_LIVE");
		String jdbcURL = PremiaCryptograph.encrypt(ConnectionManager.ENCRYPTION_KEY, "jdbc:oracle:thin:@192.168.1.151:1521:orcl");
		
		System.out.println(userName);
		System.out.println(passWord);
		System.out.println(jdbcURL);

		
		
		
	}
	
	
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

}
