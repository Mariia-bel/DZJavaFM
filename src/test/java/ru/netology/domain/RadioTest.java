package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
            void shouldQuantityStation() {
        Radio radio = new Radio(20);
        radio.setQuantityStation(15);
        assertEquals(15, radio.getQuantityStation());
    }

    // Тесты на Станции

    @Test
    void shouldReplaceWithMaxStation() { //недопустимые значения
        radio.setNumberStation(-10);
        assertEquals(9, radio.getNumberStation());
    }

    @Test
    void shouldReplaceWithMinStation() {
        radio.setNumberStation(20);
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    void shouldRememberStation() { // запоминание станции
        radio.setNumberStation(6);
        assertEquals(6, radio.getNumberStation());
    }

    @Test
    void shouldChangeStationUp() { //Увеличение на 1
        radio.setNumberStation(0);
        radio.nextStation();
        assertEquals(1, radio.getNumberStation());
    }

    @Test
    void shouldChangeStationDown() { //Уменьшение на 1
        radio.setNumberStation(7);
        radio.prevStation();
        assertEquals(6, radio.getNumberStation());
    }

    @Test
    void shouldReplaceMoreThanNine() { // Больше 9
        radio.setNumberStation(10);
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    void shouldReplaceLessThanZero() { // Меньше 0
        radio.setNumberStation(-1);
        assertEquals(9, radio.getNumberStation());
    }

    // Тесты на громкость
    @Test
    void shouldRememberVolume() { // Запоминание громкости
        radio.setVolume(6);
        assertEquals(6, radio.getVolume());
    }

    @Test
    void shouldNothingMoreThanTheMaximum() { // Максимум +1
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldNothingMoreThanTheMaximum1() { // Больше максимума
        radio.setVolume(101);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldNothingLessThanTheMinimum() { // Минимум -1
        radio.setVolume(0);
        radio.deIncreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldVolumeUp() { // Увеличить на 1
        radio.setVolume(4);
        radio.increaseVolume();
        assertEquals(5, radio.getVolume());
    }

    @Test
    void shouldVolumeUDown() { // Уменьшить на 1
        radio.setVolume(7);
        radio.deIncreaseVolume();
        assertEquals(6, radio.getVolume());
    }
}

