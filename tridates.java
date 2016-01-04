import java.util.*;
class tridates {
    
    public static void main (String[] args) {
        
        String[] array = {"12/04/1982", "09/01/1944", "06/01/1985", "12/04/1980", "29/08/1942", "04/03/1980"};
        
        boolean swap = false;
        
        do {
            swap = false;
            
            for (int i = 0; i<array.length-1; i++) {
                
                int year1 = Integer.parseInt(array[i].substring(6,10));
                int year2 = Integer.parseInt(array[i+1].substring(6,10));

                
                if (year1==year2) {
                    
                    int month1 = Integer.parseInt(array[i].substring(3,5));
                    int month2 = Integer.parseInt(array[i+1].substring(3,5));
                    
                    if (month1>month2) {
                        String x = array[i];
                        array[i] = array[i+1];
                        array[i+1] = x;
                        swap = true;
                    }
                
                }
                else if (year1>year2){
                    String x = array[i];
                    array[i] = array[i+1];
                    array[i+1] = x;
                    swap = true;
                }
            }            
            
        } while (swap == true);
        
        System.out.println(Arrays.toString(array));
        
        
    }
}