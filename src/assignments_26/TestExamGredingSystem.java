package assignments_26;

public class TestExamGredingSystem {
	public static void main(String[] args) {
		ExamGredingSystem ExamGredingSystem = new ExamGredingSystem();
		ExamGredingSystem.acceptMarks();
		ExamGredingSystem.calculateAvg();
		ExamGredingSystem.display();

		if (ExamGredingSystem.calculateAvg() > 60 && ExamGredingSystem.sub1 >= 40 && ExamGredingSystem.sub2 >= 40
				&& ExamGredingSystem.sub3 >= 40) {
			System.out.println("pass");
		} else {
			System.out.println("Fail...!!");
		}
	}
}
