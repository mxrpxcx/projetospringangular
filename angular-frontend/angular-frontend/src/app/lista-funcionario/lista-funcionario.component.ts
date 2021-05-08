import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../funcionario'; 
import { FuncionarioService } from '../funcionario.service';

@Component({
  selector: 'app-lista-funcionario',
  templateUrl: './lista-funcionario.component.html',
  styleUrls: ['./lista-funcionario.component.css']
})
export class ListaFuncionarioComponent implements OnInit {

  funcionarios: Funcionario[];  

  constructor(private funcionarioService: FuncionarioService) {
   }

  ngOnInit(): void {

   this.getFuncionarios();

  }

  private getFuncionarios(){
    this.funcionarioService.listarFuncionarios().subscribe(data => {
      this.funcionarios = data; 
    })
  }

}
