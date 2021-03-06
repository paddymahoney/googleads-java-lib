// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstantOperand.ConstantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstantOperand.ConstantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DOUBLE"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="STRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstantOperand.ConstantType")
@XmlEnum
public enum ConstantOperandConstantType {


    /**
     * 
     *                 Boolean constant type. booleanValue should be set for this type.
     *               
     * 
     */
    BOOLEAN,

    /**
     * 
     *                 Double constant type. doubleValue should be set for this type.
     *               
     * 
     */
    DOUBLE,

    /**
     * 
     *                 Long constant type. longValue should be set for this type.
     *               
     * 
     */
    LONG,

    /**
     * 
     *                 String constant type. stringValue should be set for this type.
     *               
     * 
     */
    STRING;

    public String value() {
        return name();
    }

    public static ConstantOperandConstantType fromValue(String v) {
        return valueOf(v);
    }

}
