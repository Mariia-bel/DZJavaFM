package ru.netology.domain;

public class Radio {
    private int numberStation;

    // методы для станций
    public void setNumberStation(int numberStation){
        if (numberStation > 9) {
            numberStation = 0;
        }
        if (numberStation < 0) {
            numberStation = 9;
        }

        this.numberStation = numberStation;
    }
    public int getNumberStation(){
        return numberStation;
    }
    public void nextStation(){
        int stationUp = numberStation + 1;
        setNumberStation(stationUp);
    }
    public void prevStation() {
        int stationPrev = numberStation - 1;
        setNumberStation(stationPrev);
    }

    private int volume;

    // Методы для громкости

    public void setVolume(int volume){
        if (volume > 10) {
            volume = 10;
        }
        if (volume <= 0) {
            return;
        }

        this.volume = volume;
    }
    public int getVolume(){
        return volume;

    }
    public void increaseVolume() {
        if (volume < 10) {
            int volumeUp = volume + 1;
            setVolume(volumeUp);
        }
    }

    public void deIncreaseVolume() {
        int volumeDown  = volume - 1;
        setVolume(volumeDown);
    }

}
