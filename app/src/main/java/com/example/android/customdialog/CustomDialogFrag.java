package com.example.android.customdialog;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomDialogFrag extends DialogFragment {

    Dialog d;
    public CustomDialogFrag() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
        ab.setTitle("Report Us");
        //body and button are designed in xml ,now load xml
        View v = getActivity().getLayoutInflater().inflate(R.layout.fragment_custom_dialog,null);
        //initialize all variables of ur xml file
        final EditText et1 = (EditText) v.findViewById(R.id.edittext1);
        final EditText et2 = (EditText) v.findViewById(R.id.edittext2);
        final EditText et3 = (EditText) v.findViewById(R.id.edittext3);
        Button b1 = (Button) v.findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et1.getText().toString();
                String issue = et2.getText().toString();
                String description = et3.getText().toString();
                Toast.makeText(getActivity(), "email:" +email, Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "issue:" +issue, Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "description:" +description, Toast.LENGTH_SHORT).show();
                d.dismiss();
            }
        });
        ab.setView(v);
        d = ab.create();

        return d;
    }
}
