package PrototypePattern;

public class Student extends Person {

	private String school;
	private String subject;

	public Student() {

	}

	public Student(Student student) {
		super(student);
		if (student != null) {
			this.school = student.school;
			this.subject = student.subject;
		}
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public Person clone() {
		return new Student(this);
	}

	@Override
	public String toString() {
		return super.toString() + "Student [school=" + school + ", subject=" + subject + "]";
	}

}
