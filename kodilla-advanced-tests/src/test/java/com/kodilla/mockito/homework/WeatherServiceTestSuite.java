//package com.kodilla.mockito.homework;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//class WeatherServiceTestSuite {
//
//    WeatherService weatherService = new WeatherService();
//    User anna = Mockito.mock(User.class);
//    User marta = Mockito.mock(User.class);
//    WeatherNotification weatherNotificationWarsaw = Mockito.mock(WeatherNotification.class);
//    WeatherNotification weatherNotificationWroclaw = Mockito.mock(WeatherNotification.class);
//    RegularNotification regularNotification = Mockito.mock(RegularNotification.class);
//    Localization warsaw = Mockito.mock(Localization.class);
//    Localization wroclaw = Mockito.mock(Localization.class);
//    Localization gdansk = Mockito.mock(Localization.class);
//
//    @Test
//    public void notSubscribedClientShouldNotReceiveRegularNotification() {
//        weatherService.sendNotificationToAll(regularNotification);
//        Mockito.verify(anna, Mockito.never()).receive(regularNotification);
//    }
//
//    @Test
//    public void testIfPersonWasSubscribedToWeatherService() {
//        weatherService.addSubscriber(marta, warsaw);
//        Assertions.assertEquals(1, weatherService.getSize());
//    }
//
//    @Test
//    public void testIfPersonWasSubscribedToMultipleLocations() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, wroclaw);
//        Assertions.assertEquals(2, weatherService.findLocalizations(marta).size());
//    }
//
//    @Test
//    public void PersonShouldNotBeSignedUpTwoTimesToOneLocation() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, wroclaw);
//        Assertions.assertEquals(2, weatherService.findLocalizations(marta).size());
//
//    }
//
//    @Test
//    public void testIfPersonWasNotified() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.sendNotificationToAll(regularNotification);
//        Mockito.verify(marta, Mockito.times(1)).receive(regularNotification);
//    }
//
//    @Test
//    public void testIfNotificationsFromMultipleLocationsWereReceived() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, wroclaw);
//        weatherService.sendNotificationToLocalization(warsaw);
//        weatherService.sendNotificationToLocalization(wroclaw);
//        Mockito.verify(marta, Mockito.times(1)).receive(weatherNotificationWarsaw);
//        Mockito.verify(marta, Mockito.times(1)).receive(weatherNotificationWroclaw);
//    }
//
//    @Test
//    public void shouldSubscriptionBeRemovedFromOnceLocalization() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, wroclaw);
//        weatherService.removeSubscriber(marta, wroclaw);
//        weatherService.sendNotificationToLocalization(wroclaw);
//        Mockito.verify(marta, Mockito.times(1)).receive(weatherNotificationWroclaw);
//    }
//
//    @Test
//    public void shouldSubscriptionBeRemovedFromAllLocalizations() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, wroclaw);
//        weatherService.removeSubscriber(marta);
//        weatherService.sendNotificationToLocalization(warsaw);
//        Mockito.verify(marta, Mockito.never()).receive(weatherNotificationWarsaw);
//    }
//
//    @Test
//    public void subscriberFromOneLocalizationShouldNotReceiveNotificationFromOtherLocalization() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.sendNotificationToLocalization(wroclaw);
//        Mockito.verify(marta, Mockito.never()).receive(weatherNotificationWroclaw);
//    }
//
//    @Test
//    public void testIfAllSubscribersReceivedNotification() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, wroclaw);
//        weatherService.addSubscriber(anna, warsaw);
//        weatherService.addSubscriber(anna, wroclaw);
//        weatherService.sendNotificationToAll(regularNotification);
//        Mockito.verify(marta, Mockito.times(1)).receive(regularNotification);
//        Mockito.verify(anna, Mockito.times(1)).receive(regularNotification);
//    }
//
//    @Test
//    public void localizationShouldBeRemoved() {
//        weatherService.addSubscriber(marta, warsaw);
//        weatherService.addSubscriber(marta, wroclaw);
//        weatherService.addSubscriber(marta, gdansk);
//        weatherService.removeLocation(warsaw);
//        weatherService.sendNotificationToLocalization(warsaw);
//        Mockito.verify(marta, Mockito.times(2)).receive(weatherNotificationWarsaw);
//    }
//}