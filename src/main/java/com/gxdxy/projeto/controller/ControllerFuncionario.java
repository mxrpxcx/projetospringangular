package com.gxdxy.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gxdxy.projeto.model.Funcionario;
import com.gxdxy.projeto.repository.RepositorioFuncionario;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "localhost:4200")
public class ControllerFuncionario {

	@Autowired
	private RepositorioFuncionario repositorioFuncionario;

	@GetMapping("/funcionarios")
	@CrossOrigin(origins = "http://localhost:4200")
    @ResponseStatus(HttpStatus.OK)
	public List<Funcionario> listarTodosFuncionarios(){
		return repositorioFuncionario.findAll();
	}
}
