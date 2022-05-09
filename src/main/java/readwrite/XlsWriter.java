package readwrite;

import models.Statistics;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XlsWriter {

    private XlsWriter() {
    }

    public static void generation(List<Statistics> statistics, String fileName) throws IOException {
        FileOutputStream file = new FileOutputStream(fileName);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(OPCPackage.create(file));
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("Статистика");

        Font font = xssfWorkbook.createFont();
        font.setBold(true);
        font.setFontHeight((short) 16);

        CellStyle style = xssfWorkbook.createCellStyle();
        style.setFont(font);

        List<String> titleArray = new ArrayList();
        titleArray.add("Main profile");
        titleArray.add("Avg Exam Score");
        titleArray.add("Current Students");
        titleArray.add("Current University");
        titleArray.add("University Name");

        Row row = xssfSheet.createRow(0);

        for (int i = 0; i < titleArray.size(); i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(titleArray.get(i));
            cell.setCellStyle(style);
        }

        for (Statistics statistic : statistics) {
            Row rowStatistic = xssfSheet.createRow(1);
            Cell cellProfile = rowStatistic.createCell(0);
            cellProfile.setCellValue(String.valueOf(statistic.getMainProfile()));

            Cell cellAvgExamScore = rowStatistic.createCell(1);
            cellAvgExamScore.setCellValue(statistic.getAvgExamScore());

            Cell cellCurrentStudents = rowStatistic.createCell(2);
            cellCurrentStudents.setCellValue(statistic.getCurrentStudents());

            Cell cellCurrentUniversity = rowStatistic.createCell(3);
            cellCurrentUniversity.setCellValue(statistic.getCurrentUniversity());

            Cell cellUniversityName = rowStatistic.createCell(4);
            cellUniversityName.setCellValue(statistic.getUniversityName());

        }

        xssfWorkbook.write(file);
        file.close();
    }
}
