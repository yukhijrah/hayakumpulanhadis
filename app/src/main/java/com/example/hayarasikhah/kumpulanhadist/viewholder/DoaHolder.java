package com.example.hayarasikhah.kumpulanhadist.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.hayarasikhah.kumpulanhadist.R;

/**
 * Created by Haya Rasikhah on 10/8/2018.
 */

public class DoaHolder extends RecyclerView.ViewHolder{

    public TextView txtNamaDoa;
    public TextView txtArtiDoa;


    public DoaHolder(View itemView) {
        super(itemView);
        txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_nama_doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);

    }


}
