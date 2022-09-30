package org.company;

public class CompanyInfo {
	// method create
	private void companyName() {
		// Company name create
		System.out.println("Greens Technology");

	}
	private void companyId() {
		// Company id
		System.out.println("IP02515511226ID");
		
	}
	private void companyAddress() {
		//companyAddress
		System.out.println(" Plot No.19,\r\n" + 
				"Balamurugan Garden,\r\n" + 
				"OMR Road,Kancheepuram District,\r\n" + 
				"Okkiam, Thoraipakkam,\r\n" + 
				"Jain college bus stop,\r\n" + "Phone NO: 919944152058");
	}
	public static void main(String[] args) {
		//Create object
		CompanyInfo companyInfo = new CompanyInfo();
		//method call
		companyInfo.companyName();
		companyInfo.companyId();
		companyInfo.companyAddress();
				
	}
		
	
}
