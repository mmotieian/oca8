package ch3;

class ObjectLife2 {
	public static void main(String args[]) {

		Exam myExam = new Exam("PHP");
		myExam = null;
		myExam = new Exam("SQL");
		myExam = new Exam("Java");
		Exam yourExam = new Exam("PMP");

		System.gc();		// explicit garbage collection
		Runtime.getRuntime().gc();

		yourExam = myExam;

		System.out.println(yourExam == myExam);

	}
}