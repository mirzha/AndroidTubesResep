package mobile.tubes.polinema.com.tubesandro;

import com.google.firebase.auth.FirebaseAuth;

public class KateringVideo {
    private String nama;
    private String durasi;
    private String videoRawId;
    FirebaseAuth firebaseAuth;

    // Array nama sinetron di kategori drama
    public static final KateringVideo[] drama = {

            new KateringVideo("Resep Gudeg",
                    "4:12",
                    "resepgudeg"),
            new KateringVideo("Resep Gulai",
                    "3:22",
                    "resepgulai"),
            new KateringVideo("Resep Rawon",
                    "3:22",
                    "reseprawon"),
            new KateringVideo("Resep Rendang",
                    "3:22",
                    "reseprendang"),
            new KateringVideo("Resep Soto",
                    "3:22",
                    "resepsoto"),


    };

    // Setiap data punya nama, deskripsi, dan gambar
    private KateringVideo(String nama, String durasi, String videoRawId) {
        this.nama = nama;
        this.durasi = durasi;
        this.videoRawId = videoRawId;
    }
    public String getNama() {
        return nama;
    }
    public String getDurasi() {
        return durasi;
    }
    public String getVideoRawId() {
        return videoRawId;
    }
    public String toString() {
        return this.nama;
    }

}
