package com;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private int StudentID;
	private String Name;
	private String DOB;
	private String Gender;
	private String Category;
	private String Address;
	private String City;
	private String PinCode;
	private String State;	 
	private String Country;
	private String CAddress;
	private String Mobile;
	private String Mail;
	private String ExamDate;
	private String Interview;
	private String SkypeID;
	private String Hostel;
	private String NRI;
	private String SSLC_OrgiName;
	private String SSLC_Board;
	private String SSLC_Percentage;
	private String SSLC_YOP;
	private String PUC_OrgiName;
	private String PUC_Board;
	private String PUC_Percentage;
	private String PUC_YOP;
	private String Grad_OrgiName;
	private String Grad_Board;
	private String Grad_Percentage;
	private String Grad_YOP;
	private String Other_OrgiName;
	private String Other_Board;
	private String Other_Percentage;
	private String Other_YOP;
	private String NA_LastAttended;
	private String Experience;  
	private String Orgi1;
	private String Designation1;
	private String POS1;
	private String Orgi2;
	private String Designation2;
	private String POS2;
	private String Orgi3;
	private String Designation3;
	private String POS3;
	private String Source;
	private String Mode;
	private String DDNo;
	private String BankBranch;
	private String DDIssueDate;
	private String DDAmount;
	private String Photo;
	private String Random;
	
	private String Declaration;
	
	
	public User() {
    }
	
	public User(String name, String dOB, String gender, String category, String address, String city, String pinCode, String state,	  String country, String cAddress, String mobile, String mail, String examDate, String interview, String skypeID, String hostel, String nRI, String sSLC_OrgiName, String sSLC_Board, String sSLC_Percentage, String sSLC_YOP, String pUC_OrgiName, String pUC_Board, String pUC_Percentage, String pUC_YOP, String grad_OrgiName, String grad_Board, String grad_Percentage, String grad_YOP, String other_OrgiName, String other_Board, String other_Percentage, String other_YOP, 
			String nA_LastAttended, String experience,   String orgi1, String designation1, String pOS1,String orgi2,String designation2,String pOS2,String orgi3,String designation3,String pOS3,String source,String mode,String dDNo, String bankBranch,String dDIssueDate,String dDAmount,String declaration, String photo) {
		this.Name = name;
		this.DOB = dOB;
		this.Gender = gender;
		this.Category = category;
		this.Address = address;
		this.City = city;
		this.PinCode = pinCode;
		this.State = state;
		this.Country = country;
		this.CAddress = cAddress;
		this.Mobile = mobile;
		this.Mail = mail;
		this.ExamDate = examDate;
		this.Interview = interview;
		this.SkypeID = skypeID;
		this.Hostel = hostel;
		this.NRI = nRI;
		this.SSLC_OrgiName = sSLC_OrgiName;
		this.SSLC_Board = sSLC_Board;
		this.SSLC_Percentage = sSLC_Percentage;
		this.SSLC_YOP = sSLC_YOP;
		this.PUC_OrgiName = pUC_OrgiName;
		this.PUC_Board = pUC_Board;
		this.PUC_Percentage = pUC_Percentage;
		this.PUC_YOP = pUC_YOP;
		this.Grad_OrgiName = grad_OrgiName;
		this.Grad_Board = grad_Board;
		this.Grad_Percentage = grad_Percentage;
		this.Grad_YOP = grad_YOP;
		this.Other_OrgiName = other_OrgiName;
		this.Other_Board = other_Board;
		this.Other_Percentage = other_Percentage;
		this.Other_YOP = other_YOP;
		this.NA_LastAttended = nA_LastAttended;
		this.Experience = experience;
		this.Orgi1 = orgi1;
		this.Designation1 = designation1;
		this.POS1 = pOS1;
		this.Orgi2 = orgi2;
		this.Designation2 = designation2;
		this.POS2 = pOS2;
		this.Orgi3 = orgi3;
		this.Designation3 = designation3;
		this.POS3 = pOS3;
		this.Source = source;
		this.Mode = mode;
		this.DDNo = dDNo;
		this.BankBranch = bankBranch;
		this.DDIssueDate = dDIssueDate;
		this.DDAmount = dDAmount;
		this.Declaration = declaration;
		this.Photo= photo;
		
		
		

}
	
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		this.StudentID = studentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		this.DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		this.Category = category;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getPinCode() {
		return PinCode;
	}
	public void setPinCode(String pinCode) {
		this.PinCode = pinCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	public String getCAddress() {
		return CAddress;
	}
	public void setCAddress(String cAddress) {
		this.CAddress = cAddress;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		this.Mobile = mobile;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		this.Mail = mail;
	}
	public String getExamDate() {
		return ExamDate;
	}
	public void setExamDate(String examDate) {
		this.ExamDate = examDate;
	}
	public String getInterview() {
		return Interview;
	}
	public void setInterview(String interview) {
		this.Interview = interview;
	}
	public String getSkypeID() {
		return SkypeID;
	}
	public void setSkypeID(String skypeID) {
		this.SkypeID = skypeID;
	}
	public String getHostel() {
		return Hostel;
	}
	public void setHostel(String hostel) {
		this.Hostel = hostel;
	}
	public String getNRI() {
		return NRI;
	}
	public void setNRI(String nRI) {
		this.NRI = nRI;
	}
	public String getSSLC_OrgiName() {
		return SSLC_OrgiName;
	}
	public void setSSLC_OrgiName(String sSLC_OrgiName) {
		this.SSLC_OrgiName = sSLC_OrgiName;
	}
	public String getSSLC_Board() {
		return SSLC_Board;
	}
	public void setSSLC_Board(String sSLC_Board) {
		this.SSLC_Board = sSLC_Board;
	}
	public String getSSLC_Percentage() {
		return SSLC_Percentage;
	}
	public void setSSLC_Percentage(String sSLC_Percentage) {
		this.SSLC_Percentage = sSLC_Percentage;
	}
	public String getSSLC_YOP() {
		return SSLC_YOP;
	}
	public void setSSLC_YOP(String sSLC_YOP) {
		this.SSLC_YOP = sSLC_YOP;
	}
	public String getPUC_OrgiName() {
		return PUC_OrgiName;
	}
	public void setPUC_OrgiName(String pUC_OrgiName) {
		this.PUC_OrgiName = pUC_OrgiName;
	}
	public String getPUC_Board() {
		return PUC_Board;
	}
	public void setPUC_Board(String pUC_Board) {
		this.PUC_Board = pUC_Board;
	}
	public String getPUC_Percentage() {
		return PUC_Percentage;
	}
	public void setPUC_Percentage(String pUC_Percentage) {
		this.PUC_Percentage = pUC_Percentage;
	}
	public String getPUC_YOP() {
		return PUC_YOP;
	}
	public void setPUC_YOP(String pUC_YOP) {
		this.PUC_YOP = pUC_YOP;
	}
	public String getGrad_OrgiName() {
		return Grad_OrgiName;
	}
	public void setGrad_OrgiName(String grad_OrgiName) {
		this.Grad_OrgiName = grad_OrgiName;
	}
	public String getGrad_Board() {
		return Grad_Board;
	}
	public void setGrad_Board(String grad_Board) {
		this.Grad_Board = grad_Board;
	}
	public String getGrad_Percentage() {
		return Grad_Percentage;
	}
	public void setGrad_Percentage(String grad_Percentage) {
		this.Grad_Percentage = grad_Percentage;
	}
	public String getGrad_YOP() {
		return Grad_YOP;
	}
	public void setGrad_YOP(String grad_YOP) {
		this.Grad_YOP = grad_YOP;
	}
	public String getOther_OrgiName() {
		return Other_OrgiName;
	}
	public void setOther_OrgiName(String other_OrgiName) {
		this.Other_OrgiName = other_OrgiName;
	}
	public String getOther_Board() {
		return Other_Board;
	}
	public void setOther_Board(String other_Board) {
		this.Other_Board = other_Board;
	}
	public String getOther_Percentage() {
		return Other_Percentage;
	}
	public void setOther_Percentage(String other_Percentage) {
		this.Other_Percentage = other_Percentage;
	}
	public String getOther_YOP() {
		return Other_YOP;
	}
	public void setOther_YOP(String other_YOP) {
		this.Other_YOP = other_YOP;
	}
	public String getNA_LastAttended() {
		return NA_LastAttended;
	}
	public void setNA_LastAttended(String nA_LastAttended) {
		this.NA_LastAttended = nA_LastAttended;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		this.Experience = experience;
	}
	public String getOrgi1() {
		return Orgi1;
	}
	public void setOrgi1(String orgi1) {
		this.Orgi1 = orgi1;
	}
	public String getDesignation1() {
		return Designation1;
	}
	public void setDesignation1(String designation1) {
		this.Designation1 = designation1;
	}
	public String getPOS1() {
		return POS1;
	}
	public void setPOS1(String pOS1) {
		this.POS1 = pOS1;
	}
	public String getOrgi2() {
		return Orgi2;
	}
	public void setOrgi2(String orgi2) {
		this.Orgi2 = orgi2;
	}
	public String getDesignation2() {
		return Designation2;
	}
	public void setDesignation2(String designation2) {
		this.Designation2 = designation2;
	}
	public String getPOS2() {
		return POS2;
	}
	public void setPOS2(String pOS2) {
		this.POS2 = pOS2;
	}
	public String getOrgi3() {
		return Orgi3;
	}
	public void setOrgi3(String orgi3) {
		this.Orgi3 = orgi3;
	}
	public String getDesignation3() {
		return Designation3;
	}
	public void setDesignation3(String designation3) {
		this.Designation3 = designation3;
	}
	public String getPOS3() {
		return POS3;
	}
	public void setPOS3(String pOS3) {
		this.POS3 = pOS3;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		this.Source = source;
	}
	public String getMode() {
		return Mode;
	}
	public void setMode(String mode) {
		this.Mode = mode;
	}
	public String getDDNo() {
		return DDNo;
	}
	public void setDDNo(String dDNo) {
		this.DDNo = dDNo;
	}
	public String getBankBranch() {
		return BankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.BankBranch = bankBranch;
	}
	public String getDDIssueDate() {
		return DDIssueDate;
	}
	public void setDDIssueDate(String dDIssueDate) {
		this.DDIssueDate = dDIssueDate;
	}
	public String getDDAmount() {
		return DDAmount;
	}
	public void setDDAmount(String dDAmount) {
		this.DDAmount = dDAmount;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		this.Photo = photo;
	}
	public String getRandom() {
		return Random;
	}
	public void setRandom(String random) {
		this.Random = random;
	}
	
	
	
	
	public String getDeclaration() {
		return Declaration;
	}
	public void setDeclaration(String declaration) {
		this.Declaration = declaration;
	}

	

	

	
	
	
	
}
