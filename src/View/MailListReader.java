package View;

import Model.Mail;

import java.io.*;
import java.util.ArrayList;

public class MailListReader {
    private static ArrayList<Mail> mails = new ArrayList<>();

    public static ArrayList<Mail> read(String fileName) throws IOException {
        FileReader in = new FileReader(fileName);
        BufferedReader br = new BufferedReader(in);

        String line = br.readLine();
        while(line != null){

            if(line.contains("@")){
                mails.add(new Mail(line));
            }
            line = br.readLine();
        }

        return mails;
    }
}
