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
public enum MessageDigestAlgorithm implements Algorithm {

    SHA_1("http://www.w3.org/2000/09/xmldsig#sha1");


    public static MessageDigestAlgorithm valueOfIdentifier(
        final String identifier) {

        for (final MessageDigestAlgorithm value : values()) {
            if (value.identifier.equals(identifier)) {
                return value;
            }
        }

        throw new IllegalArgumentException(
            "no value for identifier: " + identifier);
    }


    private MessageDigestAlgorithm(final String identifier) {

        this.identifier = identifier;
    }


    @Override
    public String getIdentifier() {

        return identifier;
    }


    public DigestMethodType setAlgorithm(
        final DigestMethodType digestMethodType) {

        digestMethodType.setAlgorithm(identifier);

        return digestMethodType;
    }


    private String identifier;

}

