/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasgrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Admin
 */
public class Notas extends JFrame {
    
    JLabel aluno, rotulo1, rotulo2, rotulo3, rotulo4, exibiraluno, exibir;
    JTextField texto1, texto2, texto3, texto4, texto5;
    JButton calcular, limpar;
    
    public Notas() {
        super("Calcular média");
        Container tela = getContentPane();
        setLayout(null);
        aluno = new JLabel("Nome do aluno: ");
        rotulo1 = new JLabel("1° Nota: ");
        rotulo2 = new JLabel("2° Nota: ");
        rotulo3 = new JLabel("3° Nota: ");
        rotulo4 = new JLabel("4° Nota: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        texto5 = new JTextField(5);
        calcular = new JButton("Calcular");
        exibiraluno = new JLabel("");
        exibir = new JLabel("");
        limpar = new JButton("Limpar");
        
        aluno.setBounds(50,20,100,20); rotulo1.setBounds(50,60,100,20);
        rotulo2.setBounds(50, 100, 100, 20); rotulo3.setBounds(50, 140, 100, 20);
        rotulo4.setBounds(50, 180, 100, 20); texto1.setBounds(145, 20, 220, 20);
        texto2.setBounds(120, 60, 100, 20); texto3.setBounds(120, 100, 100, 20);
        texto4.setBounds(120, 140, 100, 20); texto5.setBounds(120, 180, 100, 20);
        exibiraluno.setBounds(50, 220, 200, 20); exibir.setBounds(50, 260, 250, 20); 
        calcular.setBounds(130, 300, 120, 20); limpar.setBounds(130, 330, 120, 20);
        
        calcular.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String nome;
                    double n1, n2, n3, n4, med;
                    med = 0;
                    nome = texto1.getText();
                    n1 = Double.parseDouble(texto2.getText());
                    n2 = Double.parseDouble(texto3.getText());
                    n3 = Double.parseDouble(texto4.getText());
                    n4 = Double.parseDouble(texto5.getText());
                    med = (n1 + n2 + n3 + n4) / 4;
                    if((med >= 7) && (med <=10)) {
                        exibiraluno.setVisible(true);
                        exibir.setVisible(true);
                        exibiraluno.setText("Aluno(a): " +nome);
                        exibir.setText("A sua média é: " + med + " e está aprovado!");
                }
                    else if(med < 7 ) {
                        exibiraluno.setVisible(true);
                        exibir.setVisible(true);
                        exibiraluno.setText("Aluno(a): " +nome);
                        exibir.setText("A sua média é: " + med + " e está reprovado!");
                    }
                    else {
                        exibir.setVisible(true);
                        exibir.setText("Inválido!");
                    }
                    
                }
            });
        limpar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        texto1.setText(null);
                        texto2.setText(null);
                        texto3.setText(null);
                        texto4.setText(null);
                        texto5.setText(null);
                        exibiraluno.setText(null);
                        exibir.setText(null);
                        texto1.requestFocus();
                    }
                }
            );
        exibiraluno.setVisible(false);
        exibir.setVisible(false);
        
        tela.add(aluno); tela.add(rotulo1);
        tela.add(texto1); tela.add(texto2);
        tela.add(texto3); tela.add(texto4);
        tela.add(texto5); tela.add(rotulo2); 
        tela.add(rotulo3); tela.add(rotulo4); 
        tela.add(exibiraluno); tela.add(exibir);
        tela.add(calcular); tela.add(limpar);
        
        setSize(400, 500);
        setVisible(true);
    }
}
