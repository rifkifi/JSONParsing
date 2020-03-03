package com.dasar.jsonparsing;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import androidx.appcompat.app.AppCompatActivity;

public class JSONActivity1 extends AppCompatActivity {
    String JSON_STRING = "{\"employee\":{\"name\":\"Abhishek Saini\",\"salary\":65000}}";
    String name, salary;
    TextView employeeName, employeeSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json1);
        // get the reference of TextView's
        employeeName = (TextView) findViewById(R.id.name);
        employeeSalary = (TextView) findViewById(R.id.salary);

        try {
            // get JSONObject from JSON file
            JSONObject obj = new JSONObject(JSON_STRING);
            // fetch JSONObject named employee
            JSONObject employee = obj.getJSONObject("employee");
            // get employee name and salary
            name = employee.getString("name");
            salary = employee.getString("salary");
            // set employee name and salary in TextView's
            employeeName.setText("Name: "+name);
            employeeSalary.setText("Salary: "+salary);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
