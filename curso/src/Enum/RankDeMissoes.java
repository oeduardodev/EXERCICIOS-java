package Enum;

public enum RankDeMissoes {

    D("Baixo", 2, 3),
    C("Moderado", 3,3),
    B("Equilibrado", 4,4),
    A("Dificil", 5,5),
    S("Altissimo", 12,9);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade, int minNinjasNaEquipe) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
