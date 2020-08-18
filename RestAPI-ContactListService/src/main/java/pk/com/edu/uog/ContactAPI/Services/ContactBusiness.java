package pk.com.edu.uog.ContactAPI.Services;

import java.util.ArrayList;
import java.util.List;



public class ContactBusiness {
	
	public List<Contact> getContactList() {
		List<Contact> listContact = new ArrayList<>();
		
		listContact.add(new Contact("Usama Raheem", "usama.r10@gmail.com", "USA"));
		
		listContact.add(new Contact("Toseef Haider","seeqi.34@outlook.com", "England"));
		
		listContact.add(new Contact("Usama Saeed",  "saeed123@yahoo.com", "Australia"));
		
		listContact.add(new Contact("Hassaan Ahmed","hasni.9090@gmail.com", "India"));
		
		listContact.add(new Contact("Shiffa Shehzadi","shiffu.00@gmail.com", "Germany"));
		
		listContact.add(new Contact("Faiqa Shabeer","faiqa.90@gmail.com", "Pakistan"));
		
		listContact.add(new Contact("Qaseem Hussain","qaseem.889@gmail.com", "Hong Kong"));
		
		listContact.add(new Contact("Umair Mughal","pino.420@gmail.com", "Los Angeles"));
		
		
		return listContact;
	}

}
