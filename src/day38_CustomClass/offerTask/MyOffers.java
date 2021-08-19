package day38_CustomClass.offerTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        OffersInfo job1=new OffersInfo();
        job1.setInfo("California",true, 120000,true,"SDET",true);

        OffersInfo job2=new OffersInfo();
        job2.setInfo("Seattle, Wa", true, 115000, true, "Senior QA",true);

        OffersInfo job3=new OffersInfo();
        job3.setInfo("New York",false, 105000, false, "QA",false);

        OffersInfo job4=new OffersInfo();
        job4.setInfo("Virginia", true, 110000, false, "Junior Developer",true);

        OffersInfo job5=new OffersInfo();
        job5.setInfo("Orlando, FL", false, 150000, true, "BA",false);

        OffersInfo job6=new OffersInfo();
        job6.setInfo("Norway", false, 110000, true, "Test Engineer",false);

        OffersInfo job7=new OffersInfo();
        job7.setInfo("Vancuover, Canada", true, 120000,true, "SDET",true);

        OffersInfo[] jobs={job1,job2,job3,job4,job5,job6,job7};

        ArrayList<OffersInfo> location=new ArrayList<>(Arrays.asList(jobs) );
        location.removeIf(each-> !each.location.equals("California"));
         for(OffersInfo each: location){
             System.out.println(each);
         }

        System.out.println("-----------------------------------------------------------");

        ArrayList<OffersInfo> list =new ArrayList<>();
        list.addAll(Arrays.asList(jobs) );

        list.removeIf(each-> !(each.jobTitle.equals("SDET") || each.jobTitle.equals("QA") ) );

        //System.out.println(list);

        for(OffersInfo each: list){
            System.out.println(each);
        }

        System.out.println("----------------------------------");

        ArrayList<OffersInfo> fullTimeOffers=new ArrayList<>(Arrays.asList(jobs) );
        fullTimeOffers.removeIf(each-> each.fullTime!=true);

        System.out.println(fullTimeOffers);

        System.out.println("-------------------------------------------------");

        ArrayList<OffersInfo> workingHome=new ArrayList<>(Arrays.asList(jobs));

        workingHome.removeIf(each-> each.WFH!=true);

        for(OffersInfo each: workingHome){
            System.out.println(each+"\n");
        }

        System.out.println("-----------------------------------------------");

        ArrayList<OffersInfo> benefitsProgram=new ArrayList<>(Arrays.asList(jobs));
        benefitsProgram.removeIf(each-> each.benefits!=true);

        for(OffersInfo each: benefitsProgram){
            System.out.println(each);
        }

        System.out.println("--------------------------------------------------------------");
        ArrayList<OffersInfo> highSalaryOffers =new ArrayList<>(Arrays.asList(jobs));
        highSalaryOffers.removeIf(each-> each.salary<125000);
        System.out.println(highSalaryOffers+"\n");

    }
}
