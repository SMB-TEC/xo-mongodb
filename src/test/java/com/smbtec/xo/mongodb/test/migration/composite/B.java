package com.smbtec.xo.mongodb.test.migration.composite;

import com.smbtec.xo.mongodb.api.annotation.Document;

@Document(collection = "B")
public interface B extends A {
}
