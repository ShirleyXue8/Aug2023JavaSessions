package OOP_Inheritance;

public class TestingHospital {

	public static void main(String[] args) {
		
		Apollo a=new Apollo() ;
		
		a.makeAppointment();
		a.seeDoctor();
		a.getVaccine();
		
		System.out.println("-------");
		
	Hospital h=	new Apollo();
	h.makeAppointment();
	h.seeDoctor();
	

	}

}
