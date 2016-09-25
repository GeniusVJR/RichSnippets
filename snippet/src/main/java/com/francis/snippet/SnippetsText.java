package com.francis.snippet;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-18-2016
 */
public class SnippetsText extends EditText implements TextWatcher {

	public static final int FORMAT_BOLD = 0x01;
	public static final int FORMAT_ITALIC = 0x02;
	public static final int FORMAT_UNDERLINED = 0x03;
	public static final int FORMAT_STRIKETHROUGH = 0x04;
	public static final int FORMAT_BULLET = 0x05;
	public static final int FORMAT_QUOTE = 0x06;
	public static final int FORMAT_LINK = 0x07;

	private int bulletColor = 0;
	private int bulletRadius = 0;
	private int bulletGapWidth = 0;
	private boolean historyEnable = true;
	private int historySize = 100;
	private int linkColor = 0;
	private boolean linkUnderline = true;
	private int quoteColor = 0;
	private int quoteStripeWidth = 0;
	private int quoteGapWidth = 0;




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
		TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.KnifeText);
		bulletColor = array.getColor(R.styleable.KnifeText_bulletColor, 0);
		bulletRadius = array.getDimensionPixelOffset(R.styleable.KnifeText_bulletRadius, 0);
		bulletGapWidth = array.getDimensionPixelOffset(R.styleable.KnifeText_bulletGapWidth, 0);
		historyEnable = array.getBoolean(R.styleable.KnifeText_historyEnable, true);
		historySize = array.getInt(R.styleable.KnifeText_historySize, 100);
		linkColor = array.getColor(R.styleable.KnifeText_linkColor, 0);
		linkUnderline = array.getBoolean(R.styleable.KnifeText_linkUnderline, true);
		quoteColor = array.getColor(R.styleable.KnifeText_quoteColor, 0);
		quoteStripeWidth = array.getDimensionPixelSize(R.styleable.KnifeText_quoteStripeWidth, 0);
		quoteGapWidth = array.getDimensionPixelSize(R.styleable.KnifeText_quoteCapWidth, 0);
		array.recycle();

		if(historyEnable && historySize <= 0){
			throw new IllegalArgumentException("historySize must > 0");
		}
	}

	@Override
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		addTextChangedListener(this);
	}

	@Override
	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		removeTextChangedListener(this);
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

	@Override
	public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
		super.onTextChanged(text, start, lengthBefore, lengthAfter);
	}

	@Override
	public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

	}

	@Override
	public void afterTextChanged(Editable editable) {

	}
}
