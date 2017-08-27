/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2017 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
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
package org.jboss.ejb.client;

import javax.ejb.EJBException;

/**
 * An exception (typically) thrown by {@link EJBClientContext} if the EJBClientContext couldn't resolve
 * an EJBReceiver.
 *
 * @author <a href="mailto:lgao@redhat.com">Lin Gao</a>
 */
public class NoDestinationEstablishedException extends EJBException {

    /** The serialVersionUID */
    private static final long serialVersionUID = 2635238259242452325L;
    /**
     * Constructs a new {@code NoDestinationEstablishedException} instance.  The message is left blank ({@code null}), and no
     * cause is specified.
     */
    public NoDestinationEstablishedException() {
    }

    /**
     * Constructs a new {@code NoDestinationEstablishedException} instance with an initial message.  No cause is specified.
     *
     * @param msg the message
     */
    public NoDestinationEstablishedException(final String msg) {
        super(msg);
    }

    /**
     * Constructs a new {@code NoDestinationEstablishedException} instance with an initial cause.  If a non-{@code null} cause
     * is specified, its message is used to initialize the message of this {@code NoDestinationEstablishedException}; otherwise
     * the message is left blank ({@code null}).
     *
     * @param cause the cause
     */
    public NoDestinationEstablishedException(final Exception cause) {
        super(cause);
    }

    /**
     * Constructs a new {@code NoDestinationEstablishedException} instance with an initial message and cause.
     *
     * @param msg the message
     * @param cause the cause
     */
    public NoDestinationEstablishedException(final String msg, final Exception cause) {
        super(msg, cause);
    }

}
