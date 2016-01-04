import java.util.*;
class tridates {
    
    public static void main (String[] args) {
        
        String[] array = {"12/04/1982", "09/01/1944", "06/01/1985", "12/04/1980", "29/08/1942", "04/03/1980"};
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        
        boolean swap = false;
        
        do {
            swap = false;
            
            for (i = 0; i<array.length-1; i++) {
                Date date = format.parse(array[i]);
                Date date2 = format.parse(array[i+1]);
                
                if (date>date2) {
                    Date x = date;
                    date = date2;
                    date2 = x;
                    swap = true;
                }
            }            
            
        } while swap == true;
        
        System.out.println(Arrays.toString(array))
        
        
    }
}