package it.edoardo.testlayoutprovarest.config;

import it.edoardo.testlayoutprovarest.repository.CountryRepository;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {
    private static final String BASE_URL="https://restcountries.com/v3.1/";

    public static CountryRepository getCountryRepository(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(CountryRepository.class);
    }
}
