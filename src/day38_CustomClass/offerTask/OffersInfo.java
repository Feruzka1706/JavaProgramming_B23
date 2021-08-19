package day38_CustomClass.offerTask;

public class OffersInfo {
    public String location,jobTitle;
    public boolean benefits;
    public int salary;
    public boolean WFH;
    public boolean fullTime;



    public void setInfo(String location, boolean benefits, int salary, boolean WFH, String jobTitle,boolean fullTime) {
        this.location = location;
        this.benefits = benefits;
        this.salary = salary;
        this.WFH = WFH;
        this.jobTitle = jobTitle;
        this.fullTime=fullTime;
    }

    public String toString() {
        return "OffersInfo{" +
                "location='" + location + '\'' +
                ", benefits=" + benefits +
                ", salary= $" + salary +
                ", WFH=" + WFH +
                ", jobTitle='" + jobTitle + '\'' +
                ", fullTime= "+fullTime+
                '}';
    }
}
