package com.example.favlistapp;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.InputType;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = findViewById(R.id.category_recyclerView);// this RecyclerView is from content_Main
        mRecyclerView.setAdapter(new CategoryAdapter());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                addCategoriesAlertDialog();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void addCategoriesAlertDialog(){
        // this method will create an alert dialog that can take input from the user in the form of
        // text.  This text will be a new category.  There will also be dismission and submission buttons
        String alertTitle = getString(R.string.category_alert); // used in the assignment of a title to the alert dialog
        String positiveButtonTitle = getString(R.string.category_submit_button_title);// used in the assignment of a button label in the dialog

        AlertDialog.Builder malertDialogBuilder = new AlertDialog.Builder(this); // creates an instance of the AlertDialogBuilder
        EditText mEditText = new EditText(this); // creates an instance of the EditText

        mEditText.setInputType(InputType.TYPE_CLASS_TEXT); // sets the accepted input to the EditText
        malertDialogBuilder.setTitle(alertTitle);// sets the displayed title to the one created earlier
        malertDialogBuilder.setView(mEditText);// sets the displayed view to the EditText view created earlier
        malertDialogBuilder.setPositiveButton(positiveButtonTitle, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();// dismisses the dialog window whenever a user clicks the positive button
            }
            // setPositiveButton has two parameters; text, and, listener
            // text is the text we want displayed on this button, listener is a DialogInterface onClickListener
            // because this is a user interface
        });
        malertDialogBuilder.show();// required statement for the user to see this alert
    }
}