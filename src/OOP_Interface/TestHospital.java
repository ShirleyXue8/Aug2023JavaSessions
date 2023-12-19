package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fh=new FortisHospital();
		fh.physioServices();
		fh.ENTServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.gynoServices();
		
		fh.medicalTraining();
		fh.medicalInsurance();
		
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		USMedical.billing();
		FortisHospital.billing();
		
		fh.medicalNewsPublish();
		fh.covidVaccination();
		
		
		//top casting:child class object can be referred by interface ref variable
		
		USMedical us =new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();
		
		
		UKMedical uk=new FortisHospital();
		uk.dentalServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		
		//down casting:NA
		//ForthisHospital fh1=new USMedical();
		
				
		
		
		

	}

}
