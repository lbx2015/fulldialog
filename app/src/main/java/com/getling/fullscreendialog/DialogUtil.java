package com.getling.fullscreendialog;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;

public class DialogUtil {
    public static void showDialog(Context context) {
//        Dialog dialog = new Dialog(context);
        Dialog dialog = new Dialog(context, R.style.MyDialogStyle);

        Window window = dialog.getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT;
        window.setAttributes(layoutParams);

        dialog.setContentView(R.layout.dialog_content);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        dialog.setTitle("this is the title");

        dialog.show();
    }
}
