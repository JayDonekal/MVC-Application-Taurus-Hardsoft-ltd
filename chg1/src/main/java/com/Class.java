package com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




import javax.mail.Message;
import javax.mail.PasswordAuthentication;

import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50)
public class Class extends HttpServlet {
	 static final long serialVersionUID = 1L;
	 private static final String SAVE_DIR="images";

	 
	 
	  javax.mail.Session x;
	  final String username = "hemanthrs137@gmail.com"; // enter your mail id
		final String password = "1ga14cs043";// enter ur password

		



		 
	    
        
		  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	            String savePath = "C:" + File.separator + SAVE_DIR;
	                File fileSaveDir=new File(savePath);
	                if(!fileSaveDir.exists()){
	                    fileSaveDir.mkdir();
	                }
	               
		
		String Name = request.getParameter("Name");
	    String DOB = request.getParameter("DOB");
	    String Gender = request.getParameter("Gender");
	    String Category = request.getParameter("Category");
	    String Address = request.getParameter("Address");
	    String CAddress = request.getParameter("CAddress");
	    String City = request.getParameter("City");
	    String State = request.getParameter("State");
	    String Country = request.getParameter("Country");
	    String PinCode = request.getParameter("PinCode");
	    String Mail = request.getParameter("Mail");
	    String Mobile = request.getParameter("Mobile");
	    String ExamDate = request.getParameter("ExamDate");
	    String Hostel = request.getParameter("Hostel");
	    String Interview = request.getParameter("Interview");
	    String SkypeID = request.getParameter("SkypeID");
	    String NRI = request.getParameter("NRI");
	    String SSLC_OrgiName = request.getParameter("SSLC_OrgiName");
	    String SSLC_Board = request.getParameter("SSLC_Board");
	    String SSLC_Percentage = request.getParameter("SSLC_Percentage");
	    String SSLC_YOP = request.getParameter("SSLC_YOP"); 
	    String PUC_OrgiName = request.getParameter("PUC_OrgiName");
	    String PUC_Board = request.getParameter("PUC_Board");
	    String PUC_Percentage = request.getParameter("PUC_Percentage");
	    String PUC_YOP = request.getParameter("PUC_YOP");
	    String Grad_OrgiName = request.getParameter("Grad_OrgiName");
	    String Grad_Board = request.getParameter("Grad_Board");
	    String Grad_Percentage = request.getParameter("Grad_Percentage");
	    String Grad_YOP = request.getParameter("Grad_YOP");
	    String Other_OrgiName = request.getParameter("Other_OrgiName");
	    String Other_Board = request.getParameter("Other_Board");
	    String Other_Percentage = request.getParameter("Other_Percentage");
	    String Other_YOP = request.getParameter("Other_YOP");
	    String NA_LastAttended = request.getParameter("NA_LastAttended");
	    String Experience = request.getParameter("Experience");
	    String Orgi1 = request.getParameter("Orgi1");
	    String Designation1 = request.getParameter("Designation1");
	    String POS1 = request.getParameter("POS1");
	    String Orgi2 = request.getParameter("Orgi2");
	    String Designation2 = request.getParameter("Designation2");
	    String POS2 = request.getParameter("POS2");
	    String Orgi3 = request.getParameter("Orgi3");
	    String Designation3 = request.getParameter("Designation3");
	    String POS3 = request.getParameter("POS3");
	    String Source = request.getParameter("Source");
	    String Mode = request.getParameter("Mode");
	    String DDNo = request.getParameter("DDNo");
	    String BankBranch = request.getParameter("BankBranch");
	    String DDIssueDate = request.getParameter("DDIssueDate");
	    String DDAmount = request.getParameter("DDAmount");
	    String Declaration = request.getParameter("Declaration");
	    
	    Part part=request.getPart("Photo");
	    
	    
       
