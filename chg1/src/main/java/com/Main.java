package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.User;


public class Main {

	public void set(String Name, String DOB, String Gender, String category, String address, String city,
			String pinCode, String state, String country, String cAddress, String mobile, String mail, String examDate,
			String interview, String skypeID, String hostel, String nRI, String sSLC_OrgiName, String sSLC_Board,
			String sSLC_Percentage, String sSLC_YOP, String pUC_OrgiName, String pUC_Board, String pUC_YOP,
			String grad_OrgiName, String grad_Board, String grad_Percentage, String grad_YOP, String other_OrgiName,
			String other_Board, String other_Percentage, String other_YOP, String nA_LastAttended, String experience,
			String orgi1, String designation1, String pOS1, String orgi2, String designation2, String pOS2,
			String orgi3, String designation3, String pOS3, String source, String mode, String dDNo, String bankBranch,
			String dDIssueDate, String dDAmount, String declaration) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			user=new User();
			//user.setStudentID("#1");
			user.setName("Name");
			user.setDOB("DOB");
	        user.setGender("Gender");
	        user.setCategory("Category");
	        user.setAddress("Address");
	        user.setCAddress("CAddress");
	        user.setCity("City");
	        user.setState("State");
	          user.setCountry("Country");
	          user.setPinCode("PinCode");
	          user.setMail("Mail");
	          user.setMobile("Mobile");
	          user.setExamDate("ExamDate");
	          user.setHostel("Hostel");
	          user.setInterview("Interview");
	          user.setSkypeID("SkypeID");
	          user.setNRI("NRI");
	          user.setSSLC_OrgiName("SSLC_OrgiName");
	          user.setSSLC_Board("SSLC_Board");
	          user.setSSLC_Percentage("SSLC_Percentage");
	          user.setSSLC_YOP("SSLC_YOP");
	          user.setPUC_OrgiName("PUC_OrgiName");
	          user.setPUC_Board("PUC_Board");
	          user.setPUC_Percentage("PUC_Percentage");
	          user.setPUC_YOP("PUC_YOP");
	          user.setGrad_OrgiName("Grad_OrgiName");
	          user.setGrad_Board("Grad_Board");
	          user.setGrad_Percentage("Grad_Percentage");
	          user.setGrad_YOP("Grad_YOP");
	          user.setOther_OrgiName("Other_OrgiName");
	          user.setOther_Board("Other_Board");
	          user.setOther_Percentage("Other_Percentage");
	          user.setOther_YOP("Other_YOP");
	          user.setNA_LastAttended("NA_LastAttended");
	          user.setExperience("Experience");
	          user.setOrgi1("Orgi1");
	          user.setDesignation1("Designation1");
	          user.setPOS1("POS1");
	          user.setOrgi2("Orgi2");
	          user.setDesignation2("Designation2");
	          user.setPOS2("POS2");
	          user.setOrgi3("Orgi3");
	          user.setDesignation3("Designation3");
	          user.setPOS3("POS3");
	          user.setSource("Source");
	          user.setDDNo("DDNo" );
	          user.setBankBranch("BankBranch");
	          user.setDDIssueDate("DDIssueDate");
	          user.setDDAmount("DDAmount");
	          user.setDeclaration("Declaration"); 
	          

		}catch(Exception e) {
			e.printStackTrace();
		}
	  SessionFactory sf= null;
	  Session session=null;
	  try {
		  sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		  session=sf.openSession();
		  Transaction tx=session.beginTransaction();
		  session.save(user);
		  tx.commit();
		  session.close();
		  
	  }catch(Exception e) {
			e.printStackTrace();
		}
	  finally {
		  sf.close();
	  }
		
	}

}
