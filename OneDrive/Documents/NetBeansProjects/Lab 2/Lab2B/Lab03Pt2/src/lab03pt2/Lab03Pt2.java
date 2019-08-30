package lab03pt2;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Lab03Pt2 {

    public static void main(String[] args) {
        
        /* Row Objects */
        
        ArrayList<String> keys;             // Holds key names from header row
        ArrayList<String> values = null;           // Holds the values read from subsequent rows
        
        HashMap<String, String> row;        // Holds the key/value pairs for each data row

        String line, header;

        /* Container for File Data */
        
        ArrayList data = new ArrayList<>(); // Create ArrayList to hold HashMaps for all rows
        
        try {
            
            /* Attempt to open input file */

            Scanner in = new Scanner(Paths.get("lab03b_input.csv"), "UTF-8");
            
            /* Get list of keys from the header row; split into an ArrayList */
            
            header = in.nextLine();
            keys = new ArrayList(Arrays.asList(header.split(",")));
            
            /* Read and process every subsequent row (record) in CSV file */
            
            while ( in.hasNextLine() ) {
                
                /* Get next line */
                
                line = in.nextLine();
                
                /* Create new map for current row */
                
                row = new HashMap<>();
                
                /* Split comma-separated values into ArrayList */
                
                values = new ArrayList(Arrays.asList(line.split(",")));
                
                /* Populate map, using key names from the header row */
                
                for (int i = 0; i < keys.size(); i++) {
                    
                    row.put(keys.get(i), values.get(i));
                    
                }
                
                /* Add map to data container */
                
                data.add(row);
                                 
                            
        }
            
           
            for (int i = 0; i < data.size(); ++i) {
                    row = (HashMap)data.get(i);
                

                        System.out.print(row.get("FirstName") + " ");
                        System.out.print(row.get("MiddleInitial")+ " ");
                        System.out.println(row.get("LastName"));
                        System.out.println(row.get("StreetAddress"));
                        System.out.print(row.get("City") + ", ");
                        System.out.print(row.get("State") + " ");
                        System.out.println(row.get("ZipCode"));
                        System.out.println("                       ");
                            

                     

            } 
     
        }
        
        catch (Exception e) {
            
            System.err.println(e.toString());
            
        }
        
    }

}