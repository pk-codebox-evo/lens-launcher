package nickrout.lenslauncher.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import nickrout.lenslauncher.R;

/**
 * Created by nickrout on 2016/04/06.
 */
public class AboutActivity extends BaseActivity {

    private TextView mTextViewAbout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        mTextViewAbout = (TextView) findViewById(R.id.text_view_about);
        mTextViewAbout.setText(Html.fromHtml(getString(R.string.about)));
        mTextViewAbout.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
