package it.edoardo.testlayoutprovarest;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.List;

import it.edoardo.testlayoutprovarest.config.RetroFitClient;
import it.edoardo.testlayoutprovarest.repository.model.Country;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView nomePaeseOfficial= findViewById(R.id.titolo);
        TextView nomePaeseCommon=findViewById(R.id.sottotitolo);
        TextView corpoPaese=findViewById(R.id.body);
        Button bottoneCerca=findViewById(R.id.bottoneCercaPaese);
        EditText barraCercaPaese=findViewById(R.id.cerca);
        CardView cardView=findViewById(R.id.cardviewpaese);
        bottoneCerca.setOnClickListener(click -> {
            String paeseDaCercare=barraCercaPaese.getText().toString();
            Call<List<Country>> call=RetroFitClient.getCountryRepository().getCountryInfo(paeseDaCercare);
            call.enqueue(new Callback<List<Country>>() {
                @Override
                public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                    if (response.isSuccessful()){
                        Country paese=response.body().get(0);
                        nomePaeseOfficial.setText(paese.getName().getCommon().toString());
                        nomePaeseCommon.setText(paese.getCapital().toString());
                        corpoPaese.setText("POPOLAZIONE : "+paese.getPopulation()+" "+"\n"+"CONTINENTE :"+paese.getSubregion().toString()
                        +"\n"+"MONETA"+paese.getCurrencies().toString());
                    }
                }

                @Override
                public void onFailure(Call<List<Country>> call, Throwable t) {
                    nomePaeseOfficial.setText("Errore: " + t.getMessage());
                }
            });
        });

    }
}