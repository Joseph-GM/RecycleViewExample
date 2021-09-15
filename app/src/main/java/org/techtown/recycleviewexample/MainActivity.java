package org.techtown.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Joseph Kim", "joseph.kim@gm.com","https://butterpopcorn.kr/wp-content/uploads/2020/08/%EC%A0%9C%EB%AA%A9-%EC%97%86%EC%9D%8C-1-16.jpg"));
        contacts.add(new Contact("Changsun Lee", "changsun.lee@gm.com","https://upload.wikimedia.org/wikipedia/commons/c/ca/Denzel_Washington_cropped.jpg"));
        contacts.add(new Contact("Juhyung Sun", "juhyung.sun@gm.com","http://www.futurekorea.co.kr/news/photo/201506/27911_18694_123.JPG"));
        contacts.add(new Contact("Changhwan Lee", "changhwan.lee@gm.com","https://file.mk.co.kr/meet/neds/2021/07/image_readtop_2021_704239_16269130774725174.jpg"));
        contacts.add(new Contact("Byungjong Yu", "byungjong.yu@gm.com","http://pds.joins.com/news/component/htmlphoto_mmdata/201604/21/htm_20160421164314998976.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}