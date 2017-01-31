package com.sample.restapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchResponse {

	private List<Search> search;
	
	private String totalResults;
	
	private String response;
	
	public SearchResponse() {
		
	}

	public List<Search> getSearch() {
		return search;
	}

	public void setSearch(List<Search> search) {
		this.search = search;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "SearchResponse [search=" + search + ", totalResults=" + totalResults + ", response=" + response + "]";
	}
	
}
