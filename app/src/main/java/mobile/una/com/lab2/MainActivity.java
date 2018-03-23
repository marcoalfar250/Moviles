package mobile.una.com.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import mobile.una.com.lab2.model.Payment;

public class MainActivity extends AppCompatActivity {
    EditText card_number, name;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_number = (EditText)findViewById(R.id.card_number);
        name = (EditText)findViewById(R.id.name);
        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Payment payment = new Payment(card_number.getText().toString(), "", "", name.getText().toString(), "", "");
                payment.save();
            }
        });

        List<Payment> list = Payment.listAll(Payment.class);

        List<Payment> where = Payment.find(Payment.class, "name = ?", "David");

        Log.d("Query", list.toString());
    }
}