	    String fileName=extractfilename(part);
	    String filePath= savePath + File.separator + fileName ;
	    part.write(filePath);
	  
	    
	    User user = null;
		try {
			Random rand =new Random();
			  String AlphaNumericString= "123456890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			  char[] alpha= AlphaNumericString.toCharArray();
			  StringBuilder Unique1 = new StringBuilder();
			  for(int i=0; i<8;i++)
			  {
				  Unique1.append(alpha[rand.nextInt(alpha.length)]);
			  }
			  Unique1.toString();
			  String demo="";
				demo= demo + Unique1;
			  
			  System.out.println(demo);
			  
			
			
			user=new User();
			user.setStudentID(1);
			user.setName(Name);
			user.setDOB(DOB);
	        user.setGender(Gender);
	        user.setCategory(Category);
	        user.setAddress(Address);
	        user.setCAddress(CAddress);
	        user.setCity(City);
	        user.setState(State);
	          user.setCountry(Country);
	          user.setPinCode(PinCode);
	          user.setMail(Mail);
	          user.setMobile(Mobile);
	          user.setExamDate(ExamDate);
	          user.setHostel(Hostel);
	          user.setInterview(Interview);
	          user.setSkypeID(SkypeID);
	          user.setNRI(NRI);
	          user.setSSLC_OrgiName(SSLC_OrgiName);
	          user.setSSLC_Board(SSLC_Board);
	          user.setSSLC_Percentage(SSLC_Percentage);
	          user.setSSLC_YOP(SSLC_YOP);
	          user.setPUC_OrgiName(PUC_OrgiName);
	          user.setPUC_Board(PUC_Board);
	          user.setPUC_Percentage(PUC_Percentage);
	          user.setPUC_YOP(PUC_YOP);
	          user.setGrad_OrgiName(Grad_OrgiName);
	          user.setGrad_Board(Grad_Board);
	          user.setGrad_Percentage(Grad_Percentage);
	          user.setGrad_YOP(Grad_YOP);
	          user.setOther_OrgiName(Other_OrgiName);
	          user.setOther_Board(Other_Board);
	          user.setOther_Percentage(Other_Percentage);
	          user.setOther_YOP(Other_YOP);
	          user.setNA_LastAttended(NA_LastAttended);
	          user.setExperience(Experience);
	          user.setOrgi1(Orgi1);
	          user.setDesignation1(Designation1);
	          user.setPOS1(POS1);
	          user.setOrgi2(Orgi2);
	          user.setDesignation2(Designation2);
	          user.setPOS2(POS2);
	          user.setOrgi3(Orgi3);
	          user.setDesignation3(Designation3);
	          user.setPOS3(POS3);
	          user.setSource(Source);
	          user.setMode(Mode);
	          user.setDDNo(DDNo);
	          user.setBankBranch(BankBranch);
	          user.setDDIssueDate(DDIssueDate);
	          user.setDDAmount(DDAmount);
	          user.setDeclaration(Declaration);
	          user.setPhoto(filePath);
	         
	          user.setRandom(demo);
	          	
	          
	          
	          
	          
	          
	          
	          
	          
	          /*user.setUnique(Unique);*/

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		Properties props = new Properties();
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		javax.mail.Session s = javax.mail.Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
	  SessionFactory sf= null;
	  Session session=null;
	  
	  
	  try {
		  
		 
		  
		  
		  
		  Configuration cf=new Configuration();
	      cf.addClass(com.User.class);
		//  cf.addResource("com.User.hbm.xml"); 
		  sf=cf.configure("hibernate.cfg.xml").buildSessionFactory();
		  session=sf.openSession();
		  Transaction tx=session.beginTransaction();
		  session.save(user);
		  tx.commit();
		  response.sendRedirect("Success");
		  session.close();
		  
		   
		  
		  
		  
		  
		  
		  Message message = new MimeMessage(s);
			message.setFrom(new InternetAddress("hemanthrs137@gmail.com")); // same email id
			message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse(Mail));// whom u have to send mails that person id
			message.setSubject("CHG");
			message.setText("Dear User,"
				+ "\n\n Your Registration is Successfull!");

			Transport.send(message);
			
			
			System.out.println("Done");
			
			
	  
			  
	  }catch(Exception e) {
			e.printStackTrace();
		}
	  
	  finally {
		  sf.close();
	  }

		
		/*Main ma = new Main();
	ma.set(Name,DOB,Gender,Category,Address,City,PinCode,State,	 Country,CAddress,Mobile,Mail,ExamDate,Interview,SkypeID,Hostel,NRI,
 SSLC_OrgiName,SSLC_Board,SSLC_Percentage, SSLC_YOP,PUC_OrgiName, PUC_Board, PUC_YOP, Grad_OrgiName, Grad_Board, Grad_Percentage, Grad_YOP, Other_OrgiName,
 Other_Board, Other_Percentage, Other_YOP, NA_LastAttended, Experience,   Orgi1, Designation1, POS1, Orgi2, Designation2, POS2, Orgi3, Designation3, POS3, Source,
 Mode, DDNo, BankBranch, DDIssueDate, DDAmount,Declaration);*/
	
	}



	private String extractfilename(Part part) {
	        String contentDisp = part.getHeader("content-disposition");
	        String[] items = contentDisp.split(";");
	        for (String s : items) {
	            if (s.trim().startsWith("filename")) {
	                return s.substring(s.indexOf("=") + 2, s.length()-1);
	            }
	        }
	        return null;
	    }


	
	

}

