package com.laioffer.tinnews;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import androidx.lifecycle.LiveData;

import com.laioffer.tinnews.model.Article;
import com.laioffer.tinnews.model.NewsResponse;
import com.laioffer.tinnews.repository.NewsRepository;
import com.laioffer.tinnews.ui.home.HomeViewModel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    public NewsRepository newsRepository;
    @Mock
    public Article article;

    private HomeViewModel homeViewModel;

    @Before
    public void setup() {
        homeViewModel = spy(new HomeViewModel(newsRepository));
    }


    @Test
    public void testGetTopHeadlines() {

        homeViewModel.setFavoriteArticleInput(article);

        verify(newsRepository, times(1)).favoriteArticle(any());
    }
}
