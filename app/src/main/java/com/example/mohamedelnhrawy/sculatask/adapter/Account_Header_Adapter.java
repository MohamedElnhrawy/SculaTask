package com.example.mohamedelnhrawy.sculatask.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mohamedelnhrawy.sculatask.R;

import java.util.ArrayList;

/**
 * Created by mohamedelnhrawy on 7/26/18.
 */

public class Account_Header_Adapter extends RecyclerView.Adapter<Account_Header_Adapter.ViewHolder> {
        Context context;
        int num;


public Account_Header_Adapter(int num) {
        this.num = num;
        }

@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;

        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.account_header_item, parent, false);

        return new ViewHolder(v);
        }


@Override
public void onBindViewHolder(final ViewHolder holder, int position) {

        }

@Override
public int getItemCount() {
        return num;
        }

class ViewHolder extends RecyclerView.ViewHolder {
    ViewHolder(View v) {
        super(v);

    }
}

}