/*
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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListPersistentVolumeRequest extends RpcAcsRequest<ListPersistentVolumeResponse> {
	   

	private Integer pageSize;

	private Integer pageNumber;

	private String clusterInstanceId;
	public ListPersistentVolumeRequest() {
		super("retailcloud", "2018-03-13", "ListPersistentVolume");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getClusterInstanceId() {
		return this.clusterInstanceId;
	}

	public void setClusterInstanceId(String clusterInstanceId) {
		this.clusterInstanceId = clusterInstanceId;
		if(clusterInstanceId != null){
			putBodyParameter("ClusterInstanceId", clusterInstanceId);
		}
	}

	@Override
	public Class<ListPersistentVolumeResponse> getResponseClass() {
		return ListPersistentVolumeResponse.class;
	}

}
