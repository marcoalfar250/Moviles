package mobile.una.com.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import mobile.una.com.lab2.model.Payment;

public class PaymentListActivity extends AppCompatActivity {

    ListView paymentList;
    ArrayAdapter<String> adapter;

    String[] data;
    List<Payment> payments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_list);

        payments = Payment.listAll(Payment.class);

        data = this.convertPaymentObjectToString(payments);

        paymentList = (ListView)findViewById(R.id.paymentsListView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        paymentList.setAdapter(adapter);

        paymentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), PaymentDetailActivity.class);
                intent.putExtra("paymentObject", payments.get(i));
                startActivity(intent);
            }
        });
    }

    private String[] convertPaymentObjectToString(List<Payment> payments) {
        String[] result = new String[payments.size()];

        for (int index = 0; index< payments.size(); index++) {
            Payment object = payments.get(index);
            result[index] = object.getCard_number();
        }

        return  result;
    }
}
