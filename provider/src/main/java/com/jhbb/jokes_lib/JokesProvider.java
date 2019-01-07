package com.jhbb.jokes_lib;

import java.util.Random;

public class JokesProvider {

    public static String[] jokes = {
            "What's the difference between a guitar and a fish? You can't tuna fish.",
            "Why did the chewing gum cross the road? He was stuck to the chicken's foot.",
            "What do you get when you cross a dog with an elephant? A very nervous postman.",
            "Why do farmers put bells on cows? Their horns don't work.",
            "Why did the chicken cross the basketball court? He heard the ref was blowing fowls."
    };

    public static String getRandomJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }
}
