package javasessions;

public class Language {

	public static void useLang(Language obj) {

		System.out.println("use this lang");
		obj.readLang();
	}

	public void readLang() {

		System.out.println("readlang");
		
		
		
	
	
		
		
	}

	public static void main(String[] args) {
		Language lg=new Language();
		lg.readLang();
		
		Language.useLang(lg);
		
	

	}
	
	
	//POM  ----page chaining moel  ---supply Webdriver driver
	

}
