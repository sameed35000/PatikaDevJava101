public class obs {

	public static void main(String[] args) {

		Course mat = new Course("Matematik", "MAT101", "MAT", 0.20);
		Course fizik = new Course("Fizik", "FZK101", "FZK", 0.30);
		Course kimya = new Course("Kimya", "KMY101", "KMY", 0.40);

		Teacher t1 = new Teacher("Mahmut Hoca", "905554443322", "MAT");
		Teacher t2 = new Teacher("Fatma Ayşe", "905554443311", "FZK");
		Teacher t3 = new Teacher("Ali Veli", "905554443366", "KMY");

		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);

		Student s1 = new Student("İnek Şaban", 4, "2046", mat, fizik, kimya);
		s1.addExamNote(50, 20, 40);
		s1.addQuizNote(40, 70, 30);
		s1.isPass();

		Student s2 = new Student("Güdük Necmi", 4, "399", mat, fizik, kimya);
		s2.addExamNote(100, 50, 40);
		s2.addQuizNote(80, 90, 40);
		s2.isPass();

		Student s3 = new Student("Hayta İsmail", 4, "191", mat, fizik, kimya);
		s3.addExamNote(50, 20, 40);
		s3.addQuizNote(20, 10, 100);
		s3.isPass();
	}
}
