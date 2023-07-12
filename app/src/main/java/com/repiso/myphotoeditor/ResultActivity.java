package com.repiso.myphotoeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.repiso.myphotoeditor.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if(getIntent()!=null){
            binding.image.setImageURI(getIntent().getData());
        }



    }
}