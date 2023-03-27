package br.com.jvm.projetoconcessionaria.model.entidade;

  public abstract class Pessoa {
  
	  private String name;
      private String documento;
      private String endereco;
      private String sexo;
      private String tipo;
      
  
  
  public Pessoa() {
	  
  }
  
  public Pessoa(String name, String documento, String endereco, String sexo, String tipo) {
	  
	  this.name = name;
	  this.documento = documento;
	  this.endereco = endereco;
	  this.sexo = sexo;
	  this.tipo = tipo;
	  
  }

      
      
      
  public String getName() {
	return name;
}

  
  public void setName(String name) {
	this.name = name;
}

  
  public String getDocumento() {
	return documento;
}

  
  public void setDocumento(String documento) {
	this.documento = documento;
}

  
  public String getEndereco() {
	return endereco;
}

  
  public void setEndereco(String endereco) {
	this.endereco = endereco;
}

  
  public String getTipo() {
	return tipo;
}

  
  public void setTipo(String tipo) {
	this.tipo = tipo;
}


public String getSexo() {
	return sexo;
}


public void setSexo(String sexo) {
	this.sexo = sexo;
}


  
   
   
  

}
