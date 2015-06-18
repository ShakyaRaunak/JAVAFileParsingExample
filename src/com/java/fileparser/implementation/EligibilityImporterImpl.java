package com.java.fileparser.implementation;

import com.java.fileparser.Eligibility;
import com.java.fileparser.EligibilityImporter;
import com.java.fileparser.utils.DateUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class implements the EligibilityImporter interface and overrides the importEligibilities method.
 * Created by raunakshakya on 6/16/15.
 */
public class EligibilityImporterImpl implements EligibilityImporter {

    @Override
    public ArrayList<Eligibility> importEligibilities(File inputFile) throws FileNotFoundException {
        ArrayList<Eligibility> eligibilities = new ArrayList<Eligibility>();
        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("\\|");

            Eligibility eligibility = new Eligibility();
            eligibility.setId(line[0]);
            eligibility.setEffectiveFrom(DateUtils.parseDate(line[1]));
            eligibility.setEffectiveTo(DateUtils.parseDate(line[2]));

            eligibilities.add(eligibility);
        }
        return eligibilities;
    }

}
