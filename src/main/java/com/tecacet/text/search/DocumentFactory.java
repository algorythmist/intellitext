package com.tecacet.text.search;

import org.apache.lucene.document.Document;

import java.io.File;

public interface DocumentFactory {

    /**
     * Creates a Lucene Document from a File. This method can return <code>null</code>.
     *
     * @param file the File to convert to a Document
     * @return a ready-to-index instance of Document
     */
    Document getDocument(File file) throws DocumentHandlerException;
}
