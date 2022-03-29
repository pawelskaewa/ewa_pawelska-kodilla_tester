package com.kodilla.mockito.homework;

public class LetsTryThisShit {
    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService();
        User anna = new User() {
            @Override
            public void receive(RegularNotification regularNotification) {

            }

            @Override
            public void receive(WeatherNotification weatherNotification) {

            }
        };
        User marta = new User() {
            @Override
            public void receive(RegularNotification regularNotification) {

            }

            @Override
            public void receive(WeatherNotification weatherNotification) {

            }
        };
        Localization warsaw = new Localization() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        Localization wroclaw = new Localization() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        weatherService.addSubscriber(marta, warsaw);
        weatherService.addSubscriber(marta, wroclaw);
        System.out.println(weatherService);
        System.out.println(weatherService.findLocalizations(marta));

    }


}
