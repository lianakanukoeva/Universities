package enums;

public enum StudyProfile {
    MEDICINE("Медицина"),
    PROGRAMMING("Программирование"),
    FILILOGY("Филология"),
    HISTORY("История"),
    ART("Искусство"),
    ECONOMY("Экономика"),
    MARKETING("Марткетинг"),
    PHYSICS("Физика"),
    LINGUISTICS("Лингвистка"),
    MATHEMATICS("Математика");

//    MEDICINE ("МЕДИЦИНА"),
//    PROGRAMMING ("ПРОГРАММИРОВАНИЕ"),
//    MATH ("МАТЕМАТИКА"),
//    LANGUEGES ("ЯЗЫКИ"),
//    ART ("ИСКУССТВО"),
//    PHYSICS ("ФИЗИКА"),
//    CHEMISTRY ("ХИМИЯ"),
//    HISTORY ("ИСТОРИЯ");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }
}
