package com.example.test.repo;

import com.example.test.model.ModelUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* -- class ini turunan dari JpaRepository. 
 * pada class JpaRepository terdapat beberapa function bawaan yang digunakan 
 * untuk melakukan query seperti insert,update,delete dan list data dari database tanpa menulis query. 
*/

@Repository
public interface UserRepository extends JpaRepository<ModelUser,Long> {
	
	// kali ini saya hanya akan menggunakan function bawaan dari JpaRepository jadi saya tidak akan menambahkan function disini

}
