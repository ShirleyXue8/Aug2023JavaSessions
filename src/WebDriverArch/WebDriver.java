package WebDriverArch;

public interface WebDriver {
	
	public void findElement(String locator);
	public void click(String locatro);
	public void sendKeys(String locator,String value);
	public  String getTitle();
	public void get(String url);
	public void close();
	
	
	

}
