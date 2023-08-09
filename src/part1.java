public class part1 {
    public static void main(String[]args){
        Datamahasiswa datamahasiswa= new Datamahasiswa();
                datamahasiswa.dtmahasiswa();

    }
}

class Datamahasiswa{
    String data="---Data Mahasiswa---";
    String nama= "Antonius Marlin";
    String nrp="c14230084";
    String Matkul= "Algoritma dan Pemrogaman";
    char kelas= 'B';
    int tahun1= 2023;
    int tahun2=2024;
    String tahun="Gasal";
    void dtmahasiswa(){
        System.out.println(data);
        System.out.println("Nama:"+ nama);
        System.out.println("NRP: " +nrp);
        System.out.println("Mata Kuliah: " + Matkul);
        System.out.println("Kelas : "+ kelas);
        System.out.println("Tahun: "+ tahun1+ "/"+ tahun2);
        System.out.println("Semester: "+ tahun);
        System.out.println("-----------------------");
    }


}
