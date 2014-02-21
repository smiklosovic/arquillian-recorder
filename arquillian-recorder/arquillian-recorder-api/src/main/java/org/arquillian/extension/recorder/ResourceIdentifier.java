/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.arquillian.extension.recorder;

/**
 * Serves as a convenient way how to get an identifier of some resource according to its type. Mostly, we need to get some
 * (random) file name for resource in order to save it afterwards.
 *
 * @author <a href="mailto:smikloso@redhat.com">Stefan Miklosovic</a>
 *
 */
public interface ResourceIdentifier<T extends ResourceType> {

    /**
     * Gets identifier for a {@code resourceType}.
     *
     * @param resourceType resource we want the get an identifier of
     * @return identifier of resource based on its {@code resourceType}
     */
    String getIdentifier(T resourceType);
}