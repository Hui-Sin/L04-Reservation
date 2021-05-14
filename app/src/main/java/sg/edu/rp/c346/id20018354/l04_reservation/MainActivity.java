package sg.edu.rp.c346.id20018354.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnResetDT;
    Button btnResetInput;
    EditText etName;
    EditText etMobileNum;
    EditText etGroupSize;
    CheckBox cbEnabled;
    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btnResetDT=findViewById(R.id.buttonResetDNT);
        btnResetInput=findViewById(R.id.buttonResetInput);
        etName=findViewById(R.id.editTextTextPersonName);
        etMobileNum=findViewById(R.id.editTextMobileNumber);
        etGroupSize=findViewById(R.id.editTextNumberGS);
        cbEnabled=findViewById(R.id.checkBoxArea);
        btnConfirm=findViewById(R.id.buttonConfirm);

        btnResetDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
                dp.updateDate(2020,5,1);

            }
        });
        btnResetInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText("");
                etMobileNum.setText("");
                etGroupSize.setText("");
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbEnabled.isChecked()){
                    Toast.makeText(MainActivity.this,""+etName+"\n"+etMobileNum+"\n"+etGroupSize+"\n"+
                            dp.getDayOfMonth()+"/"+dp.getMonth()+1+"/"+dp.getYear()+"\n"+
                            tp.getCurrentHour()+":"+tp.getCurrentMinute()+"\nSmoking area selected",Toast.LENGTH_LONG).show();


                }else {
                    Toast.makeText(MainActivity.this,""+etName+"\n"+etMobileNum+"\n"+etGroupSize+"\n"+
                        dp.getDayOfMonth()+"/"+dp.getMonth()+1+"/"+dp.getYear()+"\n"+
                        tp.getCurrentHour()+":"+tp.getCurrentMinute()+"\nSmoking area not selected",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}