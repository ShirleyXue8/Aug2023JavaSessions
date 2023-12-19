package OOP_Interface;

public class MedicalCollege extends ShanghaiMedical implements USCollege,UKCollege,ChinaCollege{
	
	
	 int max_score=150;

	//US
	@Override
	public void math() {
		
		System.out.println("MC ---math");
		
	}

	@Override
	public void english() {
		
		System.out.println("MC ---english");
		
	}

	@Override
	public void science() {
		System.out.println("MC ---science");
		
	}

	
	//UK
	@Override
	public void reading() {
		System.out.println("UK ---reading");
	}

	@Override
	public void writing() {
		System.out.println("UK ---writing");
	}

	//NC
	@Override
	public void translate() {
		System.out.println("NC ---translate");
		
	}

	
	//China
	@Override
	public void chinese() {
		System.out.println("C----chinese");
	}

	@Override
	public void cooking() {
		System.out.println("C----cooking");
	}

	
	public void emergency() {
		
		System.out.println("MC ---emergency");
	}
	
	
	public static void exam() {
		System.out.println("MC---exam");
	}
	
	@Override
	public void midExam() {
		System.out.println("MC---midExam");
	}
}
