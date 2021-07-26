package Day16_;

public class EmailDomain {
    public static void main(String[] args) {
        String email="Cybertek_School@yahoo.com";//
        int beginningIndex=email.indexOf("@")+1;
        int endingIndex=email.lastIndexOf(".");//or (".com")==>make it unique
        String domain=email.substring(beginningIndex,endingIndex);

        System.out.println("domain = " + domain);
        
    }
}
