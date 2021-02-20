/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditi
 * Nama  : Aditya Ilham Subagja
 * Nim   : 10119016
 * Kelas : IF1
 * NoSoal: 5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelMahasiswa model = new ModelMahasiswa("10110269","Rizki Adam Kurniawan");
        
        System.out.println("Nim Mahasiswa : " + model.getNim());
        System.out.println("Nama Mahasiswa : " + model.getNama());
    }
        
    
}
