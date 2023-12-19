package OOP_Inheritance;

public class Apollo extends Hospital{
	
	
	
	public void getVaccine() {
		
		System.out.println("getVaccine---Apollo");
	}
	@Override
	public void makeAppointment() {
		System.out.println("makeAppointment--Apollo");
	}

}
