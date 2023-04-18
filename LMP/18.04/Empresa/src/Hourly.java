import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Hourly extends Employee{
    private double hourlyRate;
    private double hours;

    public Hourly(String name, double hourlyRate, double hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPay(){
        return hourlyRate * hours;
    }

    public void addHours(double hours){

    }

    public void insertData(){
        System.out.println("Insert Data");
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
