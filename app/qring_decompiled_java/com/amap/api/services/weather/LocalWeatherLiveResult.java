package com.amap.api.services.weather;

/* loaded from: classes.dex */
public class LocalWeatherLiveResult {
    private com.amap.api.services.weather.WeatherSearchQuery a;
    private com.amap.api.services.weather.LocalWeatherLive b;

    public static com.amap.api.services.weather.LocalWeatherLiveResult createPagedResult(com.amap.api.services.weather.WeatherSearchQuery weatherSearchQuery, com.amap.api.services.weather.LocalWeatherLive localWeatherLive) {
        return new com.amap.api.services.weather.LocalWeatherLiveResult(weatherSearchQuery, localWeatherLive);
    }

    private LocalWeatherLiveResult(com.amap.api.services.weather.WeatherSearchQuery weatherSearchQuery, com.amap.api.services.weather.LocalWeatherLive localWeatherLive) {
        this.a = weatherSearchQuery;
        this.b = localWeatherLive;
    }

    public com.amap.api.services.weather.WeatherSearchQuery getWeatherLiveQuery() {
        return this.a;
    }

    public com.amap.api.services.weather.LocalWeatherLive getLiveResult() {
        return this.b;
    }
}
