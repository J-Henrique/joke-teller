package com.example.builditbigger;

import android.support.test.espresso.ViewAssertion;
import android.support.test.rule.ActivityTestRule;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(JUnit4.class)
public class MainActivityInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityActivity = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void TestJokeIsNotEmpty(){
        onView(withId(R.id.btTellJoke)).perform(click());

        onView(withId(R.id.tv_joke)).check(matches(not(withText(""))));
    }
}
