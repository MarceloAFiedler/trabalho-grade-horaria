package com.jlm.gradehoraria.core.repository;

import com.jlm.gradehoraria.core.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository   extends JpaRepository<Curso, Long> {
}
