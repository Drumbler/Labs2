package lab10.ex4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EXCELCreator {
    public static void main(String[] args) {

        // создаем новую книгу
        XSSFWorkbook workbook = new XSSFWorkbook();

        // создаем новый лист на книге
        XSSFSheet sheet = workbook.createSheet("товары");

        // Записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товары");
        headerRow.createCell(1).setCellValue("Характиристика");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: фантастика,\nАвтор: Иванов И.И.");
        dataRow1.createCell(2).setCellValue(500.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5\nОперативная память: 8 ГБ");
        dataRow2.createCell(2).setCellValue(25000.0);

        // Записываем книгу Excel в файл
        String filePath = "src/lab10/ex4/example.xlsx";
        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("все файлы записаны успешно");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




