package utils;

import comparators.*;
import enums.StudentEnum;
import enums.UniversityEnum;

public class EnumComparator {
    private EnumComparator(){}

    public static UniversityComparator getUniversityComparator(UniversityEnum universityEnum) {
        switch (universityEnum) {
            case ID: return new UniversityIdComparator();
            case FULL_NAME: return new UniversityFullNameComparator();
            case SHORT_NAME: return new UniversityShortNameComparator();
            case YEAR_OF_FOUNDATION: return new UniversityYearOfFoundationComparator();
            case MAIN_PROFILE: return new UniversityMainProfileComparator();
            default: return new UniversityFullNameComparator();
        }
    }

    public static StudentComparator getStudentComparator(StudentEnum studentEnum) {
        switch (studentEnum) {
            case FULLNAME: return new StudentFullNameComparator();
            case UNIVERSITY_ID: return new StudentUniversityId();
            case CURRENT_COURSE_NUMBER: return new StudentCurrentCourseNumberComparator();
            case AVG_EXAM_SCORE: return new StudentAvgExamScoreComparator();
            default: return new StudentFullNameComparator();
        }
    }
}
