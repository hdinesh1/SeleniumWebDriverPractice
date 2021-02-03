package seleniumSessions;

import org.openqa.selenium.By;

public class cssSelectorsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Formula
		 * 1. For ID use # --> #id
		 * 2. For Class use .(dot) --> .class
		 * .C1.C2.C3...Cn
		 * 
		 * #twotabsearchtextbox
		 * .nav-input.nav-progressive-attribute
		 * .nav-input
		 * 
		 * 3. Using ID with tagname
		 * tagname#id
		 * input#ap_email
		 * 
		 * 4. Using classname with tagname
		 * tag.classname
		 * input.a-input-text
		 * input.a-input-text.a-span12.auth-autofocus.auth-required-field
		 * 
		 * 5a. Using ID and Class name together
		 * #ap_email.a-input-text
		 * #ap_email.a-input-text.a-span12.auth-autofocus.auth-required-field
		 * 
		 * 5b Using class name first and then ID
		 * .a-input-text.a-span12.auth-autofocus.auth-required-field#ap_email
		 * .a-input-text#ap_email
		 * input.a-input-text#ap_email ---> using with tagname
		 * 
		 * 6. tagname[attr='value'] --> use when want to use other attributes
		 * 	  //tagname[@attr='value'] --> xpath
		 * input[name='username']
		 * input[value='Login']	
		 *  	
		 * 7. Multiple attributes -- no need to use 'and' keyword
		 * tagname[attr1='value'][attr2='value']
		 * input[name='username'][type='text']
		 * input[value='Login'][type='submit']
		 * //input[@value='Login' and @type='submit'] --> xpath
		 * 
		 * input[value][type] --> correct cssSelector but doesn't make sense
		 * similarly //input[@value and @type] this xpath doesn't make sense
		 * 
		 * 8. Parent to Child Traversing.. use a space in between tags or > symbol
		 * .input-group input[name='password']
		 * div.input-group input[name='password']
		 * .private_form #username
		 * .private_form > #username
		 * 
		 * CHILD to PARENT is not allowed -- LIMITATION -- No BACKWARD TRAVERSING using CSS Selector
		 * 
		 * 9. contains
		 * tagname[attr*='value']
		 * input[id*='name']
		 * div[id*='-origin-airport-display']
		 * 
		 * 10. Start with
		 * tagname[attr^='value']
		 * input[id^='user']
		 * 
		 * 11. Ends with
		 * tagname[attr$='value']
		 * input[id$='name']
		 * 
		 * 12. Comma in CSS Selector
		 * input#username, input#password, button#loginBtn, span.private-checkbox__icon.private-checkbox__check
		 * 
		 * 13. Only Following Sibling in CSS. Preceding Sibling is not available
		 * Use + for following sibling
		 * .private-form__input-wrapper + div
		 * div.private-form__input-wrapper + div
		 * 
		 * 14.  Nth of type
		 * ul.footer-nav>li>a
		 * ul.footer-nav li a
		 * Corresponding xpath //ul[@class='footer-nav']/li/a
		 * ul.footer-nav li:nth-of-type(1)
		 * ul.footer-nav li:nth-of-type(n) this is same as --> ul.footer-nav li 
		 */
		
		By.cssSelector("#twotabsearchtextbox");
		By.cssSelector("input[value='Login']");
	}

}
