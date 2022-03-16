package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        Double averagePostsForUsersAboveForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("The average of posts for users older than 40: " + averagePostsForUsersAboveForty);

        Double averagePostsForUsersBelowForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("The average of posts for users younger than 40: " + averagePostsForUsersBelowForty);
    }
}