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
        // write your code here

        String[] myArray = new String[]{"a", "b"};
        /*int lengthOfArray = myArray.length;
        for(int i=0;i<lengthOfArray;i++) {
            System.out.println(myArray[i]);
        }*/
        /*for(String a:myArray) {
            System.out.println(a);
        }*/
        ArrayList al = new ArrayList();
        /*al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");*/
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Collections.sort(al);

        Iterator itr = al.iterator();
        /*while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        LinkedHashMap hm = new LinkedHashMap();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        Set set = hm.entrySet();
        /*Iterator itr = set.iterator();
        while(itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }*/

        MemberFileConverter memberFileConverter = new MemberFileConverter() {
            @Override
            public boolean isEligible(Eligibility eligibility) {
                return DateUtils.isCurrentDateBetweenTwoDates(eligibility.getEffectiveFrom(), eligibility.getEffectiveTo());
            }
        };
        memberFileConverter.convert(FileUtils.MEMBERS_FILE, FileUtils.ELIGIBILITIES_FILE, FileUtils.OUTPUT_FILE);

        /*
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
