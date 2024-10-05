package com.example.prac02;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.prac02.Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Employee> employeeList = new ArrayList<>();
    private TextView textViewEmployees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextId = findViewById(R.id.editTextId);
        final EditText editTextFullName = findViewById(R.id.editTextFullName);
        final EditText editTextBirthDate = findViewById(R.id.editTextBirthDate);
        final EditText editTextSalary = findViewById(R.id.editTextSalary);
        textViewEmployees = findViewById(R.id.textViewEmployees);
        Button buttonAdd = findViewById(R.id.buttonAdd);

        displayEmployees();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(editTextId.getText().toString());
                String fullName = editTextFullName.getText().toString();
                String birthDate = editTextBirthDate.getText().toString();
                double salary = Double.parseDouble(editTextSalary.getText().toString());

                Employee employee = new Employee(id, fullName, birthDate, salary);
                employeeList.add(employee);
                displayEmployees();

                // Xóa dữ liệu trong các EditText
                editTextId.setText("");
                editTextFullName.setText("");
                editTextBirthDate.setText("");
                editTextSalary.setText("");
            }
        });
    }

    private void displayEmployees() {
        if (employeeList.isEmpty()) {
            textViewEmployees.setText("Trống!"); // Hiển thị "Trống" khi danh sách rỗng
        } else {
            StringBuilder employeeInfo = new StringBuilder();
            for (Employee employee : employeeList) {
                employeeInfo.append(employee.toString()).append("\n");
            }
            textViewEmployees.setText(employeeInfo.toString());
        }
    }
}