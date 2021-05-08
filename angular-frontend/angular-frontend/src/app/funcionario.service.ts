import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Funcionario } from './funcionario';

@Injectable({
  providedIn: 'root'
})
export class FuncionarioService {

  private baseURL = "https://localhost:8080/api/v1/funcionarios";
  constructor(private httpClient: HttpClient) { }

  listarFuncionarios(): Observable<Funcionario[]>{
    return this.httpClient.get<Funcionario[]>( `${this.baseURL}` );
  }
}
