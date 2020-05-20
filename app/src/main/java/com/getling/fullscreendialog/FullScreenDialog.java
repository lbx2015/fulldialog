package com.getling.fullscreendialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class FullScreenDialog extends Dialog {
    public FullScreenDialog(Context context) {
        super(context, R.style.MyDialogStyle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View contentView = LayoutInflater.from(getContext()).inflate(R.layout.dialog_content, null);
        contentView.findViewById(R.id.tv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        setContentView(contentView);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);

    }
}
