package com.example.milde.overlaytest;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private final ArrayList<Entry> entries;

    public MainActivity() {
        entries = new ArrayList<Entry>();
        entries.add(new Entry(R.drawable.ic_build_black_24dp, "Calendar"));
        entries.add(new Entry(R.drawable.ic_camera_enhance_black_24dp, "Envelope"));
        entries.add(new Entry(R.drawable.ic_card_giftcard_black_24dp, "Location"));
        entries.add(new Entry(R.drawable.ic_card_membership_black_24dp, "Social Group"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSourceItems();
    }

    private void createSourceItems() {
        LinearLayout sourceContainer = (LinearLayout) findViewById(R.id.source_container);
        for (Entry entry : entries) {
            ImageView srcView = new ImageView(this);
            srcView.setImageResource(entry.getImageResId());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            params.topMargin = getResources().getDimensionPixelSize(R.dimen.activity_vertical_margin);
            sourceContainer.addView(srcView, params);
            ItemClickListener listener = new ItemClickListener(this, entry, srcView);
            srcView.setOnClickListener(listener);
        }
    }

    /**

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        boolean result = super.onMenuItemSelected(featureId, item);
        if (item.getItemId() == R.id.action_clear) {
            LinearLayout destinationContainer = (LinearLayout) findViewById(R.id.destination_container);
            int childCount = destinationContainer.getChildCount();
            for (int i = 1; i < childCount; i++) {
                destinationContainer.removeViewAt(1);
            }
        }
        return result;
    }
    **/
}
