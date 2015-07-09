package com.example.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Teacher implements Serializable {
	private java.lang.String room;
	private java.lang.String lesson;
	private java.lang.String teacher;
	private java.lang.Integer questionCount;
	private java.lang.Integer studentCount;

	public Teacher() {
		this.room = "1";
		this.lesson = "2";
		this.teacher = "3";
		this.questionCount = 0;
		this.studentCount = 0;
	}

	public Teacher(java.lang.String room, java.lang.String lesson,
			java.lang.String teacher, java.lang.Integer questionCount,
			java.lang.Integer studentCount) {
		this.room = room;
		this.lesson = lesson;
		this.teacher = teacher;
		this.questionCount = questionCount;
		this.studentCount = studentCount;
	}

	public java.lang.String getRoom() {
		return room;
	}

	public void setRoom(java.lang.String room) {
		this.room = room;
	}

	public java.lang.String getLesson() {
		return lesson;
	}

	public void setLesson(java.lang.String lesson) {
		this.lesson = lesson;
	}

	public java.lang.String getTeacher() {
		return teacher;
	}

	public void setTeacher(java.lang.String teacher) {
		this.teacher = teacher;
	}

	public java.lang.Integer getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(java.lang.Integer questionCount) {
		this.questionCount = questionCount;
	}

	public java.lang.Integer getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(java.lang.Integer studentCount) {
		this.studentCount = studentCount;
	}

	@Override
	public String toString() {
		return "Teacher [room=" + room + ", lesson=" + lesson + ", teacher="
				+ teacher + ", questionCount=" + questionCount
				+ ", studentCount=" + studentCount + "]";
	}

}
