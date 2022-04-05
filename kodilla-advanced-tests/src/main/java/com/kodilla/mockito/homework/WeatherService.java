package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {
    Set<User> serviceUsers = new HashSet<>();
    Map<String, Set<User>> localizationSubscription = new HashMap<>();

    public void addSubscriber(String localization, User user) {
        serviceUsers.add(user);
        Set<User> localizationSubscriptionsSet = localizationSubscription.getOrDefault(localization, new HashSet<>());
        localizationSubscriptionsSet.add(user);
        localizationSubscription.put(localization, localizationSubscriptionsSet);
    }

    public void sendNotificationToAll(Notification notification) {
        serviceUsers.forEach((user) -> user.receive(notification));
    }

    public void sendNotificationToLocalization(String localization, Notification notification) {
        localizationSubscription.getOrDefault(localization, new HashSet<>()).stream().forEach(person -> person.receive(notification));
    }

    public void removeSubscriber(User user) {
        serviceUsers.remove(user);
        localizationSubscription.values().forEach(people -> people.remove(user));
    }

    public void removeSubscriber(String localization, User user) {
        localizationSubscription.getOrDefault(localization, new HashSet<>()).remove(user);
    }

    public int getSize() {
        return serviceUsers.size();
    }

    public void removeLocalization(String localization) {
        localizationSubscription.remove(localization);
    }
}