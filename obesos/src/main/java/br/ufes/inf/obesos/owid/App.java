package br.ufes.inf.obesos.owid;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class App 
{
    public static void main( String[] args ) throws IOException, IOException {

        Reader in = new FileReader(args[0]);


        Iterable<CSVRecord> records = CSVFormat.EXCEL.withDelimiter(',').parse(in);


        for (CSVRecord record : records) {

            String columnOne = record.get(0);


            
            String columnTwo = record.get(1);


            
            System.out.println(columnOne);


            
            System.out.println(columnTwo);

        }

    }
}
