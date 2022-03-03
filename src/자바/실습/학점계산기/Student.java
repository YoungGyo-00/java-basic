package 자바.실습.학점계산기;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private Subject majorSubject;

    private ArrayList<Score> scoreList = new ArrayList<>();

    public Student(int studentId, String studentName, Subject majorSubject){
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    public void addSubjectScore(Score score){
        scoreList.add(score);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject major) {
        this.majorSubject = major;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
