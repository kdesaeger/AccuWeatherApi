# AccuWeatherApi
Java client for AccuWeather API

* Create a session: provide your API key that you got after signing up with AccuWeather

```
ApiSession session = new ApiSession.Builder(key).build();
```

* Get the API object that you want to use, e.g. Locations API

```
LocationApi locationApi = session.getLocationApi();
```

* Use the API to call some AccuWeather Rest endpoints. All other API endpoints need a AccuWeather Location Key to work with. This key can be retrieved using the Location API.
In this example, we are calling the Location API to geocode some coordinates and then printing the returned Location Key

```
Optional<GeoPositionSearchResult> geoLocation = locationApi.geoPosition(31.906974,-95.592551);
if (geoLocation.isPresent()) {
   System.out.println("The location key for the coordinates is: " + geoLocation.get().getKey());
}
```

* Once you have a Location Key, you can call other API endpoints, passing in the Location Key. For example to get the current weather conditions for a location, use the Current Conditions API like this:

```
.... (fetch a Location Key) ....

CurrentConditionsApi ccApi = session.getCurrentConditionsApi(<locationKey>);
Optional<CurrentConditions> cc = ccApi.get();
if (cc.isPresent()) {
   System.out.println("Current temperature is: " + cc.get().getTemperature().getMetric().getValue());
}
```
