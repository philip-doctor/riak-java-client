/*
 * Copyright Basho Technologies Inc.
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

package com.basho.riak.client.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotates a field or setter method in a class to store last modified.
 * <p>
 * This value is only populated when fetching an object from riak. Setting it when
 * storing an object has no effect. A getter method is not supported; only a setter
 * method may be annotated. The type must be {@literal long} or {@literal Long}.
 *
 * <pre>
 * class MyPojo
 * {
 *     {@literal @}RiakLastModified
 *     Long lastModified;
 * }
 *
 * class MyPojo
 * {
 *     private Long lastModified;
 *
 *     {@literal @}RiakLastModified
 *     public void setLastModified(Long lastModified)
 *     {
 *         this.lastModified = lastModified;
 *     }
 * }
 * </pre>
 *
 * @author Brian Roach <roach at basho dot com>
 * @since 2.0
 */
@Retention(RetentionPolicy.RUNTIME) @Target({ElementType.FIELD, ElementType.METHOD}) public @interface RiakLastModified
{
}
