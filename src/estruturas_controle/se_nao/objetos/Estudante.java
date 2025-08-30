package estruturas_controle.se_nao.objetos;

public final class Estudante {
    private String nome;
    private double media;

    public Estudante() {

    }

    public Estudante(String nome, double media) {
        this.nome = nome;
        this.media = validaEhAtribuiMedia(media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = validaEhAtribuiMedia(media);
    }

    private double validaEhAtribuiMedia(double media) {
        if(media > 0.0 && media <= 100.00) {
            return media;
        }
        return 0.0;
    }

    public String getNotaFinal() {
        if (media >= 90.0) {
            return "A";
        } else if (media >= 80.0) {
            return "B";
        } else if (media >= 70.0) {
            return "C";
        } else if (media >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
