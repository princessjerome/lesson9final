public abstract class Employee {
    
    protected String name;
    protected double rate;
    protected int hours;
    
    public static double LOW_RATE = 6.75;
    public static double HIGH_RATE = 30.50;
    public static double LOW_HOURS = 1;
    public static double HIGH_HOURS = 60;
    
    protected static double totalPay = 0;
    
    public Employee(){
        name = null;
        rate = 0;
        hours = 0;
    }
    
    public Employee(String a, double b, int c){
        name = a;
        rate = b;
        hours = c;
    }
    
    public final boolean setName(String nm){
        boolean blank = (nm.equals(""));
        if(blank)
            return false;
        else{
            name =nm;
            return true;
        }
    }
    
    public final boolean setRate(double rt){
        boolean oneortwo = (rt == 1 || rt == 2);
        if(oneortwo){
            rate = rt;
            return true;
        }    
        else
            return false;
    }
    
    public final boolean setHours(int hrs){
        boolean hoursok = (hrs >= 1 && hrs <= 60);
        if(hoursok){
            hours = hrs;
            return true;
        }
        else
            return false;
    }
    
    public final String getName(){
        return name;
    }
    
    abstract double getPay();
    
    public static String getNameRules(){
        
    }
    
    public static String getRateRules(){
        
    }
    
    public static String getHoursRules(){
        
    }
    
    public static double getTotalPay(){
        double pay;
        boolean noovertime = (hours<=40 || type == 2);
        
    }
}
    
