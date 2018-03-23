package mobile.una.com.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mobile.una.com.lab2.model.Payment;

public class PaymentDetailActivity extends AppCompatActivity {

    Payment object;
    TextView card, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_detail);

        card = (TextView)findViewById(R.id.cardNumberDetail);
        name = (TextView)findViewById(R.id.nameDetail);

        Intent intent = getIntent();

        object = (Payment) intent.getSerializableExtra("paymentObject");

        card.setText(object.getCard_number());
        name.setText(object.getName());
    }
}
