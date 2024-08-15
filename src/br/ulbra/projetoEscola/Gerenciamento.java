package br.ulbra.projetoEscola;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Gerenciamento {
    private ArrayList<Integer> lista;
    private ArrayList<Integer> listaDesordem;
    
    public Gerenciamento(){
         lista = new ArrayList();
         listaDesordem = new ArrayList();
     }
    public void adicionar(double n){
        int num=(int)n;
        lista.add(num);
        JOptionPane.showMessageDialog(null, "Numero adicionado com sucesso!!");
    }
    public void remover(int i){
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está Vazia!!");
        }else if(i>=lista.size() || i<0){
            JOptionPane.showMessageDialog(null, "Indice não existente!");
        }else{
            lista.remove(i);
            JOptionPane.showMessageDialog(null, "Numero Removido com Sucesso!!");
        }
    }
    public void atualizar(int i, int num){
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está Vazia!!");
        }else if(i>=lista.size() || i<0){
            JOptionPane.showMessageDialog(null, "Indice não existente!");
        }else{
            lista.set(i, i);
            JOptionPane.showMessageDialog(null, "Numero Atualizado com Sucesso!!");
        }
    }
    public String listar(){
        String listar="";
         if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está Vazia!!");
        }else{
             for(int i=0;i<lista.size();i++){
                listar+=(i+1)+" - "+lista.get(i)+"\n";
             }
         }
        return listar;
    }
    public String listarPares(){
        String listar="";
         if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está Vazia!!");
        }else{
             for(int i=0;i<lista.size();i++){
                 if(lista.get(i)%2==0){
                listar+=(i+1)+" - "+lista.get(i)+"\n";
             }
         }
    }
         return listar;
   }
    public String listarImpar(){
        String listarImp="";
         if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está Vazia!!");
        }else{
             for(int i=0;i<lista.size();i++){
                 if(lista.get(i)%2!=0){
                listarImp+=(i+1)+" - "+lista.get(i)+"\n";
             }
         }
    }
         return listarImp;
   }
    public String buscar(int n){
        int cont=0; 
        int numero;
        int num=n;
         if(lista.isEmpty()){
             JOptionPane.showMessageDialog(null, "A lista está vazia!");
         }else{
             for(int i=0;i<lista.size();i++){
                 numero = lista.get(i);
                 if(n==numero){
                     num = n;
                     cont++;
                 }
             }
         }
         return "O numero "+num+" está "+cont+" vezes na lista!";
     }
     public double calcularMedia(){
         double acum=0, media=0;
         for(int i=0; i<lista.size();i++){
             acum = acum+lista.get(i);
         }
         media = acum/lista.size();
         return media;
     }
     public int descobrirMaior(){
         int maiorNum = lista.get(0);
         for(int i=0;i<lista.size();i++){
             if(lista.get(i)>=maiorNum){
                 maiorNum=lista.get(i);
             }
         }
         return maiorNum;
     }
     public int descobrirMenor(){
         int menorNum=lista.get(0);
         for(int i=0;i<lista.size();i++){
             if(lista.get(i)<=menorNum){
             menorNum = lista.get(i);
         }
         }
         return menorNum;
     }
     public void ordenar(){
         Collections.sort(listaDesordem);
     }
     public String listarDesordem(){
        String listar="";
         if(listaDesordem.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista está Vazia!!");
        }else{
             for(int i=0;i<listaDesordem.size();i++){
                listar+=(i+1)+" - "+listaDesordem.get(i)+"\n";
             }
         }
        return listar;
    }
     public String retornarOrdem(){
        String listar="";
         for(int i=0;i<listaDesordem.size();i++){
                listar+=(i+1)+" - "+listaDesordem.get(i)+"\n";
     }
     return listar;
     }    
     public void adicionar2(double n){
        int num=(int)n;
        listaDesordem.add(num);
    }
}