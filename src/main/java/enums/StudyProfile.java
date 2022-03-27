package enums;

public enum StudyProfile {
    MEDICINE ("МЕДИЦИНА"),
    PROGRAMMING ("ПРОГРАММИРОВАНИЕ"),
    MATH ("МАТЕМАТИКА"),
    LANGUEGES ("ЯЗЫКИ"),
    ART ("ИСКУССТВО"),
    PHYSICS ("ФИЗИКА"),
    CHEMISTRY ("ХИМИЯ"),
    HISTORY ("ИСТОРИЯ");

    private String title;

    StudyProfile( String title) {
        this.title = title;
    }
}
