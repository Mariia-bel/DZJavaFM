package ru.netology.domain;

public class Radio {
    private int numberStation;
    private int volume;
    private int maxStation = 9;
    private int maxVolume = 100;


    public Radio() {

    }

    public Radio(int quantityStation)
    {
        maxStation = quantityStation -1;
    }


    // методы для станций
    public void setNumberStation(int numberStation) {
        if (numberStation > maxStation) {
            return;
        }
        if (numberStation < 0) {
            return;
        }

        this.numberStation = numberStation;
    }

    public int getNumberStation()
    {
        return numberStation;
    }

    public void nextStation() {
       if (numberStation < maxStation){
           numberStation++;}
       else {
           numberStation = 0;
       }
    }

    public void prevStation() {
       if (numberStation > 0){
           numberStation--;
       }
       else { numberStation = maxStation;}
    }


    // Методы для громкости

    public void setVolume(int volume) {
        if (volume > maxVolume) {
           volume = maxVolume;
        }
        if (volume <= 0) {
            return;
        }

        this.volume = volume;
    }

    public int getVolume() {
        return volume;

    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0){
            volume--;
        }
    }

}
