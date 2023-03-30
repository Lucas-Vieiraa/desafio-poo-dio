package br.com.dio.desafio.dominio;


import java.util.Scanner;

public class Curso extends Conteudo{

    private int cargaHoraria;



    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void inserirCurso(String titulo, String descricao, int cargaHoraria){
        setTitulo(titulo);
        setDescricao(descricao);
        setCargaHoraria(cargaHoraria);
    }
    public void removerCurso(){
        setTitulo(null);
        setDescricao(null);
        setCargaHoraria(0);
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
