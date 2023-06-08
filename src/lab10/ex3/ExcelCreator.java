package lab10.ex3;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


public class ExcelCreator {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Прикол");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("упражнение");
        headerRow.createCell(1).setCellValue("время");
        headerRow.createCell(2).setCellValue("подход");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("анжуманя");
        dataRow1.createCell(1).setCellValue("9:30");
        dataRow1.createCell(2).setCellValue(3);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("бегит");
        dataRow2.createCell(1).setCellValue("12:30");
        dataRow2.createCell(2).setCellValue(1);

        String filePath = "src/lab10/ex3/example3.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();

        outputStream.close();
        outputStream.close();


        System.out.println("Данные записаны в файл: " + filePath);


    }
}
