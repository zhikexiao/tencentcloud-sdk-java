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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateNotebookLifecycleScriptRequest extends AbstractModel{

    /**
    * notebook生命周期脚本名称
    */
    @SerializedName("NotebookLifecycleScriptsName")
    @Expose
    private String NotebookLifecycleScriptsName;

    /**
    * 创建脚本
    */
    @SerializedName("CreateScript")
    @Expose
    private String CreateScript;

    /**
    * 启动脚本
    */
    @SerializedName("StartScript")
    @Expose
    private String StartScript;

    /**
     * Get notebook生命周期脚本名称 
     * @return NotebookLifecycleScriptsName notebook生命周期脚本名称
     */
    public String getNotebookLifecycleScriptsName() {
        return this.NotebookLifecycleScriptsName;
    }

    /**
     * Set notebook生命周期脚本名称
     * @param NotebookLifecycleScriptsName notebook生命周期脚本名称
     */
    public void setNotebookLifecycleScriptsName(String NotebookLifecycleScriptsName) {
        this.NotebookLifecycleScriptsName = NotebookLifecycleScriptsName;
    }

    /**
     * Get 创建脚本 
     * @return CreateScript 创建脚本
     */
    public String getCreateScript() {
        return this.CreateScript;
    }

    /**
     * Set 创建脚本
     * @param CreateScript 创建脚本
     */
    public void setCreateScript(String CreateScript) {
        this.CreateScript = CreateScript;
    }

    /**
     * Get 启动脚本 
     * @return StartScript 启动脚本
     */
    public String getStartScript() {
        return this.StartScript;
    }

    /**
     * Set 启动脚本
     * @param StartScript 启动脚本
     */
    public void setStartScript(String StartScript) {
        this.StartScript = StartScript;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookLifecycleScriptsName", this.NotebookLifecycleScriptsName);
        this.setParamSimple(map, prefix + "CreateScript", this.CreateScript);
        this.setParamSimple(map, prefix + "StartScript", this.StartScript);

    }
}
