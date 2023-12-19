package ExceptionHanding;

public class Student {

	public int getMarks(String studentName) {
		
		System.out.println("getting marks for student: "+studentName);

		if (studentName.equals("Ravi")) {
			try {
				int i = 9 / 3;
				return 100;

			} catch (ArithmeticException e) {

				System.out.println("AE is coming.....");
				return 50;
			} finally {
				System.out.println("FAILLLLLLL");
//				return 75;
			}

		} else if (studentName.equals("Kiran")) {

			return 90;
		} else if (studentName.equals("Karishma")) {
			return 80;
		} else {
			System.out.println("plz pass the right student name....");
			throw new AppException("student not found....");
		}

	}

	public static void main(String[] args) {

		Student st = new Student();
		int mk = st.getMarks("Ravi");
		System.out.println(mk);

	}
}
