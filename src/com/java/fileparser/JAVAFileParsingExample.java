package com.java.fileparser;

import com.java.fileparser.utils.DateUtils;
import com.java.fileparser.utils.FileUtils;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

/**
 * Created by raunakshakya on 6/18/15.
 */
public class JAVAFileParsingExample {

    public static void main(String[] args) throws IOException, ParseException {

        // Different ways of creating an Array
        /*
        String[] countries = new String[]{"Australia", "New Zealand", "South Africa", "England"};
        */

        /*
        String[] countries = new String[4];
        countries[0] = "Australia";
        countries[1] = "New Zealand";
        countries[2] = "South Africa";
        countries[3] = "England";
        */

        /*
        String[] countries = {"Australia", "New Zealand", "South Africa", "England"};
        */

        String[] countries = {"Australia", "New Zealand", "South Africa", "England"};
        int lengthOfArray = countries.length;

        // Printing elements of Array using for loop
        /*
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println(countries[i]);
        }
        */

        // Printing elements of Array using for-each loop
        for (String a : countries) {
            System.out.println(a);
        }
        System.out.println();

        // Using ArrayList
        ArrayList al = new ArrayList();
        al.add("Australia");
        al.add("New Zealand");
        al.add("South Africa");
        al.add("England");
        Collections.sort(al);
        Iterator itr1 = al.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println();

        // Using LinkedHashMap
        LinkedHashMap hm = new LinkedHashMap();
        hm.put(100, "Australia");
        hm.put(101, "New Zealand");
        hm.put(102, "South Africa");
        Set set = hm.entrySet();
        Iterator itr2 = set.iterator();
        while (itr2.hasNext()) {
            Map.Entry m = (Map.Entry) itr2.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        /*
        MemberFileConverter memberFileConverter = new MemberFileConverter() {
            @Override
            public boolean isEligible(Eligibility eligibility) {
                return DateUtils.isCurrentDateBetweenTwoDates(eligibility.getEffectiveFrom(), eligibility.getEffectiveTo());
            }
        };
        memberFileConverter.convert(FileUtils.MEMBERS_FILE, FileUtils.ELIGIBILITIES_FILE, FileUtils.OUTPUT_FILE);
        */

        /*
        // Question from Facebook
        String r = "0";
        int x = -1, y = -5;
        if(x < 5)
            if(y > 0)
                if(x > y)
                    r += "1";
                else r += "2";
            else r += "3";
        else r += "4";
        System.out.println(r);
        */
    }

}
