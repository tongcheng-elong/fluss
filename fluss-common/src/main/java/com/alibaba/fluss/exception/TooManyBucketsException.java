/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.fluss.exception;

import com.alibaba.fluss.annotation.PublicEvolving;

/**
 * This exception is thrown if the number of table buckets is exceed max.bucket.num.
 *
 * @since 0.7
 */
@PublicEvolving
public class TooManyBucketsException extends ApiException {

    private static final long serialVersionUID = 1L;

    public TooManyBucketsException(String message) {
        super(message);
    }

    public TooManyBucketsException(String message, Throwable cause) {
        super(message, cause);
    }
}
