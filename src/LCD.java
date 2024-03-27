public class LCD {
    //isi bagian ini
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    //buat method yang ada pada soal
    public LCD() { //Constructor LCD
        this.status = "none";
        this.volume = 0;
        this.brightness = 0;
        this.cable = "none";
    }

    public void turnOff() { //Status mati
        this.status = "off";
    }

    public void turnOn() { //Status menyala
        this.status = "on";
    }

    public void Freeze() {  //Status Freeze
        this.status = "freeze";
    }

    public void setVolume(int suara) { //Method untuk set volume
        if (0 <= suara && suara <= 100) {
            this.volume = suara;
        }
    }

    public void volumeUp() { //Method untuk menaikkan volume sebesar 1
        this.volume += 1;
        if (this.volume > 100) {
            this.volume = 100;
        }
    }
    public void volumeDown() { //Method untuk menurunkan volume sebesar 1
        this.volume -= 1;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    public void setBrightness(int kecerahan) { //Method untuk set kecerahan layar lcd
        if (0 <= brightness && brightness <= 100) {
            this.brightness = kecerahan;
        }
    }

    public void brightnessDown() { //Method untuk menurunkan tingkat kecerahan sebesar 1
        this.brightness -= 1;
        if (this.brightness < 0) {
            this.brightness = 0;
        }
    }
    public void brightnessUp() { //Method untuk menaikkan tingkat kecerahan sebesar 1
        this.brightness += 1;
        if (this.brightness > 100) {
            this.brightness = 100;
        }
    }

    public void setCable(int opsi) { //Method untuk menentukan kabel
        String[] cables = { "VGA", "DVI", "HDMI", "DisplayPort" };
        this.cable = cables[opsi];
    }
    public void displayMessage() { //Method untuk menampilkan output program
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Connected Cable: " + cable);
    }
}