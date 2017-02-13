package com.dakhakhny.quranapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.pdfView)
    PDFView pdfView;
    String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //android.resource://[package]/[resource_id]
        //android.resource://[package]/[res type]/[res name]

        pdfView.fromAsset("arabi_quran.pdf")
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)

                .enableAnnotationRendering(false)
                .password(null)
                .scrollHandle(null)
                .load();

    }
}
