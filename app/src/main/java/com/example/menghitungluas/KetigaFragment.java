package com.example.menghitungluas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class KetigaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_jari_jari;
    private TextView hasil, hasil2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ketiga, container, false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_jari_jari = v.findViewById(R.id.txt_jari_jari);
        hasil = v.findViewById(R.id.hasil);
        hasil2 = v.findViewById(R.id.hasil2);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = txt_jari_jari.getText().toString();
                if(nilai.isEmpty()){
                    txt_jari_jari.setError("Data tidak boleh kosong");
                    txt_jari_jari.requestFocus();
                } else {
                    Double jari = Double.parseDouble(nilai);
                    Double luas = 3.14 * (jari * jari);
                    Double keliling = 2 * 3.14 * jari;

                    hasil.setText(String.format("%.2f",luas));
                    hasil2.setText(String.format("%.2f", keliling));
                }
            }
        });




        return v;
    }
}