/*
 * Copyright (c) 2014. JLBR
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
package com.stormpath.sample.common.exceptions.client;

/**
 * ClientValidationException
 *
 * @since 1.0.1
 */
public class ClientValidationException extends ClientException {

    private final int code;

    public ClientValidationException(com.stormpath.sample.common.Error error, String... parameters) {
        super(String.format(error.getErrorMessageTemplate(), parameters));
        this.code = error.getCode();
    }

    public int getCode() {
        return this.code;
    }
}
