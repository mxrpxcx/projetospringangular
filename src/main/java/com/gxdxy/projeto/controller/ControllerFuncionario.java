package com.gxdxy.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gxdxy.projeto.model.Funcionario;
import com.gxdxy.projeto.repository.RepositorioFuncionario;

@RestController
@RequestMapping("/api/v1/")
public class ControllerFuncionario {

	@Autowired
	private RepositorioFuncionario repositorioFuncionario;

	@GetMapping("/funcionarios")
	public List<Funcionario> listarTodosFuncionarios(){
		return repositorioFuncionario.findAll();
	}
}
