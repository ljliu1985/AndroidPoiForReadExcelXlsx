package lj.testexcel2;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;

import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new RxPermissions(this).requestEach(Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(new Consumer<Permission>() {
                    @Override
                    public void accept(Permission permission) throws Exception {
                        if (permission.granted) {
                            String filePath = "/sdcard/xxx.xlsx";
                            //String filePath = "/sdcard/yyy.xls";
                            readExcel(filePath);
                        }
                    }
                });


    }

    public static void readExcel(String filePath) {

        System.out.println("filePath:" + filePath);

        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(new File(filePath)));
            Sheet sheet = wb.getSheetAt(0);
            int i = 0;
            for (Row row : sheet) {
                System.out.print("row:" + i + "--->:");
                i++;
               String value = null;
                for (Cell cell : row) {
                     switch (cell.getCellTypeEnum()) {
                            case STRING:
                                value = cell.getStringCellValue();
                                break;
                            case NUMERIC:
                                value = String.valueOf(cell.getNumericCellValue());
                                break;
                            default:
                                continue;
                        }

                    System.out.print(value + ",");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
