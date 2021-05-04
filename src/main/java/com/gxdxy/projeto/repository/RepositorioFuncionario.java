package com.gxdxy.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gxdxy.projeto.model.Funcionario;

@Repository
public interface RepositorioFuncionario extends JpaRepository<Funcionario, Long>{

}
