package comparators;

import models.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentUniversityId implements StudentComparator{

    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getUniversityId(), o2.getUniversityId());
    }
}
