 
package if1.pkg10118006.latihan56.umurbarangantik;

/*
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : IF 1
 * NIM   : 10118006
 * Deskripsi Program : Program ini untuk membuat tampilan umur barang antik.
 */
public class IF110118006Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Radio radio = new Radio(234);
        radio.setName("Radio");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
        
    }
    
}
