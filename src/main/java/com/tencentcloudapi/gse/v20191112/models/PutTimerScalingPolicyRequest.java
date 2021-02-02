/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutTimerScalingPolicyRequest extends AbstractModel{

    /**
    * 定时器策略消息
    */
    @SerializedName("TimerScalingPolicy")
    @Expose
    private TimerScalingPolicy TimerScalingPolicy;

    /**
     * Get 定时器策略消息 
     * @return TimerScalingPolicy 定时器策略消息
     */
    public TimerScalingPolicy getTimerScalingPolicy() {
        return this.TimerScalingPolicy;
    }

    /**
     * Set 定时器策略消息
     * @param TimerScalingPolicy 定时器策略消息
     */
    public void setTimerScalingPolicy(TimerScalingPolicy TimerScalingPolicy) {
        this.TimerScalingPolicy = TimerScalingPolicy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TimerScalingPolicy.", this.TimerScalingPolicy);

    }
}

