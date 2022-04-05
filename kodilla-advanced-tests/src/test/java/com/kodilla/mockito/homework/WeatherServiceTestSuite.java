package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    User anna = Mockito.mock(User.class);
    User marta = Mockito.mock(User.class);
    Notification notificationWarsaw = Mockito.mock(Notification.class);
    Notification notificationWroclaw = Mockito.mock(Notification.class);
    Notification regularNotification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveRegularNotification() {
        weatherService.sendNotificationToAll(regularNotification);
        Mockito.verify(anna, Mockito.never()).receive(regularNotification);
    }

    @Test
    public void testIfPersonWasSubscribedToWeatherService() {
        weatherService.addSubscriber("Warsaw", anna);
        Assertions.assertEquals(1, weatherService.getSize());
    }

    @Test
    public void testIfPersonWasSubscribedToMultipleLocations() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Wroclaw", marta);
        Assertions.assertEquals(2, weatherService.localizationSubscription.size());
    }

    @Test
    public void PersonShouldNotBeSignedUpTwoTimesToOneLocation() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Wroclaw", marta);
        Assertions.assertEquals(2, weatherService.localizationSubscription.size());

    }

    @Test
    public void testIfPersonWasNotified() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.sendNotificationToAll(regularNotification);
        Mockito.verify(marta, Mockito.times(1)).receive(regularNotification);
    }

    @Test
    public void testIfNotificationsFromMultipleLocationsWereReceived() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Wroclaw", marta);
        weatherService.sendNotificationToLocalization("Warsaw", notificationWarsaw);
        weatherService.sendNotificationToLocalization("Wroclaw", notificationWroclaw);
        Mockito.verify(marta, Mockito.times(1)).receive(notificationWarsaw);
        Mockito.verify(marta, Mockito.times(1)).receive(notificationWroclaw);
    }

    @Test
    public void shouldSubscriptionBeRemovedFromOneLocalization() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Wroclaw", marta);
        weatherService.removeSubscriber("Wroclaw", marta);
        weatherService.sendNotificationToLocalization("Wroclaw", notificationWroclaw);
        weatherService.sendNotificationToLocalization("Warsaw", notificationWarsaw);
        Mockito.verify(marta, Mockito.times(0)).receive(notificationWroclaw);
        Mockito.verify(marta, Mockito.times(1)).receive(notificationWarsaw);
    }

    @Test
    public void shouldSubscriptionBeRemovedFromAllLocalizations() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Wroclaw", marta);
        weatherService.removeSubscriber(marta);
        weatherService.sendNotificationToLocalization("Warsaw", notificationWarsaw);
        Mockito.verify(marta, Mockito.never()).receive(notificationWarsaw);
    }

    @Test
    public void subscriberFromOneLocalizationShouldNotReceiveNotificationFromOtherLocalization() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.sendNotificationToLocalization("wroclaw", notificationWroclaw);
        Mockito.verify(marta, Mockito.never()).receive(notificationWroclaw);
    }

    @Test
    public void testIfAllSubscribersReceivedNotification() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Wroclaw", marta);
        weatherService.addSubscriber("Warsaw", anna);
        weatherService.addSubscriber("Wroclaw", anna);
        weatherService.sendNotificationToAll(regularNotification);
        Mockito.verify(marta, Mockito.times(1)).receive(regularNotification);
        Mockito.verify(anna, Mockito.times(1)).receive(regularNotification);
    }

    @Test
    public void localizationShouldBeRemoved() {
        weatherService.addSubscriber("Warsaw", marta);
        weatherService.addSubscriber("Wroclaw", marta);
        weatherService.removeLocalization("Warsaw");
        weatherService.sendNotificationToLocalization("Warsaw", notificationWarsaw);
        Mockito.verify(marta, Mockito.never()).receive(notificationWarsaw);
    }
}