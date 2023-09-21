package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {
    private static final String PhoneData = """
            Charlie Brown, 3334445555
            Maid Marion, 1234567890
            Mickey Mouse, 9998887777
            Minnie Mouse, 4567805666
            Robin Hood, 5647893000
            Robin Hood, 7999028222
            Lucy Van Pelt, 5642086852
            Mickey Mouse, 9998887777
            """;
    private static final String EmailData = """
            Mickey Mouse, mckmouse@gmail.com
            Mickey Mouse, micky1@aws.com
            Minnie Mouse, minnie@verizon.com
            Robin Hood, rhood@gmail.com
            Linux Van Pelt, Lvpelt2015@gmail.com
            Daffy Duck, daffy@google.com
            """;

    public static List<Contact> getData(String string) {
        List<Contact> dataList = new ArrayList<>();
        Scanner s = new Scanner(string.equals("phone") ? PhoneData : EmailData);
        while (s.hasNext()) {
            String[] data = s.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if (string.equals("phone")) {
                dataList.add(new Contact(data[0], Long.parseLong(data[1])));
            } else if (string.equals("email")) {
                dataList.add(new Contact(data[0], data[1]));
            }
        }
        return dataList;
    }
}
