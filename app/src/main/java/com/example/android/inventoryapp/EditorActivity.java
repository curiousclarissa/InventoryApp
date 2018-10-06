package com.example.android.inventoryapp;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;


import com.example.android.inventoryapp.data.ProductContract.ProductEntry;
import com.example.android.inventoryapp.data.ProductDbHelper;

/**
 * Allows user to create a new pet or edit an existing one.
 */
public class EditorActivity extends AppCompatActivity {

    /** EditText field to enter the products's name */
    private EditText localNameEditText;

    /** EditText field to enter the products's price */
    private EditText localPriceEditText;

    /** EditText field to enter the product's quantity */
    private EditText localQuantityEditText;

    /** EditText field to enter the products's supplier */
    private EditText localSupplierNameEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        // Find all relevant views that we will need to read user input from
        localNameEditText = (EditText) findViewById(R.id.edit_pet_name);
        localPriceEditText = (EditText) findViewById(R.id.edit_pet_breed);
        localQuantityEditText = (EditText) findViewById(R.id.edit_pet_weight);
        localSupplierNameEditText = (EditText) findViewById(R.id.edit_gender);

    }

    //reference lines 114 and 181 in pets app to understand adding the insert pet method

}
