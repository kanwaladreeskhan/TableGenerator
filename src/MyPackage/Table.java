 
package MyPackage;
 
public class Table {
     private int number;
            
        public void setNumber(int number)
        {
            this.number = number;
        } 
        public int getNumber()
        {
            return number;
        }
        @Override
public String toString() {
    return "Table of " + number;
}
}

 
