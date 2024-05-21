package gof.facade;

import subsistemaCrm.CrmService;
import subsistemaCep.CepApi;


public class Facade {
    public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		String pais = CepApi.getInstancia().recuperarPais(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado, pais);
	}
}
