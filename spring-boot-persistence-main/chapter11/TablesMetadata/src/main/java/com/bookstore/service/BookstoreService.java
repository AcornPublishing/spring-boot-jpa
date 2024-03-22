package com.bookstore.service;

import com.bookstore.config.DatabaseTableMetadataExtractor;
import org.hibernate.boot.model.relational.Namespace;
import org.hibernate.mapping.Column;
import org.hibernate.mapping.Table;

import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class BookstoreService {
    public void extractTablesMetadata() {
        for (Namespace namespace : DatabaseTableMetadataExtractor.EXTRACTOR
                .getDatabase()
                .getNamespaces()) {

            namespace.getTables().forEach(this::displayTablesMetadata);
        }
    }

    private void displayTablesMetadata(Table table) {
        System.out.println("\nTable: " + table);
        Iterator<Column> it = table.getColumnIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}