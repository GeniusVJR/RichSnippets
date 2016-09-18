package com.francis.snippet;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-18-2016
 */
public class SnippetsText extends EditText {

	public SnippetsText(Context context) {
		super(context);
	}

	public SnippetsText(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SnippetsText(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@TargetApi (Build.VERSION_CODES.LOLLIPOP)
	public SnippetsText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}

	// StyleSpan ===================================================

	public void bold(boolean valid) {

	}

	protected void styleValid(int style, int start, int end) {
		switch (style) {
			case Typeface.NORMAL:
			case Typeface.BOLD:
			case Typeface.ITALIC:
			case Typeface.BOLD_ITALIC:
				break;
			default:
				return;
		}

		if(start >= end){
			return;
		}

		getEditableText().setSpan(new StyleSpan(style), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
	}


	protected void styleInvalid(int style, int start, int end) {
		switch (style) {
			case Typeface.NORMAL:
			case Typeface.BOLD:
			case Typeface.ITALIC:
			case Typeface.BOLD_ITALIC:
				break;
			default:
				return;
		}

		if(start >= end){
			return;
		}

		StyleSpan[] spans = getEditableText().getSpans(start, end, StyleSpan.class);






	}
}
