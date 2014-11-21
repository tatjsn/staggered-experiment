package com.example.tat.gridapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    static class Holder extends RecyclerView.ViewHolder {
        public Holder(View itemView) {
            super(itemView);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new StaggeredGridLayoutManager(
                2, StaggeredGridLayoutManager.VERTICAL));
        list.setAdapter(new RecyclerView.Adapter<Holder>() {
            @Override
            public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
                LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
                View v = inflater.inflate(R.layout.layout_text, viewGroup, false);
                return new Holder(v);
            }

            @Override
            public void onBindViewHolder(Holder viewHolder, int i) {
                if (i == 0 || i == 1) {
                    StaggeredGridLayoutManager.LayoutParams lp =
                            (StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams();
                    lp.setFullSpan(true);
                }
            }

            @Override
            public int getItemCount() {
                return 10;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
