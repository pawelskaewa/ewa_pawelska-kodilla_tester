package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {
    private Map<User, List<Localization>> serviceUsers = new HashMap<>();

    public void addSubscriber(User user, Localization localization) {
        List<Localization> localizationList = serviceUsers.getOrDefault(user, new NoDuplicatesList<>());
        localizationList.add(localization);
        this.serviceUsers.put(user, localizationList);
    }

    public void sendNotificationToAll(RegularNotification regularNotification) {
        this.serviceUsers.forEach((user, localization) -> user.receive(regularNotification));
    }

    public void sendNotificationToLocalization(WeatherNotification weatherNotification) {
        this.serviceUsers.forEach((user, localization) -> user.receive(weatherNotification));
    }

    public void removeSubscriber(User user) {
        this.serviceUsers.remove(user);
    }

    public void removeSubscriber(User user, Localization localization) {
        this.serviceUsers.remove(user, localization);
    }

    public int getSize(){
        return serviceUsers.size();
    }

    public List<Localization> findLocalizations(User user) {
        return serviceUsers.getOrDefault(user, Collections.emptyList());
    }
    public void removeLocation (Localization localization) {
        this.serviceUsers.remove(localization);
    }
}