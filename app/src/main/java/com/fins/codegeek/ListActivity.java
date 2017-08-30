package com.fins.codegeek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

//import static com.fins.codegeek.R.layout.activity_list_item;
//import static com.fins.codegeek.R.layout.activity_main;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.listView);
        final ArrayList<Menu> data = new ArrayList<>();

        final Menu php    = new Menu(R.drawable.phplogo, "PHP", getResources().getString(R.string.php));
        final Menu ruby   = new Menu(R.drawable.rubylogo, "Ruby", getResources().getString(R.string.ruby));
        final Menu java   = new Menu(R.drawable.javalogo, "Java", getResources().getString(R.string.ruby));
        final Menu swift  = new Menu(R.drawable.swiftlogo, "Swift", getResources().getString(R.string.ruby));
        final Menu nodejs = new Menu(R.drawable.nodejslogo, "NodeJs", getResources().getString(R.string.ruby));
        final Menu jquery = new Menu(R.drawable.jquery, "jQuery", getResources().getString(R.string.ruby));
        final Menu python = new Menu(R.drawable.python_icon, "Python", getResources().getString(R.string.ruby));
        final Menu c      = new Menu(R.drawable.c_original, "C", getResources().getString(R.string.ruby));
        final Menu javascript = new Menu(R.drawable.javascript, "Javascript", getResources().getString(R.string.ruby));
        final Menu css    = new Menu(R.drawable.css, "CSS", getResources().getString(R.string.ruby));

        data.add(php);
        data.add(ruby);
        data.add(java);
        data.add(swift);
        data.add(nodejs);
        data.add(jquery);
        data.add(python);
        data.add(c);
        data.add(javascript);
        data.add(css);

        ListAdapter adapter = new ListAdapter(this, R.layout.activity_list_item, data);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Menu menu   = data.get(i);
                Intent toTarget = new Intent(getApplicationContext(), ListDetailActivity.class);
//                toTarget.putExtra("nama",menu.namaBahasa);
                toTarget.putExtra("icon",menu.icon);
                toTarget.putExtra("desc",menu.desc);
                startActivity(toTarget);
            }
        });
    }
}
