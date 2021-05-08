import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../funcionario'; 

@Component({
  selector: 'app-lista-funcionario',
  templateUrl: './lista-funcionario.component.html',
  styleUrls: ['./lista-funcionario.component.css']
})
export class ListaFuncionarioComponent implements OnInit {

  funcionarios!: Funcionario[];  

  constructor() { }

  ngOnInit(): void {

    this.funcionarios = [{
      "id": 1,
      "nome": "Renan",
      "sobrenome": "Godoy",
      "email": "renan@r.com"
    }];

  }

}
