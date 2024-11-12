
package com.iii.pel.jasperreports;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.iii.apps.persistence.CRUDHandler;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 * Servlet implementation class XDocSchedule
 */
public class jasperreport extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// int paramCount = 0,valuecount = 0;
	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/* added by Janani on 12.9.2016 for dynamic report */

	private final static ResourceBundle resourceBundle = ResourceBundle.getBundle("Report_ID");
	private final static ResourceBundle resourceBundleDatabase = ResourceBundle.getBundle("login");
	/* end */

	public jasperreport() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Get Method");
		System.out.println(request.getContextPath() + request.getQueryString());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BufferedOutputStream fos1 = new BufferedOutputStream(response.getOutputStream());
		byte[] ba1 = null;
		String reportTemplateRepID = null;
		HashMap param1 = new HashMap<>();
		try {
		Connection con = getJDBCConnection();
		
		
		String REP_KEY_NO = request.getParameter("REP_KEY_NO");
		reportTemplateRepID = request.getParameter("reportTemplateRepID");
		
		System.out.println("*********************PARAM" + request.getParameter("reportTemplateRepID"));
		
		System.out.println("reportTemplateId" + reportTemplateRepID);
		
		JSONObject sysIdJson = getSysId(REP_KEY_NO);
		String sysID = (String) sysIdJson.get("sysId");
		String polsysId = (String) sysIdJson.get("polsysId");
		String templatePath = System.getProperty("user.home")+"/ALLIANCE/";
		JasperReport jr = null;
		if(reportTemplateRepID == null){
			System.out.println("INSIDE IF DISAILITY");
			//Disability Claim
			polsysId = polsysId.substring(polsysId.lastIndexOf("&") + 1);
					System.out.println("polsysId***************************************"+polsysId);

					String pol_no = getPolNo(polsysId);
			System.out.println("pol_no***************************************"+pol_no);
			
			param1 = new HashMap<>();
			param1.put("POL_NO", pol_no);
			jr = JasperCompileManager.compileReport(templatePath+"SampleOfDisabilityClaim.jrxml");
		}else if(reportTemplateRepID.equals("AICREP010")){
			//Maturity Claim Calculation
			param1 = new HashMap<>();
			param1.put("POL_SYS_ID", Integer.parseInt(sysID));
			System.out.println("SYSID " + Integer.parseInt(sysID));
			jr = JasperCompileManager.compileReport(templatePath+"MaturityClaimCalculation.jrxml");
		}else if(reportTemplateRepID.equals("AICREP018")){
			System.out.println("INSIDE REPAYMENT");
			//Loan RePayment Sheet
			param1 = new HashMap<>();
			jr = JasperCompileManager.compileReport(templatePath+"LoanRepaymentSchedule.jrxml");
			param1 = new HashMap<>();
			String pol_no = getPolNo(polsysId.substring(polsysId.lastIndexOf("&") + 1));
//			System.out.println(polsysId.substring(polsysId.lastIndexOf("&") + 1));
			param1.put("POL_SYS_ID", polsysId.substring(polsysId.lastIndexOf("&") + 1));
			
			//POL_SYS_ID&&&10411 REP_VALUE_2 POL_SYS_ID&&&10411
		}
		
		
		
		JasperPrint jp = JasperFillManager.fillReport(jr, param1, con);
		
		ba1 = JasperExportManager.exportReportToPdf(jp);
		
//		JasperViewer.viewReport(jp, false);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "inline; filename=" + reportTemplateRepID+".pdf" + ";");
		fos1.write(ba1);
		fos1.flush();
		fos1.close();
		
//		String reportTemplateRepID = request.getParameter("reportTemplateRepID");
//		String REP_KEY_NO = request.getParameter("REP_KEY_NO");
//		
//		response.setContentType("application/pdf");
//		response.setHeader("Content-Disposition", "inline; filename=" + "testoutput" + ";");
//
//		BufferedOutputStream fos1 = new BufferedOutputStream(response.getOutputStream());
//		Connection con;
//		byte[] ba1 = null;
//		HashMap param1;
//		File jasperName;
//		JasperReport jr;
//		JasperPrint jp;
//		InputStream targetStream;
//		try {
//			con = getJDBCConnection();
//			param1 = new HashMap<>();
//			param1.put("POL_NO", "4008");
////			jasperName = new File("C:/Users/Administrator/ALLIANCE/SampleofLoanCalculation.jasper");
////			targetStream = new FileInputStream(jasperName);
////			jr = (JasperReport) JRLoader.loadObject(jasperName);
//			
//			
//			
//			File jasperName1 = new File("C:/Users/Admin/ALLIANCE/MaturityClaimCalculation.jrxml");
//		    JasperReport jr1 = JasperCompileManager.compileReport(jasperName1.getAbsolutePath());	    
//			JasperPrint jp1 = JasperFillManager.fillReport(jr1, param1, con);
//			
//			
//			
//			
//			// jr =
//			// JasperCompileManager.compileReport(jasperName.getAbsolutePath());
////			jp = JasperFillManager.fillReport(jr, param1, con);
//			ba1 = JasperExportManager.exportReportToPdf(jp1);
//		} catch (JRException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// System.out.println("Bal : "+ba1.length);
//		fos1.write(ba1);
//		fos1.flush();
//		fos1.close();
	}

	private String getPolNo(String sysID) throws SQLException, Exception {
		// TODO Auto-generated method stub
		String polNo = null;
		String query = "select POL_NO from PT_IL_POLICY where POL_SYS_ID = ?";
		ResultSet rs = new CRUDHandler().executeSelectStatement(query, getJDBCConnection(),new Object[]{sysID});
		while(rs.next())
		{
			polNo = rs.getString("POL_NO");
			
		}
		return polNo;
	}

	public static Connection getJDBCConnection() throws Exception {
		Connection dbCon = null;
		String userName = "P11_AI_LIVE";
		String passWord = "P11_AI_LIVE";
		String jdbcURL = "jdbc:oracle:thin:@192.168.1.131:19330:wenxt19";
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";

		try {
			System.out.println("welcome to getConnectionforXDOCS      " + userName + "  " + passWord + "  " + jdbcURL
					+ "  " + jdbcDriver + "  ");
			Class.forName(jdbcDriver);
			dbCon = DriverManager.getConnection(jdbcURL, userName, passWord);
			dbCon.setAutoCommit(false);

			System.out.println("dbCon     " + dbCon);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return dbCon;
	}

	public JSONObject getSysId(String repKey) throws SQLException, Exception{
		JSONObject response = new JSONObject();
		String query = "select REP_VALUE_1, REP_VALUE_2 from IP_REP_INFO where REP_KEY_NO = ?";
		ResultSet rs = new CRUDHandler().executeSelectStatement(query, getJDBCConnection(),new Object[]{repKey});
		while(rs.next())
		{
			response.put("sysId", rs.getString("REP_VALUE_1"));
			response.put("polsysId", rs.getString("REP_VALUE_2"));
			
		}
		return response;
		
	}
	
}