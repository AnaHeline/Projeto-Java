/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author a159599
 * @author a145352
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            Document doc = builder.parse("C://Bibliotecas//Documentos//pessoa.xml");
            
            Nodelist listaDePessoas = doc.getElementsByTagName("pessoa");
            
            int  tamanholista = listaDePessoas.getLength();
            
            for (int i = 0; i < tamanholista; i++ ){
                Node noPessoa = listaDePessoas.item(i);
            }
          
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Projeto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Projeto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Projeto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

