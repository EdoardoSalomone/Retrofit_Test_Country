package it.edoardo.testlayoutprovarest.repository;

import java.util.List;

import it.edoardo.testlayoutprovarest.repository.model.Country;
import lombok.Getter;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CountryRepository {
    @GET("name/{country}")
    Call<List<Country>> getCountryInfo(@Path("country")String countryName);
}
