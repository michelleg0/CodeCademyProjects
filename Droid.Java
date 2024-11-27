public class Droid {

    String droidName;
    int batteryLevel;
    String task;

    //String batteryLevelUpdate = "";

    public Droid(String droidName) {
        // Constructor with no parameters
        this.droidName = droidName;
        this.batteryLevel = 100;
        
    }

    public String toString() {
        return "Hey there, my name is " + droidName + "!";
      }

    public String performTask(String task) {
        return droidName + " is performing task: " + task;
    }

    public String energyReport(int batteryLevel) {
        return batteryLevel + "here is the current battery level: " + batteryLevel;
    }
    

    public static void main(String[] args) {
       
        Droid codey = new Droid("Codey");
        System.out.println(codey.droidName);
        System.out.println(codey.performTask("running")); 
        System.out.println(codey.energyReport(75)); 
        

   
    }
}
