package Day26_MultiDimensionalArray;

public class MultiDimensionalArrayP2 {
    public static void main(String[] args) {


        //String[] group2={"Ahmad","Nazli","Gulistan","Feruza","Jonathan","Aykut","Ateequllah","Saron"};

        String[][] cybertekGroups = {{"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve", "Atila", "Shokhzod", "Hende", "Serife", "Collins", "Akangankoy", "Liubov"},
                {"Oz", "Ibrahim", "Davut", "Dontrell", "Muahmmed","Ahmad"},
                {"Inesa", "Aysu", "Suat", "Esra", "Yusuf", "Mohamed", "Tinbite", "Raphael"},
                {"Selda", "Ibrahim", "Tamerlan", "Mehmut", "Sina","Ahmad"},
                {"Ahmad", "Nazli", "Gulistan", "Feruza", "Jonathan", "Aykut", "Ateequllah", "Saron"}
        };
        
        int count =0;

        for (String[] eachGroup : cybertekGroups) {

            for (String eachName : eachGroup) {
                if(eachName.equals("Ahmad")){
                    count++;
                }
            }
        }

        System.out.println("count = " + count);

    }
}
