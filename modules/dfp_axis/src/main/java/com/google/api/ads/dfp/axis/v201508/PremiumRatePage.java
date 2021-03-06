// Copyright 2015 Google Inc. All Rights Reserved.
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

/**
 * PremiumRatePage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201508;


/**
 * Captures a page of {@link PremiumRate} objects.
 */
public class PremiumRatePage  implements java.io.Serializable {
    /* The collection of premium rates contained within this page. */
    private com.google.api.ads.dfp.axis.v201508.PremiumRate[] results;

    /* The absolute index in the total result set on which this page
     * begins. */
    private java.lang.Integer startIndex;

    /* The size of the total result set to which this page belongs. */
    private java.lang.Integer totalResultSetSize;

    public PremiumRatePage() {
    }

    public PremiumRatePage(
           com.google.api.ads.dfp.axis.v201508.PremiumRate[] results,
           java.lang.Integer startIndex,
           java.lang.Integer totalResultSetSize) {
           this.results = results;
           this.startIndex = startIndex;
           this.totalResultSetSize = totalResultSetSize;
    }


    /**
     * Gets the results value for this PremiumRatePage.
     * 
     * @return results   * The collection of premium rates contained within this page.
     */
    public com.google.api.ads.dfp.axis.v201508.PremiumRate[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this PremiumRatePage.
     * 
     * @param results   * The collection of premium rates contained within this page.
     */
    public void setResults(com.google.api.ads.dfp.axis.v201508.PremiumRate[] results) {
        this.results = results;
    }

    public com.google.api.ads.dfp.axis.v201508.PremiumRate getResults(int i) {
        return this.results[i];
    }

    public void setResults(int i, com.google.api.ads.dfp.axis.v201508.PremiumRate _value) {
        this.results[i] = _value;
    }


    /**
     * Gets the startIndex value for this PremiumRatePage.
     * 
     * @return startIndex   * The absolute index in the total result set on which this page
     * begins.
     */
    public java.lang.Integer getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this PremiumRatePage.
     * 
     * @param startIndex   * The absolute index in the total result set on which this page
     * begins.
     */
    public void setStartIndex(java.lang.Integer startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the totalResultSetSize value for this PremiumRatePage.
     * 
     * @return totalResultSetSize   * The size of the total result set to which this page belongs.
     */
    public java.lang.Integer getTotalResultSetSize() {
        return totalResultSetSize;
    }


    /**
     * Sets the totalResultSetSize value for this PremiumRatePage.
     * 
     * @param totalResultSetSize   * The size of the total result set to which this page belongs.
     */
    public void setTotalResultSetSize(java.lang.Integer totalResultSetSize) {
        this.totalResultSetSize = totalResultSetSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PremiumRatePage)) return false;
        PremiumRatePage other = (PremiumRatePage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.totalResultSetSize==null && other.getTotalResultSetSize()==null) || 
             (this.totalResultSetSize!=null &&
              this.totalResultSetSize.equals(other.getTotalResultSetSize())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getTotalResultSetSize() != null) {
            _hashCode += getTotalResultSetSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PremiumRatePage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "PremiumRatePage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "PremiumRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "startIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResultSetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "totalResultSetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
