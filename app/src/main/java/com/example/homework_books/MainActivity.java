package com.example.homework_books;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Book> books = new ArrayList<Book>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        loadData();
        initRV();

    }

    private void initRV() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        BooksAdapter adapter = new BooksAdapter(this.getLayoutInflater(),books);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        books.add(new Book("Не мешай себе жить","Марк Гоулстон","https://knizhnik.org/covers/page-36967-ne-meshaj-sebe-zhit.jpg","500 с"));
        books.add(new Book("Коралина","Нил Гейман","https://imo10.labirint.ru/books/438848/cover.jpg/242-0","400 с"));
        books.add(new Book("Дюна","Фрэнк Герберт","https://www.litres.ru/pub/c/cover/122116.jpg","900 с"));
        books.add(new Book("Тысяча сияющих солнц","Халед Хоссейни","https://bookhouse.kg/media/galleryphoto/2020/12/4ed05ca9-8e64-45c4-ad45-ce7377304483.jpg.600x780_q94.jpg","700 с"));
        books.add(new Book("И дольше века длится день","Чынгыз Айтматов","https://imo10.labirint.ru/books/648222/cover.jpg/363-0","450 с"));
        books.add(new Book("Ненасильственное общение","Маршалл Розенберг","https://www.litres.ru/pub/c/cover/39962476.jpg","500с"));
        books.add(new Book("Маленький принц","Антуан де Сент-Экзюпери","https://static.insales-cdn.com/r/H6fmzEaLaCE/rs:fit:1000:0:1/q:100/plain/images/products/1/2433/602458497/1.jpg@jpg","300 с"));
    }
}