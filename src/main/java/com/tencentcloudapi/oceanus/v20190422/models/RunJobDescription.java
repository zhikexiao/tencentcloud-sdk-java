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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunJobDescription extends AbstractModel{

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 运行类型，1：启动，2：恢复
    */
    @SerializedName("RunType")
    @Expose
    private Long RunType;

    /**
    * SQL类型作业启动参数：指定数据源消费起始时间点
    */
    @SerializedName("StartMode")
    @Expose
    private String StartMode;

    /**
    * 已发布上线的作业配置版本
    */
    @SerializedName("JobConfigVersion")
    @Expose
    private Long JobConfigVersion;

    /**
     * Get 作业Id 
     * @return JobId 作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业Id
     * @param JobId 作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 运行类型，1：启动，2：恢复 
     * @return RunType 运行类型，1：启动，2：恢复
     */
    public Long getRunType() {
        return this.RunType;
    }

    /**
     * Set 运行类型，1：启动，2：恢复
     * @param RunType 运行类型，1：启动，2：恢复
     */
    public void setRunType(Long RunType) {
        this.RunType = RunType;
    }

    /**
     * Get SQL类型作业启动参数：指定数据源消费起始时间点 
     * @return StartMode SQL类型作业启动参数：指定数据源消费起始时间点
     */
    public String getStartMode() {
        return this.StartMode;
    }

    /**
     * Set SQL类型作业启动参数：指定数据源消费起始时间点
     * @param StartMode SQL类型作业启动参数：指定数据源消费起始时间点
     */
    public void setStartMode(String StartMode) {
        this.StartMode = StartMode;
    }

    /**
     * Get 已发布上线的作业配置版本 
     * @return JobConfigVersion 已发布上线的作业配置版本
     */
    public Long getJobConfigVersion() {
        return this.JobConfigVersion;
    }

    /**
     * Set 已发布上线的作业配置版本
     * @param JobConfigVersion 已发布上线的作业配置版本
     */
    public void setJobConfigVersion(Long JobConfigVersion) {
        this.JobConfigVersion = JobConfigVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "StartMode", this.StartMode);
        this.setParamSimple(map, prefix + "JobConfigVersion", this.JobConfigVersion);

    }
}

