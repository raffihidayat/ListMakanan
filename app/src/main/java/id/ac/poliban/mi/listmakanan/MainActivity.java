package id.ac.poliban.mi.listmakanan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Food> countries = new ArrayList<>();
    private ListView lvFood;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFood = findViewById(R.id.listview);

        //ambil data dari CountryData dan berikan ke object countries
        countries.addAll(FoodData.getAllContries());

        //buat object adapter dan kirim data countries sebagai
        // parameter di konstruktor CountryAdapter()
        adapter = new FoodAdapter(countries);
        //pasang object adapter sebagai adapter lvCountry
        lvFood.setAdapter(adapter);

        //menambahkan kejadian ketika user mengklik salah satu item
        lvFood.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Negara yang Anda Pilih")
                    .setMessage("anda memilih: " +
                            countries.get(position).getCountryName())
                    .setPositiveButton("OK", null).show();
        });
    }
}
