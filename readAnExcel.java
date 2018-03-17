import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class readAnExcel {

    public static void main(String[] args) throws IOException {
        
        FileInputStream file;
        Workbook workbook;
        Sheet dataSheet;
        XSSFWorkbook workbook2;
        Cell cell;
        FileOutputStream output_file;
        
        //Where the data is saved
        String data = "C:\\Users\\RASYID\\Documents\\University task etc\\Semester 6\\Real-Time Programming\\A162-STIX3912-Practicum-StudentSupervisorList-24Mei2017.xlsx";
        
        try {
            
            //Place to copy and read the file from the folder 
            file = new FileInputStream(data);
            //A class which act as an excel workbook
            workbook = new XSSFWorkbook(file);
            //A class that act as a worksheet.In here we will read from the sheet 0
            dataSheet = workbook.getSheetAt(0);
            //Iterator to read the Row
            Iterator<Row> read = dataSheet.iterator();

            while (read.hasNext()) {
                
                Row currentRow = read.next();        
                Iterator<Cell> cellIterator = currentRow.iterator();
                
                while (cellIterator.hasNext()) {
                    Cell previousCell = cellIterator.next();
                    if (previousCell.getCellTypeEnum() == CellType.STRING) {
                        System.out.print(previousCell.getStringCellValue() + " - ");
                    } else if (previousCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.print(previousCell.getNumericCellValue() + " - ");
                    }
                }        
                System.out.println();
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        FileInputStream infile = new FileInputStream(new File(data));
        
        //Give an access to the workbook
        workbook2 = new XSSFWorkbook(infile);
        //Access the worksheet, so that we can update / modify it.
        XSSFSheet datatypeSheet = workbook2.getSheetAt(0);
        // declare a Cell object
        cell = null;
        //Close the InputStream
        infile.close(); 

        output_file =new FileOutputStream(new File("C:\\Users\\RASYID\\Documents\\University task etc\\Semester 6\\Real-Time Programming\\rasyid.md"));  //Open FileOutputStream to write updates

        //write changes
        workbook2.write(output_file); 
        output_file.close();    

    }
}       