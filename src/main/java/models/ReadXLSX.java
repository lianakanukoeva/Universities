package models;

import enums.StudyProfile;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadXLSX {
    private ReadXLSX(){};

    public static List<Student> readStudents() throws IOException {
        FileInputStream filename = new FileInputStream("src/main/resources/universityInfo.xlsx");

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(filename);

        XSSFSheet xssfSheet = xssfWorkbook.getSheet("Студенты");

        Iterator iterator = xssfSheet.iterator();
        Student student = new Student();
        List<Student> studentList = new ArrayList();

        while(iterator.hasNext()) {
            Row row = (Row) iterator.next();
            Iterator cells = row.iterator();

            while(cells.hasNext()) {
                for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                    Cell cell = row.getCell(i);
                    if(i == 0) {
                        student.setUniversityId(cell.getStringCellValue());
                    }
                    if(i == 1) {
                        student.setFullName(cell.getStringCellValue());
                    }
                    if(i == 2) {
                        student.setCurrentCourseNumber((int) cell.getNumericCellValue());
                    }
                    if(i == 3) {
                        student.setAvgExamScore((float) cell.getNumericCellValue());
                    }
                }
                studentList.add(student);
            }
        }
        return  studentList;
    }

    public static List<University> readUniversity() throws IOException {
        FileInputStream filename = new FileInputStream("src/main/resources/universityInfo.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(filename);

        XSSFSheet sheet = workbook.getSheet("Университеты");

        University university = new University();
        List<University> universityList = new ArrayList();
        Iterator<Row> rows = sheet.iterator();
        rows.next();

        while (rows.hasNext()) {
            Row cells = rows.next();
                for (int i = 0; i < cells.getPhysicalNumberOfCells(); i++) {
                    Cell cell = cells.getCell(i);
                    if(i == 0) {
                        university.setId(cell.getStringCellValue());
                    }
                    if(i == 1) {
                        university.setFullName(cell.getStringCellValue());
                    }
                    if(i == 2) {
                        university.setShortName(cell.getStringCellValue());
                    }
                    if(i == 3) {
                        university.setYearOfFoundation((int)cell.getNumericCellValue());
                    }
                    if(i == 4) {
                        university.setMainProfile(StudyProfile.valueOf(cell.getStringCellValue()));
                    }
                }
                universityList.add(university);
            }
        return universityList;
    }
}
