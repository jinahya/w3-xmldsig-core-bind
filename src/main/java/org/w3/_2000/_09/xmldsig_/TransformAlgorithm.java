/*
 * Copyright 2015 Jin Kwon &lt;jinahya_at_gmail.com&gt;.
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
 */

package org.w3._2000._09.xmldsig_;


/**
 *
 * @author Jin Kwon &lt;jinahya_at_gmail.com&gt;
 */
public enum TransformAlgorithm implements Algorithm {

    BASE64("http://www.w3.org/2000/09/xmldsig#base64"),
    XPATH_FILTERING("http://www.w3.org/TR/1999/REC-xpath-19991116"),
    ENVELOPED_SIGNATURE_TRANSFORM(
        "http://www.w3.org/2000/09/xmldsig#enveloped-signature"),
    XSLT_TRANSFORM("http://www.w3.org/TR/1999/REC-xslt-19991116");


    public static TransformAlgorithm valueOfIdentifier(
        final String identifier) {

        for (final TransformAlgorithm value : values()) {
            if (value.identifier.equals(identifier)) {
                return value;
            }
        }

        throw new IllegalArgumentException(
            "no value for identifier: " + identifier);
    }


    private TransformAlgorithm(final String identifier) {

        this.identifier = identifier;
    }


    @Override
    public String getIdentifier() {

        return identifier;
    }


    public TransformType setAlgorithm(final TransformType transformType) {

        transformType.setAlgorithm(identifier);

        return transformType;
    }


    private String identifier;

}

