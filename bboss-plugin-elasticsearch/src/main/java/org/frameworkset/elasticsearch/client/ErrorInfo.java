package org.frameworkset.elasticsearch.client;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorInfo {
	@JsonProperty("root_cause")
	private List<RootCause> rootCauses;
	private String type;//": "search_phase_execution_exception",
	private String reason;//: "all shards failed",
	private String phase;//": "query",
	private boolean  grouped;//": true,
	@JsonProperty("failed_shards")
    private List<FailedShard> failedShards;
	public ErrorInfo() {
		// TODO Auto-generated constructor stub
	}
	public List<RootCause> getRootCauses() {
		return rootCauses;
	}
	public void setRootCauses(List<RootCause> rootCauses) {
		this.rootCauses = rootCauses;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public boolean isGrouped() {
		return grouped;
	}
	public void setGrouped(boolean grouped) {
		this.grouped = grouped;
	}
	public List<FailedShard> getFailedShards() {
		return failedShards;
	}
	public void setFailedShards(List<FailedShard> failedShards) {
		this.failedShards = failedShards;
	}

}