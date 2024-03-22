package com.bookstore.by;

import org.hibernate.annotations.ValueGenerationType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ValueGenerationType(generatedBy = ModifiedByValueGeneration.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ModifiedBy {
}