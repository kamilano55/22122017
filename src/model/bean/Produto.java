/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Pretinho
 */
public class Produto {
    private int id_dvd;
    private String dvd_titulo;
    private String dvd_genero;
    private String dvd_classificacao;
    private String dvd_sinopse;
    private String dvd_imagem;

    public String getDvd_imagem() {
        return dvd_imagem;
    }

    public void setDvd_imagem(String dvd_imagem) {
        this.dvd_imagem = dvd_imagem;
    }
    
    
    public int getId_dvd() {
        return id_dvd;
    }

    public void setId_dvd(int id_dvd) {
        this.id_dvd = id_dvd;
    }

    public String getDvd_titulo() {
        return dvd_titulo;
    }

    public void setDvd_titulo(String dvd_titulo) {
        this.dvd_titulo = dvd_titulo;
    }

    public String getDvd_genero() {
        return dvd_genero;
    }

    public void setDvd_genero(String dvd_genero) {
        this.dvd_genero = dvd_genero;
    }

    public String getDvd_classificacao() {
        return dvd_classificacao;
    }

    public void setDvd_classificacao(String dvd_classificacao) {
        this.dvd_classificacao = dvd_classificacao;
    }

        public String getDvd_sinopse() {
        return dvd_sinopse;
    }

    public void setDvd_sinopse(String dvd_sinopse) {
        this.dvd_sinopse = dvd_sinopse;
    }

    

    @Override
    public String toString() {
        return getDvd_genero(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
        
}
