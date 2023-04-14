package HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class noteBooks {
    private String manufacturer;
    private String OS;
    private String model;
    private String ram;    
    private String hardDrive;
    private String video;
    static Set<String> select;
    
    
    
   

    public noteBooks(String manufacturer, String OS, String model, String ram, String hardDrive, String video) {
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.OS = OS;
        this.manufacturer = manufacturer;
        this.video = video;
        this.model = model;
        
    }

    public String getRam() {
        return this.ram;
    }

    

    public void setRam(String ram) {
        this.ram = ram;
    }
   

    public String getHardDrive() {
        return this.hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }
    

    public String getOS() {
        return this.OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof noteBooks)) {
    //         return false;
    //     }
    //     noteBooks noteBooks = (noteBooks) o;
    //     return Objects.equals(ram, noteBooks.ram) && Objects.equals(hardDrive, noteBooks.hardDrive) && Objects.equals(OS, noteBooks.OS) && Objects.equals(manufacturer, noteBooks.manufacturer) && Objects.equals(model, noteBooks.model);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(ram, hardDrive, OS, manufacturer, model);
    // }

    
    @Override
    public String toString() {
        return "{" +
            " manufacturer='" + getManufacturer() + "'" +
            ", OS='" + getOS() + "'" +
            ", model='" + getModel() + "'" +
            ", ram='" + getRam() + "'" +
            ", hardDrive='" + getHardDrive() + "'" +
            ", video='" + getVideo() + "'" +
            "}";
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
    
        List<noteBooks> noteBooks = new ArrayList<>();
    
        noteBooks note1 = new noteBooks("Acer", "Windows", "sdh7865", "8", "512", "Radeon");       
        noteBooks.add(note1);
        noteBooks note2 = new noteBooks("Apple", "MacOS", "h98998w", "32", "1028", "Nvidia");        
        noteBooks.add(note2);
        noteBooks note3 = new noteBooks("Asus", "Windows", "asd2023", "8", "256", "Nvidia");        
        noteBooks.add(note3);
        noteBooks note4 = new noteBooks("Apple", "MacOS", "drr555", "16", "512", "Radeon");        
        noteBooks.add(note4);
        noteBooks note5 = new noteBooks("Acer", "Windows", "1233sd", "8", "512", "Radeon");       
        noteBooks.add(note5);
        noteBooks note6 = new noteBooks("Dell", "Linux", "sdgsg14545", "16", "256", "Nvidia");       
        noteBooks.add(note6);
    
        System.out.println("Дорогой покупатель! Вас приветствует интернет-магазин <NoteBook-ONE>! ");
        System.out.println("В наличии доступны следующие варианты:");
        for (noteBooks elem : noteBooks) {
            System.out.println(elem);
        }
        
        main.select(noteBooks);
    
    }
    
}