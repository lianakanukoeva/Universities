package models;

import enums.StudyProfile;

public class Statistics {
    StudyProfile mainProfile;
    float avgExamScore;
    int currentStudents;
    int currentUniversity;
    String universityName;

    public Statistics(StudyProfile mainProfile, float avgExamScore, int currentStudents, int currentUniversity, String universityName) {
        this.mainProfile = mainProfile;
        this.avgExamScore = avgExamScore;
        this.currentStudents = currentStudents;
        this.currentUniversity = currentUniversity;
        this.universityName = universityName;
    }


    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getCurrentStudents() {
        return currentStudents;
    }

    public void setCurrentStudents(int currentStudents) {
        this.currentStudents = currentStudents;
    }

    public int getCurrentUniversity() {
        return currentUniversity;
    }

    public void setCurrentUniversity(int currentUniversity) {
        this.currentUniversity = currentUniversity;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
