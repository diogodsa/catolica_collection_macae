package com.collection.collection;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

	@RequestMapping("/")
	String home(){
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2022;
		meuCarro.cor = "Branco";
		meuCarro.modelo = "JEEP";
		meuCarro.fabricante = "JEEP";

		Usuario usuario = new Usuario();
		usuario.nome = "Thiago";
		usuario.email = "thiago@gmail.com";

		meuCarro.usuario = usuario;

		Endereco endereco = new Endereco();
		endereco.endereco = "Glória";
		endereco.rua = "Alameda";
		endereco.cep = "27910000";

		usuario.endereco = endereco;

		Gson gson = new Gson();
		String json = gson.toJson(meuCarro);

		return json;
	}

	@RequestMapping("/v1/user/Thiago")
	String thiago(){
		return "Hello Thiago :)";
	}


}
