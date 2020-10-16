/*
 * Copyright (C) 2018 Drake, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drake.logcat.sample

import com.drake.logcat.Chain
import com.drake.logcat.LogInterceptor

/**
 * 上传日志拦截器
 */
class LogStoreInterceptor : LogInterceptor {

    override fun intercept(chain: Chain) {
        chain.message?.let {
            // ... 上传或者保存到本地
        }
    }
}

