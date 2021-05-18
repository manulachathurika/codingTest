package com.coding.models;

import java.util.Map;

public class ParsedData {

	private long timestamp;
	
	private Map<String, String> attributes;
	
	public ParsedData() {}
	
	public ParsedData(long timestamp, Map<String, String> attributes) {
		super();
		this.timestamp = timestamp;
		this.attributes = attributes;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "ParsedData [timestamp=" + timestamp + ", attributes=" + attributes + "]";
	}

}
