/*
 * Copyright 2017 Red Hat Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.enmasse.iot.transport;

/**
 * Bring information about a delivered message
 */
public class MessageDelivery {

    private final String address;
    private final String message;

    /**
     * Constructor
     *
     * @param address   address on which message was delivered
     * @param message   message body
     */
    public MessageDelivery(String address, String message) {
        this.address = address;
        this.message = message;
    }

    /**
     * @return  address on which message was delivered
     */
    public String address() {
        return this.address;
    }

    /**
     * @return  message body
     */
    public String message() {
        return this.message;
    }
}
