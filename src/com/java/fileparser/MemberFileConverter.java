package com.java.fileparser;

import com.java.fileparser.implementation.EligibilityImporterImpl;
import com.java.fileparser.implementation.MemberExporterImpl;
import com.java.fileparser.implementation.MemberImporterImpl;
import com.java.fileparser.utils.EligibilityUtils;
import com.java.fileparser.utils.FileUtils;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by raunakshakya on 6/16/15.
 */
public abstract class MemberFileConverter {

    public void convert(File membersFile, File eligibilityFile, File outputFile) throws IOException {

        FileUtils.checkIfFileExists(membersFile);
        FileUtils.checkIfFileExists(eligibilityFile);
        FileUtils.checkIfFileExists(outputFile);

        // import members from members.dat file
        MemberImporterImpl memberImporter = new MemberImporterImpl();
        ArrayList<Member> members = memberImporter.importMember(membersFile);

        // import eligibilities from eligibility.dat file
        EligibilityImporterImpl employeeImporter = new EligibilityImporterImpl();
        ArrayList<Eligibility> eligibilities = employeeImporter.importEligibilities(eligibilityFile);

        MemberExporterImpl memberExporterImpl = new MemberExporterImpl();

        Writer writer = new FileWriter(outputFile);
        // PrintWriter printWriter = new PrintWriter(outputFile);

        // FileOutputStream fileOutputStream = new FileOutputStream("./src/output.csv");

        // FileReader fileReader = new FileReader("./src/output.csv");
        // BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (Member member : members) {
            Eligibility eligibility = EligibilityUtils.findEligibilityForMember(member, eligibilities);
            if (eligibility != null) {
                if (isEligible(eligibility)) {
                    memberExporterImpl.exportMember(member, writer);

                    // Another way of writing to a file is by using PrintWriter.print()
                    // printWriter.print(member.toString());

                    // memberExporterImpl.exportMember(member, fileOutputStream);
                }
            }
        }
        writer.flush();
        writer.close();

        // printWriter.flush();
        // printWriter.close();

        // fileOutputStream.flush();
        // fileOutputStream.close();
    }

    public abstract boolean isEligible(Eligibility eligibility);

}
