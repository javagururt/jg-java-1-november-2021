package student_jurij_mardusevic.lesson_4_if_statement.homework.level_7_senior.Task_23;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LeapYear {

	public boolean isLeapYear(int year) {
		if (!isDividedBy4(year)) {
			return false;
		}

		if (!isDividedBy100(year)) {
			return true;
		}

		return isDividedBy400(year);
	}

	private boolean isDividedBy4(int year) {
		return year % 4 == 0;
	}

	private boolean isDividedBy100(int year) {
		return year % 100 == 0;
	}

	private boolean isDividedBy400(int year) {
		return year % 400 == 0;
	}

}