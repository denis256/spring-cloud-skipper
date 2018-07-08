/*
 * Copyright 2018 the original author or authors.
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
package org.springframework.cloud.skipper.domain;

/**
 * This contains all the request attributes for cancel operation.
 *
 * @author Janne Valkealahti
 *
 */
public class CancelRequest {

	private String releaseName;

	public CancelRequest() {
	}
	
	public CancelRequest(String releaseName) {
		this.releaseName = releaseName;
	}

	public String getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}
	
	@Override
	public String toString() {
		return "CancelRequest [releaseName=" + releaseName + "]";
	}	
}
