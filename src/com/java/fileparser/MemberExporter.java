package com.java.fileparser;

import java.io.Writer;

/**
 * Created by raunakshakya on 6/16/15.
 */
public interface MemberExporter {

    void exportMember(Member member, Writer writer);

}
