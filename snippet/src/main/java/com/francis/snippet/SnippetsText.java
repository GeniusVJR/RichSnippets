package com.francis.snippet;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
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
}
