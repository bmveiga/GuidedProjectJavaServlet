package br.com.bmveiga.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<Empresa>();
	
	static {
		Empresa alura = new Empresa();
		alura.setNome("Alura");
		Empresa caelum = new Empresa();
		caelum.setNome("Caelum");
		empresas.add(caelum);
		empresas.add(alura);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.empresas.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.empresas;
	}
}
