package lab10.ex3;
import java.io.*;
import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


public class ExcelParser {
    public static void main(String[] args) throws IOException {
        String filePath = "src/lab10/ex3/example3.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheet("Прикол");

        for (Row row : sheet){
            for (Cell cell : row){
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        inputStream.close();
    }
}
