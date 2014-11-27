public class PartTimeEmployee extends Employee{
    
    public PartTimeEmployee(){
        super();
    }
    
    public double getPay(){
        double emppay = hours * rate;
        totalPay += emppay;
        return emppay;
    }
    
}
