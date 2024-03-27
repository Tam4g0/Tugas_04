public class Main {

    public static void main(String[] args) {

        LCD lcd = new LCD();
        lcd.turnOff();
        lcd.turnOn();
        lcd.Freeze(); //LCD status Freeze
        lcd.setVolume(50);  //LCD memiliki volume sebesar 50
        lcd.volumeUp(); //Volume dinaikkan 1
        lcd.volumeDown(); //Volume diturunkan 1
        lcd.setBrightness(39); //Kecerahan di set 39
        lcd.brightnessUp(); //Kecerahan dinaikkan 1
        lcd.brightnessDown(); //Kecerahan diturunkan 1
        lcd.setCable(2); //Kabel dipilih HDMI

        lcd.displayMessage(); //memanggil tampilan output

        System.out.println("--------------------------------------------------------");

        LCD lcd1 = new LCD();
        lcd1.turnOn(); //Status menyala
        lcd1.setVolume(90); //Volume di set 90
        lcd1.volumeDown(); //Volume turunkan 1
        lcd1.setBrightness(70); //Tingkat kecerahan di set 70
        lcd1.brightnessUp(); //Tingkat kecerahan dinaikkan 1
        lcd1.setCable(1); //Kabel dipilih DVI
        lcd1.displayMessage(); //memanggil tampilan output
    }
}



