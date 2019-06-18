/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author USSenterprise
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField teste;
    
    @FXML
    private WebView webSite;
    
    @FXML
    private WebView webSite2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        //Pega o nome da noticia
        String news2 = teste.getText();
        //Converte para o link final da pesquisa para o GoogleFTT
        String news3 = "https://toolbox.google.com/factcheck/explorer/search/"+news2+";hl=pt;gl=";
        //Converte para o link final da pesquisa para o FF
        String news4 = "https://fullfact.org/search/?q="+news2+"&order=relevance";
        
        //Gerar o site no WebView
        WebEngine engine = webSite.getEngine();
        engine.load(news3);
        
        //Gerar o site no WebView2
        WebEngine engine2 = webSite2.getEngine();
        engine2.load(news4);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //teste = new TextField();
    }    
    
}
