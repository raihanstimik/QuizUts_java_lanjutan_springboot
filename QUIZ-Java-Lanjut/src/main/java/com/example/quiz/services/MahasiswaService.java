package com.example.quiz.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.quiz.models.Mahasiswa;

@Service
public class MahasiswaService {

  private final Map<String, Mahasiswa> mahasiswaMap = new HashMap<>();

    public MahasiswaService() {
        // Contoh data awal
        Mahasiswa mahasiswa1 = new Mahasiswa("123", "John Doe");
        Mahasiswa mahasiswa2 = new Mahasiswa("456", "Jane Doe");
        mahasiswaMap.put(mahasiswa1.getNim(), mahasiswa1);
        mahasiswaMap.put(mahasiswa2.getNim(), mahasiswa2);
    }
// 1. GET - Tampilkan semua data mahasiswa
public Collection<Mahasiswa> getAllMahasiswa() {
    return mahasiswaMap.values();
}

//GET(read data nim)
public Mahasiswa getMahasiswaByNim(String nim) {
    return mahasiswaMap.get(nim);
}

//POST(create data)
public void addMahasiswa(Mahasiswa mahasiswa) {
    mahasiswaMap.put(mahasiswa.getNim(), mahasiswa);
}

//PUT(Update data)
public void updateMahasiswa(String nim, Mahasiswa mahasiswa) {
    if (mahasiswaMap.containsKey(nim)) {
        mahasiswa.setNim(nim);
        mahasiswaMap.put(nim, mahasiswa);
    }
}

//DELETE(data mahasiswa)
public void deleteMahasiswa(String nim) {
    mahasiswaMap.remove(nim);
}
}
