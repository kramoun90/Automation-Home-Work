package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {
    // Read Excel File
    public static final String FILE_NAME = System.getProperty("user.dir") + "/HomeWork/src/emiratsData/FlyEmirats.xlsx";

    public static void main(String[] args) {
        readExcelFile(FILE_NAME, 0);
    }

    public static void readExcelFile(String fileName, int sheetNumber) {
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "           ");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "             ");
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException fn) {
            //fn.printStackTrace();
            System.out.println("File not Found");
        } catch (IOException io) {
            //io.printStackTrace();
            System.out.println("Reading Done");
        }
    }
}
