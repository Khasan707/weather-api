package by.bsuir.weather;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import by.bsuir.weather.pojo.Weather;

public class WeatherViewModel extends ViewModel {

    private MutableLiveData<Weather> weatherData = new MutableLiveData<>();

    public MutableLiveData<Weather> getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(Weather weatherDto) {
        this.weatherData.setValue(weatherDto);
    }

}
