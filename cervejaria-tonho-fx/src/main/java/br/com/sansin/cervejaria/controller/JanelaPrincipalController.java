package br.com.sansin.cervejaria.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JanelaPrincipalController {

	@FXML
	private BorderPane pnlRaiz;

	private Stage stage;

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	@FXML
    void cadastroClienteOnAction(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/CadastroCliente.fxml"));
		Parent parent = loader.load();
		pnlRaiz.setCenter(parent);
		stage.setTitle("Cervejaria Tonho - Cadastro de Clientes");
    }

    @FXML
    void cadastroItemOnAction(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/CadastroItem.fxml"));
		Parent parent = loader.load();
		pnlRaiz.setCenter(parent);
		stage.setTitle("Cervejaria Tonho - Cadastro de Itens");
    }

    @FXML
    void consumoOnAction(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Consumo.fxml"));
		Parent parent = loader.load();
		pnlRaiz.setCenter(parent);
		stage.setTitle("Cervejaria Tonho - Consumo");
    }

    @FXML
    void fecharContaOnAction(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FecharConta.fxml"));
		Parent parent = loader.load();
		pnlRaiz.setCenter(parent);
		stage.setTitle("Cervejaria Tonho - Fechar Conta");
    }
    
    

	@FXML
	void sairOnAction(ActionEvent event) {
		stage.close();
	}
}
