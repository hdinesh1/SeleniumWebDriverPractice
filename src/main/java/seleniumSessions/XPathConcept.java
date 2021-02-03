package seleniumSessions;

public class XPathConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Absolute XPath
		//2. Custom XPath
		// //tagname[attribute='value']
		// single element 1 of 1
		// multiple elements 1 of n
		// E.g. //input[@id='input-email'];
		// //tagname[attr1='value 1' and attr2='value 2' and attr3='value 3']
		// input[@id='input-email' and @name='email' and @type='text']
		// input(@id and @name and @type] ---> valid xpath but will not give unique value
		// tagname[attr='value 1 value2']
		
		// tagname[@class='classname1 classname2 classname3']
		// By.classname("form-control login-email") ---> This is wrong
		// input[@class='form-control login-email'] ---> This will work
		
		//text()
		// tagname[text()='value']
		//a[text()='customers']
		
		// tagname[@attr='value1' and text90='value2']
		
		//Indexing in xpath
		// (tagname[@attr='value'])[index] ----index starts from 1 not 0-----  (tagname[@attr='value']) ---> Called CAPTURE GROUP
		
		//Position() and Last() Function
		// (tagname[@attr='value'])[position()=1]
		// (tagname[@attr='value'])[last()]  ---> to go to last element of collection
		
		//Contains()
		// tagname[contains(@attr,'value')
		// input[contains(@name,'search')]
		
		//Dynamic ID using contains()
		// input[contains(@id,'_test')]
		
		//Using Contains() and Text()
		// input[contains(@id,'value') and text()='value2']
		// a[contains(@href,'login') and text()='Forgot Password']
		// a[contains(@href,'login') and contains(text(),'Forgot Password')]
		
		// starts-with
		// input[starts-with(@name,'user')
		
		//Child Direct --> Single Slash
		// div[@class='input-group']/input
		
		//Child Indirect --> Double Slash
		
		// div[@class='input-group']//child::input ---> Gives all direct and indirect Child input tags
		
		//************************************************** ADVANCE CONCEPTS *****************************************************************
		//Child to Parent
		//BACKWARD TRAVERSING
		// input[@name='username']/.. ---> immidiate parent
		// input[@name='username']/../../.. ---> goes 1 level up with each /.. ---> BACKWARD TRAVERSING
		
		// input[@name='username']//parent::div
		// input[@name='username']//parent::div//parent::form
		// input[@name='username']//ancestor::form ---> GRAND PARENT
		
		//PRECEDING-SIBLING 
		// a[@text()='Alex DAN']//parent::td//preceding-sibling::td/input
		
		//FOLLOWING SIBLING
		//a[text()='Cheteshwar Pujara']//parent::td//following-sibling::td/span
	}

}
