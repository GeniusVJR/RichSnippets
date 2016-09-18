package com.francis.richsnippets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-18-2016
 */
public class SnippetsText extends EditText{


	public static final int FORMAT_BOLD = 0x01;
	public static final int FORMAT_ITALIC = 0x02;
	public static final int FORMAT_UNDERLINED = 0x03;
	public static final int FORMAT_STRIKETHROUGH = 0x04;
	public static final int FORMAT_BULLET = 0x05;
	public static final int FORMAT_QUOTE = 0x06;
	public static final int FORMAT_LINK = 0x07;

	public SnippetsText(Context context) {
		super(context);
		init(null);
	}

	public SnippetsText(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(attrs);
	}

	public SnippetsText(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(attrs);
	}

	@TargetApi (Build.VERSION_CODES.LOLLIPOP)
	public SnippetsText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		init(attrs);
	}

	private void init(AttributeSet attrs){

		//TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.SnippetsText);
		//array.recycle();
	}

}
