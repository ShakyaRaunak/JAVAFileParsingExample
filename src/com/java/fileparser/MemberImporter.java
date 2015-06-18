package com.java.fileparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by raunakshakya on 6/16/15.
 */
public interface MemberImporter {

    ArrayList<Member> importMember(File inputFile) throws FileNotFoundException;

}
