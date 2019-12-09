package com.example.producer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    public static String[] edit_text_array = null;
    public static String send_text_value = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {

        super.onResume();

    }

    // метод определения переменной передаваемого текста
    public void setSendTextVal(String text) {
        send_text_value = text;
    }

    // получение значение переменной передаваемого текста
    public String getSendTextValue() {
        return send_text_value;
    }



    public void recordToLogField(String message_type, String message_text) {

        TextView app_check_broadcast = findViewById(R.id.app_check_broadcast);
        String old_log_value = app_check_broadcast.getText().toString();
        app_check_broadcast.setText(old_log_value + "\n" + message_type + ": " + message_text);

    }






    public void onClick(View view) {

        final String[] text_message = new String[1];

        switch(view.getId()){


            // нажимаем кнопку и пытаемся отправить другому приложению текст
            case R.id.send_text_btn:




                // сначала определим этот текст
                EditText edit_text = findViewById(R.id.edit_text_field);
                this.setSendTextVal(
                        edit_text.getText().toString()
                );

                // если в поле ввода что-то введено, то отправляем
                if(getSendTextValue().trim().length() != 0) {

                    // массив строк, разделенный по разделителю \n - перенос строки
                    edit_text_array = getSendTextValue().split("\n");

                    // циклом проходим по массиву и отправляем сообщения каждой строки
                    for (int i = 0; i < edit_text_array.length; i++) {

                        // если строка не пустая
                        if(edit_text_array[i].trim().length() !=0 ) {

                            // 1
                            // отправка широковещательного запроса с текстом и указанием, что это от продюсера
                            Intent intent = new Intent(
                                    "message_from_producer"
                            );
                            intent.putExtra(
                                    "message_from_producer_text",
                                    edit_text_array[i]
                            );
                            sendBroadcast(intent);
                            intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);




                        }







                        IntentFilter intentFilter = new IntentFilter("message_from_producer_text");
                        BroadcastReceiver mIntentReceiver = new BroadcastReceiver() {
                            @Override
                            public void onReceive(Context context, Intent intent) {
                                text_message[0] = intent.getStringExtra("message_from_producer_text");
                            }
                        };
                        registerReceiver(mIntentReceiver, intentFilter);

                        this.recordToLogField(
                                "message_from_producer",
                                text_message[0]);








                    }

                }



            break;



            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());


        }


    }

}
