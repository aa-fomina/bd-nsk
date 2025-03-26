package com.fomina.top.proba1.repository;

import com.fomina.top.proba1.entity.Oks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;


import java.util.List;
import java.util.Optional;

public interface OksRepository extends JpaRepository<Oks, Integer> {
    Oks findAllById(Integer id);

    @NativeQuery("SELECT * FROM oks WHERE id=?1")
    List<Oks> findById2(Integer id);
}
