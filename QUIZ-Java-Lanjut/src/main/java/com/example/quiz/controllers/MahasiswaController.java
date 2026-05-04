package com.example.quiz.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.quiz.services.MahasiswaService;
import com.example.quiz.models.Mahasiswa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Collection;

@RestController
@RequestMapping("mahasiswa")
public class MahasiswaController {
  private final MahasiswaService mahasiswaService;

  public MahasiswaController(MahasiswaService mahasiswaService) {
    this.mahasiswaService = mahasiswaService;
  }
@GetMapping()
public Collection<Mahasiswa> getAllMahasiswa() {
    return mahasiswaService.getAllMahasiswa();
}
  @GetMapping("/{nim}")
  public Mahasiswa getMahasiswaByNim(@PathVariable String nim) {
      return mahasiswaService.getMahasiswaByNim(nim);
  }
  @PostMapping()
  public void addMahasiswa(@RequestBody Mahasiswa mahasiswa) {
      mahasiswaService.addMahasiswa(mahasiswa);
  }
      @PutMapping("/{nim}")
    public void updateMahasiswa(@PathVariable String nim, @RequestBody Mahasiswa mahasiswa) {
        mahasiswaService.updateMahasiswa(nim, mahasiswa);
    }
      @DeleteMapping("/{nim}")
    public void deleteMahasiswa(@PathVariable String nim) {
        mahasiswaService.deleteMahasiswa(nim);
    }  
  
  
  // running di http://localhost:8110/mahasiswa
  // kerjakan bagian service dan controller
  // model jangan dirubah
  // kerjakan tanpa menggunakan AI
  // hargai kemampuan diri sendiri dan junjung tinggi kejujuran
  // nilai bukan hasil yang utama. 
  // selamat mengerjakan

  // @GetMapping()
  // 1. tampilkan semua data mahasiswa

  // @GetMapping("/{nim}")
  // 2. tampilkan data mahasiswa berdasarkan nim

  // @PostMapping()
  // 3. tambahkan data mahasiswa

  // @PutMapping("/{nim}")
  // 4. update data mahasiswa

  // @DeleteMapping("/{nim}")
  // 5. hapus data mahasiswa
}


