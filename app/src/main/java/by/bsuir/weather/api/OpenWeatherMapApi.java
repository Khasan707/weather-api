package by.bsuir.weather.api;

import by.bsuir.weather.pojo.weather.CurrentWeather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherMapApi {

    String BASE_URL = "http://api.openweathermap.org";
    String API_KEY = "2dc160166b867fa5e18af75b6b0cbe39";

    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByCityId(@Query("q") String cityName,
                                                   @Query("APPID") String apiKey,
                                                   @Query("units") String units);

}
