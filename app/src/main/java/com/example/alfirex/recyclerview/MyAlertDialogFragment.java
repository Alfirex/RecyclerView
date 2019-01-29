package com.example.alfirex.recyclerview;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class MyAlertDialogFragment extends AppCompatDialogFragment  {

    /**
     * Obtenemos parametros para modificar los campos
     * @param title
     * @param msg
     * @return
     */
    public static MyAlertDialogFragment newInstance(String title, String msg) {
        MyAlertDialogFragment frag = new MyAlertDialogFragment();
        Bundle args = new Bundle();
        args.putString("titulo", title);
        args.putString("mensaje", msg);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Obtenemos la informacion del Bundle del newIntance:
        String title = getArguments().getString("titulo");
        String mensaje = getArguments().getString("mensaje");

        return new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(mensaje)
                .setPositiveButton("SI",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                            }
                        }
                )
                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                            }
                        }
                )
                .create();
    }
}
