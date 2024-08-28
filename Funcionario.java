/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q01;

/**
 *
 * @author mathillesheim
 */
public class Funcionario {
    
    private String nome;
    private double salario;
    
private static final double FAIXA_1_LIMITE_SUP = 1903.98;
private static final double FAIXA_2_LIMITE_INF = 1903.99;
private static final double FAIXA_2_LIMITE_SUP = 2826.65;
private static final double FAIXA_3_LIMITE_INF = 2826.66;
private static final double FAIXA_3_LIMITE_SUP = 3751.05;
private static final double FAIXA_4_LIMITE_INF = 3751.06;
private static final double FAIXA_4_LIMITE_SUP = 4664.68 ;
private static final double FAIXA_5_LIMITE_INF = 4664.69;

private static final double ALIQUOTA_FAIXA_2 = 0.075;
private static final double ALIQUOTA_FAIXA_3 = 0.15;
private static final double ALIQUOTA_FAIXA_4 = 0.225;
private static final double ALIQUOTA_FAIXA_5 = 0.275;
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if(nome == null) {
            throw new IllegalArgumentException("Nome inválido");
        } 
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario == 0){
            throw new IllegalArgumentException("Salário Inválido");
        } 
        this.salario = salario;
    }
    
    public double calculaIrpf () {
        
        double total = 0;
        
        if(salario <= FAIXA_1_LIMITE_SUP) {
            return total;
        }
        if(salario < FAIXA_2_LIMITE_INF) {
            total = (salario - FAIXA_1_LIMITE_SUP) * ALIQUOTA_FAIXA_2;
            return total;
        }
        
        total += (FAIXA_2_LIMITE_SUP - FAIXA_1_LIMITE_SUP) * ALIQUOTA_FAIXA_2;
        
        if (salario < FAIXA_3_LIMITE_INF) {
            total = (salario - FAIXA_2_LIMITE_SUP) * ALIQUOTA_FAIXA_3;
            return total;
        }
        
       
        
        
}
    
    }
        
    
    
