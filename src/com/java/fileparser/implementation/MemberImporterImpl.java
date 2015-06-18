package com.java.fileparser.implementation;

import com.java.fileparser.Member;
import com.java.fileparser.MemberImporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class implements the MemberImporter interface and overrides the importMember method.
 * Created by raunakshakya on 6/16/15.
 */
public class MemberImporterImpl implements MemberImporter {

    @Override
    public ArrayList<Member> importMember(File inputFile) throws FileNotFoundException {
        ArrayList<Member> members = new ArrayList<Member>();
        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            Member member = new Member();
            member.setId(line.substring(0, 9).trim());
            member.setFirstName(line.substring(10, 19).trim());
            member.setLastName(line.substring(20, 29).trim());
            member.setAddress(line.substring(30, line.length()).trim());

            members.add(member);
        }
        return members;
    }

}
