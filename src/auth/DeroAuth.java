package auth;

import encrypt.DeroEncrypt;
import user.DeroUserModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeroAuth {
    public static boolean validateIdentifiers(String username, String rawPassword) {
        try {
            File myObj = new File(username + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return (data.compareTo(DeroEncrypt.BasicEncrypt(rawPassword)) == 0);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static DeroUserModel login (String username, String rawPassword) {
        if(validateIdentifiers(username, rawPassword))
            return new DeroUserModel(username);
        else return null;
    }

    public static boolean userExists(String username) {
        File tempFile = new File(username + ".txt");
        return tempFile.exists();
    }

    public static boolean signUp(String username, String rawPassword) {
        try {
            FileWriter myWriter = new FileWriter(username + ".txt");
            myWriter.write(DeroEncrypt.BasicEncrypt(rawPassword));
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
