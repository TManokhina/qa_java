package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void eatMeat() throws Exception {
        feline.eatMeat();
        verify(feline, times(1)).getFood("Хищник");
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        feline.getKittens();
        verify(feline, times(1)).getKittens(1);
    }

    @Test
    public void testKittensCount() {
        assertEquals(feline.getKittens(1), feline.getKittens());
    }
}