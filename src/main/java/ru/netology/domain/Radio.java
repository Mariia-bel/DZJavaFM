package ru.netology.domain;

public class Radio {
    private int minStation;
    private int maxStation = 9;
    private int minVolume;
    private int maxVolume = 100;
    private int numberStation;
    private int volume;

    public Radio() {
    }

    public Radio(int quantityStation)
    {
        this.maxStation = quantityStation;
    }


    // методы для станций
    public void setNumberStation(int numberStation) {
        if (numberStation > maxStation) {
            return;
        }
        if (numberStation < minStation) {
            numberStation = maxStation;
        }

        this.numberStation = numberStation;
    }

    public int getNumberStation()
    {
        return numberStation;
    }

    public void nextStation() {
        int stationUp = numberStation + 1;
        setNumberStation(stationUp);
    }

    public void prevStation() {
        int stationPrev = numberStation - 1;
        setNumberStation(stationPrev);
    }


    // Методы для громкости

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            volume = maxVolume;
        }
        if (volume <= minVolume) {
            return;
        }

        this.volume = volume;
    }

    public int getVolume() {
        return volume;

    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            int volumeUp = volume + 1;
            setVolume(volumeUp);
        }
    }

    public void deIncreaseVolume() {
        int volumeDown = volume - 1;
        setVolume(volumeDown);
    }

}
