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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGatewayApiRequest extends AbstractModel{

    /**
    * API 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Api信息
    */
    @SerializedName("ApiList")
    @Expose
    private ApiInfo [] ApiList;

    /**
     * Get API 分组ID 
     * @return GroupId API 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set API 分组ID
     * @param GroupId API 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Api信息 
     * @return ApiList Api信息
     */
    public ApiInfo [] getApiList() {
        return this.ApiList;
    }

    /**
     * Set Api信息
     * @param ApiList Api信息
     */
    public void setApiList(ApiInfo [] ApiList) {
        this.ApiList = ApiList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "ApiList.", this.ApiList);

    }
}

