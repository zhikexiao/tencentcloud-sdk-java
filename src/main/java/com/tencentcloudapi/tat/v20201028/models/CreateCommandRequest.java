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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCommandRequest extends AbstractModel{

    /**
    * 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * Base64编码后的命令内容，长度不可超过64KB。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 命令描述。不超过120字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 命令类型，目前仅支持取值：SHELL。默认：SHELL。
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * 命令执行路径，默认：/root。
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * 命令超时时间，默认60秒。取值范围[1, 86400]。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。 
     * @return CommandName 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。
     * @param CommandName 命令名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get Base64编码后的命令内容，长度不可超过64KB。 
     * @return Content Base64编码后的命令内容，长度不可超过64KB。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64编码后的命令内容，长度不可超过64KB。
     * @param Content Base64编码后的命令内容，长度不可超过64KB。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 命令描述。不超过120字符。 
     * @return Description 命令描述。不超过120字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 命令描述。不超过120字符。
     * @param Description 命令描述。不超过120字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 命令类型，目前仅支持取值：SHELL。默认：SHELL。 
     * @return CommandType 命令类型，目前仅支持取值：SHELL。默认：SHELL。
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set 命令类型，目前仅支持取值：SHELL。默认：SHELL。
     * @param CommandType 命令类型，目前仅支持取值：SHELL。默认：SHELL。
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get 命令执行路径，默认：/root。 
     * @return WorkingDirectory 命令执行路径，默认：/root。
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set 命令执行路径，默认：/root。
     * @param WorkingDirectory 命令执行路径，默认：/root。
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get 命令超时时间，默认60秒。取值范围[1, 86400]。 
     * @return Timeout 命令超时时间，默认60秒。取值范围[1, 86400]。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 命令超时时间，默认60秒。取值范围[1, 86400]。
     * @param Timeout 命令超时时间，默认60秒。取值范围[1, 86400]。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

