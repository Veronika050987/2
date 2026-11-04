package com.com.contactlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Contact> contacts = new ArrayList<>();
        int defaultAvatar = R.mipmap.ic_launcher_round;

        contacts.add(new Contact("Иван Иванов", "+7 (900) 123-45-67",
                defaultAvatar));
        contacts.add(new Contact("Пётр Петров", "+7 (900) 987-65-43",
                defaultAvatar));
        contacts.add(new Contact("Анна Сидорова", "+7 (900) 555-44-33",
                defaultAvatar));
        contacts.add(new Contact("Мария Кузнецова", "+7 (900) 222-11-00",
                defaultAvatar));
        contacts.add(new Contact("Алексей Смирнов", "+7 (900) 777-88-99",
                defaultAvatar));

        ContactAdapter adapter = new ContactAdapter(contacts, contact -> {
            String message = "Контакт: " + contact.getName() + "\nТел: "
                    + contact.getPhone();
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        });

        recyclerView.setAdapter(adapter);
    }
}