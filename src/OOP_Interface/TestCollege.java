package OOP_Interface;

public class TestCollege {

	public static void main(String[] args) {

		MedicalCollege mc = new MedicalCollege();
		mc.chinese();
		mc.cooking();
		mc.math();
		mc.english();
		mc.emergency();
		System.out.println(USCollege.max_score);
		System.out.println(mc.max_score);
		USCollege.exam();
		MedicalCollege.exam();
		mc.midExam();
		mc.surgrey();
		

		USCollege us = new MedicalCollege();
		us.english();
		us.math();
		us.science();
		us.midExam();

		UKCollege uk = new MedicalCollege();
		uk.reading();
		uk.writing();

	}

}
