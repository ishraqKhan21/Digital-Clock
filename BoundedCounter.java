
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
     private int value;
    private int upperLimit;
 
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    // Increments the value by 1 as long as value not greater than upper limit
    public void next() {
        if (value >= upperLimit) {
            this.value = 0;
        } else {
        this.value++;
        }
    }
    // Imitates how digits on digital clock perceived, ex: 00,01,02...
    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
        return "" + value;
        }
    }
    
    public int getValue() {
        return this.value; 
    }
    
    public void setValue(int value) {
        if (value < 0 || value > upperLimit) {
            return;
        }
        this.value = value;
    } 
    
}
