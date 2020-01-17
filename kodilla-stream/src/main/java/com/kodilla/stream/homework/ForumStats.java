package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
       double avgNumberOfPostsUsersAbove40yo = UsersRepository.getUserList()
                .stream()
                .filter(a -> a.getAge() >= 40)
                .map(ForumStats::getNumberOfPosts)
                .mapToInt(a -> a)
                .average()
                .getAsDouble();
        System.out.println(avgNumberOfPostsUsersAbove40yo);

        double avgNumberOfPostsUsersUnder40yo = UsersRepository.getUserList()
                .stream()
                .filter(b -> b.getAge() <= 40)
                .map(ForumStats::getNumberOfPosts)
                .mapToInt(b -> b)
                .average()
                .getAsDouble();
        System.out.println(avgNumberOfPostsUsersUnder40yo);
    }

    public static int getNumberOfPosts(User user) {
        return user.getNumberOfPosts();
    }
}
