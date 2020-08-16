package Utils;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ExcelReader {
    public  String path = System.getProperty("user.dir");
    public  final String filePath = path+"/src/TestData1.xlsx";

    // Creating a Workbook from an Excel file (.xls or .xlsx)
    Workbook workbook = WorkbookFactory.create(new File(filePath));

    public ExcelReader() throws IOException, InvalidFormatException {
    }

    // Retrieving the number of sheets in the Workbook
    public int getNumberOfSheets() {
        return workbook.getNumberOfSheets();
    }

    // Get sheets names
    public String getSheetName() {
        String sheetName = "";
        for(Sheet sheet: workbook) {
            sheetName = sheet.getSheetName();
        }
        return sheetName;
    }

    // Getting the Sheet at certain index
    public Sheet getSheetAtIndex(int index) {
        return workbook.getSheetAt(index);
    }

    // Create a DataFormatter to format and get each cell's value as String
    DataFormatter dataFormatter = new DataFormatter();

    // Iterate over the rows and columns
    public void getAllCellsValues(int sheetIndex) throws IOException {
        for (Row row : getSheetAtIndex(sheetIndex)) {
            for (Cell cell : row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
        }
    }

//    public void getCellValue1(int sheetIndex, String key, int rowNumber) throws IOException {
//        for (Row row : getSheetAtIndex(sheetIndex)) {
//            for (Cell cell : row) {
//                if (dataFormatter.formatCellValue(cell) == key) {
//                    int index = cell.getColumnIndex();
//                    getCellValue(sheetIndex,);
//                }
//                String cellValue = dataFormatter.formatCellValue(cell);
//                System.out.print(cellValue + "\t");
//            }
//        }
//    }

    public String getCellValue(int sheetIndex, String cellIndex) {
        CellReference cellReference = new CellReference(cellIndex);
        Row row = getSheetAtIndex(sheetIndex).getRow(cellReference.getRow());
        Cell cell = row.getCell(cellReference.getCol());
        return dataFormatter.formatCellValue(cell);
    }



    // Closing the workbook
    public void closeWorkbook() throws IOException {
        workbook.close();
    }
}
