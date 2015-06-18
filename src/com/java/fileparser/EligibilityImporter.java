package com.java.fileparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by raunakshakya on 6/16/15.
 */
public interface EligibilityImporter {

    ArrayList<Eligibility> importEligibilities(File inputFile) throws FileNotFoundException, ParseException;

}
