package com.improve10x.zomatoscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Screen1Activity extends AppCompatActivity {
    RecyclerView screen1Rv;
    ScreenItems[] food;
    Screen1Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        initViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        screen1Rv.setAdapter(adapter);
        screen1Rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpAdapter() {
        adapter = new Screen1Adapter(food);
    }

    private void createData() {
        food = new ScreenItems[3];
        ScreenItems food1 = new ScreenItems();
        food1.foodUrl = "https://media.istockphoto.com/id/923387432/photo/hyderabadi-chicken-biryani-with-cucumber-raita-on-rustic-table.jpg?s=612x612&w=0&k=20&c=GBAu6tRdbmpwo2Vr1Q8jcuuIdXzIeUYZacBUiom0wbI=";
        food1.promoted = "Promoted";
        food1.offerPercentage = "60% OFF";
        food1.rupeeOffer = "Up to 120";
        food1.deliveryTime = "35 mins";
        food1.foodName = "Itminaan Biryani - Dum Pukh";
        food1.subFoodName = "Biryani, Desserts";
        food1.rating = "4.1 ☆";
        food1.rupeesForMe = "250 for one";
        food[0] = food1;

        ScreenItems food2 = new ScreenItems();
        food2.foodUrl = "https://www.thespruceeats.com/thmb/1ASSnPUMf1ZqROSByxvDpWi07Bg=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/chicken-tikka-recipe-1957388-Final-5bb021874cedfd0026da89fd.jpg";
        food2.promoted = "";
        food2.offerPercentage = "75 OFF";
        food2.rupeeOffer = "up to 20";
        food2.deliveryTime = "43 mins";
        food2.foodName = "Prem Dhaba";
        food2.subFoodName = "North Indian, Mughlai";
        food2.rating = "4.1 ☆";
        food2.rupeesForMe = "150 for one";
        food[1] = food2;

        ScreenItems food3 = new ScreenItems();
        food3.foodUrl = "https://maunikagowardhan.co.uk/wp-content/uploads/2012/08/Tandoori-Chicken1-1024x683.jpg";
        food3.promoted = "Promoted";
        food3.offerPercentage = "70% OFF";
        food3.rupeeOffer = "Up to 99";
        food3.deliveryTime = "7 mins";
        food3.foodName = "Hyderabadi biryani";
        food3.subFoodName = "alt, turmeric, chili powder, biryani or garam masala powder, cardamom powder, green chilli, ginger garlic paste";
        food3.rating = "4.8 ☆";
        food3.rupeesForMe = "99 for me";
        food[2] = food3;




    }

    private void initViews() {
        screen1Rv = findViewById(R.id.screen1_rv);
    }
}
