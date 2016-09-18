package com.francis.richsnippets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.francis.snippet.SnippetsText;

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

	private SnippetsText snippetsText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		snippetsText = (SnippetsText) findViewById(R.id.snippets);
		snippetsText.setSelection(snippetsText.getEditableText().length());

		initBold();


	}

	private void initBold() {

		ImageButton bold = (ImageButton) findViewById(R.id.bold);

		bold.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {

			}
		});

		bold.setOnLongClickListener(new View.OnLongClickListener() {

			@Override
			public boolean onLongClick(View view) {
				Toast.makeText(MainActivity.this, R.string.toast_bold, Toast.LENGTH_SHORT).show();
				return true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
			case R.id.undo:
				break;
			case R.id.redo:
				break;
			case R.id.save:
				break;
			default:
				break;
		}
		return true;
	}
}
