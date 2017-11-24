package Model;

public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getDomain(){
        String[] temp = mail.split("@");
        return temp[1];
    }
}
