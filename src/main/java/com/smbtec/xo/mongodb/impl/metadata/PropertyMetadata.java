/*
 * eXtended Objects - MongoDB Binding
 *
 * Copyright (C) 2014 SMB GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.smbtec.xo.mongodb.impl.metadata;

import com.smbtec.xo.mongodb.impl.IndexDefinition;

/**
 *
 * @author Lars Martin - lars.martin@smb-tec.com
 *
 */
public class PropertyMetadata {

    private final String name;

    private IndexDefinition index;

    public PropertyMetadata(final String name) {
        this.name = name;
    }

    public PropertyMetadata(final String name, IndexDefinition index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public IndexDefinition getIndexDefinition() {
        return index;
    }

}