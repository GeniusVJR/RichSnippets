package com.francis.snippet.model;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-18-2016
 */
public class SnippetsPart {

	private int start;
	private int end;

	public SnippetsPart(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public boolean isValid(){
		return start < end;
	}
}
