package comparators;

import models.University;

public class UniversityMainProfileComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return o1.getMainProfile().compareTo(o2.getMainProfile());
    }
}
