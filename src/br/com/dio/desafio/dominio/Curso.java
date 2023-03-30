package br.com.dio.desafio.dominio;


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
    public void cadastrarCurso(String titulo,String descricao,int cargaHoraria){
       Curso curso = new Curso();
       curso.setTitulo(titulo);
       curso.setDescricao(descricao);
       curso.setCargaHoraria(cargaHoraria);
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
