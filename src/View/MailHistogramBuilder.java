package View;

import Model.Histogram;
import Model.Mail;
import java.util.ArrayList;

public class MailHistogramBuilder{
    private static Histogram<String> histogram = new Histogram<>();

    public static Histogram<String> build(ArrayList<Mail> mails){
        for (Mail mail : mails) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }



}