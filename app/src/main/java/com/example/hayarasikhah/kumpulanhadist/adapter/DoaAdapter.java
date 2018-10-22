package com.example.hayarasikhah.kumpulanhadist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.hayarasikhah.kumpulanhadist.R;
import com.example.hayarasikhah.kumpulanhadist.model.Doa;
import com.example.hayarasikhah.kumpulanhadist.viewholder.DoaHolder;

import java.util.List;

/**
 * Created by Haya Rasikhah on 10/8/2018.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas;

    public DoaAdapter(List<Doa> doas){
        this.doas = doas;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa,parent, false));
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, int position) {
        holder.txtNamaDoa.setText(doas.get(position).getNama());
        holder.txtArtiDoa.setText(doas.get(position).getArti());
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}
