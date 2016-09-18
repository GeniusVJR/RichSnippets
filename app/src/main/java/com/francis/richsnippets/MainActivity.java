package com.francis.richsnippets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	/**
	 * 加粗
	 */
	private static final String BOLD = "<b>Bold</b><br><br>";

	/**
	 * 斜体
	 */
	private static final String ITALIC = "<i>Italic</i><br><br>";

	/**
	 * 下划线
	 */
	private static final String UNDERLINE = "<u>Underline</u><br><br>";

	/**
	 * 删除线
	 */
	private static final String STRIKETHROUGH = "<s>Strikethrough</s><br><br>";

	/**
	 * 列表
	 */
	private static final String BULLET = "<ul><li>asdfg</li></ul>";

	/**
	 * 代码块
	 */
	private static final String QUOTE = "<blockquote>Quote</blockquote>";

	/**
	 * 超链接
	 */
	private static final String LINK = "<a href=\"https://github.com/GeniusVJR/RichSnippets\">Link</a><br><br>";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
