package WebDriverArch;

public class AmazonTest {
	
	
	static WebDriver driver;

	public static void main(String[] args) {


		//chrome
//		ChromeDriver driver=new ChromeDriver();
		
		//firefox
//		FireFoxDriver driver=new FireFoxDriver();
		
		//edge
//		EdgeDriver driver=new EdgeDriver();
		
		//topcasting: cross browser logic 
		String browser="IE";
		
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;
			
		default:
			System.out.println("please pass the right browswer name"+browser);
			break;
		}
		
		driver.get("https://www.amazon");
		String title=driver.getTitle();
		System.out.println(title);
		
		
         driver.findElement("emailId");
         driver.findElement("password");
         driver.sendKeys("emailId", "password");
         driver.click("login button");
         
         driver.close();
         
         
//         Testing obj=new Testing();
         
         //System obj=new System();
         
         
         
		
	}

}
