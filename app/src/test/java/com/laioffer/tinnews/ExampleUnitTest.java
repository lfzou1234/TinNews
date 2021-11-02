package com.laioffer.tinnews;

import org.junit.Test;

import static org.junit.Assert.*;

import com.laioffer.tinnews.repository.NewsRepository;
import com.laioffer.tinnews.ui.home.HomeViewModel;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testHomeViewModelSortFails() {
        HomeViewModel homeViewModel = new HomeViewModel(new NewsRepository());
        int[] inputArray = new int[]{5, 1, 4, 6,2,3};
        int[] expectedArray = new int[]{1,2,4,3,6,5};
        assertNotEquals(expectedArray, homeViewModel.mergeSort(inputArray));
    }

    @Test
    public void testHomeViewModelSort() {
        HomeViewModel homeViewModel = new HomeViewModel(new NewsRepository());
        int[] inputArray = new int[]{5, 1, 4, 6,2,3};
        int[] expectedArray = new int[]{1,2,3,4,5,6};
        assertNotEquals(expectedArray, homeViewModel.mergeSort(inputArray));
    }
}