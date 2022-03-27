package com.example.monan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MonAn> monAnList;
    static MonanAdapter monanAdapter;
    static RecyclerView recyclerView;
    static String url = "https://appnote-codernon.herokuapp.com/api/monan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        recyclerView = findViewById(R.id.list_monan);
        monAnList = new ArrayList<>();
        GetData();
    }

    private void GetData() {
        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        MonAn monAn = new MonAn();
                        monAn.setMonanId(object.getInt("monanId"));
                        monAn.setMonanname(object.getString("moanname").toString());
                        monAn.setAvt(object.getString("avt").toString());
                        monAn.setNguyenlieu(object.getString("nguyenlieu").toString());
                        monAn.setCongthuc(object.getString("congthuc").toString());
                        monAn.setTien(object.getString("tien").toString());

                        monAnList.add(monAn);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                monanAdapter = new MonanAdapter(getApplicationContext(), monAnList);
                recyclerView.setAdapter(monanAdapter);
                RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                recyclerView.addItemDecoration(itemDecoration);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (error instanceof NetworkError) {
                } else if (error instanceof ServerError) {
                } else if (error instanceof AuthFailureError) {
                } else if (error instanceof ParseError) {
                } else if (error instanceof NoConnectionError) {
                } else if (error instanceof TimeoutError) {
                    Toast.makeText(MainActivity.this, "Lỗi", Toast.LENGTH_LONG).show();
                }
            }
        });
        requestQueue.add(jsonArrayRequest);
    }
}