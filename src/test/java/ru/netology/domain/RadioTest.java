package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    // Тесты на Станции
    @Test
    void shouldReplaceWithNine() { //недопустимые значения
        Radio radio = new Radio();
        radio.setNumberStation(-10);
        assertEquals(9, radio.getNumberStation());
    }

    @Test
    void shouldReplaceWithZero() {
        Radio radio = new Radio();
        radio.setNumberStation(20);
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    void shouldRememberStation() { // запоминание станции
        Radio radio = new Radio();
        radio.setNumberStation(6);
        assertEquals(6, radio.getNumberStation());
    }

    @Test
    void shouldChangeStationUp() { //Увеличение на 1
        Radio radio = new Radio();
        radio.setNumberStation(0);
        radio.nextStation();
        assertEquals(1, radio.getNumberStation());
    }

    @Test
    void shouldChangeStationDown() { //Уменьшение на 1
        Radio radio = new Radio();
        radio.setNumberStation(7);
        radio.prevStation();
        assertEquals(6, radio.getNumberStation());
    }

    @Test
    void shouldReplaceMoreThanNine() { // Больше 9
        Radio radio = new Radio();
        radio.setNumberStation(10);
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    void shouldReplaceLessThanZero() { // Меньше 0
        Radio radio = new Radio();
        radio.setNumberStation(-1);
        assertEquals(9, radio.getNumberStation());
    }

    // Тесты на громкость
    @Test
    void shouldRememberVolume() { // Запоминание громкости
        Radio radio = new Radio();
        radio.setVolume(6);
        assertEquals(6, radio.getVolume());
    }

    @Test
    void shouldNothingMoreThanTheMaximum() { // Максимум +1
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }
    @Test
    void shouldNothingMoreThanTheMaximum1() { // Больше максимума
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldNothingLessThanTheMinimum() { // Минимум -1
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.deIncreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldVolumeUp() { // Увеличить на 1
        Radio radio = new Radio();
        radio.setVolume(4);
        radio.increaseVolume();
        assertEquals(5,radio.getVolume());
    }

    @Test
    void shouldVolumeUDown() { // Уменьшить на 1
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.deIncreaseVolume();
        assertEquals(6,radio.getVolume());
    }
}

